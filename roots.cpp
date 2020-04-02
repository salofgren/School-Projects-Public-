#include <iostream>
#include <cmath>

int main() {
	double a, b, c, x1, x2;

	std::cout << "Enter a value for a: ";
	std::cin >> a;

	std::cout << "\nEnter a value for b: ";
	std::cin >> b;

	std::cout << "\nEnter a value for c: ";
	std::cin >> c;

	x1 = (((-b) + sqrt((pow(b, 2)) - (4.0 * a * c))) / (2.0 * a));
	x2 = (((-b) - sqrt((pow(b, 2)) - (4.0 * a * c))) / (2.0 * a));

	std::cout << "\nThe root x1 = " << x1 << std::endl;
	std::cout << "The root x2 = " << x2 << std::endl;

	return 0;
}