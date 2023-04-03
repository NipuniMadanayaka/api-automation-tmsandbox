# UI Automation Exercise

## Table of contents

* [ Overview ](#Overview)  
* [ Automated scenarios ](#Scenarios)
* [ Technologies used ](#Technologies)
* [ Prerequisites ](#Prerequisites)
* [ Steps to run the project ](#Steps)
* [ Test results ](#Results)
  
<a name="Overview"></a>
### Overview

In this project, I have automated the API
endpoint, https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false, using a RestAssured based maven
project.

<a name="Scenarios"></a>
### Automated scenarios

1. Validate the acceptance criteria, name = "Carbon credits"
2. Validate the acceptance criteria, canRelist = true
3. Validate the acceptance criteria, the promotions element with Name = "Gallery" has a description that contains the
   text "Good position in category"

<a name="Technologies"></a>
### Technologies used

* Java: 20
* TestNG: 7.4.0
* Apache Maven build tool
* RestAssured: 4.4.0
* Jackson Databind: 2.9.5

<a name="Prerequisites"></a>
### Prerequisites

* Install and setup Java 20
* Install and setup Apache Maven
* Install Allure

```sh
$ npm install -g allure-commandline
```

<a name="Steps"></a>
### Steps to run the project

* Clone the project from the git
* Open project as 'Maven project' from IDE ( IntelliJ IDEA).
* Resolve the dependencies

```sh
$ mvn clean install -DskipTests=true
```

* Run the test suite

```sh
$ mvn clean test -Dsuite=tmSandboxAPIAutomation
```

* Open the project folder from terminal and type command to generate allure
  report.

```sh
$ allure generate --clean
```

```sh
$ allure open
```

* In allure-report folder, open index.html file through the browser

<a name="Results"></a>
### Test results

The result can be generated as the allure report

* Results
  ![api-test-result-one.png](api-test-result-one.png)

