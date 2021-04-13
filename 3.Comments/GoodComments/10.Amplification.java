/**
	AMPLIFICATION
*/

// A comment may be used to amplify the importance of something that may otherwise seem inconsequential.
String listItemContent = match.group(3).trim();
// the trim is really important. It removes the starting
// spaces that could cause the item to be recognized
// as another list.
new ListItemWidget(this, listItemContent, this.level + 1);
return buildList(text.substring(match.end()));