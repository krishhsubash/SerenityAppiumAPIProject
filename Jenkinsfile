pipeline {
    agent any
        stages('Execute docker compose Command') {
            steps {
                bat "docker-compose up"
            }

        }
        post {
            always {
                archiveArtifacts artifacts: 'target/**'
                bat "docker-compose down"
            }
        }
}