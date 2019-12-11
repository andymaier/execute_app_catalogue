FROM openjdk

COPY target/*.jar .

CMD ["java","-jar","catalogue-1.0.0-SNAPSHOT.jar","--spring.cloud.consul.host=consul"]
