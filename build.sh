#!/bin/bash
mvn clean install
docker build -t localhost:5000/msa-catalogue-test:version2.0 .
docker push localhost:5000/msa-catalogue-test:version2.0
