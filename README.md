# rabbitMQ-java messageing
# Email Service

## Description

The **Email Service** is a microservice built with Java and Spring Boot that handles email notifications within a microservices architecture. It leverages RabbitMQ for reliable and asynchronous messaging, ensuring efficient communication between different services to send transactional and promotional emails.

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.1**
- **RabbitMQ**
- **Maven**

## Installation

### Prerequisites

- **Java 17** installed on your machine.
- **Maven** installed.
- **RabbitMQ** server running.

### Steps

1. **Clone the Repository**


2. **Install Dependencies**

    ```bash
    mvn install
    ```

3. **Configure Application Properties**

    Update the `src/main/resources/application.properties` file with your RabbitMQ server details and any other necessary configurations.

4. **Run the Application**

    ```bash
    mvn spring-boot:run
    ```

## Usage

Once the application is running, it will connect to the RabbitMQ server and handle email-related operations such as sending emails, scheduling email deliveries, and processing email templates. You can interact with the service using RESTful APIs or through message queues.

### Example API Endpoints

- **Send Email**

    ```http
    POST /api/emails
    ```

    **Request Body:**

    ```json
    {
      "recipient": "user@example.com",
      "subject": "Welcome to Our Service",
      "body": "Thank you for signing up!"
    }
    ```

- **Get Email Status**

    ```http
    GET /api/emails/status/{emailId}
    ```

    **Response:**

    ```json
    {
      "emailId": "abc123",
      "status": "SENT",
      "timestamp": "2023-10-05T14:48:00Z"
    }
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the Repository**
2. **Create a New Branch**

    ```bash
    git checkout -b feature/YourFeature
    ```

3. **Commit Your Changes**

    ```bash
    git commit -m "Add some feature"
    ```

4. **Push to the Branch**

    ```bash
    git push origin feature/YourFeature
    ```

5. **Open a Pull Request**


# Order Service

## Description

The **Order Service** is a microservice built with Java and Spring Boot that manages order processing within a microservices architecture. It leverages RabbitMQ for messaging, enabling reliable and asynchronous communication between services to ensure efficient order management and processing.

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.1**
- **RabbitMQ**
- **Maven**

## Installation

### Prerequisites

- **Java 17** installed on your machine.
- **Maven** installed.
- **RabbitMQ** server running.

### Steps

1. **Clone the Repository**

2. **Install Dependencies**

    ```bash
    mvn install
    ```

3. **Configure Application Properties**

    Update the `src/main/resources/application.properties` file with your RabbitMQ server details and any other necessary configurations.

4. **Run the Application**

    ```bash
    mvn spring-boot:run
    ```

## Usage

Once the application is running, it will connect to the RabbitMQ server and handle order-related operations such as creating orders, updating order status, and processing order events. You can interact with the service using RESTful APIs or through message queues.

### Example API Endpoints

- **Create Order**

    ```http
    POST /api/orders
    ```

    **Request Body:**

    ```json
    {
      "productId": "12345",
      "quantity": 2,
      "customerId": "67890"
    }
    ```

- **Get Order Status**

    ```http
    GET /api/orders/{orderId}/status
    ```

    **Response:**

    ```json
    {
      "orderId": "abc123",
      "status": "PROCESSING",
      "timestamp": "2023-10-05T14:48:00Z"
    }
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the Repository**
2. **Create a New Branch**

    ```bash
    git checkout -b feature/YourFeature
    ```

3. **Commit Your Changes**

    ```bash
    git commit -m "Add some feature"
    ```

4. **Push to the Branch**

    ```bash
    git push origin feature/YourFeature
    ```

5. **Open a Pull Request**

# Stock Service

## Description

The **Stock Service** is a microservice built with Java and Spring Boot that manages inventory and stock levels within a microservices architecture. It leverages RabbitMQ for messaging, enabling reliable and asynchronous communication between services to ensure accurate and efficient stock management.

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.1**
- **RabbitMQ**
- **Maven**
- **Lombok**

## Installation

### Prerequisites

- **Java 17** installed on your machine.
- **Maven** installed.
- **RabbitMQ** server running.

### Steps

1. **Clone the Repository**

2. **Install Dependencies**

    ```bash
    mvn install
    ```

3. **Configure Application Properties**

    Update the `src/main/resources/application.properties` file with your RabbitMQ server details and any other necessary configurations.

4. **Run the Application**

    ```bash
    mvn spring-boot:run
    ```

## Usage

Once the application is running, it will connect to the RabbitMQ server and handle stock-related operations such as updating inventory levels, checking stock availability, and processing stock reservations. You can interact with the service using RESTful APIs or through message queues.

### Example API Endpoints

- **Check Stock Availability**

    ```http
    GET /api/stock/{productId}
    ```

    **Response:**

    ```json
    {
      "productId": "12345",
      "availableQuantity": 150
    }
    ```

- **Update Stock Quantity**

    ```http
    POST /api/stock/update
    ```

    **Request Body:**

    ```json
    {
      "productId": "12345",
      "quantity": 50
    }
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the Repository**
2. **Create a New Branch**

    ```bash
    git checkout -b feature/YourFeature
    ```

3. **Commit Your Changes**

    ```bash
    git commit -m "Add some feature"
    ```

4. **Push to the Branch**

    ```bash
    git push origin feature/YourFeature
    ```

5. **Open a Pull Request**

## License

This project is licensed under the MIT License.