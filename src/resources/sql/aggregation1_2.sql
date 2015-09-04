-- #1
select trunc(floor(avg(population))) from city;

-- #2
select sum(population) from city where countrycode = 'JPN';


