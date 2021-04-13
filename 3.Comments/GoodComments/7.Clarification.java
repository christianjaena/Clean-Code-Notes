/**
	CLARIFICATION 
*/

// Sometimes it is just helpful to translate the meaning of some obscure argument or return value into something that's readable.

public void testCompareTo() throws Exception {
	WikiPagePath a = PathParser.parse("PageA");
	WikiPagePath ab = PathParser.parse("PageA.PageB");
	WikiPagePath b = PathParser.parse("PageB");
	WikiPagePath aa = PathParser.parse("PageA.PageA");
	WikiPagePath bb = PathParser.parse("PageB.PageB");
	WikiPagePath ba = PathParser.parse("PageB.PageA");
	assertTrue(a.compareTo(a) == 0); // a == a
	assertTrue(a.compareTo(b) != 0); // a != b
	assertTrue(ab.compareTo(ab) == 0); // ab == ab
	assertTrue(a.compareTo(b) == -1); // a < b
	assertTrue(aa.compareTo(ab) == -1); // aa < ab
	assertTrue(ba.compareTo(bb) == -1); // ba < bb
	assertTrue(b.compareTo(a) == 1); // b > a
	assertTrue(ab.compareTo(aa) == 1); // ab > aa
	assertTrue(bb.compareTo(ba) == 1); // bb > ba
}