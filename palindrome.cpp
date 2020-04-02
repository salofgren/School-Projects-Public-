#include <iostream>
#include <string>

int main() {
	std::string input;

	//prompt for input, getline to use more than one word
	std::cout << "Please enter a string: ";
	std::getline(std::cin, input);

	for (int i = 0; i < input.length(); i++) {//erase spaces
		while (input[i] == ' ') {
			input.erase(i, 1);
		}
	}

	if (input == std::string(input.rbegin(), input.rend())) {//determine if beginning and end indices are the same
		std::cout << input << " is a palindrome" << std::endl;
	}
	else {
		std::cout << input << " is not a palindrome" << std::endl;
	}
	return 0;
}