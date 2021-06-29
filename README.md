# sonarqube-java

## Setup

* Install docker
* Run command "docker-compose up"
* Setup Jenkins and SonarQube
* Create SonarQube webhook and add quality gates
* Create Jenkins Pipeline
* Build now

## Troubleshooting

* What went wrong: Task 'sonarqube' not found in root project 'sonarqube-java'.

  Solution - Run command "git update-index --chmod=+x gradlew"
  
* What went wrong: Execution failed for task ':sonarqube'. > Not authorized. Analyzing this project requires authentication. Please provide a user token in sonar.login or other credentials in sonar.login and sonar.password.

  Solution - Go to sonarqube web page, then go to administration, after that go to security and disable "Force User Authentication".
