/**
	DON'T REPEAT YOURSELF
*/

public int add(int a, int b) {
	return a + b;
}

public int addThree(int a, int b, int c) {
	return a + b + c;
}


// Don't repeat yourself

public int add(int... vars) {
	int total = 0;
	for (int i : vars) {
		total += i;
	}
	return total;
}