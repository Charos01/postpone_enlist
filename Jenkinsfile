pipeline {
    agent any
     tools {
        
         maven '3'
         jdk 'jdk9'
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
  
        }
    }
}
     

