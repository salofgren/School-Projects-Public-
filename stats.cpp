#include <iostream>
#include <iomanip>
#include <cmath>

double mean(int* scores, int count) { //calculate average of all scores entered
	double sum = 0;

	for (int i = 0; i < count; i++) {
		sum += scores[i];
	   }

	return sum / count;
}

double deviation(int* scores, int count) { //get standard deviation (square root of sum(Xi - mean)^2 / total count)
	double sum = 0;

	for (int i = 0; i < count; i++) {
		sum += pow(scores[i] - double(mean(scores, count)), 2);
	}

	return sqrt(sum / count);
}

int* histogram(int* scores, int count) { //load scores into bins
	static int bins[10]{};

	for (int i = 0; i < count; i++) {
		int binIndex = scores[i] / 10;
		if (binIndex > 9) {//put scores > 100 into bin[9]
			binIndex = 9;
		}
		bins[binIndex]++;
	}
	return bins;
}

int main() {
	int scores[100];
		
		//test cases
		//{ 30, 40, 45, 102, 35, 42, 65, 89, 55, 48, 56, 46, 42, 54, 56, 51, 47, 50,
		//51, 50, 50, 47, 52, 53, 47, 44, 69, 35, 40, 45, 35, 42, 65, 55, 48, 100,
		//56, 46, 42, 54, 56, 51, 47, 50, 51, 50, 50, 47, 52, 53, 47, 78, 80, 95 };

		//{ 100, 95, 90, 85, 80, 75, 70, 65, 60, 40, 20, 5 };

	int score;
	int count = 0;
		
	//get length of array when running test cases
	//std::size(scores);

	//prompt for user input
	std::cout << "Enter a score greater than 0 (-1 to stop): ";
	std::cin >> score;

	while (score != -1) { //loop to enter scores until -1 is entered, loading each score into the array and incrementing the count
		scores[count++] = score;
		std::cin >> score;

		if (score < -1 || score > 109) {
			std::cout << "Invalid score entered" << std::endl;
			return 1;
			break;
		}
	}

	int* temp = histogram(scores, count);//load bins array into temp variable for use in histogram loop

	for (int i = 9; i >= 0; i--) {//print out the histogram (9-0 style)
		std::cout << ' ' << i << "| ";
		for (int j = 0; j < temp[i]; j++) {
			std::cout << '*';
		}
		std::cout << std::endl;
	}
	std::cout << "SD: " << deviation(scores, count) << std::endl;

	return 0;
}