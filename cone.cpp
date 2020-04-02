#define _USE_MATH_DEFINES

#include <iostream>
#include <cmath>

int main() {
	double V, S, r, h;

	std::cout << "Enter the radius: ";
	std::cin >> r;

	std::cout << "\nEnter the height: ";
	std::cin >> h;

	V = ((1.0 / 3.0) * M_PI * (pow(r, 2) * h));
	S = ((M_PI * r * sqrt(pow(r, 2) + pow(h, 2)) + (M_PI * pow(r, 2))));

	std::cout << "\nThe Volume is: " << V << std::endl;
	std::cout << "The Surface Area is: " << S << std::endl;

	return 0;
}