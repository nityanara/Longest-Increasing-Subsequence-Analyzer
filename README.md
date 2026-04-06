# Longest-Increasing-Subsequence-Analyzer


This project is a web-based application that analyzes the Longest Increasing Subsequence (LIS) from a given sequence of numbers. The purpose of this project is to identify the longest increasing trend in a sequence and display it in a simple and understandable way.

The user can enter a sequence of integers through the input field provided on the webpage. The system then processes this input and determines the longest increasing subsequence present in the data. Along with the subsequence, the length of the LIS is also displayed to the user.

The application is built using Java and Spring Boot for the backend, and HTML and CSS for the frontend. The frontend provides a clean and interactive interface where users can enter their input and instantly view the results without navigating to another page.

The main logic of the project is based on Dynamic Programming. For every element in the sequence, the algorithm checks all previous elements to see if an increasing subsequence can be formed. A dp array is used to store the length of the LIS ending at each index, and a prev array is used to reconstruct the actual subsequence. After processing the entire sequence, the algorithm backtracks using the prev array to generate the final LIS.

This approach has a time complexity of O(n²), which is suitable for understanding the concept clearly and is efficient enough for moderate input sizes. The focus of this project is on clarity and correct implementation rather than heavy optimization.

The system accepts input in multiple formats. The user can enter numbers separated by spaces or commas, and the application correctly parses the input and processes it. Basic error handling is included to ensure that invalid inputs do not crash the system.

To run the project, it can be opened in an IDE such as IntelliJ IDEA. After running the main application file, the server starts locally. The application can then be accessed through a browser by visiting http://localhost:8080/
. Once the page loads, the user can enter a sequence of numbers and click on the analyze button to view the results.

Some sample results include:

Input:
3 10 2 1 20


Output:
LIS: [3, 10, 20]
Length: 3


Input:
3 10 2 1 20


Output:
LIS: [3, 10, 20]
Length: 3

The application correctly identifies the longest increasing subsequence for these inputs and displays both the sequence and its length.

This project demonstrates how a classical algorithm like LIS can be implemented and connected with a web interface to create a complete working system. It also helps in understanding how backend processing and frontend interaction work together in a real application.

In the future, this project can be improved by optimizing the algorithm to O(n log n), adding step-by-step visualization of how the LIS is formed, and enhancing the user interface for better user experience. Additional features such as file input support or graphical representation of trends can also be added.

Overall, this project serves as a good example of combining algorithmic problem-solving with web development to build a functional and interactive tool.
