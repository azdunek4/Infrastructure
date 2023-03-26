pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/azdunek4/Backend.git")
                    }
                    branches('master') // w innych plikach jest 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}