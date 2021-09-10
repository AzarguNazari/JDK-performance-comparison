#!/bin/bash

./mvnw clean -pl ./jdk-8/pom.xml spring-boot:build-image
./mvnw clean -pl ./jdk-11/pom.xml spring-boot:build-image
./mvnw clean -pl ./jdk-16/pom.xml spring-boot:build-image
