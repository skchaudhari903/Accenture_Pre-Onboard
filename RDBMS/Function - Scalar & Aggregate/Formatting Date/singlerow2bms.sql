select schedule_id, to_char(travel_date, 'YYYY-MM-DD') as formattedDate
from schedule order by schedule_id;