pipeline{
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/home/ubuntu/.m2'
        }
    }

    stages {
        stage('BUild'){
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}