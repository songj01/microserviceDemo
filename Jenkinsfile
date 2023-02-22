pipeline {
    agent {
    
       docker {
       
          image 'maven:3.9.0-eclipse-temurin-11'
          args '-v /root/.m2:/root/.m2'
    }
   }
    stages {
        stage('Checkout') {
            steps {
               git 'https://github.com/songj01/microserviceDemo.git'
            }
        }
        
        stage('Build') {
            steps {
            
                sh'cd ${WORKSPACE}/product-service &&mvn -B -DskipTests clean package'
            
                sh'cd ${WORKSPACE}/order-service &&mvn -B -DskipTests clean package'
                
            }
            
        }
        
         stage('Unit Test') {
            steps {
                echo 'this a test stage'
            }
        }
        
          stage('Build Docker Image') {
            steps {
                echo 'this a test stage'
            }
        }
        
           stage('Run Docker Image') {
            steps {
                echo 'this a test stage'
            }
        }
        
          stage('Intergration Test') {
            steps {
                echo 'this a test stage'
            }
        }
        
         stage('Performance Test') {
            steps {
                echo 'this a test stage'
            }
        }
        
        
         stage('Code Quality check') {
            steps {
                echo 'this a sonarQube stage'
            }
        }
        
         stage('Build Docker image') {
            steps {
                echo 'this a test stage'
            }
        }
    }
}
