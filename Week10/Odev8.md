1-)test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

->CREATE TABLE employee(
id SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
email VARCHAR(100),
birthday DATE);

2-)Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

->insert into employee (name, birthday, email) values ('Stefano', '2007-11-04', 'slenihan0@ovh.net');

insert into employee (name, birthday, email) values ('Willetta', '2005-05-13', 'whedditch1@bloglines.com');

insert into employee (name, birthday, email) values ('Wilbert', '1969-11-04', 'wklaaassen2@blinklist.com');

insert into employee (name, birthday, email) values ('Ingrim', '1996-07-25', 'imullany3@clickbank.net');

insert into employee (name, birthday, email) values ('Sigrid', '1991-12-30', 'skiff4@imageshack.us');

insert into employee (name, birthday, email) values ('Isabeau', '2015-09-26', 'iscammonden5@google.co.uk');

insert into employee (name, birthday, email) values ('Eloise', '2023-04-12', 'ealentyev6@mashable.com');

insert into employee (name, birthday, email) values ('Devondra', '2008-09-21', 'dstainson7@cnbc.com');

insert into employee (name, birthday, email) values ('Delilah', '1970-01-09', 'dclemont8@marketwatch.com');

insert into employee (name, birthday, email) values ('Kerrin', '1989-09-03', 'kkenelin9@sphinn.com');

insert into employee (name, birthday, email) values ('Concettina', '1967-05-06', 'cfulstowa@statcounter.com');

insert into employee (name, birthday, email) values ('Elianore', '1962-03-04', 'erymmerb@sakura.ne.jp');

insert into employee (name, birthday, email) values ('Kelvin', '1997-02-18', 'khuniwallc@com.com');

insert into employee (name, birthday, email) values ('Olag', '1979-01-11', 'ovittored@paginegialle.it');

insert into employee (name, birthday, email) values ('Dinny', '2002-04-12', 'drothame@google.ca');

insert into employee (name, birthday, email) values ('Deanna', '1978-05-02', 'dblacklawef@cornell.edu');

insert into employee (name, birthday, email) values ('Kristen', '2014-12-13', 'ksaffrang@hao123.com');

insert into employee (name, birthday, email) values ('Napoleon', '1988-01-16', 'ndoveyh@wordpress.com');

insert into employee (name, birthday, email) values ('Vivie', '2016-09-24', 'vlabordei@google.co.jp');

insert into employee (name, birthday, email) values ('Constantine', '2001-07-02', 'cpirreyj@uol.com.br');

insert into employee (name, birthday, email) values ('Dorey', '1962-06-04', 'deagletonk@1688.com');

insert into employee (name, birthday, email) values ('Maryann', '2001-07-31', 'mrovel@abc.net.au');

insert into employee (name, birthday, email) values ('Wainwright', '1962-11-20', 'wailwardm@nydailynews.com');

insert into employee (name, birthday, email) values ('Miller', '1961-10-30', 'mcattermulln@networkadvertising.org');

insert into employee (name, birthday, email) values ('Burtie', '1998-02-26', 'bhallwortho@about.com');

insert into employee (name, birthday, email) values ('Annmaria', '1998-05-04', 'asowerbyp@typepad.com');

insert into employee (name, birthday, email) values ('Lucina', '2001-03-19', 'lroddaq@netscape.com');

insert into employee (name, birthday, email) values ('Filip', '1962-04-23', 'fpococker@usnews.com');

insert into employee (name, birthday, email) values ('Sunny', '1977-07-02', 'ssharratts@goodreads.com');

insert into employee (name, birthday, email) values ('Lila', '2003-11-03', 'lskewst@hhs.gov');

insert into employee (name, birthday, email) values ('Briana', '1964-02-14', 'bdroganu@scientificamerican.com');

insert into employee (name, birthday, email) values ('Elayne', '2023-03-03', 'eisaacsv@networksolutions.com');

insert into employee (name, birthday, email) values ('Elinor', '2016-08-18', 'etorrittiw@washingtonpost.com');

insert into employee (name, birthday, email) values ('Joe', '1978-09-16', 'jpettsx@youtu.be');

insert into employee (name, birthday, email) values ('Weylin', '1994-08-28', 'wpettifordy@slashdot.org');

insert into employee (name, birthday, email) values ('Daphene', '1991-05-09', 'dcourtierz@wired.com');

insert into employee (name, birthday, email) values ('Valma', '2004-08-29', 'vforsyth10@list-manage.com');

insert into employee (name, birthday, email) values ('Leontyne', '1965-02-09', 'llanfere11@imgur.com');

insert into employee (name, birthday, email) values ('Eldin', '2009-12-03', 'ebredee12@prlog.org');

insert into employee (name, birthday, email) values ('Thorndike', '1961-11-18', 'tcorbyn13@who.int');

insert into employee (name, birthday, email) values ('Dorella', '1971-08-07', 'dortiga14@wunderground.com');

insert into employee (name, birthday, email) values ('George', '2011-08-11', 'gandreaccio15@webnode.com');

insert into employee (name, birthday, email) values ('Paulita', '1963-02-14', 'psodeau16@yandex.ru');

insert into employee (name, birthday, email) values ('Aurelie', '1996-04-29', 'aweldrake17@google.ca');

insert into employee (name, birthday, email) values ('Alyssa', '1979-08-22', 'amcwhinnie18@slate.com');

insert into employee (name, birthday, email) values ('Uri', '1961-06-05', 'usherratt19@networksolutions.com');

insert into employee (name, birthday, email) values ('Pinchas', '1972-09-13', 'pblaszczyk1a@wsj.com');

insert into employee (name, birthday, email) values ('Mufinella', '2001-05-26', 'mgallen1b@phoca.cz');

insert into employee (name, birthday, email) values ('Imogene', '2002-02-24', 'ivasnev1c@usnews.com');

insert into employee (name, birthday, email) values ('Timothy', '1970-11-27', 'twinterson1d@europa.eu');

3-)Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

->
1-UPDATE employee
SET name='DEO'
WHERE id=1
RETURNING*;
2-UPDATE employee
SET name='OA'
WHERE id=2
RETURNING*;
3-UPDATE employee
SET email='avoa@gmail.com'
WHERE id=2
RETURNING*;
4-UPDATE employee
SET birthday='1990-03-30'
WHERE id=2
RETURNING*;
5-UPDATE employee
SET name='X'
WHERE id=34
RETURNING*;

4-)Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

->
1-DELETE FROM employee
WHERE id=6;
2-DELETE FROM employee
WHERE name='DEO';
3-DELETE FROM employee
WHERE id=32;
4-DELETE FROM employee
WHERE id=45;
5-DELETE FROM employee
WHERE id=23;