pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage ('Running Tests') {
            steps {
                sh '''
                    mvn clean test verify
                '''
            }
        }

        stage ('Docker down') {
            steps {
                docker-compose down
            }
        }
    }
}
