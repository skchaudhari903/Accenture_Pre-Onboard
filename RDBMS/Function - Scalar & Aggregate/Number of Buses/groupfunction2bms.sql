select type as bus_type,
count(bus_no) as bus_count from buses
group by type
order by bus_count desc;