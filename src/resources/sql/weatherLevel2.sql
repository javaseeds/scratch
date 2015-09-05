-- weather observation station 2
select to_char(lat_n.sigma, '999999.99') || ' ' || to_char(long_w.sigma, '999999.99')
from
  (select sum(LAT_N) sigma from station) lat_n,
  (select sum(LONG_W) sigma from station) long_w;

-- weather observation station 14
select round(max(LAT_N), 4) from station
where LAT_N < 137.2345;

-- weather observation station 15
select round(LONG_W, 4) from station
where lat_n =
  (select max(LAT_N) from station where LAT_N < 137.2345);

-- weather observation station 16
select round(min(LAT_N), 4) from station
where LAT_N > 38.7780;

-- weather observation station 17
select round(LONG_W, 4) from station
where lat_n =
  (select min(LAT_N) from station where LAT_N > 38.7780);

-- weather observation station 17
-- Consider P1(a, b) and P2(c, d) be two points on 2D plane, where (a, b) be minimum
-- and maximum values of Northern Latitude and (c, d) be minimum and maximum values of
-- Western Longitude. Write a query to print the Manhattan Distance between points P1 and P2
-- up to 4 decimal digits.
-- let p(p1,p2) q(q1,q2) distance between p and q is d= |q1-p1| + |q2-p2|
select round(abs(q1.lng - p1.lat), 4) + round(abs(q2.lng - p2.lat), 4)
from
    (select min(LAT_N) lat from station) p1,
    (select min(LONG_W) lng from station) q1,
    (select max(LAT_N) lat from station) p2,
    (select max(LONG_W) lng from station) q2;

