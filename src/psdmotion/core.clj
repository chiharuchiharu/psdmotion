(ns psdmotion.core
  (:require [fn-fx.fx-dom :as dom]
            [fn-fx.controls :as ui]
            [fn-fx.diff :refer [component defui render should-update?]]))


(defn -main []
  (let [u (ui/stage
            :title "Helaaalo World!"
            :shown true
            :min-width 300
            :min-height 300
            :scene (ui/scene
                     :root (ui/stack-pane
                             :children [(ui/button
                             ;:children   ui/image-view
                                          :text "Say 'aaHello World'"
                                          :on-action {:say "Hello World!"}
                                          )])))
        handler-fn (fn [evt]
                     (println "Received Event: " evt (a)))]
    (dom/app u handler-fn)))

(defn a [] "sssssss")


(comment
  (-main))


