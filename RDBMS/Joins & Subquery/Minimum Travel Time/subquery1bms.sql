select schedule_id, source, destination, duration
from schedule
where duration = (select min(duration) from schedule)
order by schedule_id;