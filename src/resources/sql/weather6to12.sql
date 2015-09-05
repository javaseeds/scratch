-- #6
select distinct(city) from station where REGEXP_LIKE (lower(city), '^[aeiou].*$') order by city;

-- #7
select distinct(city) from station where REGEXP_LIKE (lower(city), '^.*[aeiou]$') order by city;

-- #8
select distinct(city) from station where REGEXP_LIKE (lower(city), '^[aeiou].*[aeiou]$') order by city;

-- #9
select distinct(city) from station where REGEXP_LIKE (lower(city), '^[^aeiou].*$') order by city;

-- #10
select distinct(city) from station where REGEXP_LIKE (lower(city), '^.*[^aeiou]$') order by city;

-- #11
select distinct(city) from station
where (REGEXP_LIKE (lower(city), '^[^aeiou].*$') OR REGEXP_LIKE (lower(city), '^.*[^aeiou]$'))
order by city;

-- #12
select distinct(city) from station where REGEXP_LIKE (lower(city), '^[^aeiou].*[^aeiou]$') order by city;

