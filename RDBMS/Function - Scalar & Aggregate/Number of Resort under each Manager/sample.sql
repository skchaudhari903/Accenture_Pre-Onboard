select managerid, count(resortid) as NUMBEROFRESORT
from resort where starrating >= 4
group by managerid
order by managerid;