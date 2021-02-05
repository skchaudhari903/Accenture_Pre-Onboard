select rs.resortname, c.describe, c.cabintype, c.bedroomcount
from resort rs join cabin c
       on c.resortid=rs.resortid
order by rs.resortid;