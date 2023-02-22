pipeline {
    agent any
    
    tools{
       maven 'maven-3.9.0'
    }
    stages {
        stage('Checkout') {
            steps {
         echo  "$JOB_NAME"
                echo "$BUILD_NUMBER"
              sh 'cd $WORKSPACE/order-service && cat pom.xml'
                
               git 'https://github.com/songj01/microserviceDemo.git'
            }
        }
        
        stage('Build') {
            steps {
            
                echo  "$JOB_NAME"
               
             //   sh "cd ${WORKSPACE}/order-service && mvn  clean package  -DskipTests"
             //   sh "cd ${WORKSPACE}/inventory-service && mvn  -DskipTests clean package"
              //  sh "cd ${WORKSPACE}/product-service && mvn -B -DskipTests clean package"
                
            }
            
        }
        
         stage('Unit Test') {
            steps {
        
                echo  "$JOB_NAME"
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
                emailext attachLog: true, body: 'Check console output at $BUILD_URL to view the results. \n\n ${CHANGES} \n\n -------------------------------------------------- \n${BUILD_LOG, maxLines=100, escapeHtml=false}',
                to: env.commiteremail + env.EMAIL_TO,
                subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
            }
            unstable {
                emailext body: 'Check console output at $BUILD_URL to view the results. \n\n ${CHANGES} \n\n -------------------------------------------------- \n${BUILD_LOG, maxLines=100, escapeHtml=false}', 
                to: env.commiteremail + env.EMAIL_TO,
                subject: 'Unstable build in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
            }
            success {
                emailext attachLog: true, body: 'Check console output at $BUILD_URL to view the results. \n\n ${CHANGES} \n\n -------------------------------------------------- \n${BUILD_LOG, maxLines=100, escapeHtml=false}',
                to: env.commiteremail + env.EMAIL_TO,
                subject: 'Build success in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER'
            }
            always {
                cleanWs()
            }
        }

}
