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
           sudo apt update
           sudo apt install software-properties-common
           sudo add-apt-repository --yes --update ppa:ansible/ansible
           sudo apt install ansible
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
     

