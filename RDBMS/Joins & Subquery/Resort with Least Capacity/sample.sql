select rs.resortname, rs.townname
from resort rs left join cabin c
    on rs.resortid = c.resortid
    where c.bedroomcount = (select min(bedroomcount) from cabin)
    order by 1;