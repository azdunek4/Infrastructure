pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/azdunek4/Frontend.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}