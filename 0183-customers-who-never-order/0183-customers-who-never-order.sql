# Write your MySQL query statement below
select name as Customers
from customers
left join orders On Customers.id=Orders.customerId
where Orders.customerId is null;