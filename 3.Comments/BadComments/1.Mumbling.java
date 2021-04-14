/**
	MUMBLING
*/

// Writing comment out of necessity or legal processes is a bad practice.
// Whenever you have to write a comment, make sure it is the best comment you can write.

// An example of a rushed comment:
public void loadProperties()
{
	try
	{
		String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
		FileInputStream propertiesStream = new FileInputStream(propertiesPath);
		loadedProperties.load(propertiesStream);
	}
	catch(IOException e)
	{
		// No properties files means all defaults are loaded
	}
}

// The comment only meant something to the author, not to those who will read it.
// NOTE: Any comment that forces you to look in another module for the meaning of that comment has failed to communicate to you and is not worth the bits it consumes.
