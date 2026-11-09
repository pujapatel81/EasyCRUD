pipeline {
    agent any
    stages {
        stage('pull the code') {
            steps {
                git branch: 'main', url: 'https://github.com/pujapatel81/EasyCRUD.git'
            }
        }
        stage('build and make artifact') {
            steps {
                sh '''cd backend
                mvn clean package  -DskipTests'''
            }
        }
        stage('deploye the code') {
            steps {
                sh 'echo deploy'
                
            }
        }
    }
}
