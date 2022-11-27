--Создаем таблицу департамент
CREATE TABLE department (
  id INTEGER,
  name VARCHAR(255),
  PRIMARY KEY (id)
);
--Создаем таблицу сотрудников
CREATE TABLE employees (
        id INTEGER,
        department_id INTEGER,
        name VARCHAR(255),
        PRIMARY KEY (id)
);
--Создаем таблицу заказчиков
CREATE TABLE customer (
        id INTEGER,
        customer_name VARCHAR(255),
        location VARCHAR(255),
        PRIMARY KEY (id)
);
--Создаем таблицу контрактов
CREATE TABLE contract (
        id INTEGER,
        customer_id INTEGER,
        amount INTEGER,
        PRIMARY KEY (id)
);
--Создаем таблицу исполнителей
CREATE TABLE executor (
	tab_no INTEGER,
	contract_id INTEGER
);

ALTER TABLE employees ADD FOREIGN KEY (department_id) REFERENCES department(id);
ALTER TABLE executor ADD FOREIGN KEY (tab_no) REFERENCES employees(id);
ALTER TABLE executor ADD FOREIGN KEY (contract_id) REFERENCES contract(id);
ALTER TABLE contract ADD FOREIGN KEY (customer_id) REFERENCES customer(id);


INSERT INTO department(
  id, name)
  VALUES(1,'Manufacturing');
INSERT INTO department(
  id, name)
  VALUES(2,'Logistic');
INSERT INTO department(
  id, name)
  VALUES(3,'Sales');
INSERT INTO department(
  id, name)
  VALUES(4,'Economy');
INSERT INTO department(
  id, name)
  VALUES(5,'Production');

INSERT INTO employees(
  id, department_id, name)
  VALUES(1,1,'Ivan Ivanov');
INSERT INTO employees(
  id, department_id, name)
  VALUES(2,1,'Sidor Sidorov');
INSERT INTO employees(
  id, department_id, name)
  VALUES(3,2,'Egor Egorov');
INSERT INTO employees(
  id, department_id, name)
  VALUES(4,3,'Petr Petrov');
INSERT INTO employees(
  id, department_id, name)
  VALUES(5,4,'Vasily Vasilev');
INSERT INTO employees(
  id, department_id, name)
  VALUES(6,5,'Marina Marinina');
INSERT INTO employees(
  id, department_id, name)
  VALUES(7,5,'Dmitry Dmitriev');
INSERT INTO employees(
  id, department_id, name)
  VALUES(8,2,'Alex Alexeev');
INSERT INTO employees(
  id, department_id, name)
  VALUES(9,1,'Olga Olgova');
INSERT INTO employees(
  id, department_id, name)
  VALUES(10,3,'Olesya Olesyeva');

INSERT INTO customer(
  id, customer_name, location)
  VALUES(1,'Dmitry Bolshakov','Innopolis');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(2,'Olesya Lavrenteeva','Innopolis');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(3,'Anton Tarasov','Saratov');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(4,'Marya Chelnakova','Moscow');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(5,'Andrew Nilov','Kazan');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(6,'Dmitry Egorov','Moscow');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(7,'Ekaterina Fedorova','Moscow');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(8,'Sergey Nikonov','Kazan');
INSERT INTO customer(
  id, customer_name, location)
  VALUES(9,'Alexey Lomovoi','Vladivostok');

