select resort.resortID, resort.resortName,
nvl2(manager.name, manager.name, 'NA') as MANAGERNAME,
nvl2(manager.phone, manager.phone, 'NA') as PHONENO from resort
left join manager on resort.managerid=manager.managerid
order by resort.resortID;