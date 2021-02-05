select distinct(users.name), address from users
inner join bookingdetails b
on users.user_id = b.user_id
where users.user_id not in (select user_id from bookingdetails b
where lower(name) = 'hdfc')
order by users.name;