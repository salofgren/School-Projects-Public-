#include <iostream>
#include <cmath>

int main() {
	double a, b, c, x1, x2, discriminant, real, imag;

	std::cout << "Enter a value for a: ";
	std::cin >> a;

	std::cout << "\nEnter a value for b: ";
	std::cin >> b;

	std::cout << "\nEnter a value for c: ";
	std::cin >> c;

	discriminant = (pow(b, 2) - (4 * a * c));

	if (a == 0) {
		std::cout << "Error: Division by 0" << std::endl;
		std::cout << "Value of \"" << "a\"" << " cannot be 0" << std::endl;
		return 1;
	}
	else if (discriminant >= 0) {
		x1 = (-b + sqrt(discriminant)) / (2.0 * a);
		x2 = (-b - sqrt(discriminant)) / (2.0 * a);

		std::cout << "\nThe root x1 = " << x1 << std::endl;
		std::cout << "The root x2 = " << x2 << std::endl;
	}
	else {
		real = -b / (2.0 * a);
		imag = sqrt(-discriminant) / (2.0 * a);

		std::cout << "\nThe root x1 = " << real << " + " << imag << 'i' << std::endl;
		std::cout << "\nThe root x2 = " << real << " - " << imag << 'i' << std::endl;

	}
	return 0;
}