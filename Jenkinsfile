pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage ('Running Tests') {
            steps {
                sh '''
                    mvn clean test verify
                '''
            }
        }

        stage ('Docker compose run tests') {
            steps {
             sh '''
                docker-compose -f docker-compose1.yaml up
                '''
            }
        }
    }
}
