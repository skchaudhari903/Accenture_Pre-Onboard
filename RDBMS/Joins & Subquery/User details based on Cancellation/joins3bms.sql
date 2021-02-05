select users.user_id, users.name
from users join tickets
on users.user_id = tickets.user_id
join cancellation
on cancellation.ticket_id = tickets.ticket_id
order by users.user_id;