import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiTP1.Adress;

/**
 *
 *����RMIע�������RMI���񣬲���Զ�̶���ע�ᵽRMIע�����
 *
 */
public class Server {
	public static void main(String[] args){
		try{
			Adress adresse = new Adress();
			//����һ��ע���
			Registry registry = LocateRegistry.createRegistry(adresse.port);
			//����һ��Զ�̶���
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
