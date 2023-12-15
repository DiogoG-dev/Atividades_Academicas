CREATE TABLE students (
student_id INT NOT NULL,
first_name VARCHAR NOT NULL,
last_name VARCHAR NOT NULL,
email VARCHAR NOT NULL,
date_of_birth DATE,
gender VARCHAR,
PRIMARY KEY (student_id)
);

CREATE TABLE instructors (
instructor_id INT NOT NULL,
first_name VARCHAR NOT NULL,
last_name VARCHAR NOT NULL,
email VARCHAR NOT NULL,
date_of_birth DATE,
hire_date DATE,
department VARCHAR,
PRIMARY KEY (instructor_id)
);

CREATE TABLE courses (
course_id INT NOT NULL,
course_name VARCHAR NOT NULL,
department VARCHAR,
credits INT,
instructor_id INT NOT NULL,
PRIMARY KEY (course_id),
FOREIGN KEY (instructor_id) REFERENCES instructors(instructor_id)
);

CREATE TABLE enrollments (
enrollment_id INT NOT NULL,
student_id INT NOT NULL,
course_id INT NOT NULL,
enrollment_date DATE,
grade DECIMAL,
PRIMARY KEY (enrollment_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

CREATE TABLE books (
book_id INT NOT NULL,
title VARCHAR NOT NULL,
author VARCHAR,
publication_date DATE,
genre VARCHAR,
price DECIMAL NOT NULL,
PRIMARY KEY (book_id)
);

CREATE TABLE book_reviews (
review_id INT NOT NULL,
book_id INT NOT NULL,
student_id INT NOT NULL,
review_date DATE,
rating VARCHAR,
review_text VARCHAR NOT NULL,
PRIMARY KEY (review_id),
FOREIGN KEY (book_id) REFERENCES books(book_id),
FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE employees (
employee_id INT NOT NULL,
first_name VARCHAR NOT NULL,
last_name VARCHAR NOT NULL,
email VARCHAR NOT NULL,
date_of_birth DATE,
job_title VARCHAR NOT NULL,
hire_date DATE,
salary DECIMAL,
PRIMARY KEY (employee_id)
);

CREATE TABLE bookstore_departments (
department_id CHAR NOT NULL,
department_name VARCHAR NOT NULL,
manager_id INT NOT NULL,
location VARCHAR,
PRIMARY KEY (department_id),
FOREIGN KEY (manager_id) REFERENCES employees(employee_id)
);

CREATE TABLE customers (
customer_id CHAR NOT NULL,
customer_name VARCHAR NOT NULL,
address VARCHAR,
age INT,
PRIMARY KEY (customer_id)
);

CREATE TABLE orders (
order_id CHAR NOT NULL,
customer_id INT NOT NULL,
order_date DATE,
total_amount DECIMAL NOT NULL,
shipping_address VARCHAR NOT NULL,
PRIMARY KEY (order_id),
FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE order_items (
item_id CHAR NOT NULL,
order_id CHAR NOT NULL,
product_id CHAR NOT NULL,
quantity INT NOT NULL,
unit_price DECIMAL NOT NULL,
PRIMARY KEY (item_id),
FOREIGN KEY (order_id) REFERENCES orders(order_id)
);