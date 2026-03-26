# Java Programming Fundamentals

This repository contains multiple standalone Java study projects focused on object-oriented programming, design patterns, collections, algorithms, JPA, and unit testing.

## Repository Structure

- `AulaPOO` - OOP domain model for students, courses, subjects, and enrollments.
- `BEE1168_LED` - Algorithm exercises (Beecrowd 1168 and quadratic formula challenge).
- `br.computacao.aulajpa` - JPA/Hibernate example project.
- `calculadoraAula` - Basic calculator with tests.
- `CollectionsClass` - Java Collection API examples.
- `Construtores` - Constructor-focused basic classes.
- `CursoStrategyy` - Strategy pattern applied to database access.
- `HerancaSimuladorDePatos` - Duck simulator using inheritance.
- `JavaMaven` - Minimal Java module skeleton.
- `junit-5-basica` - Basic JUnit calculator exercises.
- `Model` - Sales model classes.
- `Model_Vendas` - Sales model with controllers and console application.
- `Project_School` - School domain model.
- `StrategyCompactar` - Compression strategy pattern examples.
- `StrategySimuladorDePatos` - Duck simulator using strategy pattern.
- `TemperaturaPorOrdenacao` - Temperature sorting by patient profile.

## Requirements

- Java 8+ (some modules use Java 11/17 settings)
- Maven (for Maven-based projects)
- Eclipse (optional, for `.project`/`.classpath` compatibility)

## Running Projects

Each folder is independent. Open and run each project separately.

For Maven modules:

```bash
mvn clean test
```

or

```bash
mvn clean package
```

For non-Maven modules, run from your IDE as a standard Java application.

## Notes

- Naming has been standardized to English for classes, methods, and variables.
- Package/folder structure was preserved to reduce migration risk.
- Some projects use local database configuration; update connection settings for your environment before running.
