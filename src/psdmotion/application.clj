;; Applicationクラスの継承 (application.clj)
(ns psdmotion.application
  (:import (javafx.application Application)
           (javafx.stage Stage))
  (:gen-class
    :extends javafx.application.Application
    :name hellofx.application))

;; 将来的にStageが入る箱
(def window (promise))

;; Applicationの起動をラップし、起動後のStageオブジェクトを持ってくる
(defn start-fx
  []
  (when (not (realized? window))
    (doto (Thread.
           #(Application/launch
             hellofx.application
             (into-array String [])))
      .start))
  @window )

;; 起動時にStageをdeliverする
(defn -start
  [this stage]
  (deliver window stage )
  (.show stage))

;;　実行部分 (core.clj)
(ns hellofx.core
  (:require [hellofx.application :as app])
  (:gen-class
   :main true))

(defn -main
  [& args]
  (let [stage (app/start-fx)]
    (doto stage
      ;; Applicationクラスの外でStageの操作ができた!!
      (.setTitle "Hello, JavaFX")
