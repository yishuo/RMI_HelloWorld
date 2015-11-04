import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiTP1.Adress;
import rmiTP1.RemoteEcho;

/**
 * 
 * 客户端测试，在客户端调用远程对象上的远程方法，并返回结果。
 *
 */
public class Client {
	public static void main(String[] args){
		String serverAdress = "161.3.74.167";
		try{
			Adress adresse = new Adress();
			Registry registry = LocateRegistry.getRegistry(serverAdress, adresse.port);
			//提取注册表中的对象。
			RemoteEcho echo = (RemoteEcho)registry.lookup(adresse.nom);
			System.out.println("Connection OK to "+serverAdress);
			String s = echo.Hello()+"\n"+echo.Echo("All your base are belong to us.");
			System.out.println(s);
		}catch(RemoteException e){
			e.printStackTrace();
		}catch(NotBoundException e){
			e.printStackTrace();
		}
		
	}

}