INSERT INTO contract(
  id, customer_id, amount)
  VALUES(1,1,20000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(2,2,10000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(3,5,50000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(4,7,150000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(5,8,200000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(6,9,14000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(7,5,26000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(8,4,60000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(9,3,30000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(10,1,32000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(11,2,30000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(12,8,40000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(13,7,50000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(14,9,60000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(15,5,70000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(16,4,80000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(17,3,90000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(18,4,100000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(19,2,110000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(20,1,120000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(21,2,130000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(22,7,140000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(23,8,150000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(24,9,160000);
INSERT INTO contract(
  id, customer_id, amount)
  VALUES(25,3,170000);

INSERT INTO executor(
  tab_no, contract_id)
  VALUES(1,1);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(2,2);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(3,3);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(4,4);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(5,5);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(7,6);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(2,7);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(3,8);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(5,9);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(6,10);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(7,11);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(9,12);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(10,13);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(1,14);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(2,15);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(5,16);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(2,17);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(3,18);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(7,19);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(8,20);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(5,21);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(4,22);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(3,23);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(4,24);
INSERT INTO executor(
  tab_no, contract_id)
  VALUES(5,25);


--Выбери все из таблицы сотрудников
SELECT * FROM employees
--Присоедени таблицу Департамент по внешнему ключу department.id к значению employees.department_id
    JOIN department d on d.id = employees.department_id;

--Выбери все из таблицы заказчиков
SELECT * FROM customer
    --Присоедени таблицу Заказчиков по внешнему ключу customer.id к значению contract.customer_id
    JOIN contract c on customer.id = c.customer_id;

--Выбери все из таблицы Контрактов
SELECT * FROM contract
    --Присоедени таблицу контрактов по внешнему ключу contract.id к значению executor.contract_id
    JOIN executor e on contract.id = e.contract_id;

--Выбери все из таблицы сотрудников
SELECT * FROM executor
    --Присоедени таблицу сотрудников по внешнему ключу employees.id к значению executor.tab_no
    JOIN employees em on em.id = executor.tab_no;

--	Найти информацию о всех контрактах, связанных с сотрудниками департамента «Logistic». Вывести: contract_id, employee_name
--1вар
--Выбери все(*) из таблицы департаментов (далее как d) где d.name = Logistic
SELECT * FROM department AS d WHERE d.name LIKE '%Logistic%';
--В созданную виртуальную таблицу1 добавь выбор из таблицы сотрудников который равен вложенному подзапросу
WITH table1 AS (
SELECT name, id FROM employees WHERE department_id =(SELECT d.id FROM department AS d WHERE d.name LIKE '%Logistic%')
)
SELECT e.contract_id, t.name  FROM table1 AS t
LEFT JOIN executor AS e on e.tab_no = t.id;
--2вар
SELECT e.contract_id, em.name FROM executor e
JOIN employees em on em.id = e.tab_no WHERE department_id =(SELECT d.id FROM department AS d WHERE d.name LIKE '%Logistic%');

--	Найти среднюю стоимость контрактов, заключенных сотрудников Ivan Ivanov. Вывести: среднее значение amount

SELECT * FROM employees AS e WHERE e.name LIKE '%Ivan Ivanov%';

SELECT AVG(c.amount) as medium FROM contract c
LEFT JOIN executor AS e ON e.contract_id = c.id
LEFT JOIN employees AS em ON e.tab_no = em.id;

--2вар
SELECT AVG(c.amount) as medium FROM employees em
LEFT JOIN executor AS e ON e.tab_no = em.id
LEFT JOIN contract AS c ON  e.contract_id = c.id;
--3вар
SELECT AVG(c.amount) as medium FROM employees em
RIGHT JOIN executor AS e ON e.tab_no = em.id
RIGHT JOIN contract AS c ON  e.contract_id = c.id;
--4вар
SELECT AVG(c.amount) as medium FROM employees em
INNER JOIN executor AS e ON e.tab_no = em.id
INNER JOIN contract AS c ON  e.contract_id = c.id;

--	Найти самую часто встречающуюся локации среди всех заказчиков. Вывести: location, count
SELECT c.location, SUM(con.customer_id/c.id) FROM customer c
JOIN contract con on c.id = con.customer_id
GROUP BY location
ORDER BY SUM(con.customer_id/c.id)
DESC
LIMIT 1;

--  Найти заказчика с наименьшей средней стоимостью контрактов. Вывести customer_name, среднее значение amount
SELECT cus.customer_name, AVG(c.amount) FROM contract c
JOIN customer cus on c.customer_id = cus.id
Group by cus.customer_name
HAVING AVG(c.amount) =
(SELECT AVG(c.amount) FROM contract c
JOIN customer cus on c.customer_id = cus.id
Group by cus.customer_name
ORDER BY AVG(c.amount)
DESC --поменять на обратное значение
LIMIT 1);

--	Найти отдел, заключивший контрактов на наибольшую сумму. Вывести: department_name, sum
SELECT d.name, SUM(c.amount) FROM department as d
JOIN employees e on d.id = e.department_id
JOIN executor exe on e.id = exe.tab_no
JOIN contract c on c.id = exe.contract_id
GROUP BY d.name
HAVING SUM(c.amount) =
(SELECT SUM(c.amount) FROM department as d
JOIN employees e on d.id = e.department_id
JOIN executor exe on e.id = exe.tab_no
JOIN contract c on c.id = exe.contract_id
GROUP BY d.name
ORDER BY SUM(c.amount)
DESC
LIMIT 1);

--	Найти контракты одинаковой стоимости. Вывести count, amount
SELECT   c.amount,  SUM(c.customer_id/c.customer_id) AS count FROM contract AS c
JOIN customer cus on cus.id = c.customer_id
GROUP BY c.amount;





