SELECT e.title, COUNT(r.registration_id) AS total_registrations
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
GROUP BY e.event_id
ORDER BY total_registrations DESC
LIMIT 3;
