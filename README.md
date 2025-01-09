# **QA Selenium Automation with java**   
![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)

## **Table of Contents**  
1. [Overview](#overview)  
2. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)  
   - [Installation](#installation)
3. [Approach Followed](#approach-followed)
---

## **Overview**  
This repository has the test suite for testing the search bar functionality in the ![Selenium Playground](https://www.lambdatest.com/selenium-playground/table-sort-search-demo)  for New York entry.

---

## **Getting Started**  

### Prerequisites  
List of resources required to run the project: 
- [Eclipse IDE or any other IDE]  
- [Java]  
- [Selenium]
- [TestNG] 

### Installation  
Step-by-step instructions for setting up the project locally.  

1. Clone the repository
2. Navigate to project directory
3. Build the Maven project and clean install it
4. Run the test suite as TestNG class

---

## **Approach Followed**
- The test framework basically follows a Page Object Model(POM) approach.
- The test case is in /qaAssessment/src/test/java/AnanayMahajan/Tests/ package.
- The class of the test folder inherits from the base class: AnanayMahajan/TestComponents/BaseTest.java which is basically responsible for object creation and driver initialization.
- I am using implicit wait as there was not much need to wait for any component explicitly as everything is rendered all-together.
- I should have created actions class independently to do all the tasks such as entering value in search bar but because it was just one page so skipped that and included action methods in page class itself.
- I am using soft assertions to do the validations.
- I have enclosed all the test method in try-catch-finally block to catch any exceptions that might occur during the execution.
