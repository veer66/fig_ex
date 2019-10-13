(ns fig-ex.core)

(enable-console-print!)

(def num-el (-> js/document
                (.getElementById "num")))

(set! (.-innerHTML num-el) "1082")
