# sonarqube-java

## Setup

* Install docker
* Run command
  docker-compose up
* Setup Jenkins and SonarQube
* Create SonarQube webhook and add quality gates
* Create Jenkins Pipeline
* Build now

## Troubleshooting

* For below error

  + ./gradlew sonarqube
  /var/jenkins_home/workspace/sonarqube-code-coverage@tmp/durable-8c7abd6c/script.sh: 1: /var/jenkins_home/workspace/sonarqube-code-coverage@tmp/durable-8c7abd6c/script.sh: ./gradlew: Permission denied


  Run command
  git update-index --chmod=+x gradlew

