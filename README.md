<h1 align="center">One-to-One Chat Application</h1>
<p align="center">
  Веб-приложение для обмена сообщениями в реальном времени между двумя пользователями.
</p>

<br>

## Обзор

Проект **One-to-One Chat** представляет собой веб-приложение для обмена сообщениями в реальном времени между двумя пользователями. Приложение построено с использованием **Spring Boot**, **WebSocket**, **MongoDB** и **STOMP**. Оно позволяет пользователям регистрироваться, подключаться к чату, отправлять и получать сообщения в реальном времени.

<br>

## Технологии

*   **Spring Boot**: Основной фреймворк для создания приложения.
*   **WebSocket**: Обеспечивает двустороннюю связь между клиентом и сервером в реальном времени.
*   **STOMP**: Протокол для обмена сообщениями поверх WebSocket.
*   **MongoDB**: База данных для хранения сообщений и информации о пользователях.
*   **SockJS**: Библиотека для обеспечения совместимости WebSocket с браузерами, которые не поддерживают WebSocket.
*   **HTML/CSS/JavaScript**: Фронтенд часть приложения.

<br>

## Структура Проекта
### Основные файлы:

*   `config`:
    *   `WebSocketConfig.java`: Конфигурация WebSocket.
*   `controller`:
    *   `ChatController.java`: Контроллер для обработки сообщений чата.
*   `model`:
    *   `ChatMessage.java`: Модель сообщения чата.
    *    `ChatRoom.java`: Модель чат-комнаты.
    *   `User.java`: Модель пользователя.
*   `repository`:
    *   `ChatMessageRepository.java`: Репозиторий для работы с сообщениями в MongoDB.
    *    `ChatRoomRepository.java`: Репозиторий для работы с чат-комнатами.
    *   `UserRepository.java`: Репозиторий для работы с пользователями.
*   `service`:
    *   `ChatMessageService.java`: Сервис для обработки логики сообщений.
    *   `ChatRoomService.java`: Сервис для обработки логики чат-комнат.
    *   `UserService.java`: Сервис для обработки логики пользователей.
*   `WebSocketApplication.java`: Основной класс приложения.

### Фронтенд:

*   `index.html`: Главная страница чата.
*   `main.css`: Стили для страницы чата.
*   `main.js`: Логика для работы с WebSocket и отправки сообщений.

<br>

## Как запустить проект

### Предварительные требования

1.  Установленный Java Development Kit (JDK) 17 или выше.
2.  Установленный Maven.
3.  Установленный MongoDB.

### Шаги для запуска

1.  **Клонирование репозитория:**

    ```bash
    git clone https://github.com/BogdanPryadko4853/one-to-one-chat
    cd one-to-one-chat
    ```


2. **Настройка MongoDB**
  *  Убедитесь, что у вас установлен MongoDB.
    
  *  Создайте базу данных `chat_app` и пользователя с правами доступа:

       ```mongo
       use chat_app
       db.createUser({ user: "bogdan", pwd: "bogdan", roles: ["readWrite"] })
       ```
       *  *Примечание: вы можете изменить имя пользователя и пароль, но они должны совпадать с настройками подключения в `application.properties`.*

3.  **Сборка и запуск приложения:**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    Приложение будет доступно по адресу: `http://localhost:8080`.

<br>

## Как использовать

1.  Откройте приложение в браузере по адресу `http://localhost:8080`.
2.  Введите ваш **Nickname** и **Real Name**, затем нажмите кнопку **Enter Chatroom**.
3.  Выберите пользователя из списка онлайн-пользователей.
4.  Начните отправлять сообщения выбранному пользователю. Сообщения будут отображаться в реальном времени.

<br>

## Основные функции

*   **Регистрация пользователя:** Пользователи могут зарегистрироваться, указав Nickname и Real Name.
*   **Список онлайн-пользователей:** Отображает всех подключенных пользователей.
*   **Отправка сообщений:** Пользователи могут отправлять сообщения выбранному пользователю.
*   **Получение сообщений:** Сообщения отображаются в реальном времени.
*   **Уведомления о новых сообщениях:** Пользователи получают уведомления о новых сообщениях.

<br>

## Автор

[bogdanpryadko1@gmail.com](mailto:bogdanpryadko1@gmail.com)

<br>
