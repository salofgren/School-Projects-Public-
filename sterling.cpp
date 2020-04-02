#include "sterling.h"
#include <iostream>
#include <iomanip>

//definitions for prototype functions

sterling make_sterling(int pounds, int shillings, int pence) {
	sterling temp;
	
	temp.pounds = pounds;
	temp.shillings = shillings;
	temp.pence = pence;

	return temp;
}

//1 pound = 240 pence, 1 shilling = 12 pence
sterling make_sterling(int pence) {
	sterling temp;

	temp.pounds = pence / 240;
	pence %= 240;

	temp.shillings = pence / 12;

	temp.pence = pence % 12;

	return temp;
}

//add user inputs
sterling add(sterling str1, sterling str2) {//pased by value
	int i1 = str1.pounds * 240 + str1.shillings * 12 + str1.pence;
	int i2 = str2.pounds * 240 + str2.shillings * 12 + str2.pence;

	return make_sterling(i1 + i2);
}

//print format for £x.Xx.Xx (0 is inserted for X if Xx < 10)
void print(sterling& str) {//passed by reference (&)
	std::cout.fill('0');
	std::cout << (char)156 << str.pounds << '.' << std::setw(2) << str.shillings << '.' << std::setw(2) << str.pence << std::endl;
}

//read user input for each value
void read(sterling* str) {//passed by pointer (*)
	std::cout << "Enter the pounds: " << std::endl;
	std::cin >> str->pounds;
	std::cout << std::endl;

	std::cout << "Enter the shillings: " << std::endl;
	std::cin >> str->shillings;
	std::cout << std::endl;

	std::cout << "Enter the pence: " << std::endl;
	std::cin >> str->pence;
	std::cout << std::endl;
}