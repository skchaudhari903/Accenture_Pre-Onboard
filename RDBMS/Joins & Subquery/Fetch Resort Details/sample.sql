select r.resortname, mg.name from resort r join Manager mg
on r.managerID = mg.managerID where r.townname = 'JAIPUR'
order by 1;