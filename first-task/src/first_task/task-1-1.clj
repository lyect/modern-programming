(defn task-1-1-rec [n deep res prev alphabet]
    (if (= n deep)
        (list res)
        (loop [current-symbol-index 0 l ()]
            (if (< current-symbol-index (.length alphabet))
                (recur 
                    (+ current-symbol-index 1)
                    (concat
                        l
                        (let [cur (.charAt alphabet current-symbol-index)]
                            (if-not (= prev cur)
                                (task-1-1-rec n (+ deep 1) (str res cur) cur alphabet)
                            )
                        )
                    )
                )
                l
            )
        )
    )
)

(defn task-1-1 [n alphabet]
    (task-1-1-rec n 0 "" "" alphabet)
)