/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Date;
import entities.Client;
import java.util.ArrayList;
import java.util.List;
import services.ClientService;
/**
 *
 * @author X1 YOGA
 */
public class AppClient {
       
    public static void main(String[] args) {
        List<Client> list=new ArrayList();
        ClientService client = new ClientService();
        

       
       // boolean del= client.delete(client.findById(4));
       // System.out.println(del);
        list = client.findAll();
        System.out.println(list);
        System.out.println(client.findById(1));
        

       // client.create(new Client("fati", "fati","0672214433"));

    }

}