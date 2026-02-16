# Data Structure 2026

A comprehensive Java project for learning and implementing data structures and algorithms.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Clone and Setup

```bash
git clone https://github.com/aditya3322/data-structure-2026.git
cd data-structure-2026
```

### Build the Project

```bash
mvn clean install
```

### Run the Project

```bash
mvn exec:java -Dexec.mainClass="Main"
```

### Run Tests

```bash
mvn test
```

## Project Structure

```
data-structure-2026/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Main.java
│   │   │   └── neetcode/
│   │   │       └── array/
│   │   │           ├── TwoSum.java
│   │   │           ├── ValidSudoku.java
│   │   │           ├── LongestConsecutiveSequence.java
│   │   │           ├── GroupAnagram.java
│   │   │           ├── TopKFreqElements.java
│   │   │           ├── stack/
│   │   │           │   ├── ReversePolishNotation.java
│   │   │           │   ├── ValidateParenthesis.java
│   │   │           │   ├── CarFleet.java
│   │   │           │   └── DailyTemperatures.java
│   │   │           └── sliding/
│   │   │               └── window/
│   │   │                   ├── BuyStock.java
│   │   │                   ├── LongestNonRepeatingSubstring.java
│   │   │                   ├── DNASequences.java
│   │   │                   ├── MinWIndow.java
│   │   │                   ├── StringPermutation.java
│   │   │                   ├── MaximumInSlidingWindow.java
│   │   │                   └── LongestRepaceCharacterString.java
│   │   └── resources/    # Configuration files
│   └── test/
│       ├── java/         # Test files
│       └── resources/    # Test resources
├── docs/                 # Documentation
├── pom.xml              # Maven configuration
└── README.md
```

## Implemented Algorithms

### Array Problems (`neetcode.array`)
- **TwoSum** - Find two numbers that add up to target
- **ValidSudoku** - Validate Sudoku board configuration
- **LongestConsecutiveSequence** - Find longest consecutive elements sequence
- **GroupAnagram** - Group words that are anagrams together
- **TopKFreqElements** - Find K most frequent elements

### Stack Problems (`neetcode.array.stack`)
- **ReversePolishNotation** - Evaluate postfix expression
- **ValidateParenthesis** - Check balanced parentheses
- **CarFleet** - Calculate number of car fleets
- **DailyTemperatures** - Find next warmer day indices

### Sliding Window Problems (`neetcode.array.sliding.window`)
- **BuyStock** - Best time to buy and sell stock
- **LongestNonRepeatingSubstring** - Longest substring without repeating characters
- **DNASequences** - Repeated DNA sequences
- **MinWIndow** - Minimum window substring
- **StringPermutation** - Permutation in string
- **MaximumInSlidingWindow** - Sliding window maximum
- **LongestRepaceCharacterString** - Longest repeating character replacement
