pipeline {
    agent any
     tools {
        
         maven 'maven3'
         jdk 'jdk'
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
     

