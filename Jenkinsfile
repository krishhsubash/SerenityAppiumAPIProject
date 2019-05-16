pipeline {
    agent any
    stages {
        stage('Build Jar') {
        agent {
            docker {
                image 'maven:3-alpine'
                args '-v $HOME/.m2:/root/.m2'
            }
            }
        }
        stage('Build Image') {
            steps {
                script {
                    app = docker.build("krishhsubash/automationFramework")
                }
            }
        }
        stage('Push Image') {
            steps {
                  script {
                        docker.withRegistry('https://registry.hub.docker.com','dockerhub') {
                        app.push("${BUILD_NUMBER}")
                        app.push("latest")
                        }
                  }
            }

        }
        stage('Start test') {
            steps {
                sh "docker-compose -f docker-compose1.yaml up"
            }
        }
        stage('stop docker') {
            steps {
                sh "docker-compose -f docker-compose1.yaml down"
            }
        }
     }
}
