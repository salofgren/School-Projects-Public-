#include "fraction.h"
#include <iostream>

int main() {
	char choice;
	fraction f, f1;

	do {//do while loop for switch statement until user enters e/E
		std::cout << "A\tAdd\n";
		std::cout << "S\tSub\n";
		std::cout << "M\tMult\n";
		std::cout << "D\tDiv\n";
		std::cout << "E\tExit\n";

		std::cout << "\nEnter your choice: ";

		std::cin >> choice;
		std::cin.ignore();

		switch (choice) {
			case 'A':
			case 'a':
				f.read();
				f1.read();

				f.add(f1).print();
				break;
			case 'S':
			case 's':
				f.read();
				f1.read();

				f.sub(f1).print();
				break;
			case 'M':
			case 'm':
				f.read();
				f1.read();

				f.mult(f1).print();
				break;
			case 'D':
			case 'd':
				f.read();
				f1.read();

				f.div(f1).print();
				break;
			case 'E':
			case 'e':
				break;
			default:
				std::cerr << "Unrecognized choice: " << choice << std::endl;
				break;
		}
	}
	while (choice != 'e' && choice != 'E');

	return 0;
}

//Test cases
//Comment out before submitting
//using namespace std;
//
//int main() {
//	// The following code must compile but does not
//	// produce any output beyond the prompts in read.
//	// There must be only ONE constructor function,
//	// but it must handle all three cases below.
//	fraction f1(2,4);
//	fraction f2(2);
//	fraction f3;

//	f3 = f1.add(f2);
//	f3 = f1.sub(f2);
//	f3 = f1.mult(f2);
//	f3 = f1.div(f2);

//	//f3.read();
//	// End compilation test.

//	cout << endl << "-----------------" << endl;

//	// Constructor tests.
//	cout << "Pass if 1/2: ";
//	f1.print();
//	cout << "Pass if 2/1 or 2: ";
//	f2.print();
//	// End constructor tests.

//	cout << "-----------------" << endl;

//	// Operation tests
//	cout << "Pass if 13/14: ";
//	fraction(3,7).add(fraction(2,4)).print();
//	cout << "Pass if 1/14: ";
//	fraction(2,4).sub(fraction(3,7)).print();
//	cout << "Pass if 3/7: ";
//	fraction(2,7).mult(fraction(3,2)).print();
//	cout << "Pass if 3/14: ";
//	fraction(2,7).div(fraction(4,3)).print();
//	// End operation tests

//	cout << "-----------------" << endl;

//	// constraints tests
//	fraction cf1(3,7);
//	fraction cf2(2,4);
//	fraction cf3(3,2);
//	fraction cf4(2,7);
//	fraction cf5(4,3);

//	cf1.add(cf2);
//	cf2.sub(cf1);
//	cout << "Pass if 3/7 and 1/2: ";
//	cf1.print();
//	cf2.print();
//	cf4.mult(cf3);
//	cf4.div(cf5);
//	cout << "Pass if 3/2, 2/7 and 4/3: ";
//	cf3.print();
//	cf4.print();
//	cf5.print();
//	// end constraints tests

//	return 0;
//}