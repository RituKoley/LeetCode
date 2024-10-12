# Write your MySQL query statement below
SELECT today.id
FROM weather yesterday, weather today
WHERE DATEDIFF(today.recordDate, yesterday.recordDate) = 1
AND today.temperature > yesterday.temperature