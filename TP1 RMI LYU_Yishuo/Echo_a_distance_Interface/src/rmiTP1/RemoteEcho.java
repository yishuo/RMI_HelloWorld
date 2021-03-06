package rmiTP1;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
 */
public interface RemoteEcho extends Remote{
	
	public String Hello() throws RemoteException;
	public String Echo(String s) throws RemoteException;

}
