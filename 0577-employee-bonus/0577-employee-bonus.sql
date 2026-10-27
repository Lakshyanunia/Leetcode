select e.name,b.bonus
from Employee e
Left JOIN Bonus b
ON e.empID = b.empID
WHERE bonus < 1000 OR bonus IS NULL ;