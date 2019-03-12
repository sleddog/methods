pipeline {
    agent none

    stages {
        stage('Test') {
            agent {
                docker {
                    image 'python:2-alpine'
                }
            }
            steps {
                echo 'Testing Python combined solution'
                sh './python_combined_tests'
            }
        }
    }
}
