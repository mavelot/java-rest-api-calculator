pipeline {
    agent any
    //test webook 4
    stages {
        stage('Build') {
             steps {
                git branch: "${BRANCH_NAME}", url: 'https://github.com/jenkinsci/git-parameter-plugin.git'
                sh './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
         stage('Publish') {
             steps {
                sh './mvnw package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }    
    }
}