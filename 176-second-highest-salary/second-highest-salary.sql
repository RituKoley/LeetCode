# Write your MySQL query statement below
select (select distinct salary
from employee 
order by salary desc 
LIMIT 1 offset 1) as secondhighestsalary