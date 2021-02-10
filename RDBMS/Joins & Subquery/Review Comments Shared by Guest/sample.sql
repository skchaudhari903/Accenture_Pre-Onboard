select rs.resortname, g.name as "GUEST NAME", r.comments
from guest g join review r
        on r.guestid=g.guestid join resort rs
        on r.resortid=rs.resortid
order by 1, 2;