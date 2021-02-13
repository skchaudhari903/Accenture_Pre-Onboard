select resortid, (sum(adultcount)+sum(childcount)) as "Total Guest"
from booking
group by resortid
having (sum(adultcount)+sum(childcount))<=10
order by resortid;