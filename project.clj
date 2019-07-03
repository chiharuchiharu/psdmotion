(defproject psdmotion "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [fn-fx/fn-fx-openjfx11 "0.5.0-SNAPSHOT"]    ; If you're running JRE 11 (Oracle or OpenJDK)
                 [fn-fx/fn-fx-javafx "0.5.0-SNAPSHOT"]
                 [com.twelvemonkeys.imageio/imageio-core "3.1.1"]
                 [com.twelvemonkeys.imageio/imageio-psd "3.1.1"]
                 ]
  :repl-options {:init-ns psdmotion.core}
  :main psdmotion.core)
