create table payments(
    payment_id varchar2(3),
    ticket_id varchar2(3),
    bd_id number(11),
    discount_id varchar2(3),
    constraint PK_payments primary key(payment_id),
    constraint FK_payments_tickets foreign key(ticket_id) references tickets,
    constraint FK_payments_bookingdetails foreign key(bd_id) references bookingdetails,
    constraint FK_payments_discounts foreign key(discount_id) references discounts
);