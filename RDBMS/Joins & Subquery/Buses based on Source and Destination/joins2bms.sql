select distinct(buses.bus_no), buses.bus_name 
from buses
join(select sc1.bus_no from schedule sc1
join schedule sc2
on sc1.source = sc2.destination and sc1.destination = sc2.source) s1
on buses.bus_no = s1.bus_no
order by buses.bus_no;