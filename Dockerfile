FROM maven:3.8-openjdk-17 as maven
WORKDIR /usr/pet-clinic
ARG PORT=8080
ENV SERVER_PORT=$PORT
EXPOSE $PORT
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn clean package -Dmaven.test.skip=true -q
ENTRYPOINT java -jar target/pet-clinic-0.0.1-SNAPSHOT.jar