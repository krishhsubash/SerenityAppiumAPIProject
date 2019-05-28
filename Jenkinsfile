pipeline {
    agent any
    stages {
           stage ('Run docker-compose test run') {
           steps {
                      sh 'docker-compose -f docker-compose1.yaml up'
                 }
           }
    }
}
