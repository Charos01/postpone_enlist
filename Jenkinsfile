pipeline {
    agent any
     tools {
        
         maven 'maven3'
         jdk 'jdk'
         'org.jenkinsci.plugins.docker.commons.tools.DockerTool' '18.09'

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
             sh'''
            sudo systemctl start docker
            '''
            sh'''
            docker build .
            '''
            }
  
        }
    }

}
     

