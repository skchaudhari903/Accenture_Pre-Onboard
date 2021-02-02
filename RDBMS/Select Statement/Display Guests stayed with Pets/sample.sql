 select guestid, resortid,(todate-fromdate) as numberofdays, adultcount, childcount, petcount, totalcharge 
 from booking 
 where petcount>0 and childcount>0 
 order by petcount desc;