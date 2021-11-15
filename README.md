# DATA STRUCTURE
##Crab Food

####Description
Your team is given this CrabFood project for 10,000 CrabCoins (currency of Crabby Island, CC). After analyzing the Crabbians’ feedback, as well as having some serious meetings with the top management, your team finally finalized the requirements for CrabFood. CrabFood is defined as a Desktop application that manages and keeps track of daily delivery order for crabs to ensure the efficiency of delivery services, just think about GrabFood.

*TASK*
We are assigned to write a program to simulate a food delivery system for crabs. Our food delivery system is designed to manage and keep track of daily delivery order. This system is designed with several additional features as well.

*TASK REQUIREMENTS*
1. Make a Java console application that shows the delivery process.
2. Make a logging system that shows the entire process when CrabFood is up.
3. Make a reporting system that displays daily order information for every restaurant. This is
explicitly mentioned by the restaurants that partner with CrabFood for them to improve
their services.
4. You will be given sample input files to help in your development, utilize them wisely.
In this food delivery queueing system, there is no priority queue. First come first serve as our principle.
1. There are four information needed : Shop, Branch, Time, Dish
2.  There is no limit of order.
3. In the output, the detail of the process and the total completion time is showed.
4. This simulator can be set either automatically or manually to ensure all kinds of queue will be simulated and produce a desired outcome.
 
-	A display screen:
1.	There are six columns of data that display on the screen. The number of orders, arrival time of customer order, order time, cooking time, delivery time and total time are shown in each of the column.
2.	The display screen should have number of rows according to the number of order in the queue.
3.	The latest arrival of customer should be display at lowest row of the display screen.
4.	In the display screen, the type of the queue is also identified along with which counter the customer will be served.
  
-	Log file
-   	Generate a summary report of the queueing system. The output of the queueing simulator is generated in the form of a table. The output data of the queue can be print to log file for recording purposes.
  
*APPROACH*

We designed this queueing simulator to imitate the queueing system in Grab Food. All the requirements and additional requirements were fulfilled and that the system able to produce waiting time for each customer as well as the processing time. We also implemented both scheduling method which are distributing the customer to the queue and the food. The queueing system would be in first come first serve manner. There is no VIP member.
	
	In the system, user is only allowed enter input with the selection given. User can enter multiple times before they click ‘Finish’. This will ensure that the program can run smoothly and the program would not terminate because of this error. 

Besides, this simulator is especially useful with the features to be able to write the output data produced in the system in a log file. This is vital for the collect and analyze data. The data generated such as arrival time, cooking time, delivery time and total completion time can be saved into the log file. The queueing system is designed to calculate the total serving time from the first until the last customer that had been served


 

*DATA STRUCTURE*
	In our Data Structure, we’ve imported the LinkedList package to build the queue class. We’ve implemented queue in our food delivery system. A queue is built and the customer is placed into the queue once he made an order.
	Our queue is based on the first-in first-out method. Only the first customer in the queue will be entertained. The dish ordered by the customer will be prepared and delivered. Once finished, the customer will be dequeue and the next customer in the queue will become the first customer in the queue. Only then the next customer will be entertained. The waiting time for the previous customers in the queue will also be included.
	After the customer is served and is dequeue, the customer is added into an array list. The array list is used to print the log file for the system. This helps to maintain the record for the CrabFood food delivery business.
