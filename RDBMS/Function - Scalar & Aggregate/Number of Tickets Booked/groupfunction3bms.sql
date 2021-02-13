select user_id, count(ticket_id) as no_of_tickets from tickets
group by user_id
order by no_of_tickets;