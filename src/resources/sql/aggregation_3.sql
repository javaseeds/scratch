-- Population Density Difference
select co.continent, floor(avg(ci.population)) from city ci
inner join country co on ci.countrycode = co.code
group by co.continent;

-- Average Population of Each Continent
select co.continent, floor(avg(ci.population)) from city ci
inner join country co on ci.countrycode = co.code
group by co.continent;
