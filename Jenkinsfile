pipeline {
    agent any
    //test webook 6
    stages {
        stage('Build') {
             steps {
                git branch: dev, url: 'https://github.com/jenkinsci/git-parameter-plugin.git'
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