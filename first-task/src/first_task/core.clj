(ns first-task.core
    (:gen-class))

(load-file "./src/first_task/task-1-1.clj")
(load-file "./src/first_task/task-1-2.clj")
(load-file "./src/first_task/task-1-3.clj")
(load-file "./src/first_task/task-1-4.clj")

(defn -main [& args]
    (do
        (println (task-1-1 2 "abc"))
        (println (task-1-2 2 "abc"))
        (println (my-map    inc  '(0 1 2 3 4 5 6 7 8 9)))
        (println (my-filter odd? '(0 1 2 3 4 5 6 7 8 9)))
        (println (task-1-4 3 "abc"))
    )
)