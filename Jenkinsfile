pipeline {
    agent any
    stages {
           stage ('Clean') {
                steps {
                sh 'mvn clean'
                }
            }
           stage ('Clean') {
            steps {
                sh 'mvn compile'
                }
           }
           stage ('Clean') {
           steps {
                           sh 'docker-compose -f docker-compose1.yaml up'
                           }
           }
    }
}
