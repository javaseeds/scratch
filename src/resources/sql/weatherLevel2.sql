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

