/** 
	USE INTENTION-REVEALING NAMES
*/ 


/*
	If a name requires a comment, then the name does not reveal its intent.
*/
int d; // elapsed time in days

/*
	We should choose a name that specifies what is being measured and the unit of that measurement.

	Variable Name = Unit of Measurement + What is being measured 
*/
int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;

/*
	1. What kinds of things are in theList?
	2. What is the significance of the zeroth subscript of an item in theList?	
	3. What is the significance of the value 4?
	4. How would I use the list being returned?
*/
public List<int[]> getThem() {
	List<int[]> list1 = new ArrayList<int[]>();
	for (int[] x : theList)
		if (x[0] == 4)
			list1.add(x);
	return list1;
}

/*
	Each cell on the board is represented by a simple array. We further find that the zeroth subscript is the location of a status value and that a status value of 4 means "flagged". Just by giving these concepts names we can improve the code considerably:
*/
public List<int[]> getFlaggedCells() {
	List<int[]> flaggedCells = new ArrayList<int[]>();
	for (int[] cell : gameBoard)
		if (cell[STATUS_VALUE] == FLAGGED)
			flaggedCells.add(cell);
	return flaggedCells;
}

/*
	We can go further and write a simple class for cells instead of using an array of integers. It can include an intention-revealing function (call it isFlagged) to hide the magic numbers. It results in a new version of the function:
*/
public List<Cell> getFlaggedCells() {
	List<Cell> flaggedCells = new ArrayList<Cell>();
	for (Cell cell : gameBoard)
		if (cell.isFlagged())
			flaggedCells.add(cell);
	return flaggedCells;
}
