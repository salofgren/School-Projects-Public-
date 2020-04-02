#pragma once

int gcd(int u, int v);//prototype Euclid's algorithm

class fraction {//create fraction class
private://private variables and functions
	int numerator;
	int denominator;

public://public variables and functions
	fraction(int n = 0, int d = 1);//default/conversion/general constructor

	//prototype fraction functions
	fraction add(fraction f);
	fraction sub(fraction f);
	fraction mult(fraction f);
	fraction div(fraction f);

	//prototype void functions
	void print();
	void read();
};