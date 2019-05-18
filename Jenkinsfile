pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
           stage ('Docker compose run tests') {
                steps {
                 sh '''
                    /usr/local/bin/docker-compose -f docker-compose1.yaml up
                    '''
                }
            }
    }
}
