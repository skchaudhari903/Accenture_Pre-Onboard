select guest.guestid, guest.name, sum(booking.totalcharge) as
TOTALPAID from guest
join booking on booking.guestid=guest.guestid
group by guest.guestid,guest.name
having sum(booking.totalcharge)>=50000
order by guest.guestid;