SELECT DATE_FORMAT(registration_date, '%Y-%m') AS month,
  COUNT(*) AS registration_count
FROM Registrations
GROUP BY month
ORDER BY month DESC;
