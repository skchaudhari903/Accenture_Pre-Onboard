select b.resortid, (select resortname from resort rs where rs.resortid=b.resortid ) as "RESORTNAME",
count (b.bookingid) as TOTALBOOKING, sum (b.totalcharge) as
TOTALAMOUNT
from booking b
group by b.resortid
order by 1;