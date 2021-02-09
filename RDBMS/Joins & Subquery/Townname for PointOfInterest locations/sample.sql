select p.pointID, p.describe,
                          (select townname from town t where p.townid=t.townid ) as townname,
                         (select state from town t where p.townid=t.townid) as state
from PointofInterest p 
order by 1;