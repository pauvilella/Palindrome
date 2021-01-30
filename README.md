# Palindrome
Exercise related with Linked Lists.

## Exercise Challenge
Implement a function to check if a linked list is a palindrome.

### Solution
Both solutions perform the same algorithm but the first one is implemented with a reverse iterator and the second one by reversing the linked list.
Basically, what I do is check if the elements are the same checked forward than backwards (in the first solution by using the reversed iterator and the second one by comparing the first linked list with the reversed linked list).
This solution runs in O(N) runtime, which is the BCR of this problem.