package com.lgh.controller;
//TODO A1  MyThread类 extends Thread
public class MyThread extends Thread{

    public void MyThread(){

    }

    //TODO A2 通过构造方法调用父类发构造方法给线程起名
    public void MyThread(String name){
    super.setName(name);
    }

    public static int ticketNumber=100;//TODO A3 一共100张票

    Object object = new Object();//TODO A4定义一个对象。但是注意，如果object放入synchronized中，并不会锁住,因为每一个object都是new出来的，人手一把锁，不行的。

    @Override
    public void run() {
        super.run();

        while (this.ticketNumber>0){

            //TODO A5 对象锁，锁代码块

          synchronized ("jack"){
              if(this.ticketNumber>0){
                  System.out.println(this.getName()+"卖了第"+ticketNumber+"张票");
                  this.ticketNumber--;
              }
          }

        }
    }
}
