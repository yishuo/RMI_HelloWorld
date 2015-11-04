

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmiTP1.RemoteEcho;


/**
 * 远程接口的实现 
 */
public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho{
	
    //	private static final long serialVersionUID = -7278596802637355415L;

	/**
	 * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，必须声明抛出RemoteException异常
	 * 
	 * @throws RemoteException
	 */
	public RemoteEchoImpl() throws RemoteException{
		super();
	}
	
	/**
	 * 简单的返回“Hello World！”字样
	 * 
	 * @return 返回“Hello World！”字样
	 * @throws java.rmi.RemoteException
	 * 
	 */
	public String Hello() throws RemoteException{
		return "Hello World!";
	}
	/**
	 * 
	 * @param 
	 * @return 返回相应的问候语
	 * @throws java.rmi.RemoteException
	 * 
	 */
	public String Echo(String s) throws RemoteException{
		return "Echo: "+s+"(from MyComputer)";
	}
	
	
}
