select resortID, bedroomcount, cabintype 
from cabin 
where resortID=1001 or resortID=1002 
order by resortID, bedroomcount, cabintype;