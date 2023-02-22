pipeline {
    agent any
    
    tools{
       maven 'maven-3.9.0'
    }
    
    options {
            timeout(time: 1, unit: 'HOURS')
        }
    stages {
        stage('Checkout') {
            steps {
   
              sh "cd $WORKSPACE/order-service && cat pom.xml"
              
              sh "cd $WORKSPACE/product-service && cat pom.xml"
                
               git 'https://github.com/songj01/microserviceDemo.git'
            }
        }
        
        stage('Build') {
            steps {
            
                echo  "$JOB_NAME"
                echo  "$PROJECT_NAME"
               
             //   sh "cd ${WORKSPACE}/order-service && mvn  clean package  -DskipTests"
             //   sh "cd ${WORKSPACE}/inventory-service && mvn  -DskipTests clean package"
              //  sh "cd ${WORKSPACE}/product-service && mvn -B -DskipTests clean package"
                
            }
            
        }
        
         stage('Unit Test') {
            steps {
        
        
                echo "$BUILD_NUMBER"
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
     post {
            failure {
               echo "Build failed in Jenkins: $JOB_NAME - #$BUILD_NUMBER"
          
            }
            unstable {
          
                echo 'Unstable build in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
            }
            success {
              
                echo "Build success in Jenkins: $JOB_NAME - #$BUILD_NUMBER"
            }
            always {
                cleanWs()
            }
        }

}
