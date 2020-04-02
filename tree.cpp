#include <iostream>

int main() {
	int size;

	//Welcome message showing an example of the output
	std::cout << "Welcome!!!\n" <<
		"Let's draw a tree!!!\n\n" << std::endl;
	std::cout << "This is an example of what your tree will look like.\n\n" << 
		"  /\\\n" <<
		" /  \\\n" <<
		"/    \\\n" <<
		"------\n"<<
		"  ||\n\n" << std::endl;

	//Get the height of the tree's cone, every part of the tree depends on this value
	std::cout << "How tall is the tree (between 3 and 15):" << std::endl;
	std::cin >> size;

	//Limit the size of the tree to 3-15 units high
	if (size < 3 || size > 15) {
		std::cout << "Size " << size << " is out of bounds!" << std::endl;
		return 1;
	}

	//Main loop for cone
	for (int level = 0; level < size; level++) {

		//Draw the outside spaces(oSpaces) on the left side of the cone
		for (int oSpaces = 0; oSpaces < size - level - 1; oSpaces++) {
			std::cout << ' ';
		}

		//Draw the left side of the cone
		std::cout << '/';

		//Draw the inside spaces(iSpaces) between '/' and '\'
		for (int iSpaces = 0; iSpaces < 2 * level; iSpaces++) {
			std::cout << ' ';
		}

		//Draw the right side of the cone, endl to start the next level of the cone
		std::cout << '\\' << std::endl;
	}

	//Draw the base
	for (int base = 0; base < size * 2; base++) {
		std::cout << '-';
	}
	std::cout << std::endl;

	//Main loop for trunk, size/2 to get half the size of the tree, truncates when size == odd number
	for (int level = 0; level < size / 2; level++) {

		//Draw spaces on the left side of the trunk, -1 to center the trunk
		for (int spaces = 0; spaces < size - 1; spaces++) {
			std::cout << ' ';
		}

		//Draw the trunk
		std::cout << "||" << std::endl;
	}

	return 0;
}