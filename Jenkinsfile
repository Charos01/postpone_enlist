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
              pwd
            '''
            sh '''
            mvn clean install -DskipTests
            '''
             sh '''
            mvn compile com.google.cloud.tools:jib-maven-plugin:3.2.1:build -Dimage=charosregistry.azurecr.io/charos/postpone:latest  -Djib.to.auth.username=charosRegistry  -Djib.to.auth.password=W+uuvdVvHnau2lqgaqRX7bOeAfexMYxB
             
            '''
             sh '''
             ansible-playbook docker-playbook.yml             
            '''
            
            }
  
        }
        }

}
     

