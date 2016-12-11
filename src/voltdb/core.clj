(ns voltdb.core
  (:import [org.voltdb.client Client]))

(defn get-default-vdb-port
  []
  (Client/VOLTDB_SERVER_PORT))
