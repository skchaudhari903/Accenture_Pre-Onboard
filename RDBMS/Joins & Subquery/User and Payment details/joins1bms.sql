select users.user_id as user_id, users.name as user_name, tickets.ticket_id as ticket_id,
(no_seats * fare) as total_amount, ((no_seats*fare)- discount_amount) as paid_amount
from tickets join users
on tickets.user_id = users.user_id
join payments
on tickets.ticket_id = payments.ticket_id
join discounts
on payments.discount_id = discounts.discount_id
order by user_id desc;