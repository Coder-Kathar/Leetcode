# Write your MySQL query statement below
select e.name as Employee from employee as e
inner join employee as em
on
e.managerId = em.id
where e.salary > em.salary;