#!/bin/bash

echo "*******************************"
echo "***** Building Jar ************"
echo "*******************************"

WORKSPACE=/var/lib/jenkins/workspace/bill-pay-app

docker run --rm  -v $WORKSPACE:/app -v /root/.m2/:/root/.m2/ -w /app  maven:3.8.3-openjdk-17 "$@"