using Microsoft.EntityFrameworkCore;
using WildgroeiInDeBezemkast.Models;

Console.WriteLine("Hello, World!");

var context = new AdventureWorks2022Context();

Console.WriteLine(context.People.First().FirstName);

await context.People.ExecuteDeleteAsync();
