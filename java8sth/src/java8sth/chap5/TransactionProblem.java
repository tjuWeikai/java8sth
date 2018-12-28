/** 
 * Project Name:java8sth 
 * File Name:TransactionProblem.java 
 * Package Name:java8sth.chap5 
 * Date:2018年12月27日下午11:57:30 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** 
 * ClassName:TransactionProblem <br/> 
 * Function: Solve some problems about transaction 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月27日 下午11:57:30 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class TransactionProblem {

	
	public static void main(String[] args) {
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Trader> traders = Arrays.asList(raoul,mario,alan,brian);
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		//Get all transactions sorted by value ascending and happened in a specific year
		System.out.println(getTransactionsOfUniqueYear(2011, transactions));
		
		//Find all cities in where the traders worked
		System.out.println(findCitiesTradersWorked(traders));
		
		//Find traders from a specific city and sort them by name
		System.out.println(findTradersFromOneCityAndSortByName("Cambridge", traders));
		
		//Get traders' name sorted by letter in one string
		System.out.println(getAllNamesSortedByLetter(traders));
		
		//Does anyone live in a specific city?
		System.out.println(isAnyoneLivingInSpecificCity(traders, "Milan"));
		
		//Print values of transaction dealt by traders who live in a specific city
		System.out.println(printSpecificCityTradersTransactionsValues("Cambridge", traders, transactions));
		
		//Get the highest value of transactions
		System.out.println(getHighestValue(transactions));
		
		//Get the transaction having lowest value
		System.out.println(getTransactionHavingLowestValue(transactions));
		
		
	}
	
	public static List<Transaction> getTransactionsOfUniqueYear(int year, List<Transaction> transactions){
		return transactions.stream()
						   .filter(transaction -> year == transaction.getYear())
						   .sorted(Comparator.comparing(Transaction::getValue))
						   .collect(Collectors.toList());
						   
	}
	
	public static List<String> findCitiesTradersWorked(List<Trader> traders) {
		return traders.stream()
						   .map(Trader::getCity)
						   .distinct()
						   .collect(Collectors.toList());
	}
	
	public static List<Trader> findTradersFromOneCityAndSortByName(String city,List<Trader> traders) {
		return traders.stream()
					  .filter(trader -> city.equals(trader.getCity()))
					  .sorted(Comparator.comparing(Trader::getName))
					  .collect(Collectors.toList());
	}
	
	public static String getAllNamesSortedByLetter(List<Trader> traders) {
		return traders.stream()
					  .map(Trader::getName)
					  .distinct()
					  .sorted()
//					  .reduce("", (n1, n2) -> n1 + n2); //Worse efficiency
					  .collect(Collectors.joining());// More efficient
	}
	
	public static boolean isAnyoneLivingInSpecificCity(List<Trader> traders, String city) {
		return traders.stream()
					  .anyMatch(trader -> city.equals(trader.getCity()));
	}
	
	public static List<Integer> printSpecificCityTradersTransactionsValues(String city,
																		   List<Trader> traders,
																		   List<Transaction> transactions
																		   ) {
		return traders.stream()
					  .filter(trader -> city.equals(trader.getCity()))
					  .flatMap(trader -> transactions.stream()
							  						 .filter(transaction -> 
							  						 			trader.equals(transaction.getTrader())
							  								 )
							  						 .map(Transaction::getValue)
							  )
					  .collect(Collectors.toList());
	}

	public static int getHighestValue(List<Transaction> transactions) {
		return transactions.stream()
						   .max(Comparator.comparing(Transaction::getValue))
						   .get()
						   .getValue();
	}

	public static Transaction getTransactionHavingLowestValue(List<Transaction> transactions) {
		return transactions.stream()
						   .min(Comparator.comparing(Transaction::getValue))
						   .get();
	}
}
  