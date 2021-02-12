select name, concat(substr(name, 1, 3), substr(phno, 1, 3))
as password from users
order by name; 