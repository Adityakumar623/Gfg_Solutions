<h2><a href="https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1?page=4&category[]=Arrays&curated[]=7&sortBy=difficulty">Count the subarrays having product less than k</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px">Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k. </span></span></p>

<p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Example 1:</strong></span></span></p>

<pre><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Input : 
</strong>n = 4, k = 10
a[] = {1, 2, 3, 4}
<strong>Output : </strong>
7
<strong>Explanation:</strong>
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.</span></span></pre>

<p>&nbsp;</p>

<p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Example 2:</strong></span></span></p>

<pre><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Input:
</strong>n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
<strong>Output:</strong>
16</span></span></pre>

<p>&nbsp;</p>

<p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>countSubArrayProductLessThanK()</strong>&nbsp;which takes the array <strong>a[]</strong>, its size <strong>n</strong><strong> </strong>and an integer <strong>k</strong> as inputs and returns the count of required subarrays.</span></span></p>

<p>&nbsp;</p>

<p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></span></p>

<p>&nbsp;</p>

<p><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:20px"><strong>Constraints:</strong><br>
1&lt;=n&lt;=10<sup>5</sup><br>
1&lt;=k&lt;=10<sup>15</sup><br>
1&lt;=a[i]&lt;=10<sup>5</sup></span></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Goldman Sachs</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;