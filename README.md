# 🌐 Moduliths with Spring Boot Tutorial 

This project demonstrates a simple implementation of Moduliths using Spring Boot 🚀. Moduliths are a way to structure large applications, breaking them down into smaller, more manageable modules. In this tutorial, we'll be creating a simple system with two modules, Customer and Product.

## 📂 Project Structure

The application is divided into the following major components:

1. **ModulithApplication**: 💻 The main entry point of the application.
2. **Customer Module**: 👥 Contains the `CustomerController` which exposes a REST API endpoint at `/customer`.
3. **Product Module**: 📦 Contains the `ProductController` which exposes a REST API endpoint at `/product`.

Each of these components has its own gradle build script (`build.gradle`) and source code under `src/main/java`.

The root directory also contains a `build.gradle` which orchestrates the build process for all modules.

## 🏗️ Building and Running the Application

To build and run the application, you need to have Gradle installed on your machine. Navigate to the root directory of the application and run the following command:

```bash
./gradlew build
```

Once the application has been built successfully, you can start it with the following command:
```bash
./gradlew run
```

## 🌐 API Endpoints
The application exposes the following REST API endpoints:

- `/customer`: Returns a test string "Test Customer". 🧾 You can use this to verify that the CustomerController is working as expected.

- `/product`:  Returns a test string "Test Product". 🧾 You can use this to verify that the ProductController is working as expected.