CREATE TABLE USERS(
    User_id number(11) CONSTRAINT PK_USERS PRIMARY KEY,
    Name varchar2(20),
    Address varchar2(100),
    Phno number(11),
    Emailid varchar2(30)
);