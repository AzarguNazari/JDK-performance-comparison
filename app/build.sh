#!/bin/bash

docker build -t jdk8 -f jdk8.Dockerfile .
docker build -t jdk17 -f jdk17.Dockerfile .
docker build -t jdk18 -f jdk18.Dockerfile .
docker build -t jdk19 -f jdk19.Dockerfile .
