def call() {
    pipeline {
        agent any
        environment {
            ENV_NAME = "DEV"
        }
        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Build') {
                steps {
                    echo "Building project for ${env.ENV_NAME}"
                    echo 'Build is successful'
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying to ${env.ENV_NAME}"
                    echo 'deploy is successful'
                }
            }
        }
    }
}
