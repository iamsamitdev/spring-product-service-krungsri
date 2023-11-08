# Use official base image of Java Runtime
FROM arm64v8/openjdk:17-slim

# Who is MAINTAINER
MAINTAINER Samit Koyom, samit@gmail.com

# Copy jar file to container
COPY ./target/product-service-0.0.1-SNAPSHOT.jar product-api.jar

# Set port
EXPOSE 8181

# Run the JAR file
ENTRYPOINT ["java","-jar","/product-api.jar"]