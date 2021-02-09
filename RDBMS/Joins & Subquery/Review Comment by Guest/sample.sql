select g.name, rs.resortname, rv.comments 
from guest g join review rv 
on g.guestid=rv.guestid 
join resort rs 
on rs.resortid= rv.resortid 
order by 1, 2;