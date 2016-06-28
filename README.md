# Luck-Balance

Lena is preparing for important coding competition that is preceded by  N sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers, L[i] and T[i]:

 L[i] is the amount of luck that can be gained by winning the contest. If Lena wins the contest, her luck balance will decrease by L[i]; if she loses it, her luck balance will increase by L[i].

T[i] denotes the contest's importance rating. It's equal to 1 if the contest is important, and it's equal to 0  if it's unimportant.
If Lena loses no more than K  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

Input Format
The first line contains two space-separated integers, N (the number of preliminary contests) and  K (the maximum number of important contests Lena can lose), respectively. 
Each line i of the  N subsequent lines contain two space-separated integers,  L[i] (the contest's luck balance) and T[i] (the contest's importance rating), respectively.

Output Format
Print a single integer denoting the maximum amount of luck Lena can have after all the contests.
