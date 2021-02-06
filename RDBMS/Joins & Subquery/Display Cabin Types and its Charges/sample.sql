select c.cabinid, c.cabintype, c.describe, c.bedroomcount,
c.sleepcapacity, (select rate from cabincost where
cabinid=c.cabinid) as rate
from cabin c
order by 1;