[![Java CI](https://github.com/arsemnv/number-processor/actions/workflows/java_ci.yml/badge.svg)](https://github.com/arsemnv/number-processor/actions/workflows/java_ci.yml)

# Number Processor Project

## Описание
Проект "Number Processor" предназначен для обработки массивов чисел, включая нахождение минимального и максимального значения, вычисление их суммы и произведения. Проект написан на Java и включает базовые тесты для проверки функциональности.

## Начало работы

Для работы с проектом необходимо иметь установленный Java JDK 11 или выше.

### Клонирование репозитория

Для начала склонируйте репозиторий на ваш локальный компьютер:

```bash
git clone https://github.com/arsemnv/number-processor.git
cd number-processor
```

## Сборка проекта
Проект использует Java для компиляции и запуска. Выполните следующие команды для компиляции проекта:
```bash
javac NumberProcessor.java NumberProcessorTest.java EdgeCaseTest.java PerformanceTest.java
```

## Запуск тестов

### Запуск локально
Для запуска тестов используйте следующие команды:
```bash
java -ea NumberProcessorTest
java -ea EdgeCaseTest
java -ea PerformanceTest
```
Флаг `-ea` (enable assertions) необходим для активации утверждений Java и 
обеспечения корректной работы тестов.

### Запуск Github Actions
Для этого вам нужно сначала создать репозиторий и сделать initial commit

Для запуска тестов:
1. Перейдите Actions
2. Выберите Java CI
3. Нажмите Run workflow


## Настройка GitHub Actions
Проект использует GitHub Actions для автоматического тестирования при каждом коммите. Для настройки секретов для GitHub Actions выполните следующие шаги:

1. Перейдите в настройки вашего репозитория на GitHub
2. Выберите вкладку "Secrets and variables" в левом меню
3. Выберите вкладку "Actions"
4. Нажмите на кнопку "New repository secret"
5. Введите имя секрета и его значение

### Шаг 1: Создание Telegram Bot и получение токена

1. Начните чат с [BotFather](https://t.me/botfather) в Telegram
2. Отправьте команду `/newbot` и следуйте инструкциям BotFather для создания нового бота
3. После создания бота, BotFather предоставит вам токен, который будет использоваться для отправки сообщений через API
4. Добавляем Secret с названием `TELEGRAM_TOKEN`

### Шаг 2: Получение Chat ID

1. Добавьте бота в группу или начните приватный чат с ним
2. Отправьте любое сообщение боту
3. Используйте следующий URL для получения вашего `chat_id`: https://api.telegram.org/bot<YourBotToken>/getUpdates
4. Замените `<YourBotToken>` на ваш токен бота и просмотрите ответ, чтобы найти `chat_id`
5. Добавляем Secret с названием `TELEGRAM_CHAT_ID`
