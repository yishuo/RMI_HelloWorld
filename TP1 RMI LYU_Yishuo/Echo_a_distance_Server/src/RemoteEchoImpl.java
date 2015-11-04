

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmiTP1.RemoteEcho;


/**
 * Զ�̽ӿڵ�ʵ�� 
 */
public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho{
	
    //	private static final long serialVersionUID = -7278596802637355415L;

	/**
	 * ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д�����������׳�RemoteException�쳣
	 * 
	 * @throws RemoteException
	 */
	public RemoteEchoImpl() throws RemoteException{
		super();
	}
	
	/**
	 * �򵥵ķ��ء�Hello World��������
	 * 
	 * @return ���ء�Hello World��������
	 * @throws java.rmi.RemoteException
	 * 
	 */
	public String Hello() throws RemoteException{
		return "Hello World!";
	}
	/**
	 * 
	 * @param 
	 * @return ������Ӧ���ʺ���
	 * @throws java.rmi.RemoteException
	 * 
	 */
	public String Echo(String s) throws RemoteException{
		return "Echo: "+s+"(from MyComputer)";
	}
	
	
}
