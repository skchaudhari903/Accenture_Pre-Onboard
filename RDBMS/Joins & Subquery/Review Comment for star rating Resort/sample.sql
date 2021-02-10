select r.resortid, rv.comments from Resort r join review rv 
on r.resortid=rv.resortid where r.starRating > 4.2
order by 1;