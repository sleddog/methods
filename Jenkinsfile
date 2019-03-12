pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Python combined solution'
                sh 'which python3'
                sh 'curl "https://bootstrap.pypa.io/get-pip.py" -o "get-pip.py"'
                sh 'python3 get-pip.py --user'
                sh 'pip3 --help'
                sh 'pip3 --version'
                //sh './python_combined_tests'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
