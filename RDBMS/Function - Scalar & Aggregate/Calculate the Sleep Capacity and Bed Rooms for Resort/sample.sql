select distinct resortid, sum(bedroomcount) as TotalRoom, sum(sleepcapacity) as Capacity 
from cabin
group by resortid
having sum(bedroomcount)>=60 and sum(sleepcapacity)>=100
order by resortid;