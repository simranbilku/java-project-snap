<!-- _class: lead -->

# Java Snap Card Game

---

[![GitHub repo size](https://img.shields.io/github/repo-size/simranbilku/java-project-snap)](https://github.com/simranbilku/java-project-snap)
[![GitHub stars](https://img.shields.io/github/stars/simranbilku/java-project-snap?style=social)](https://github.com/simranbilku/java-project-snap)

---

## Overview

A two-player command-line implementation of the card game Snap, built in Java. Players take turns dealing cards from a shuffled 52-card deck, and must type "snap" within 2 seconds when two consecutive cards share the same symbol.

---

## Prerequisites

Before you begin, ensure you have the following installed:

- Java JDK 17 or higher
- An IDE such as IntelliJ IDEA 

---

## Installing

To install and run this project, follow these steps:

1. Clone the repository: git clone https://github.com/simranbilku/java-project-snap.git
2. Navigate to the project directory: cd java-project-snap
3. Run the project: Main.java

---

## Using the Game

To play the game, follow these steps:

1. Run the program in Main.java. The deck is automatically shuffled on startup.
2. Player 1 presses **Enter** in the terminal to deal a card.
3. Players alternate turns, each pressing **Enter** to deal a card.
4. When two consecutive cards share the same symbol, a snap opportunity occurs — the current player has **2 seconds** to type `snap` and press Enter to win.
5. If the player doesn't type `snap` in time, the game continues.
6. The game ends when a player successfully calls snap.

## Features

- Full 52-card deck 
- Deck sorting by number order and by suit
- Deck shuffling
- Two-player alternating turns
- 2-second snap timer using `ExecutorService` and `Future`
- Automatic deck rebuild and reshuffle when the deck runs out

---

## Known Issues

- After a snap timeout, an extra Enter press may be required to continue.

---

## Contributors

 [@simranbilku](https://github.com/simranbilku) 

---

## License

This project does not currently use a license.

---
