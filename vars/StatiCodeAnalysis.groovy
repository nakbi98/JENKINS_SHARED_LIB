def Call(){
    withSonarQubeEnv(credentialsId: 'sonarqube-api') {
    sh 'mvn clean package sonar:sonar'
}}