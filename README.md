# Book Title Reporter
## Problem
Given a list of book titles, we need to find how many book titles are prefixed by other titles. <br> 
Examples: <br>
"wall", "wall paper", "wall street", "phil", "philadelphia" -> 3 (because "wall" which is the first element of array is prefix for 2nd and 3rd elements, also "phil" is the prefix for "philadelphia", so totally we have 3 prefix) <br>
"a", "a", "aa", "aaaab", "philadelphia" -> 7 <br>
"" -> 0 <br>

## Solution 
The solution creates two inner loops to iterate over the array and find the number of prefix for each element.

## Setup/Requirements
* Java 11 or up
* Maven 3
