pipeline {
    agent any
     tools {
        
         maven 'maven3'
         jdk 'jdk'
         docker 'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'

         }
    environment {
    DOCKER_CERT_PATH = credentials('id-for-a-docker-cred')
   }
    stages {
        stage('Initialize'){
            steps {
            sh '''
              ls
            '''
            sh '''
            mvn clean install -DskipTests
            
            
            '''
            }
  
        }stage('docker'){
            steps{
                sh '''
                docker --version
                '''
            }
        }
    }

}
     

