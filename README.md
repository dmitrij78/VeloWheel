# VeloWheel
Трекер велопутешествий

## Функционал
- Навигация по карте
- Трекинг маршрута и параметров движения в режиме реального времени
- Сохранение данных поездки
- Просмотр истории поездок

## Архитектура
Single activity application + MVVM + DI

## Технологии
- Kotlin 
- Kotlin coroutines - асинхронные вызовы
- Dagger2 - DI фреймворк
- Fragment - представление экранов
- Room - база данных
- ОкHttpClient - http-клиент 
- Retrofit - выполние сетевых запросов
- Coil - загрузка изображений
- GoogleMaps - отображение карты
- GooglePlayServices - определение координат

## Тестирование
- Mokito - создание сущностей-заглушек
- Hamcrest - матчер тестовых данных
- JUnit - юнит-тестирование
- AndroidXJunit - локальные тесты
- Espresso - View-тесты
- JACOCO - Покрытие тестами
