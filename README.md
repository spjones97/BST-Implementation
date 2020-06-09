# Basic Binary Search Tree (BST)
You will write code that implements and exercises binary search trees. We are eventually going to build splay trees but will get there one chunk at a time, and the first chunk is the basic BST.

There are plenty of implementations of "tree" stuff out there. Please do not copy those. You may read them for ideas and understanding, but I want you to write your own code and follow the structure I outline below.

The learning in this activity comes from actually powering through all the reasoning needed to get the pointers (object addresses) and recursive calls hooked up correctly.

In our program, we will have one object as "the BST". We will call the various functions such as insert, delete, etc. on that object. There is a field in the BST object that is a link to the root data cell. If the field is null, then there are no nodes in the tree.

The BST implementation examples in your text are good patterns to follow in structuring your solution.

# Implementation Notes
Please note, as before, that just because the Oracle gives you 100, you are not guaranteed any specific grade on the assignment. We do try to put as many things as we can in there edge-case wise, but testing your programs is your responsibility. The main goal of the Oracle is to provide some direction. However, it is not the end-all be-all determiner of correctness. Please do not use this tool as a crutch.
