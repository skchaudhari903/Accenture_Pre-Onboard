create view user_travel_details as select tickets.user_id as
user_id, users.name as user_name, sc.source as source, sc.destination as destination
from tickets, users, schedule sc
where sc.schedule_id = tickets.schedule_id
and users.user_id = tickets.user_id;