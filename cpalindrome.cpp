#include <iostream>
#include <cstring>

int main(int argc, char* argv[]) {
	int count = 0;

	for (int i = 1; i < argc; i++) {//Count the letters in each word; starting at 1 skips the name of the program in argv[0]
		count += strlen(argv[i]);
	}
	count += argc - 2;//Subtract 1 as part of the fence post problem solution, and subtract another 1 because argc includes the name of the program in the count

	//create empty array for command line arguments
	char palindrome[1000] = "";

	for (int i = 1; i < argc; i++) {//load command line arguments into array, concatenating the arguments into single cstring
		strcat_s(palindrome, 1000, argv[i]);
	}

	//loop with local variable i to print the array and tell whether it is a palindrome or not
	int i;
	for (int i = 0; i < strlen(palindrome); i++) {
		if (palindrome[i] != palindrome[strlen(palindrome) - 1 - i]) {// compare left side and right side
			std::cout << palindrome << " is not a palindrome" << std::endl;
			break;
		}

		if (i == strlen(palindrome) / 2) {
			std::cout << palindrome << " is a palindrome" << std::endl;
		}
	}

	return 0;
}