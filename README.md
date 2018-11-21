# JavaSorting2

Note to self: This repo is saved as the directory "LSE/Term 1/MA407 Algorithms & Computation/Week 5/MyCode_Week5"  

## Quick Sort
Input: a<sub>1</sub>, ... , a<sub>n</sub>  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

1. Pick some element a<sub>k</sub> from the input and call it the pivot.  
2. Reorder the list such that for all i = 1,.., k-1, k+1,..., n:  
      i. all elements a<sub>i</sub> < a<sub>k</sub> come before the pivot.  
      ii. all elements a<sub>i</sub> > a<sub>k</sub> come after the pivot.  
3. Recursively sort the elements on either side of the pivot. 

Recurrence formula: T(n) = T(n-1) + cn  
Running time: O(n<sup>2</sup>)  


## Counting Sort

Input: a<sub>1</sub>, ... , a<sub>n</sub>, a<sub>i</sub> in \[k] for all i.  
Output: b<sub>1</sub>, ... , b<sub>n</sub> (the a<sub>i</sub>'s in increasing order)  

1. Set c<sub>1</sub> = c<sub>2</sub> = ... = c<sub>k</sub> = 0. Define c<sub>j</sub> = c<sub>j+1</sub> + 1 if a<sub>i</sub> = j for i=1,2,...,n, ie. c<sub>j</sub> = # of times j appears in the input.  
2. Set d<sub>0</sub> = d<sub>1</sub> = ... = d<sub>k</sub> = 0. Define d<sub>j</sub> = d<sub>j-1</sub> + c<sub>j</sub> for j=1,2,..k, ie. d<sub>j</sub> = # of times a<sub>i</sub>'s in the input are such that a<sub>i</sub> <= j.  
3. For i=n,..,1, put a<sub>i</sub> in the position d<sub>a<sub>i</sub></sub> of the output and set d<sub>a<sub>i</sub></sub> = d<sub>a<sub>i</sub></sub> - 1, ie if h = d<sub>a<sub>i</sub></sub> then set b<sub>h</sub> = a<sub>i</sub> in the output.  

Recurrence formula: T(n) = (k+n) + (2k+1) + 2n  
Running time: O(n+k). Note if n=k, then it takes O(n) time  
