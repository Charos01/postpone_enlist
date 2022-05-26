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
        stage('Docker')
            steps {
                sh '''
                 sudo apt-get update
                 sudo apt-get install curl apt-transport-https ca-certificates software-properties-common
                 curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
                 sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

                 sudo apt update
                 apt-cache policy docker-ce
                 sudo apt install docker-ce

                 '''
            }
        }
    }
     
}
