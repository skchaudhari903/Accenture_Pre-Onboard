select r.resortname, g.name, rv.comments from resort r join review rv
on  r.resortid=rv.resortid join guest g
on g.guestid = rv.guestid
order by r.resortid;