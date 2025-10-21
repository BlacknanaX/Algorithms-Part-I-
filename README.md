# **Readme - Course Notes**
## 1. Union-Find
* ~~Quick-find~~
  - Union too expensive (N array accesses).
  - Trees are flat, but too expensive to keep them flat.
* ~~Quick-union~~
  - Trees can get tall.
  - Find too expensive (could be N array accesses) 
  - Union costs increase linearly (union cost + find root cost).
 * **Weighted Quick-Union**
   - Modify quick-union to avoid tall trees (therefore no item will be too far away from the root).
   - Keep track of size of each tree (number of objects).
   - Balance by linking root of smaller tree to root of larger tree.

 | Algorithms  | Initialize | Union | Find|
 |-------------|------------|-------|-----|
 | Quick-Find  | N          | N     | 1   |
 | Quick-Union | N          | N+    | N   | 


   - 
