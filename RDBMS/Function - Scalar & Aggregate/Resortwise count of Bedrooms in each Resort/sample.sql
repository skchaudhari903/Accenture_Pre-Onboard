select distinct resortid , sum(bedroomcount) as TOTALCOUNT  
from Cabin
group by resortid
order by resortid;