pipeline {
    agent any
     tools {
        
         maven 'maven3'
         jdk 'jdk'
         dockerTool 'docker'
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
            sudo su
            sudo jenkins
            sudo systemctl start docker
            '''
            sh'''
            docker build .
            '''
            }
  
        }
    }

}
     

