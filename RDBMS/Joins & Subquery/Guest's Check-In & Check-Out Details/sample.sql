select g.name, g.country, g.email, g.phone, b.fromdate, b.todate, b .totalcharge
from guest g join booking b
on g.guestID=b.guestID
order by g.guestID;