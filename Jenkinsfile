node {
        stage("Checkout") {
            checkout scm
        }

        stage('Maven Build') {
            sh "mvn -DskipTests=true package"
        }

        stage('Docker image') {
             docker.build("catalogue")
        }

        stage("Deploy") {
            sh "docker rm -f catalogue || echo 'ok'"
            sh "docker run -d --name catalogue --net cp-all-in-one_default -p 11080:8080 catalogue"
        }
}
