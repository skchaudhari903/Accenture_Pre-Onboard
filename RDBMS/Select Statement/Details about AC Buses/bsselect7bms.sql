select bus_no as bus_number, bus_name from buses
where avail_seats >= 10 and type = 'ac' 
order by bus_no;