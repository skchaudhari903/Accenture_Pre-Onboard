select t.townname, t.state, p.describe as "Tourist Spots"
from town t join pointofinterest p
            on t.townid=p.townid
order by t.townid;