create table schedule(
    schedule_id varchar2(3),
    travel_date date,
    source varchar2(20),
    destination varchar2(20),
    bus_no number(11),
    duration number(11),
    constraints PK_schedule primary key(schedule_id),
    constraints FK_schedule_buses foreign key(bus_no) references buses
);