pipeline {
    agent any

    stages {
       
        stage('Build') {
            steps {
                echo 'Build'
                bat 'mvn compile'
            }
        }
        stage('test') {
            steps {
                echo 'test'
                bat 'mvn test'
            }
        }
        stage('package') {
            steps {
                echo 'package'
                bat 'mvn package'
            }
            
        }

        }
        stage('Deploy') {
            steps {
                
                echo 'Deploy'
                
            }
        }
    }
}
