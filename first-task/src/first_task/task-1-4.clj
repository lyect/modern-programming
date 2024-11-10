(defn task-1-4-rec [n deep alphabet]
    (if (= n deep)
        (list (str))
        (reduce
            (fn [l r] (concat l r))
            ()
            (map
                (fn [word]
                    (map
                        (fn [letter]
                            (str word letter)
                        )
                        (filter (fn [letter] (not= (last word) letter)) alphabet)
                    )
                )
                (task-1-4-rec n (+ deep 1) alphabet)
            )
        )
    )
)

(defn task-1-4 [n alphabet]
    (task-1-4-rec n 0 alphabet)
)