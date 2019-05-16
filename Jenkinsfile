pipeline {
    agent any
    stages {
        stage('Start Zalenium') {
            steps {
                script {
                    sh "docker-compose -f docker-compose1.yaml up"
                }
            }
        }
        stage('stop docker') {
            steps {
                sh "docker-compose -f docker-compose1.yaml down"
                sh "docker-compose -f docker-compose.yaml down"
            }
        }
     }
}
