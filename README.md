# CQRS Design Pattern

CQRS stands for Command Query Responsibility Segregation. It separates read(Query) and update(Command) operations for a data store. Implementing CQRS in your application can maximize its performance, scalability, and security. The flexibility created by migrating to CQRS allows a system to better evolve over time and prevents update commands from causing merge conflicts at the domain level.

![](img/CQRS.png)

The above diagram shows the architecture of CQRS pattern. In this project we have the read and write model for performing different operations on user bank account info. When the user just wants to know it's account info the read model is used, whereas when the user wants to perform any operation that results in change of it's bank account information in that case the write model is used. It's very important to keep the write and read database in synchronization. To achieve that, we've used Apache Kafka. Whenever there is a change in the write database the change is published to the kafka topic after that the kafka consumer makes the required changes to the read database.

We have two application here:

* credit-card-bill-payment
* user-bank-account

The former application performs the bill payment which results in update of users bank balance. Once the value is updated in the write database, the bill-payment application which acts as a kafka producer publishes the updated data to the kafka topic. Once the data is published the user-bank-account(kafka consumer) which is subscribed to the same kafka topic updates the read database accordingly.
