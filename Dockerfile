FROM gradle:4.7.0-jdk8-alpine AS builder
RUN mkdir /home/gradle/src
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:8-jre-alpine
LABEL Luca Martinelli <luca.martinelli7cc@gmail.com>
RUN echo "Using Alpine linux image with openjdk"
RUN java -version
EXPOSE 1111
RUN echo "Deploying binary"
RUN mkdir /app
COPY --from=builder /home/gradle/src/SimpleRestProject-1.0/build/distributions/SimpleRestProject-1.0.tar /app/
WORKDIR /app
RUN tar -xvf SimpleRestProject-1.0.tar
RUN echo "Configuring startup"
WORKDIR /app/SimpleRestProject-1.0
#In order to pass any additional parameter you just need to put args into JAVA_OPTS env variable
#ENV JAVA_OPTS=
CMD bin/SimpleRestProject-1.0
