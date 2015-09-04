--select c1.city || ' ' || length(c1.city) || chr(10) || c2.city || ' ' || length(c2.city)
--select c1.city, length(c1.city), chr(13) || chr(10), c2.city, length(c2.city)
select c1.city, length(c1.city), c2.city, length(c2.city)
from
  (select city from station
   where length(city) = (select min(length(city)) from station)
   order by city) c1,
  (select city from station
   where length(city) = (select max(length(city)) from station)
   order by city) c2
where rownum <= 1;

select c1.city, length(c1.city), c2.city, length(c2.city) from (select city from station where length(city) = (select min(length(city)) from station) order by city) c1, (select city from station where length(city) = (select max(length(city)) from station) order by city) c2 where rownum <= 1;


select city from station
  where length(city) = (select min(length(city)) from station)
  and rownum <= 1
  order by city;
select city from station where length(city) = (select max(length(city)) from station) order by city;

