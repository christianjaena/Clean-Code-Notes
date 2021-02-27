/**
	USE SEARCHABLE NAMES
*/

// Do not use single-letter names and numeric constants.
int 7;
// Use instead long, capitalized, descriptive names.
int MAX_CLASSES_PER_STUDENT;
// Use single-letter names ONLY on local variables inside short methods.
for (int j = 0; j < 34; j++) {
	s += (t[j] * 4) / 5;
}

// Recommended usage:
int realDaysPerIdealDay = 4;
const int WORK_DAYS_PER_WEEK = 5;
int sum = 0;
for (int j = 0; j < NUMBER_OF_TASKS; j++) {
	int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
	int realTaskWeeks = (realDays / WORK_DAYS_PER_WEEK);
	sum += realTaskWeeks;
}
