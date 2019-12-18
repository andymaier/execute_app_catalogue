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

        stage('Docker push') {             
             sh "docker tag catalogue localhost:5000/catalogue"
             sh "docker push localhost:5000/catalogue"
        }

        stage("Deploy") {
            sh "docker rm -f catalogue || echo 'ok'"
            sh "docker pull localhost:5000/catalogue"
            sh "docker run -d --name catalogue --net cp-all-in-one_default -p 11081:8081 localhost:5000/catalogue"
        }
}
