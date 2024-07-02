# Spring-Framework-Inventory-Management-System
This customizable Spring Framework application provides a sample store like Aerial Innovations with real-time inventory management, minimum and maximum stock levels, and purchase tracking.

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Project Overview: Tailored Inventory Management Application</h1>
    <p>This project showcases the ability to build, customize, and maintain a full-stack application using Java and Spring Framework. The project entails creating a web-based application that tracks inventory for a store, featuring both a user interface and a backend system.</p>
    <h2>Key Features and Components:</h2>
    <h3>User Interface Customization:</h3>
    <ul>
        <li>Customized HTML front-end that includes the shop name, product names, and part names.</li>
        <li>Addition of an "About" page describing the chosen customer’s company, with proper navigation to and from the main screen.</li>
    </ul>
    <img src="https://github.com/MayCooper/Spring-Framework-Inventory-Management-System/assets/82129870/c3f20fec-8103-4cc5-a346-b951cd9b976b" alt="Project Store Page1">
    <img src="https://github.com/MayCooper/Spring-Framework-Inventory-Management-System/assets/82129870/ffab2d3c-1480-4d2d-a215-0bed92c6df78" alt="Project Store Page2">
    <h3>Inventory Management:</h3>
    <ul>
        <li>Implementation of a sample inventory with five products and five parts, ensuring no data overwrites in the database.</li>
        <li>Addition of a “Buy Now” button that decrements product inventory upon purchase, with success or failure messages.</li>
    </ul>
    <h3>Advanced Inventory Tracking:</h3>
    <ul>
        <li>Modification of parts to include maximum and minimum inventory fields.</li>
        <li>Validation to ensure inventory levels remain between the specified minimum and maximum values, with appropriate error messages for invalid entries.</li>
    </ul>
    <img src="https://github.com/MayCooper/Spring-Framework-Inventory-Management-System/assets/82129870/41ec3ec7-77a1-48d4-9a47-99b642aaf86a" alt="Adding a part and receiving a warning if outside of limits set">
    <img src="https://github.com/MayCooper/Spring-Framework-Inventory-Management-System/assets/82129870/7b551e9a-d64b-4538-9875-ba99b374c2a3" alt="Adding outsourced part and receiving a warning if outside of limits set">
    <h3>Testing and Code Quality:</h3>
    <ul>
        <li>Development of unit tests for maximum and minimum inventory fields.</li>
        <li>Removal of unused validators to ensure clean and efficient code.</li>
    </ul>
    <h3>Professional Development Tools:</h3>
    <ul>
        <li>Utilization of IntelliJ IDEA (Ultimate Edition) as the Integrated Development Environment (IDE).</li>
        <li>Use of GitLab for version control, including cloning the project repository, committing changes, and pushing updates.</li>
    </ul>
    <img src="https://github.com/MayCooper/Spring-Framework-Inventory-Management-System/assets/82129870/d46762e4-5b53-4f7a-a15d-f138262e80ee" alt="May Cooper_Java Frameworks_Gitlab repository graph">
    <h2>Scenario</h2>
    <p>The project simulates working for a company that customizes software to track inventory in stores. The developer's task is to adapt the existing Spring application to meet a specific customer's requirements, who sells products composed of various parts. For example, a bicycle shop selling bicycles (products) composed of wheels and other components (parts).</p>
    <h2>Development Process</h2>
    <h3>Setup:</h3>
    <ul>
        <li>Installation and configuration of IntelliJ IDEA using a free student license.</li>
        <li>Cloning the provided GitLab repository and setting up the project environment.</li>
    </ul>
    <h3>Implementation:</h3>
    <ul>
        <li>Customization of the HTML front-end and integration with the Java back-end.</li>
        <li>Addition of new features such as the "About" page and the “Buy Now” button.</li>
        <li>Incorporation of advanced inventory tracking and validation mechanisms.</li>
    </ul>
    <h3>Testing and Finalization:</h3>
    <ul>
        <li>Writing and executing unit tests to ensure functionality.</li>
        <li>Cleaning the codebase by removing unused validators.</li>
        <li>Ensuring all changes are well-documented in a README file with references to specific code modifications.</li>
    </ul>
    <h2>Learning Outcomes</h2>
    <p>Through this project, students gain practical experience in:</p>
    <ul>
        <li>Implementing user interfaces and frameworks using Java and Spring.</li>
        <li>Handling real-world software customization and maintenance tasks.</li>
        <li>Utilizing professional development tools like IntelliJ IDEA and GitLab.</li>
        <li>Writing and validating code to meet specific business requirements.</li>
        <li>Preparing for technical interviews and building a portfolio of completed projects.</li>
    </ul>
    <h2>Tech Stack Used</h2>
    <h3>Front-End:</h3>
    <ul>
        <li><strong>HTML/CSS:</strong> For creating and styling the user interface of the application.</li>
    </ul>
    <h3>Back-End:</h3>
    <ul>
        <li><strong>Java:</strong> The primary programming language used for the backend logic and functionality.</li>
        <li><strong>Spring Framework:</strong> A robust Java framework used for building the application, providing features like dependency injection, transaction management, and web MVC.</li>
    </ul>
    <h3>Database:</h3>
    <ul>
        <li><strong>H2 Database:</strong> An in-memory database used for development and testing purposes. It simplifies the setup and allows for quick iteration during development.</li>
    </ul>
    <h3>Development Environment:</h3>
    <ul>
        <li><strong>IntelliJ IDEA (Ultimate Edition):</strong> An integrated development environment (IDE) used for writing, debugging, and managing the Java code. A free student license is used to access the Ultimate Edition's features.</li>
    </ul>
    <h3>Version Control:</h3>
    <ul>
        <li><strong>Git:</strong> A version control system used to manage code changes and collaboration.</li>
        <li><strong>GitLab:</strong> A web-based Git repository manager used for hosting the project’s code, managing branches, and tracking changes.</li>
    </ul>
    <h3>Testing:</h3>
    <ul>
        <li><strong>JUnit:</strong> A testing framework for Java, used to write and run unit tests for validating the application's functionality.</li>
    </ul>
    <p>By combining these technologies, the project leverages a modern and efficient tech stack that is commonly used in enterprise-level Java development.</p>
</body>
</html>
