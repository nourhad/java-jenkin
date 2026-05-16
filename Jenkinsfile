pipeline {
    agent any
    
    parameters {
        string(name: 'PROJECT_PATH', defaultValue: '/home/java-jenkin', description: 'Chemin du projet')
        choice(name: 'MAVEN_GOAL', choices: ['test', 'clean test', 'package'], description: 'Goal Maven')
    }
    
    stages {
        stage('Exécution Maven') {
            steps {
                dir(params.PROJECT_PATH) {
                    sh "mvn ${params.MAVEN_GOAL}"
                }
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}