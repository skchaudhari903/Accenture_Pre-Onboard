select townname from town t
where t.summertemp>(select summertemp from town where townname='JAIPUR')
order by 1;