# <p align="center">UltimateKits</p>
<div align="center">
    <img src="https://img.shields.io/github/v/release/luiz-otavio/ultimate-kit-api?style=for-the-badge" alt="Release"/>
    <img src="https://img.shields.io/github/issues/luiz-otavio/ultimate-kit-api?style=for-the-badge" alt="Issues"/>
    <img src="https://img.shields.io/github/forks/luiz-otavio/ultimate-kit-api?style=for-the-badge" alt="Forks"/>
    <img src="https://img.shields.io/github/stars/luiz-otavio/ultimate-kit-api?style=for-the-badge" alt="Stars"/>
</div>

## How to install
Groovy DSL:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.luiz-otavio:ultimate-kit-api:{PROJECT_VERSION}'
}
```

Kotlin DSL:
```kotlin
repositories() {
    maven("https://jitpack.io")
}

dependencies() {
    implementation("com.github.luiz-otavio:ultimate-kit-api:{PROJECT_VERSION}")
}
```

Maven:
```xml
<repositories>
    <repository>
        <id>jitpack</id>
        <name>jitpack</name>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.luiz-otavio</groupId>
        <artifactId>ultimate-kit-api</artifactId>
        <version>{PROJECT_VERSION}</version>
    </dependency>
</dependencies>
```

## Contributing
Open an issue or a pull request and let's discuss it.
