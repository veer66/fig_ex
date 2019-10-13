(ns fig-ex.core)

(enable-console-print!)

(def span-el (-> js/document
                (.getElementById "num")))

(set! (.-innerHTML span-el) "Yo")

;; cider-jack-in-cljs / figwheel-main / :dev
