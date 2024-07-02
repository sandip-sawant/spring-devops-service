FROM openjdk:17-oracle
EXPOSE 8080
ADD target/destps-integration.jar devops-integration.jar
ENTRYPOINT [ "java","-jar","devops-integration.jar" ]