pipeline {
    agent any
    
    
       tools { 
        maven 'maven-3.9.0' 
    }

    stages {
        stage('Checkout') {
            steps {
               git 'https://github.com/songj01/microserviceDemo.git'
            }
        }
        
        stage('Build') {
            steps {
            
                sh'cd product-service'
                sh'mvn clean package'
                
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
