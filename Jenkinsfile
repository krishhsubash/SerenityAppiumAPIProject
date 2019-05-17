pipeline {
    agent any
    stages {
        stage('Start Zalenium') {
            steps {
                script {
                    sh "/usr/local/bin/docker-compose -f docker-compose1.yaml up"
                }
            }
        }
        stage('stop docker') {
            steps {
                sh "/usr/local/bin/docker-compose -f docker-compose1.yaml down"
                sh "/usr/local/bin/docker-compose -f docker-compose.yaml down"
            }
        }
     }
}
