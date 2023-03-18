pipeline {
    agent any
    
    stages {
        stage('Build') {
             steps {
                git 'https://github.com/mavelot/java-rest-api-calculator.git'
                sh './mvnw clean compile'
            }
        }
    }
}