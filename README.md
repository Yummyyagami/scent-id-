# Scent ID

## Project Overview
Scent ID is an innovative application designed to help users identify and learn about various scents. Using advanced image recognition and a user-friendly interface, the app allows users to capture images of substances, providing them with information and insights about the scents they encounter.

## Tech Stack
- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **MVVM**
- **Clean Architecture**
- **Hilt**
- **Retrofit**
- **Room**
- **CameraX**
- **Firebase**

## Features
- Image recognition for scent identification
- User-friendly UI built with Jetpack Compose
- Offline data access with Room
- Cloud storage and user authentication via Firebase
- Rich information about scents and their properties
- Easy sharing of identified scents with friends

## Installation Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Yummyyagami/scent-id-
   ```
2. Navigate to the project directory:
   ```bash
   cd scent-id-
   ```
3. Build the project with Gradle:
   ```bash
   ./gradlew build
   ```
4. Open in Android Studio and run the application in an emulator or on a device.

## App Structure
- **app/**: Main application module containing all the code and resources.
- **data/**: Data layer handling data sources (network, local, etc.).
- **domain/**: Business logic layer, defining the app's core functionalities.
- **presentation/**: UI layer, including activities and view models.

## Contribution Guidelines
1. Fork the repository.
2. Create your feature branch:
   ```bash
   git checkout -b feature/YourFeature
   ```
3. Commit your changes:
   ```bash
   git commit -m 'Add some feature'
   ```
4. Push to the branch:
   ```bash
   git push origin feature/YourFeature
   ```
5. Open a pull request.