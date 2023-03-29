# CPU-Scheduling

This repository includes a CPU Scheduling Program made using JavaSE-14 as a course work done for a college class. The program schedules the order in which processes are handled using 6 different algorithms: 

1. First-Come, First-Served
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 

This program was developed and run using Eclipse.

LICENSE: 

## Program

You start by inputting the absolute value of the .csv file which contains the data regarding the processes. (you may edit the values of the input.csv file in this repository)

```
Please input the absolute file path of the csv file:
C:\Users\Kyle\Documents\Scheduling\input.csv
```

If the csv file is valid, you will then be prompted to select one CPU Scheduling Algorithm that the program would use to schedule the order in which processes are processed by the CPU. Input a number between 1-6 to select an option.

```
Please select a CPU Scheduling algorithm (or enter 7 to exit): 
1. First-Come, First-Served 
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 
7. Exit 

1
```

The program will then perform the CPU Scheduling and output the results of the scheduling including the Completion Times, Response Times, Waiting Times, Turnaround Times, and the Gantt Chart. After outputing the results, the program will repeat and prompt you again on which CPU Scheduling Algorithm you want to use.

```
Completion Time: 
P1 - 32
P2 - 23
P3 - 9
P4 - 7

Response Time: 
P1 - 18
P2 - 5
P3 - 6
P4 - 0
Average Response Time: 7.25

Waiting Time: 
P1 - 18
P2 - 5
P3 - 6
P4 - 0
Average Waiting Time: 7.25

Turnaround Time: 
P1 - 27
P2 - 19
P3 - 8
P4 - 7
Average Turnaround Time: 15.25

Gantt Chart:
0--P4--7--P3--9--P2--23--P1--32

Please select a CPU Scheduling algorithm (or enter 7 to exit): 
1. First-Come, First-Served 
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 
7. Exit 
```


