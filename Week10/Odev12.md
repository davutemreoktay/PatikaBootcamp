1-)film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

->SELECT * FROM film
WHERE length>ANY(
SELECT AVG(length) FROM film
);

2-)film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

->SELECT COUNT(*)
FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

3-)film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.

->SELECT*FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND
replacement_cost=(SELECT MIN(replacement_cost) FROM film)
ORDER BY film;

4-)payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

->SELECT first_name FROM customer WHERE customer_id = ANY
( SELECT customer_id FROM payment WHERE amount = ( SELECT MAX(amount) FROM payment ));