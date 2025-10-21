# **Readme - Course Notes**
## 1. Union-Find
* ~~Quick-find~~
  - Union too expensive (N array accesses).
  - Trees are flat, but too expensive to keep them flat.
* ~~Quick-union~~
  - Trees can get tall.
  - Find too expensive (could be N array accesses) 
  - Union costs increase linearly (union cost + find root cost).

 | Algorithms  | Initialize | Union | Find|
 |-------------|------------|-------|-----|
 | Quick-Find  | N          | N     | 1   |
 | Quick-Union | N          | N+    | N   | 
 
