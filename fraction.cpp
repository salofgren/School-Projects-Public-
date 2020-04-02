#include "fraction.h"
#include <iostream>

fraction::fraction(int n, int d) : numerator(n), denominator(d) {//create a fraction object
	numerator = n / gcd(n, d);
	denominator = d / gcd(n, d);
}

fraction fraction::add(fraction f) {//add fractions
	int n = (numerator * f.denominator) + (denominator * f.numerator);
	int d = (denominator * f.denominator);

	return fraction(n, d);
}

fraction fraction::sub(fraction f) {//subtract fractions
	int n = (numerator * f.denominator) - (denominator * f.numerator);
	int d = (denominator * f.denominator);

	return fraction(n, d);
}

fraction fraction::mult(fraction f) {//multiply fractions
	int n = (numerator * f.numerator);
	int d = (denominator * f.denominator);

	return fraction(n, d);
}

fraction fraction::div(fraction f) {//divide fractions
	int n = (numerator * f.denominator);
	int d = (denominator * f.numerator);

	return fraction(n, d);
}

void fraction::print() {//print fractions, if the denominator is 1, only print the numerator since X / 1 = X
	if (denominator == 1) {
		std::cout << numerator << std::endl;
	}
	else {
		std::cout << numerator << '/' << denominator << std::endl << std::endl;
	}
}

void fraction::read() {//read user input
	std::cout << "Please enter an integer for the numerator: ";
	std::cin >> numerator;

	std::cout << "Please enter an integer for the denominator: ";
	std::cin >> denominator;
}

int gcd(int u, int v) {//Euclid's algorithm for gcd
	u = (u < 0) ? -u : u;
	v = (v < 0) ? -v : v;

	while (u > 0) {
		if (u < v) {
			int t = u;
			u = v;
			v = t;
		}
		u -= v;
	}
	return v;
}