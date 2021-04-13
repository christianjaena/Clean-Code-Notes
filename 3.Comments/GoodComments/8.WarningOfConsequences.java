/**
	WARNING OF CONSEQUENCES
*/

// Sometimes it is useful to warn about future consequences.

// Don't run unless you have some time to kill.
public void _testWithReallyBigFile()
{
	writeLinesToFile(1000000);
	
	response.setBody(testFile);
	response.readyToSend(this);
	String responseString = output.toString();
	assertSubstring("Content-Length: 100000000", responseString);
	assertTrue(bytesSent > 1000000000);
}

public static SimpleDateFormat makeStandardHttpDateFormat() 
{
	// SimpleDateFormat is not thread safe, so we need to create each instance independently.
	SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH::mm::ss z");
	df.setTimeZone(TimeZone.getTimeZone("GMT"));
	return df;
}

