<h1 align="center"> Voxy Assessment </h1> <br>

<p align="center">
  Word Count Challenge
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Testing](#testing)


## Introduction

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/e91606af4a364076a7058c5ea1c006a8)](https://www.codacy.com/app/joneubank/microservice-template-java?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=overture-stack/microservice-template-java&amp;utm_campaign=Badge_Grade)
[![CircleCI](https://circleci.com/gh/overture-stack/microservice-template-java/tree/master.svg?style=shield)](https://circleci.com/gh/overture-stack/microservice-template-java/tree/master)

As a user when I view the application then I see a form containing a text box to enter a body of text and when I submit the form with some text then I see a result containing the number of words in the text box
and when I submit the form with an empty text then I see a form error telling me that some text input is required.

## Features

* Spring MVC Web Application
* Spring Data with MariaDB
* Boostrap features
* Thymeleaf implementations
* Junit 5 for testing


## Requirements
The application can be run locally.
If you want to use the spring data features you must install de mariaDB

### Local
* [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/download.cgi)
* [MariaDB](https://mariadb.org/download/?t=mariadb&p=mariadb&r=10.10.0) 

## Quick Start
Make sure the applications.properties file for configuring the database connection if you wish so
The default value running locally on its default port `8080`.

### Run Local

```bash
$ mvn spring-boot:run
```
or run the main method in VoxyApplication class on your IDE of choice

Application will run by default on port `8080`

Configure the port by changing `server.port` in applications.properties


## Testing
VoxyApplicationTests class for smoke test scenarios

