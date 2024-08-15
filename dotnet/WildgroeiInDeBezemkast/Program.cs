using Microsoft.EntityFrameworkCore;
using WildgroeiInDeBezemkast.Models;

Console.WriteLine("Hello, World!");

const string connectionString = "Server=.;Database=AdventureWorks2022;Trusted_Connection=True;";

var optionsBuilder = new DbContextOptionsBuilder<AdventureWorks2022Context>();
optionsBuilder.UseSqlServer(connectionString);
var context = new AdventureWorks2022Context(optionsBuilder.Options);

Console.WriteLine(context.People.First().FirstName);

await context.People.ExecuteDeleteAsync();
