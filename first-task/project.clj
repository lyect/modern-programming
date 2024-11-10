(defproject first-task "1.0-RELEASE"
  :description "First task"
  :url "https://github.com/lyect/modern-programming"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot first-task.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
