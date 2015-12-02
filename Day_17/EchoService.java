public interface EchoService extends Remote{
	/**
	* Returns the same string passed as parameter
	* @Param s a string
	* @Return the same string passed as parameter
	*/
	public String echo(String s) throws RemoteException;
}