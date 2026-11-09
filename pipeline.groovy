pipeline {
    agent any
    stages {
        stage('pull the code') {
            steps {
                git branch: 'main', url: 'https://github.com/pujapatel81/EasyCRUD.git'
            }
        }
        stage('build the code') {
            steps {
                sh '''cd backend
                mvn clean package  -DskipTests'''
            }
        }
        stage('deploye the code') {
            steps {
                sh '''
                java -jar target\\spring-backend-v1.jar'''
            }
        }
    }
}
