select distinct m1.city, m1.name, m1.phone
from manager m1 join manager m2
       on m2.city=m1.city
       where m1.name!=m2.name
order by 1,2;