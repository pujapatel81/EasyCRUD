pipeline {
    agent any
    stages {
        stage('pull the code'){
            git branch: 'main', url: 'https://github.com/pujapatel81/EasyCRUD.git'
        }
        stage('build code'){
            sh '''cd backend
            mvn clean package -DSKIPTests'''
        }
        stage('deploy'){
            sh 'echo deploying app'
        }
    }
}