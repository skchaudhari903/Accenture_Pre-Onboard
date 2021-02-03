select resortid, comments 
from review 
where comments>'0' 
order by resortid, comments;