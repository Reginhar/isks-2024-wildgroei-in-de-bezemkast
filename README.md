# Wildgroei In De Bezemkast

Deze workshop duurt ongeveer 30 minuten, maar je mag er natuurlijk ook korter of langer over doen.

## Doel
Het doel van deze workshop is best practices verzamelen over het opschonen van SQL databases. Als deelnemer werk je een oplossing uit en draag je je ervaring bij. Zo krijgen we input om guidance te schrijven over dit onderwerp.

## Opdracht
Jij bent op een project geplaatst waar je een mooie applicatie hebt ontwikkeld die gebruikmaakt van een SQL database. Natuurlijk moet de data na een bepaalde periode weer opgeschoond worden. Maar hoe ga je dit doen? Maak je een SQL job? Maak je een applicatie die periodiek een DELETE uitvoert? Zo ja, hoevaak dan en waarom kies je voor die frequentie? Hoelang mag de job draaien? Verwijder je een maximaal aantal rows per keer of heb je een timeout? Of mag hij net zolang draaien als nodig? Houd je rekening met locking of niet? Gebruik je cascading deletes of juist niet? Delete je de rows een voor een of veel tegelijk? Huur je een database administrator in die het elke maand handmatig schoont? De keuze is aan jou.

**Concreet**: Verwijder de personen in de tabel Person.Person met een ModifiedDate van voor 2013. Je mag zelf kiezen hoe je dit wilt doen. Denk bewust na over de keuzes die je maakt. Noteer je overwegingen en je keuzes: wat werkt wel/niet? waar kies je voor en waar zou je juist helemaal nooit voor kiezen? wat zou je moeten kiezen in welke situatie?

Je krijgt een connection string naar een database om deze opdracht uit te voeren. Als alternatief kun je de database ook lokaal installeren. Verder kun je in deze repository een .NET-stub en een Java-stub vinden, mocht je daar gebruik van willen maken. Het is natuurlijk ook goed als je puur SQL gebruikt.

Fork deze repository en push jouw oplossing en notities naar je fork. Of mail jouw overwegingen naar ons.

## Lokale database
Als je wilt testen met een lokale database, kun je het volgende doen.

1. Installeer SQL Server.

2. [Download AdventureWorks2022](https://learn.microsoft.com/en-us/sql/samples/adventureworks-install-configure?view=sql-server-ver16&tabs=ssms)
naar `C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\Backup\`

3. Restore database:
```sql
USE [master];
GO

RESTORE DATABASE [AdventureWorks2022]
FROM DISK = N'C:\AdventureWorks2022.bak'
WITH
    FILE = 1,
    NOUNLOAD,
    STATS = 5,
    MOVE 'AdventureWorks2022' TO 'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\AdventureWorks2022.mdf',
    MOVE 'AdventureWorks2022_log' TO 'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\AdventureWorks2022_log.ldf',
    REPLACE;
GO
```
