pipeline {
    agent any
    stages {
           stage ('Clean') {
                steps {
                bat "mvn clean"
                }
            }
           stage ('Compile') {
            steps {
                bat "mvn compile"
                }
           }
           stage ('Run docker-compose test run') {
           steps {
                           bat "docker-compose -f docker-compose1.yaml up"
                           }
           }
    }
}
