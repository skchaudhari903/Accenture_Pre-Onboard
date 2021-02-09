select p.pointid, p.describe, p.opentime, p.closetime
from pointofinterest p join town t
                      on t.townid=p.townid
                      where t.townname='CHENNAI'
                      order by 1;