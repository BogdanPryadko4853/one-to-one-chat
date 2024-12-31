# One-to-One Chat Application

Проект **One-to-One Chat** — это веб-приложение для обмена сообщениями в реальном времени между двумя пользователями. Приложение построено с использованием **Spring Boot**, **WebSocket**, **MongoDB** и **STOMP**. Оно позволяет пользователям регистрироваться, подключаться к чату, отправлять и получать сообщения в реальном времени.

## Технологии
- **Spring Boot**: Основной фреймворк для создания приложения.
- **WebSocket**: Обеспечивает двустороннюю связь между клиентом и сервером в реальном времени.
- **STOMP**: Протокол для обмена сообщениями поверх WebSocket.
- **MongoDB**: База данных для хранения сообщений и информации о пользователях.
- **SockJS**: Библиотека для обеспечения совместимости WebSocket с браузерами, которые не поддерживают WebSocket.
- **HTML/CSS/JavaScript**: Фронтенд часть приложения.

## Структура проекта
### Основные файлы:
- **WebSocketConfig.java**: Конфигурация WebSocket.
- **ChatController.java**: Контроллер для обработки сообщений чата.
- **ChatMessage.java**: Модель сообщения чата.
- **ChatMessageRepository.java**: Репозиторий для работы с сообщениями в MongoDB.
- **ChatMessageService.java**: Сервис для обработки логики сообщений.
- **ChatRoom.java**: Модель чат-комнаты.
- **ChatRoomRepository.java**: Репозиторий для работы с чат-комнатами.
- **ChatRoomService.java**: Сервис для обработки логики чат-комнат.
- **User.java**: Модель пользователя.
- **UserRepository.java**: Репозиторий для работы с пользователями.
- **UserService.java**: Сервис для обработки логики пользователей.
- **WebSocketApplication.java**: Основной класс приложения.

### Фронтенд:
- **index.html**: Главная страница чата.
- **main.css**: Стили для страницы чата.
- **main.js**: Логика для работы с WebSocket и отправки сообщений.

## Как запустить проект
1. **Клонирование репозитория**
   
bash
   git clone https://github.com/yourusername/one-to-one-chat.git
   cd one-to-one-chat
   

2. **Настройка MongoDB**
   Убедитесь, что у вас установлен MongoDB.

   Создайте базу данных chat_app и пользователя с правами доступа:
   
bash
   use chat_app
   db.createUser({ user: "bogdan", pwd: "bogdan", roles: ["readWrite"] })
   

3. **Запуск приложения**
   Убедитесь, что у вас установлен Java (минимум версия 8) и Maven.

   Соберите и запустите проект:
   
bash
   mvn clean install
   mvn spring-boot:run
   
   Приложение будет доступно по адресу: [http://localhost:8080](http://localhost:8080).

## Как использовать
1. Откройте приложение в браузере.
2. Введите Nickname и Real Name, затем нажмите Enter Chatroom.
3. Выберите пользователя из списка онлайн-пользователей.
4. Отправляйте сообщения выбранному пользователю. Сообщения будут отображаться в реальном времени.

## Пример интерфейса

## Основные функции
- **Регистрация пользователя**: Пользователи могут зарегистрироваться, указав Nickname и Real Name.
- **Список онлайн-пользователей**: Отображает всех подключенных пользователей.
- **Отправка сообщений**: Пользователи могут отправлять сообщения выбранному пользователю.
- **Получение сообщений**: Сообщения отображаются в реальном времени.
- **Уведомления о новых сообщениях**: Пользователи получают уведомления о новых сообщениях.

## Автор
[Bogdanpryadko1@gmail.com]  
[Ссылка на GitHub](https://github.com/yourusername)
