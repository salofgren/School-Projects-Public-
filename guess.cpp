#include <iostream>
#include <stdlib.h>
#include <time.h>

int main() {

	//seed the generator
	srand((unsigned)time(nullptr));

	//generate random number 0-99
	int target = rand() % 100;

	//set condition for while loop
	bool playing = true;

	//print target so we can test each case without taking a lot of time, comment out when submitting
	//std::cout << target << std::endl; 

	while (playing) {
		std::cout << "Guess a number from 0-99 (0 and 99 are valid inputs, -1 to terminate): \n";
		int guess;
		std::cin >> guess;
		if (guess < -1 || guess > 99) {
			std::cout << "Error: Guess cannot be less than -1 or greater than 99" << std::endl;
			return 1;
		}
		else if (guess == -1) {
			std::cout << "Thanks for playing." << std::endl;
			playing = false;
		}
		else if (guess > target) {
			std::cout << "Guess a number lower than " << guess << '\n' << std::endl;
		}
		else if (guess < target) {
			std::cout << "Guess a number higher than " << guess << '\n' << std::endl;
		}
		else {
			std::cout << "You win!";

			//set condition to false to terminate loop
			playing = false;
		}
	}
	
	return 0;
}