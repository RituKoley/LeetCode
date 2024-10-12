# Write your MySQL query statement below
SELECT name, bonus
FROM employee left join bonus
ON employee.empId = bonus.empId
WHERE bonus < 1000 OR bonus is NULL