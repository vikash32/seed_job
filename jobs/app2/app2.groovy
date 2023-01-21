pipelineJob("app2-job-pipeline") {
    definition {
        cpsScm {
            lightweight(true)
            scm {
                git("https://github.com/vikash32/java_tuts.git", "master")
            }
        }
    }
}