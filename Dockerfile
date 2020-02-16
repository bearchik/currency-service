FROM openjdk:8

MAINTAINER Mikhail <bearchik@gmail.com>

#Build stage
RUN  \
  export DEBIAN_FRONTEND=noninteractive && \
  sed -i 's/# \(.*multiverse$\)/\1/g' /etc/apt/sources.list && \
  apt-get update && \
  apt-get install -y git maven && \
  git clone https://github.com/bearchik/currency-service.git /tmp/currency-service && \
  mvn -f /tmp/currency-service/pom.xml clean package && \
  APPVERSION=`mvn -f /tmp/currency-service/pom.xml help:evaluate -Dexpression=project.version -q -DforceStdout` && \
  mv /tmp/currency-service/target/currency-$APPVERSION.jar /usr/local/bin/currency-service.jar && \
  rm -rf /tmp/currency-service

EXPOSE 80
ENTRYPOINT ["java","-jar","/usr/local/bin/currency-service.jar"]
