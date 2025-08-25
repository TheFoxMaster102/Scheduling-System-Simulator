# Job Priority Queue

This program simulates a job scheduling system that processes jobs based on their priority. It reads a list of jobs from a text file, adds them to a priority queue, and then processes them in order of priority.

## How to Run

1.  **Compile the code:**
    ```bash
    javac Proj4/job.java Proj4/JobSort.java
    ```

2.  **Run the program:**
    ```bash
    java Proj4.JobSort
    ```

## Input File Format

The program reads job data from a file named `jobs.txt`. Each line in this file represents a single job and should contain three space-separated integers:

-   **Job ID:** A unique identifier for the job.
-   **Job Length:** The time required to complete the job.
-   **Job Priority:** The priority of the job (lower numbers indicate higher priority).

### Example `jobs.txt`:

```
111 30 3
222 60 1
333 10 7
```
