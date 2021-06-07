pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
                bat 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello World'
                bat 'mvn install'
            }
        }
                stage('Deploy') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
