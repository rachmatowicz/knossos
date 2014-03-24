(defproject knossos "0.1.1-SNAPSHOT"
  :description "Linearizability checker"
  :url "https://github.com/aphyr/knossos"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {
                 "boundary-site" "http://maven.boundary.com/artifactory/repo"
                 }
  :dependencies [[org.clojure/clojure "1.6.0-beta1"]
                 [org.clojure/math.combinatorics "0.0.7"]
                 [potemkin "0.3.4"]
                 [com.boundary/high-scale-lib "1.0.3"]]
  ; "-verbose:gc" "-XX:+PrintGCDetails"
  :jvm-opts ["-Xmx32g" "-XX:+UseConcMarkSweepGC" "-XX:+UseParNewGC" "-XX:+CMSParallelRemarkEnabled" "-XX:+AggressiveOpts" "-XX:+UseFastAccessorMethods"])
