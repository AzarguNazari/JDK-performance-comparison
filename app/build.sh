#!/bin/bash

docker build -t jdk17 -f jdk17.Dockerfile .
docker build -t jdk18 -f jdk18.Dockerfile .
docker build -t jdk19 -f jdk19.Dockerfile .
