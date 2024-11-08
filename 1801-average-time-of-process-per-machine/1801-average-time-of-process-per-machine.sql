# Write your MySQL query statement below
select m.machine_id, round(
    (select avg(a.timestamp) from Activity a where a.activity_type='end' and a.machine_id=m.machine_id)-(select avg(a.timestamp) from Activity a where a.activity_type='start' and a.machine_id=m.machine_id),3
) as processing_time from Activity m
group by m.machine_id