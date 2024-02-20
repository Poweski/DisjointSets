# DisjointSets

Implementation of data structures for disjoint sets with any number of elements:
- **ListDisjointSet** - class based on a link list,
- **ForestDisjointSet** - class based on a forest of disjoint sets.

Unlike a typical implementation, the disjoint sets in this list do not store values, because the only important thing is whether the two sets are connected or not. We place the responsibility for storing references to the created sets on the class user. This implementation of disjoint sets can be used, for example, as tags for our data to determine whether they are in some relationship (represented as set connectivity).
