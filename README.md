# Testing Devin Code Migrations Scala

This repository contains a Scala project that uses sbt as its build tool.

## Setup

To set up the project, ensure that sbt is installed on your system. The project uses sbt version 1.9.9 and Scala version 2.13.12.

## Building the Project

To compile the project, run the following command in the root directory:

```
sbt compile
```

## Running Tests

To run the tests and ensure that everything is working as expected, use:

```
sbt test
```

All tests should pass, confirming that the project is correctly set up and functioning.

## Dependencies

The project includes the following main dependencies:
- ScalaTest version 3.2.9 for testing
- Apache Spark version 3.5.1 (core and SQL)
- Scalameta MUnit version 0.7.29 for testing

These dependencies are managed by sbt and should be automatically resolved and downloaded when you compile or test the project.

## Subprojects

The repository includes the following subprojects:
- `commonClasses` located in `platform/common-classes`
- `domainA` located in `subdomains/domain-A`

Each subproject has its own build settings and dependencies, as defined in the `build.sbt` file.

## Running the Application

To run the main application, execute:

```
sbt run
```

Ensure that you are in the root directory of the project when running this command.

For more detailed information on the project structure and sbt commands, refer to the sbt documentation.
