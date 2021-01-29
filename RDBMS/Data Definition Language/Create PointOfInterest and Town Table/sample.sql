create table PointofInterest(
    pointID number,
    describe varchar2(30),
    opentime varchar(10),
    closetime varchar2(10),
    townID number,
    constraint PK primary key (pointID)
);

create table Town(
    townID number,
    townname varchar(30),
    state varchar(30),
    longitude varchar(30),
    latitude varchar(30),
    summertemp number,
    wintertemp number,
    sealevel number,
    constraint PK2 primary key(townID)
);