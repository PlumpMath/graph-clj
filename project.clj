(defproject graph "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] [aysylu/loom "0.6.0"]]
  :main ^:skip-aot graph.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
