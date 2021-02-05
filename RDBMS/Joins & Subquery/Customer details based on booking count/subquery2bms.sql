select user_id, name from users
where user_id in (select user_id from tickets
where no_seats > 1)
order by name;