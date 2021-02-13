select resortid, guestid, (sum(totalcharge)) as TotalCost 
from booking 
group by guestid, resortid 
order by resortid, guestid;