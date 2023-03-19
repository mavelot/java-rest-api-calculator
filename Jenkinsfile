pipeline {
    agent any
    //test webook 3
    stages {
        stage('Build') {
             steps {
                sh 'git clone -b dev 'https://github.com/mavelot/java-rest-api-calculator.git''
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