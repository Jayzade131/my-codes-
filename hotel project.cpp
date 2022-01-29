#include <iostream>
using namespace std;

int main()
{

    int cost,t=0,t1=0,t2=0,t3=0,qyt,cho,cash,ret,total;
    cout<<"**********WELCOME TO MY HOTEL***********"<<endl;
do{
    cout<<":::::::::: MENU ::::::::::"<<endl;
    cout<<"1. DOSA          40/-"<<endl<<
          "2. SAMOSA        20/-"<<endl<<
          "3. TEA           10/-"<<endl<<
          "0. EXIT"<<endl;
    cout<<"ENTER YOUR CHOICE - ";
    cin>>cho;
   switch(cho)
   {
   case 1:
    cout<<"HOW MANY PLATES - ";
    cin>>qyt;
    cost=40;
    t1=qyt*cost;
    cout<<"OK NICE CHOICE....."<<endl;
    break;
   case 2:
     cout<<"HOW MANY PLATES - ";
    cin>>qyt;
    cost=20;
    t2=qyt*cost;
     cout<<"OK NICE CHOICE....."<<endl;
     break;
   case 3:
     cout<<"HOW MANY CUPS - ";
    cin>>qyt;
    cost=10;
    t3=qyt*cost;
    cout<<"OK NICE CHOICE....."<<endl;
    break;
   case 0:
    cout<<"---------------------------------"<<endl;
    break;
   default:
    cout<<"YOUR ORDER IS NOT AVAILABLE"<<endl;
    break;
   }

}while(cho!=0);
t=t1+t2+t3;
cout<<"YOUR BILL: "<<t<<endl;
cout<<"CASH:      ";
cin>>cash;
ret=cash-t;
cout<<"RETURN:    "<<ret<<endl;
cout<<"THERE ARE: "<<endl;
total= ret/500;
cout<<total<<"  NOTES OF 500.00"<<endl;


ret=ret-(total*500);
total= ret/100;

cout<<total<<"  NOTES OF 100.00"<<endl;

ret=ret-(total*100);
total=ret/50;
cout<<total<<"  NOTES OF 50.00"<<endl;

ret=ret-(total*50);
total=ret/20;
cout<<total<<"  NOTES OF 20.00"<<endl;

ret=ret-(total*20);
total=ret/10;
cout<<total<<"  NOTES OF 10.00"<<endl;

ret=ret-(total*10);
total=ret/5;
cout<<total<<"  NOTES OF 5.00"<<endl;

ret=ret-(total*5);
total=ret/2;
cout<<total<<"  COIN OF 2.00"<<endl;

ret=ret-(total*2);
total=ret/1;
cout<<total<<"  COIN OF 1.00"<<endl;
cout<<"*************************************";
    return 0;
}

