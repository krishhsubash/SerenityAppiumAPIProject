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
           stage ('Run Maven Tests') {
           steps {
                      sh 'mvn clean test verify'
                 }
           }
    }
}
