Microservice for Managing Users and Subscriptions
Описание проекта
Микросервис предоставляет REST API для управления пользователями и их подписками на цифровые сервисы (Netflix, YouTube Premium и др.). Проект разработан на Spring Boot 3 с использованием Java 17.

Функциональные возможности
Управление пользователями
Создание нового пользователя

Получение информации о пользователе

Обновление данных пользователя

Удаление пользователя

Управление подписками
Добавление подписки пользователю

Просмотр списка подписок пользователя

Удаление подписки

Получение ТОП-3 популярных подписок

Технологический стек
Язык: Java 17

Фреймворк: Spring Boot 3.1.5

База данных: PostgreSQL

Библиотеки:

Lombok

MapStruct

Spring Data JPA

Spring Web

Документация: OpenAPI 3.0 (Swagger)

Требования к окружению
JDK 17

Maven 3.9+

Docker 20.10+ (опционально)

PostgreSQL 13+

Установка и запуск
1. Сборка проекта
bash
mvn clean package
2. Запуск с Docker
bash
docker-compose up --build
3. Запуск без Docker
Предварительно убедитесь, что PostgreSQL запущена и настроена в application.properties.

bash
mvn spring-boot:run
Конфигурация
Основные настройки приложения находятся в файле:

src/main/resources/application.properties
API Endpoints
Документация API доступна по адресу после запуска приложения:

http://localhost:8080/swagger-ui.html
Основные эндпоинты:
Пользователи
POST /api/v1/users - Создать пользователя

GET /api/v1/users/{id} - Получить пользователя

PUT /api/v1/users/{id} - Обновить пользователя

DELETE /api/v1/users/{id} - Удалить пользователя

Подписки
POST /api/v1/users/{id}/subscriptions - Добавить подписку

GET /api/v1/users/{id}/subscriptions - Получить подписки пользователя

DELETE /api/v1/users/{id}/subscriptions/{sub_id} - Удалить подписку

GET /api/v1/subscriptions/top - ТОП-3 популярных подписок

Структура проекта
src/
├── main/
│   ├── java/
│   │   └── com/example/userservice/
│   │       ├── config/       # Конфигурационные классы
│   │       ├── controller/   # REST контроллеры
│   │       ├── dto/          # Data Transfer Objects
│   │       ├── exception/    # Обработка ошибок
│   │       ├── model/        # Сущности БД
│   │       ├── repository/   # Репозитории Spring Data
│   │       ├── service/      # Бизнес-логика
│   │       └── Application.java
│   └── resources/
│       ├── application.properties
│       └── logback-spring.xml
├── test/                     # Тесты
docker-compose.yml            # Конфигурация Docker
Dockerfile                    # Сборка Docker образа
Тестирование
Для запуска тестов:

bash
mvn test
