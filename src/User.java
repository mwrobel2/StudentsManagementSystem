/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class User {
    private int sno;
    private  String name, address, gender, knowledge, subject;
    private byte[] picture;
    
    public User(int sno, String name, String address, String gender, String knowledge, String subject, byte[]image )
    {
        this.sno=sno;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.knowledge=knowledge;
        this.subject=subject;
        this.picture=image;
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
       return name;
    }
    public String getaddress(){
       return address;
    }
    public String getgender(){
       return gender;
    }
    public String getknowledge(){
       return knowledge;
    }
    public String getsubject(){
       return subject;
    }
    public byte[] getImage(){
       return picture;
    }
}
