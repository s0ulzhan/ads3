# Sorting and Searching Algorithm Analysis

##  Project Overview
This project demonstrates and compares the performance of different sorting and searching algorithms in Java.  
The goal is to analyze how execution time changes depending on algorithm type and input size.

Selected algorithms:
- Bubble Sort (Basic Sorting)
- Heap Sort (Advanced Sorting)
- Linear Search (Searching)

---

##  1. Bubble Sort Result
<img width="1920" height="1080" alt="2026-04-28_16-19-16" src="https://github.com/user-attachments/assets/115c48a5-db36-4f5d-82eb-1f66c2687e31" />

## Explanation
Bubble Sort works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order.  
This process is repeated until the entire array is sorted.

It is simple but inefficient for large datasets.

Time Complexity:
- Best: O(n)
- Average: O(n²)
- Worst: O(n²)

--- 

##  2. Heap Sort Result
<img width="1920" height="1080" alt="2026-04-28_16-59-22" src="https://github.com/user-attachments/assets/ab00cab8-31fb-4d51-a8d2-1e3eeb398cd5" />
<img width="1920" height="1080" alt="2026-04-28_17-00-08" src="https://github.com/user-attachments/assets/306a48a8-ed23-41a5-8f50-981fb93cb2b1" />

##  Explanation
Heap Sort builds a binary heap from the array and repeatedly removes the largest element.  
After each removal, the heap structure is restored.

It is much more efficient than Bubble Sort for large datasets.

Time Complexity:
- Best: O(n log n)
- Average: O(n log n)
- Worst: O(n log n)


---

##  3. Linear Search Result
<img width="1920" height="1080" alt="2026-04-28_17-02-02" src="https://github.com/user-attachments/assets/6e0d8cff-7ec8-4261-a444-db311d82c8fc" />

##  Explanation
Linear Search goes through each element one by one until the target value is found.

It works on both sorted and unsorted arrays but can be slow for large datasets.

Time Complexity:
- Best: O(1)
- Average: O(n)
- Worst: O(n)
  
---

##  4. Full Comparison (All Algorithms Together)
<img width="1920" height="1080" alt="2026-04-28_17-03-53" src="https://github.com/user-attachments/assets/77fae38c-8973-41dc-b553-c49463beddad" />
<img width="1920" height="1080" alt="2026-04-28_17-04-22" src="https://github.com/user-attachments/assets/9a55da22-0896-468f-b7bd-121a3b29e347" />
<img width="1920" height="1080" alt="2026-04-28_17-04-45" src="https://github.com/user-attachments/assets/3f14d7fb-5207-43f5-964b-dce1efb7c4d7" />

##  Analysis

- Bubble Sort is the slowest algorithm due to O(n²) complexity.
- Heap Sort is much faster and efficient (O(n log n)).
- Linear Search is simple and works on unsorted arrays but depends on size.

The results match theoretical Big-O complexity.

---

## Reflection

Through this project, I learned how different algorithms perform in practice compared to theory.  
Heap Sort is significantly more efficient than Bubble Sort for large datasets.

The most challenging part was implementing Heap Sort and measuring execution time using System.nanoTime().

---

##  Conclusion

Algorithm choice has a major impact on performance.  
Efficient algorithms like Heap Sort are necessary when working with large datasets, while simpler algorithms like Bubble Sort are only suitable for small inputs.
