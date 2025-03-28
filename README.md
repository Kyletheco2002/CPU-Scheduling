# CPU-Scheduling

This repository includes a CPU Scheduling Program made using JavaSE-14 as a course work done for a college class. The program schedules the order in which processes are handled using 6 different algorithms: 

1. First-Come, First-Served
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 

This program was developed and run using Eclipse.

This work is licensed under a
[Creative Commons Attribution-ShareAlike 4.0 International License][cc-by-sa].

[cc-by-sa]: http://creativecommons.org/licenses/by-sa/4.0/


## Program

You start by inputting the absolute value of the .csv file which contains the data regarding the processes. (you may edit the values of the input.csv file in this repository)

```
Please input the absolute file path of the csv file:
C:\Users\Kyle\Documents\Scheduling\input.csv
```

If the csv file is valid, you will then be prompted to select one CPU Scheduling Algorithm that the program would use to schedule the order in which processes are processed by the CPU. To select an algorithm, simply input a number between 1 to 6.

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

The program will then perform the CPU Scheduling and output the results of the scheduling including the Completion Times, Response Times, Waiting Times and Turnaround Times of the processes, along with the Gantt Chart which shows how the scheduling is done. After outputing the results, the program will repeat and prompt you again on which CPU Scheduling Algorithm you want to use.

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

If you input a number between 1 to 6, the program will perform the CPU Scheduling again using the newly selected CPU Scheduling Algorithm and output the results.

```
Please select a CPU Scheduling algorithm (or enter 7 to exit): 
1. First-Come, First-Served 
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 
7. Exit 

4
Completion Time: 
P1 - 32
P2 - 18
P3 - 3
P4 - 23

Response Time: 
P1 - 18
P2 - 0
P3 - 0
P4 - 0
Average Response Time: 4.5

Waiting Time: 
P1 - 18
P2 - 0
P3 - 0
P4 - 16
Average Waiting Time: 8.5

Turnaround Time: 
P1 - 27
P2 - 14
P3 - 2
P4 - 23
Average Turnaround Time: 16.5

Gantt Chart:
0--P4--1--P3--3--P4--4--P2--18--P4--23--P1--32

Please select a CPU Scheduling algorithm (or enter 7 to exit): 
1. First-Come, First-Served 
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 
7. Exit 
```

However, if you wish to exit the program, then you may input the number 7 to close the program.

```
Please select a CPU Scheduling algorithm (or enter 7 to exit): 
1. First-Come, First-Served 
2. Shortest-Job-First 
3. Shortest-Remaining-Time-First 
4. Priority Preemptive 
5. Priority Non-Preemptive 
6. Round-Robin 
7. Exit 

7
Thank you for using the program.
```

