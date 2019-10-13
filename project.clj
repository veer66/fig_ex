(defproject fig_main_example "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.339"]
                                  [com.bhauman/figwheel-main "0.2.3"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  [cider/piggieback "0.4.2"]]
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]
                   :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})
  
  
