# mycar Spring Boot REST API

**mycar** involves implementing an application in java which provides a REST API with endpoints for searching, creating, updating and deleting “server” objects.

***Tools Required and Setup Process :***

- The following application utilizes maven project structure and is created entirely on Spring tool Suite.*(https://spring.io/tools)*

- To get started, you need Spring Boot maven project with required dependencies. Go to *https://start.spring.io/* to create your Spring Boot Project and add necessary dependencies.

![1](https://user-images.githubusercontent.com/65592677/164176489-759dc4fe-bb49-4819-a9da-59fcb8e4f449.png)

- The ***Spring Web dependency*** allows you to create RESTful applications using Spring MVC and ***Spring Data MongoDB*** provides support for connecting MongoDB database to your application.

- Now, generating the project will download a zip file of Spring Boot Project with all dependencies added. Just unzip the file and import the project folder on Spring tool suite. Once you are done, your project structure might look like this :

![2](https://user-images.githubusercontent.com/65592677/164176864-28b57bad-89d7-4790-b335-02da4234a00b.png)

- Here, ***src/main/java*** will contain all your necessary packages with java classes.

- ***src/main/resources*** will contain ***application.properties*** configuration file which will be required when you configure your mongodb database to connect with your application.

- ***pom.xml*** file contains all the necessary dependencies defined for this project.

- The package structure inside ***src/main/java*** is as follows :

![3](https://user-images.githubusercontent.com/65592677/164177629-be1bc479-a203-49f3-9de2-76ae8333cee9.png)

- ***MycarApplication.java*** is the entry point for execution of this application as it contains main method.

- ***CarController.java*** contains the controller class which receives the http requests and delegates it to various methods depending on request type.

- ***Cars.java*** defines the structure of json object.It includes the type of data that will be stored as json object in database and used depending on http request.

- ***CarData.java*** interface extends from ***MongoRepository*** interface which provides you with built in methods to perform CRUD operations with data.

- Now to showcase the response from the database you need to connect the database. For that you neeed to configure ***application.properties*** with following configuration.

![4](https://user-images.githubusercontent.com/65592677/164178646-1c85d13e-2ead-4ba1-8519-e273e83257bd.png)

- Note that you need to create a new database in mongodb using "**use**" command before you can configure it to work with your spring boot application.More on that [here.](https://www.tutorialspoint.com/mongodb/mongodb_create_database.htm)

- To send http requests you need ***postman*** tool.Download postman from *https://www.postman.com/downloads/*

- You are now ready to send request.

- Start your Spring Boot Application from Spring Tool Suite(STS).

![5](https://user-images.githubusercontent.com/65592677/164185566-1e0af852-30ef-4d4f-944a-325a57158bbb.png)

- Now in Postman you will send **GET** request to retrive data from database.

![5](https://user-images.githubusercontent.com/65592677/162919941-35dbb87c-c2b4-4107-b046-72741b06856d.png)

- The Response will return no json object as the database is empty.

- You will now use **POST** request to create car object and send it to the database.

![6](https://user-images.githubusercontent.com/65592677/162927938-c4ab0779-435b-425f-ac86-9bc619b9eeca.png)

- If you send a **GET** request again, you will now receive a json object which you created in previous step using **POST** request.

![7](https://user-images.githubusercontent.com/65592677/162928013-c8a168fc-045e-4929-b1af-fc255088baad.png)

- You will now add another car object using **POST**.

![8](https://user-images.githubusercontent.com/65592677/162928097-5aec25c9-c2d0-4a06-82c3-7a87f92d13e0.png)

![9](https://user-images.githubusercontent.com/65592677/162928133-ffbc3182-1037-41a5-94ce-0c2bc842f382.png)

- You can use **GET** request to get specific car object by specifying its id in the http request.

 ![10](https://user-images.githubusercontent.com/65592677/162928182-5ee09a5f-497b-4807-a914-4679dfa068ac.png)

- You can use **PUT** request to update existing object by specifying new object data in the http request body.

![11](https://user-images.githubusercontent.com/65592677/162922706-ef374d40-f4ba-451d-a735-ae728e21217e.png)

![12](https://user-images.githubusercontent.com/65592677/162922735-7e9789e4-5fc6-4c69-a42e-6943426ca490.png)

- You can use **DELETE** request to delete existing car object by specifying its id in the http request.

![13](https://user-images.githubusercontent.com/65592677/162924915-144e0378-5112-4a45-9385-97d5706a347e.png)

![14](https://user-images.githubusercontent.com/65592677/162924951-cfb8360b-41f9-4a5b-b3c9-e9f4fb1db482.png)
