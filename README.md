# My-Software-Architecture-MicroServices-

<img width="936" alt="Screen Shot 2022-11-28 at 11 41 22 PM" src="https://user-images.githubusercontent.com/92329294/204448360-8dec309b-e101-4897-9eed-6914cc41a309.png">


Software architecture project
Implement a library system according the microservice architecture style.
The library system should contain the following services:
1. Customers service: you can get, add, update and delete customers. Customers have a
customernumber, name, phone, email, street, city, zip.
2. BooksQuery service: you can get books. The book(s) that is/are returned by this service
has an isbn, title, description, author name and all reviews of this book. Because this
service is used a lot, make sure you run 2 instances of this booksQuery service. The API
gateway should load balance between these instances.
3. BooksCommand service: you can add, update and delete books. Books have an isbn,
title, description and author name.
4. Review service: you can add reviews for a certain book. Reviews have an isbn, review
rating (number between 0 and 5), customer name and a description.
5. Borrowings service: you can get, add, update and delete a borrowing. This borrowing
contains all the details of the borrowing including borrowingNumber, date,
customernumber, customerName, isbn and book title.
Store all data of the services in a Mongo database. For this project you can use 1 mongo
instance for all services. Make sure all services use a different mongo collection.
Implement the following supporting services: registry, API gateway, Zipkin and a config
server.
When a customer borrows a book in the borrowingservice, the only data provided is the
isbn number and the customernumber. The borrowing service will then call the book service
for the book information, and call the customer service for customer information. 
Implement the following events:
 When we change customer data, the corresponding borrowing(s) should also change
 When we change book data, the corresponding borrowing(s) should also change
 When we add, update or delete book data, the corresponding bookquery service should
update its data
 When you add a review for a book, the bookquery service should update its data
Make sure you implement the services using the best practices we learned in this course.
Think about layers, adapters and DTO’s, domain classes, etc.
Write a client application that executes the following scenario:
1. Add 2 customers to the customer service
2. Add 2 books to the bookcommand service
3. Add 2 reviews for every book in the review service, one review per customer
4. Get all books from the booksquery service with all the information of the books and
print it to the console.
5. Add a borrowing to the borrowingservice for a book and a customer
6. Change the title of this book that is borrowed
7. Get this book from the booksquery service and check if the title has changed
8. Get the corresponding borrowing and check if the book title has changed
The client application is a plain java application that writes the output in the console. It does not
have a web UI.
Deliverables:
- All code that you write. Every microservice should be in a separate Maven project that can
be opened with IntelliJ.
- A UML class diagram of the design of the classes in every service (in PDF)
- A video of a 15-20 minutes presentation of your application.
Presentation
- Minimal 15 minutes, maximal 20 minutes
o Your presentation should demo all the important aspects of your code
 Show quickly the UML class diagram for every service (~4 minutes)
 Show that the services are registered in the registry (~1 minute)
 Show the configuration files in github (~2 minutes)
 Show running the client application and its output (~4 minutes)
 Show the topics and messages in Kakfka with KafkaMagic. (~2 minutes)
 Show the content in the Mongo database (~3 minutes)
 Show the graph created by zipkin (~1 minute)
o Do NOT explain the project, I know the project.
o Do NOT explain your code, I have your code.
This project is done individually. All your code and material needs to be created by yourself.
The due date for this project is Thursday November 24 at 9:45 AM ( projects that are submitted
later will lose points). 
You do not need to come to class for this project.
You only need to come to class on Wednesday November 23 at 10:00 AM in the morning and on
Thursday November 24 at 10:00 AM
You are expected to work on this project in total of 4 days. Assuming you will study on Saturday and
Sunday for the final exam, you are expected to work on this project on the following days:
 Thursday Nov. 17 afternoon/evening
 Friday Nov. 18 whole day
 Monday Nov. 21 afternoon/evening
 Tuesday Nov. 22 whole day
 Wednesday Nov. 23 whole day
How to submit your project?
The project needs to be submitted in the assignment section is sakai. You can submit the code, but
you cannot upload your video (size is too large) in sakai. Upload your video to google drive, make it
available to everyone, and submit the link as part of your assignment. It is important that the link is
available to everyone.
The grading of this project is based on:
- The quality of your code and design
- The quality of the presentation.
- Did you implement all requirements? 
