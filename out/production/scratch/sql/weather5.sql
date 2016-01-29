select c1.city, length(c1.city)
from
  (select city from station
   where length(city) = (select min(length(city)) from station)
   order by city) c1
where rownum <= 1;
select c2.city, length(c2.city)
from
  (select city from station
   where length(city) = (select max(length(city)) from station)
   order by city) c2
where rownum <= 1;
