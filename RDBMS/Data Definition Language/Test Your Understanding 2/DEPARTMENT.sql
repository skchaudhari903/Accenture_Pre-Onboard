CREATE table department
( dept_id number(4) primary key,
  prod_id number(4),
  dept_name varchar(25) UNIQUE,
  dept_head varchar2(25) NOT NULL,
  FOREIGN KEY(prod_id) REFERENCES product
); 