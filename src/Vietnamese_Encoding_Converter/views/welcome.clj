(ns Vietnamese-Encoding-Converter.views.welcome
  (:require [Vietnamese-Encoding-Converter.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to Vietnamese-Encoding-Converter"]))
