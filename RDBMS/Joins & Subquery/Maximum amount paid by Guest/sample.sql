select g.guestid, g.name, max(b.totalcharge) as MAX_AMOUNT
from guest g join booking b
           on b.guestid=g.guestid
           group by g.guestid, g.name
order by 1;