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
            docker.build("postpone_enlist")
               
            }
  
        }
    }

}
     

