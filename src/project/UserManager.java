package project;

public class UserManager {
    public UserManager(){

    }
    public void Add(User user){
        System.out.println("First Name :" +user.getFirstName());
        System.out.println("Last Name :" +user.getLastName());
        System.out.println("id :" +user.getId());
    }
    public void delete(User user){
        System.out.println("Bu Bilgilere Sahip Olan Kullanıcı silindi : " );

        System.out.println("First Name :" +user.getFirstName());
        System.out.println("Last Name :" +user.getLastName());
        System.out.println("id :" +user.getId());
    }



}
