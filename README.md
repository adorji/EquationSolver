# EquationSolver
## Тестовое задание "Решение квадратных уравнений"

Задание:
> Пользователь открывает начальную страницу и вводит значения коэффициентов a, b и с.
> После ввода коэффициентов пользователь нажимает на кнопку "рассчитать".
> Программа должна сохранить значения коэффициентов и рассчитанных корней уравнения в базу данных.
> Пользователю нужно вывести страницу, на которой выводится значения введенных коэффициентов и значения корней уравнения.
> Если корни уравнения вычислить нельзя, то вместо реузультатов вывести сообщение об ошибке.

## Инструменты
- Spring 3.2.18
- Maven 3.8.1
- Java 7
- PostgreSQL 9.6
- Hibernate 4

## Инструкция по развороту приложения c помощью IntelliJ IDEA
Необходимо скачать и установить:
- IntelliJ IDEA
- PostgreSQL 9.6
- Jdk 1.7.x
- Maven 3.8.1
- tomcat 9

Далее по шагам:
1) Клонируем репозиторий у себя в Idea.
![git](https://user-images.githubusercontent.com/96363980/147120371-e7ae142c-7b16-4662-b6ed-67526e89fec7.png)
2) Открываем psql консоль и подключаемся к бд postgres под пользователем postgres
3) Выполняем запрос на создание базы данных приложения " create database equation_solver;"
4) Повторно открываем консоль и подключаемся к созданной базе данных. 
![connect](https://user-images.githubusercontent.com/96363980/147118732-3226ee1d-542e-45ee-a9ca-52eabf5c4e3d.png)
5) Выполним скрипт для создания таблицы куда будут сохраняться уравнения и их решения. 
[create_table_equation.txt](https://github.com/adorji/EquationSolver/files/7763707/create_table_equation.txt)
6) Необходимо убедиться, что настройки подключения к бд совпадали с настройками из файла persistence.properties
7) Собираем проект с помощью maven
![mvn](https://user-images.githubusercontent.com/96363980/147120607-0201e219-a528-4db3-8dc0-ff940bd38c5b.png)
8) Настраиваем tomcat в Idea и запускаем приложение
[tomcat](https://user-images.githubusercontent.com/96363980/147120761-5978c7c6-18e0-4566-831f-33efd1b76a31.png)
![tomcat2](https://user-images.githubusercontent.com/96363980/147121359-2e4fc4aa-8f9e-49a2-bd84-5fe6078027e9.png)
9) После запуска приложения в браузере откроется стартовая страница приложения
![view1](https://user-images.githubusercontent.com/96363980/147121834-90749f3f-698c-4d73-8473-e09e8c94a812.png)

