Daily learning 

# Getting to know Spring Data JPA in practice with Java

Project developed at Bootcamp Carrefour Web Developer of Digital Innovation One with expert guidance [Camila Cavalcante](https://www.linkedin.com/in/cami-la/ "Camila Cavalcante").
Learning the main concepts of object relational mapping (ORM) using Spring Data JPA in a RESTful API developed with an emphasis on modeling your entities, in the domain of a gym.

# Prerequisites

* Spring Boot Fundamentals
* SQL Basics

# Road map

* Presentation of the Base Project
* PostgreSQL DBMS database configuration
* Applying the annotations
* Execution of the backend flow: Controller - Service - Repository
* Validation - Hibernate Validator
* Advanced Query Derived Query - Native Query

# Technologies Used

* IntelliJ IDE
* Java 11
* Maven
* Spring Web
* SpringData JPA
* PostgreSQL Driver
* Hibernate Validator
* Lombok
* Postman

<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/">
Mapping Annotations </a></h2>


* @Entity
Used to specify that the annotated class currently represents an entity type.

* @Table
Used to specify the main table of the currently annotated entity.

* @Id
Specifies the entity identifier. An entity must always have an identified attribute.

* @GeneratedValue
Specifies that the entity identifier value is generated automatically.

* @Column
Used to specify the mapping between a base entity attribute and database table column.

* @JoinColumn
Used to specify the FOREIGN KEY column. Indicates that the entity is responsible for the relationship.

* @OneToMany
Used to specify a one-to-many database relationship.

* @OneToOne
Used to specify a one-to-one database relationship.

* @ManyToOne
Used to specify a many-to-one database relationship.

* @shell of
Cascading operations only makes sense in Parent-Child relationships.

* mappedBy
Indicates which is the inverse or non-dominant side of the relationship.

# Useful links

<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
    <li><a href="https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted">Validation Reference Implementation: Reference Guide</a></li>

</ul>

# Follow the original project in the github repository of the specialist [Camila Cavalcante](https://www.linkedin.com/in/cami-la/ "Camila Cavalcante") at the link https://github.com/cami-la/academia-digital
