# Ecom App Microservices

## Description

This is the result of Practical Activity 3 of the J2EE course.

## Microservices (in their launch order)

- **Discovery Service**: Microservices discovery service
- **Gateway Service**: Routing and request redirection service
- **Config Service**: Microservices configuration service
- **Customer Service**: Customer management service
- **Inventory Service**: Product management service
- **Billing Service**: Invoice management service

## Eureka Discovery Service

- **URL**: [http://localhost:8761](http://localhost:8761)

![Eureka Discovery Service](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.23.39.png?raw=true)

## List of customers

- **GET**: [http://localhost:9082/customers](http://localhost:9082/customers)

![List of Customers](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.24.40.png?raw=true)

## List of customers via the Gateway Service

- **GET**: [http://localhost:8888/customers](http://localhost:8888/customers)

![List of Customers via Gateway Service]()

## List of customers via the service name

- **GET**: [http://localhost:8888/CUSTOMER-SERVICE/customers](http://localhost:8888/CUSTOMER-SERVICE/customers)

![List of Customers via Service Name](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.25.08.png?raw=true)

## List of products

- **GET**: [http://localhost:8083/products](http://localhost:8083/products)

![List of Products](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.44.43.png?raw=true)

## List of products via the Gateway Service

- **GET**: [http://localhost:8888/products](http://localhost:8888/products)

![List of Products via Gateway Service](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.44.13.png?raw=true)

## List of invoices

- **GET**: [http://localhost:8083/bills](http://localhost:8083/bills)

![List of Invoices](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.44.43.png?raw=true)

## List of invoices via the Gateway Service

- **GET**: [http://localhost:8888/bills](http://localhost:8888/bills)

![List of Invoices via Gateway Service](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.43.54.png?raw=true)

## Static + Dynamic Routing

- **Static Routing**

![Static Routing](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.53.45.png?raw=true)

- **Dynamic Routing**

![Dynamic Routing](https://github.com/Charafeddine-B/assets/blob/main/TP3/Screenshot%202023-12-14%20at%2020.24.19.png?raw=true)
