<div align="center">

# 💊 MedRem

**A medication reminder Android app that helps you never miss a dose**

[![Kotlin](https://img.shields.io/badge/Kotlin-100%25-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Stars](https://img.shields.io/github/stars/AdoyoClifford/MedRem?style=for-the-badge&color=167638)](https://github.com/AdoyoClifford/MedRem/stargazers)

</div>

---

## 📖 About

MedRem is a medication reminder application built with modern Android development practices. It helps users track their medications, set reminders, and ensure they never miss a dose. The app features a clean UI built entirely with Jetpack Compose and follows the MVVM architecture pattern.

## ✨ Features

- 🔔 **Smart Notifications** — Timely medication reminders with local notifications
- 💾 **Persistent Storage** — Medication data stored locally using SqlDelight
- 🎨 **Material Design** — Clean, intuitive UI following Material Design 2 guidelines
- 🏗️ **Modern Architecture** — Built with MVVM pattern for clean separation of concerns
- 💉 **Dependency Injection** — Dagger Hilt for scalable dependency management
- ⚡ **Reactive Streams** — Kotlin Coroutines & Flow for asynchronous data handling
- 🧭 **Navigation** — Jetpack Navigation for seamless screen transitions

## 🛠️ Tech Stack

| Category | Technology |
|---|---|
| **Language** | Kotlin |
| **UI Framework** | Jetpack Compose |
| **Architecture** | MVVM |
| **DI** | Dagger Hilt |
| **Database** | SqlDelight |
| **Async** | Coroutines & Flow |
| **Navigation** | Jetpack Navigation |
| **Design** | Material Design 2 |

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or later
- JDK 17+
- Android SDK 24+ (minimum)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/AdoyoClifford/MedRem.git
   ```

2. **Open in Android Studio**
   ```
   File → Open → Select the MedRem directory
   ```

3. **Build & Run**
   ```
   Click the ▶️ Run button or press Shift+F10
   ```

## 📁 Project Structure

```
MedRem/
├── app/
│   ├── src/main/
│   │   ├── java/com/adoyo/medrem/
│   │   │   ├── data/          # Data layer (database, repositories)
│   │   │   ├── di/            # Dependency injection modules
│   │   │   ├── domain/        # Domain models and use cases
│   │   │   ├── presentation/  # UI screens and ViewModels
│   │   │   └── utils/         # Utility classes
│   │   └── res/               # Resources (drawables, strings, etc.)
│   └── build.gradle
├── build.gradle
└── settings.gradle
```

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## ⭐ Support

If you found this project helpful, please give it a star! It helps others discover the project.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

