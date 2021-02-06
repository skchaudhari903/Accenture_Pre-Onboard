select distinct rate as SECOND_MAX
from cabincost
where rate=(select max(rate) from cabincost where rate< (select max(rate) from cabincost));