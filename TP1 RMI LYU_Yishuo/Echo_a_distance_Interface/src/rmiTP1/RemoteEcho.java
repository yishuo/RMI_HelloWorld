package rmiTP1;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * ����һ��Զ�̽ӿڣ�����̳�Remote�ӿڣ�������ҪԶ�̵��õķ��������׳�RemoteException�쳣 
 */
public interface RemoteEcho extends Remote{
	
	public String Hello() throws RemoteException;
	public String Echo(String s) throws RemoteException;

}
