pipeline {
    agent any
    node(label: 'master') {
           stage ('Clean') {
                steps {
                sh 'mvn clean'
                }
            }
           stage ('Compile') {
            steps {
                sh 'mvn compile'
                }
           }
           stage ('Run docker-compose test run') {
           steps {
                      sh 'docker-compose -f docker-compose1.yaml up'
                 }
           }
    }
}
