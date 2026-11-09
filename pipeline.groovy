pipeline {
    agent any
    stages {
        stage('pull the code'){
            steps {
            git branch: 'main', url: 'https://github.com/pujapatel81/EasyCRUD.git'
           }
        }
        stage('build code'){
            steps{
            sh '''cd backend
            mvn clean package -DSKIPTests'''
        }
    }
        stage('deploy'){
            steps {
            
            sh 'echo deploying app'
        }
        }
    }
}