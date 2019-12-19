#!/bin/bash
mvn clean install
docker build -t localhost:5000/catalogue .
docker push localhost:5000/catalogue
