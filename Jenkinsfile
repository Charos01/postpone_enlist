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
             sh '''
            mvn compile com.google.cloud.tools:jib-maven-plugin:3.2.1:build -Dimage=Postpone_enlist
            '''
            
            }
  
        }
    }

}
     

