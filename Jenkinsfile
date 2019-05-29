pipeline {
    agent any
    tools {
            maven 'maven'
          }
    stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
                }
                }
           stage ('Start Zalenium') {
           steps {
                      sh 'mvn clean'
                      sh '/usr/local/bin/docker-compose -f docker-compose1.yaml up -d zalenium'
                      sh 'mvn test verify'
                 }
           }
           stage('Zalenium Down') {
                steps {
                    sh '/usr/local/bin/docker-compose -f docker-compose1.yaml down'
                }
           }
    }
}
