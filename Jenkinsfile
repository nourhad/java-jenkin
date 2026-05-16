pipeline {
    agent any
    
    stages {
        stage('Exécution Maven') {
            steps {
                sh "mvn clean test package -X"
            }
            post {
                always {
                    junit testResults: '**/target/surefire-reports/*.xml', allowEmptyResults: true
                }
                success {
                    archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
                }
                failure {
                    echo "Maven build failed!"
                }
            }
        }
    }
}