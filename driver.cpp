#include "sterling.h"
#include <iostream>

int main() {
	//get value for a
	sterling a;
	read(&a);

	//get value for b
	sterling b;
	read(&b);

	//call add function and store result in c
	sterling c = add(a, b);

	//print result of a + b
	std::cout << "  ";
	print(a);
	std::cout << "+ ";
	print(b);
	std::cout << "-----------" << std::endl;
	std::cout << "  ";
	print(c);

	return 0;
}