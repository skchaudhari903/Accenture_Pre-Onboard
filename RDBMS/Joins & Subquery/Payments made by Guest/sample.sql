select g.name, r.resortname, b.fromdate, b.todate, b.adultcount, b.childcount, b.totalcharge
from guest g join booking b
           on g.guestid=b.guestid
           join resort r
           on b.resortid= r.resortid
order by g.guestid;