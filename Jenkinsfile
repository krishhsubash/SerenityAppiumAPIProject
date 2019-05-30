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
            stage('Embed Zalenium') {
                steps {
                    script {
                        currentBuild.rawBuild.project.setDescription("<iframe src='http://localhost:4444/grid/admin/live' width='1400' height='500'></iframe>")
                    }
                }
            }
            stage('Run Tests') {
                steps {
                                           sh 'mvn clean test verify'
                }
            }

           }
    }
