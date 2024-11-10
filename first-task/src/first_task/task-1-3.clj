(defn my-map [f l]
    (reduce (fn [r v] (concat r (list (f v)))) () l)
)

(defn my-filter [f l]
    (reduce (fn [r v] (concat r (if (f v) (list v) ()))) () l)
)