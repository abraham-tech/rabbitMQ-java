# rabbitMQ-java messageing

# Stock Service

## Description

The **Stock Service** is a microservice built with Java and Spring Boot that manages inventory and stock levels within a microservices architecture. It leverages RabbitMQ for messaging, enabling reliable and asynchronous communication between services to ensure accurate and efficient stock management.

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
      "availableQuantity": 100
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



# RabbitMQ Service

## Description

The **RabbitMQ Service** is a microservice built with Java and Spring Boot that facilitates messaging and communication within a microservices architecture. It leverages RabbitMQ for reliable and asynchronous message handling, ensuring efficient data exchange between different services.

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

Once the application is running, it will connect to the RabbitMQ server and handle message publishing and consumption as defined in the service. You can interact with the service using RESTful APIs or through message queues.

### Example API Endpoints

- **Publish Message**

    ```http
    POST /api/messages
    ```

    **Request Body:**

    ```json
    {
      "exchange": "exchangeName",
      "routingKey": "routing.key",
      "message": "Your message here"
    }
    ```

- **Consume Messages**

    The service listens to configured queues and processes incoming messages automatically.

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


# Email Service

## Description

The **Email Service** is a microservice built with Java and Spring Boot that handles email notifications within a microservices architecture. It leverages RabbitMQ for messaging, enabling reliable and asynchronous communication between services to send transactional and promotional emails efficiently.

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

## License

This project is licensed under the MIT License.
