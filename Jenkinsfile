pipeline {
    agent any
    
    tools{
       maven 'maven-3.9.0'
    }
    stages {
        stage('Checkout') {
            steps {
             echo "$WORKSPACE"
     echo  "$PROJECT_NAME"
                echo '${JOB_NAME}'
                echo "${JOB_NAME}"
              sh 'cd $WORKSPACE/order-service'
              sh 'cat pom.xml'
                
               git 'https://github.com/songj01/microserviceDemo.git'
            }
        }
        
        stage('Build') {
            steps {
            
                
                 sh 'cd $WORKSPACE/order-service'
                sh "cd ${WORKSPACE}/order-service && mvn  clean package  -B -DskipTests"
                sh "cd ${WORKSPACE}/inventory-service && mvn -B -DskipTests clean package"
                sh "cd ${WORKSPACE}/product-service && mvn -B -DskipTests clean package"
                
            }
            
        }
        
         stage('Unit Test') {
            steps {
                echo '${JOB_NAME}'
                echo "${JOB_NAME}"
                echo  $JOB_NAME
                echo  "$JOB_NAME"
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
                echo 'this a test stage1'
            }
        }
    }
}
