pipelineJob("test-seed-job-pipeline") {
    definition {
        cpsScm {
            lightweight(boolean lightweight = true)
            scm {
                git(String url, Closure configure = null)
            }
        }
    }
}