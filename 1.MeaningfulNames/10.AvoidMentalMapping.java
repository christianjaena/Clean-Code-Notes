/** 
	AVOID MENTAL MAPPING
*/

// Traditionally in loops, we use single letters for counters. This need mental mapping and requires more cognitive load.

for (int i = 0; i < 10; i++) {
	for (int j = i; j < 10; j++) {
		for (int k = j; j < 10; k++) {

		}
	}
}

// ----------------- //

for (int firstCounter = 0; firstCounter < 10; firstCounter++) {
	for (int secondCounter = firstCounter; secondCounter< 10; secondCounter++) {
		for (int thirdCounter = secondCounter; thirdCounter < 10; thirdCounter++) {

		}
	}
}
