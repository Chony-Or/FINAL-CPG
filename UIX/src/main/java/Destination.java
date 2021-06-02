
public class Destination extends AIRLINE
{
  int d;
  float PRTRAVTCHARGE = 4260;
  float BUSTRAVTCHARGE = 5700;
  float REGTRAVTCHARGE = 2500;
  
  float priInsurance = 4500;
  float busInsurance = 6500;
  float regInsurance = 950;
  
    int count(int a)
    {
    d = a;
    --d;
    return d;
    }
    
  
   
    //DefaultTableModel tb;
   String[] destination = {"Manila to Batanes", "Batanes to Manila", "Manila to Palawan", "Palawan to Manila", "Manila to South Korea", "South Korea to Manila", "Manila to Japan","Japan to Manila","Manila to Vietnam","Vietnam to Manila"};
   String[] PrClass = {"8,000.00", "9,800.00", "9,100.00", "9,850.00", "27,450.00", "30,890.00", "40,450.00","43,855.00","8,505.00","14,300.00"};
   String[] BClass = {"12,500.00", "12,950.00", "10,500.00", "10,975.00", "37,390.00", "39,650.00", "45,355.00","49,780.00","12,345.00","16,320.00"};
   String[] RClass = {"3,500.00", "3,900.00", "3,200.00", "3,575.00", "12,055.00", "13,100.00", "27,800.00","29,400.00","3,200.00","4,600.00"};
}

