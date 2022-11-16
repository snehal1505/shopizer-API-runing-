#!/bin/bash

JENKINS_NODE_COOKIE==dontKillMe ./mvnw spring-boot:run & > /dev/null &

