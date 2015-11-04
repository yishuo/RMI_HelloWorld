import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiTP1.Adress;

/**
 *
 *创建RMI注册表，启动RMI服务，并将远程对象注册到RMI注册表中
 *
 */
public class Server {
	public static void main(String[] args){
		try{
			Adress adresse = new Adress();
			//创建一个注册表
			Registry registry = LocateRegistry.createRegistry(adresse.port);
			//创建一个远程对象
			RemoteEchoImpl echo;
			echo = new RemoteEchoImpl();
			String rebindName = adresse.nom;
			registry.rebind(rebindName, echo);
			System.out.println("Object Echo ok");
		}catch(AccessException e){
			e.printStackTrace();
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}

}
