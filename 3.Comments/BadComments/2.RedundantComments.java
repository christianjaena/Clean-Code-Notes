/**
	REDUNDANT COMMENTS
*/

// Utility method that returns when this.closed is true. Throws an exception if the timeout is reached.
public synchronized void waitForClose(final long timeoutMills) throws Exception
{
	if (!closed) 
	{
		wait(timeoutMills);
		if (!closed)
			throw new Exception("MockResponseSender could not be closed");
	}
}

// The comment does not justify the code.


// Another example:
public abstract class ContainerBase implements Container, Lifecycle, Pipeline, MBeanRegistration, Serializable {
	/**
	The processor delay for this component
	*/
	protected int backgroundProcessorDelay = -1;

	/**
	 The lifecycle event support for this component
	*/
	protected LifecycleSupport lifecycle = new LifecycleSupport(this);

	/**
		The container event listeners for this Container.
	*/
	protected ArrayList listeners = new ArrayList();

	/**
		The Loader implementation with which this Container is associated.
	*/
	protected Loader loader = null;

	/**
		The Logger implementation with which this Container is associated.
	*/
	protected Log logger = null;

	/**
		Associated logger name.
	*/
	protected String logName = null;
}


