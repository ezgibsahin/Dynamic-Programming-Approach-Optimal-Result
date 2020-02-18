# Dynamic-Programming-Approach-Optimal-Result

Design of a Dynamic Programming approach that plans an optimal investment strategy in Java.

# Explanation of the Expected Optimal Investment Strategy

Consider you have money in amount of M and you decide to invest it in a company for Y years. The company has n different investment options numbered 1 to n and each year (j), investment option i provides a return of rate rij. In other words, if you have M dollars in the investment i, you will have M*rij  dollars at the end of year j. At the end of each year, you can put your money in another investment or you can use the same investment. You make investment decisions only once per year. At the end of each year, you can leave the money earnt in the previous year in the same investment, or you can shift money to another investment. If you do not move your money between two consecutive years, you pay a fee in rate of f1 over total earnt money, whereas if you switch your money to another investment option, you will pay a fee in rate of f2 over total earnt money, where f2 > f1.

#
You will get the rate of each investment from the “input.xlsx” file. In the first matrix, columns represent years, rows are the investment identifiers. In the second matrix, rows show the f1 and f2 rates, columns show the consecutive years (1-2, 2-3, 10-11 etc.). You are allowed to convert .xlsx file into corresponding .txt files before reading in Java.
