(ns Vietnamese-Encoding-Converter.server
  (:require [noir.server :as server]))

(server/load-views "src/Vietnamese_Encoding_Converter/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'Vietnamese-Encoding-Converter})))

