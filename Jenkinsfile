pipeline {
    agent any

    tools {
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sandip-sawant/spring-devops-service']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image') {
            steps {
                script {
                    bat 'docker build -t sunpsldocker/devops-integration .'
                }
            }
        }
        stage('push docker image to hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpwd')]) {
                        bat 'docker login -u sunpsldocker -p June@#2024'
                    }
                    bat 'docker push sunpsldocker/devops-integration'
                }
            }
        }
    }
}