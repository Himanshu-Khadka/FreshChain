
```markdown
# FreshChain

FreshChain is a simple blockchain implementation in Java. It uses the Proof-of-Work algorithm for mining new blocks and validates the integrity of the blockchain.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 21
- Maven

### Installing

1. Clone the repository
```bash
git clone https://github.com/Himanshu-Khadka/FreshChain.git
```
2. Navigate into the cloned repository
```bash
cd FreshChain
```
3. Build the project with Maven
```bash
mvn clean install
```
4. Run the project
```bash
java -cp target/FreshChain-1.0-SNAPSHOT.jar himanshukhadka.FreshChain
```

## Usage

The `FreshChain` class contains the `main` method which adds blocks to the blockchain and mines them. It also validates the blockchain and prints it out in JSON format.

The `Block` class represents a block in the blockchain. It contains a `mineBlock` method which implements a simple Proof-of-Work algorithm.

The `StringUtil` class contains a `applysha256` method which applies the SHA-256 hash function to a given input.

