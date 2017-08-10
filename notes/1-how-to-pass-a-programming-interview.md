# How to pass a programming interview

TIL how to pass a programming interview, via
[TripleByte](http://blog.triplebyte.com/how-to-pass-a-programming-interview).

In this doc I will summarize the concepts mentioned in section 2 of the above
article. This is by no means an exhaustive reference, and should only be used
as a high-level guide.

## Hash Tables

A [hash table](https://en.wikipedia.org/wiki/Hash_table) (hash map) is a data
structure used to implement an associative array, a structure that can map keys
to values. Average case time complexity of search/insert/delete is O(1), worst
case O(n). Computing the space i.e. size of a hash table is O(n).

Typically, a hash table is implemented by mapping a key to a hash using some
hash function, and mapping the hash to some bucket in an array.

In Python, hash tables are denoted using curly braces `{}`. For example:

    >>> h = {}
    >>> h[1] = 'a'
    >>> h[2] = 'b'
    >>> print(h[1])
    a
    >>> h
    {1: 'a', 2: 'b'}

## Linked lists

A [linked list](https://en.wikipedia.org/wiki/Linked_list) is a linear
collection of data elements, called nodes pointing to the next node by means of
pointer.

    >>> l = []
    >>> l.append('a')
    >>> l.append('b')
    >>> l
    ['a', 'b']
    >>> l.append('c')
    >>> l.remove('b')
    >>> l
    ['a', 'c']

## Breadth-first search, depth-first search

A breadth-first search (BFS) explores the nodes of a tree level by level. A
depth-first search (DFS) explores the nodes of a tree by exploring as far as
possible along a branch before backtracking.

There are three types of DFS: in-order, pre-order, and post-order.

Tree problems, while very academic, are some of my favorite to solve Just For
Fun^TM. In fact I have an example BFS problem in another one of my [github
repos](https://github.com/mpillar/interview-questions/blob/master/src/java/LinkNodes.java).

## Quicksort, merge sort

[Quick sort](https://en.wikipedia.org/wiki/Quicksort) is (also) an efficient,
general-purpose divide and conquer algorithm.

Quicksort first divides a large array into two smaller sub-arrays: the low
elements and the high elements. Quicksort can then recursively sort the
sub-arrays.

The steps are:

* Pick an element, called a pivot, from the array.
* Partitioning: reorder the array so that all elements with values less than
  the pivot come before the pivot, while all elements with values greater than
  the pivot come after it (equal values can go either way). After this
  partitioning, the pivot is in its final position. This is called the
  partition operation.
* Recursively apply the above steps to the sub-array of elements with smaller
  values and separately to the sub-array of elements with greater values.

[Merge sort](https://en.wikipedia.org/wiki/Merge_sort) is (also) an efficient,
general-purpose divide and conquer sorting algorithm.

Conceptually, a merge sort works as follows:

* Divide the unsorted list into n sublists, each containing 1 element (a list
  of 1 element is considered sorted).
* Repeatedly merge sublists to produce new sorted sublists until there is only
  1 sublist remaining. This will be the sorted list.

Both quicksort and merge sort have average case time complexity of O(n*ln(n)).

In Python, sorting is easy using the `sort` method on lists, and using the
`sorted` builtin.

For example:

    >>> l = [3, 4, 7, 1, 0]
    >>> sorted(l)
    [0, 1, 3, 4, 7]
    >>> l
    [3, 4, 7, 1, 0]
    >>> l.sort()
    >>> l
    [0, 1, 3, 4, 7]

## Binary search

The [Binary search](https://en.wikipedia.org/wiki/Binary_search_algorithm) or
half-interval search algorithm finds the position of a target value within a
sorted array. In Python, you can use the bisect module to do binary search.

## 2D arrays

Two dimensional arrays in Python can be implemented, again, using the very
powerful builtin Python list. For example:

    >>> [[0 for x in range(5)] for x in range(5)] 
    [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

## Dynamic arrays

Dynamic arrays (as with the Python list) are often implemented with linked
lists under the hood, as opposed to fixed with arrays, which reserve a specific
block of memory. In Python, the builtin list is an dynamic array.

## Binary search trees

[Binary search](https://en.wikipedia.org/wiki/Binary_search_tree) trees keep
their keys in sorted order, so that lookup and other operations can use the
principle of binary search. Of interest: searching, insertion, deletion.
Deletion is the most complicated operation, as it required rebalancing in
certain cases.
 
## Dynamic programming

[Dynamic programming](https://en.wikipedia.org/wiki/Dynamic_programming) is a
method for solving a complex problem by breaking it down into a collection of
simpler sub-problems, solving each of those sub-problems just once, and storing
their solutions.

## Big-O analysis

[Big-O notation](https://en.wikipedia.org/wiki/Big_O_notation) describes the
limiting behavior of a function when the argument tends towards a particular
value or infinity. We often evaluate best, average and worst case limiting
behavior.

For example, the following code snippet has `O(n^2)` behavior, where `n` is the
length of the parameter `a`, since it iterates over a with a nested loop.

    def foo(a):
        result = 0
        for i in range(len(a)):
            for j in range(len(a)):
                result += a[i] * a[j]
        return result
