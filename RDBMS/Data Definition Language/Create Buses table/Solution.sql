CREATE TABLE buses(
	Bus_no number(11) CONSTRAINT PK_BUSES PRIMARY KEY,
	Bus_name varchar2(20),
	Type varchar2(20),
	Total_seats number(11),
	Avail_seats number(11)
);