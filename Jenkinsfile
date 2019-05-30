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
            stage('Start Zalenium and Run Tests')   {
                            stage('Run Tests') {
                                steps {
                                           sh 'mvn clean test verify'
                                       }
                             }

           }
    }
}
