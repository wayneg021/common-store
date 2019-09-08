FROM java:8-jdk-alpine

COPY ./target/account-svc-0.0.1.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch account-svc-0.0.1.jar'

ENTRYPOINT ["java", "-jar", "account-svc-0.0.1.jar"]