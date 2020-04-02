#pragma once

//create sterling structure
struct sterling
{
	int pounds;
	int shillings;
	int pence;
};

//prototype functions, make_sterling is overloaded
sterling make_sterling(int pounds, int shillings, int pence);
sterling make_sterling(int pence);

sterling add(sterling str1, sterling str2);

void print(sterling& str);
void read(sterling* str);