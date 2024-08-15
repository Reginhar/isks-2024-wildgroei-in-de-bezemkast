# .NET stub

Dit project is een opzetje voor een verbinding met de database.

De DbContext is gegenereerd met het volgende commando:
```
Scaffold-DbContext "Server=.;Database=AdventureWorks2022;Trusted_Connection=True;TrustServerCertificate=True;" 
```
Als hij klaagt over login, kijk dan in SSMS wat je servernaam is en vul die in bij Server in de connection string.

Je hebt nu een AdventureWorks2022Context.
