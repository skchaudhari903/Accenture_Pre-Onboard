select bus_no, bus_name from buses
where(avail_seats >= 5 and avail_seats <= 10) 
order by bus_name;