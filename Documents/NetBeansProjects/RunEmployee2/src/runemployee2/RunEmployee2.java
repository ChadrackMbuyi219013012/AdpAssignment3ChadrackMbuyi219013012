/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runemployee2;

/**
 *
 * @author Chadrack
 */
public class RunEmployee2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee2 emp2 = new Employee2();
        Manager2 man2 = new Manager2();
        Secretary2 sec2 = new Secretary2();
        double totalSalary = 0;
        
       Employee2[] employees = new Employee2[20];
       employees[0] =new Employee2("Chadrack", "Kalala", 465, 59000, 39, 10, "227 Main Road Wynberg", "Male", "African", "chadrackmbuyi2@gmail.com", "Cape Town");
       employees[1] =new Secretary2("Ester", "Mukendi", 614, 27000, 29, 6, "5 Ross Road Wynberg", "Female", "African", "ecmd114@gmail.com", "Cape Town");
       employees[2] =new Manager2("Cedric", "Kande", 424, 180000, 42, 16, "2 Basset road Claremont", "Male", "African", "cedrickande@yahoo.com", "Cape Town");
       employees[3] =new Employee2("Marleine", "Bamuswe", 521, 21000, 11, 6, "14 Duban road Mowbray", "Female", "Afican", "marleinebamuswe@gmail.com", "Cape Town");
       employees[4] =new Secretary2("George", "Klein", 901, 12000, 17, 3, "89 Kloof Street", "Male", "Coloured", "KleinG3@gmail.com", "Cape Town");
       employees[5] =new Manager2("Juluette", "Suu", 101, 39000, 30, 15, "5 Rockville Road", "Female", "Asian", "jueluetteSuu@gmail.com", "Cape Town");
       employees[6] =new Employee2("Sivenathi", "Tango", 801, 7000,9, 5, "8 Vilakazi Street", "Male", "African", "SiveTango09@gmail.com", "Cape Town");
       employees[7] =new Secretary2("Jacob", "Bieber", 601, 509, 1, 0, "001 NewVille Street", "Male", "White", "JB009@gmail.com", "Cape Town");
       employees[8] =new Manager2("Emmanuel", "Jhumpa", 781, 23000, 9, 2, "43 Belhar Street", "Male", "African", "emmanueljhumpa@gmail.com", "Cape Town");
       employees[9] =new Employee2("Zukile", "Rato", 902, 23000, 45, 19, "67 Constantia Street", "Female", "African", "ZukileRato3@gmail.com", "Cape Town");
       employees[10] =new Secretary2("Donald", "Trump", 492, 8500, 7, 5, "3 Loop Street", "Male", "White", "donaldtrump2@gmail.com", "Cape Town");
       employees[11] =new Manager2("Mpumi", "Rori", 102, 40000, 15, 2, "67 New Market Street", "Female", "African", "Mpumirori23@gmail.com", "Cape Town");
       employees[12] =new Employee2("Shuxan", "Yong-Sun", 803, 12000, 7, 1, "5 Loop Street", "Male", "Asian", "shusanY12@gmail.com", "Cape Town");
       employees[13] =new Secretary2("Siyathand", "Mqhamane", 403, 25000, 20, 5, "24 Delft Street", "Female", "African", "SiyaMqhamane@gmail.com", "Cape Town");
       employees[14] =new Manager2("Chadley", "Fourie", 659, 40000, 24, 8, "8 High Road Street", "Male", "Coloured", "chadleyf121@gmail.com", "Cape Town");
       employees[15] =new Employee2("Miriam", "Red", 703, 2000, 1, 0, "50 Nelson Street", "Female", "White", "redmiriam@gmail.com", "Cape Town");
       employees[16] =new Secretary2("Yoshi", "Lee", 504, 20000, 16, 10, "9 Adderley Street", "Male", "Asian", "yoshilee@yahoo.com", "Cape Town");
       employees[17] =new Manager2("Ndalana", "Cuba", 404, 30000, 23, 7, "67 Ngcwalazi Drive", "Male", "African", "ndalanacuba@gmail.com", "Cape Town");
       employees[18] =new Employee2("Faeeza", "Rome", 654, 21000, 4, 2, "23 Hanover Street", "Female", "Coloured", "faeezarome2123@gmail.com", "Cape Town");
       employees[19] =new Secretary2("Christian", "Wenger", 855, 26000, 29, 11, "78 Kloop Street", "Male", "White", "chriswenger11@gmail.com", "Cape Town");
       
       
             
       System.out.println("Name:            " + "   Surname:            " + "    Employee Id:           " + "   Salary :R       " + "     Hours Worked:     " + "    Number of Leave Days Left:     " + "         Address:                  " + "   Gender:     " + "       Race:       " + "       Email Address:                          " + "           City: \n            " );
       System.out.println("======================================================================================================================================================================================================================================================================================================================================================");
       
        for (Employee2 employee : employees) 
        {
            System.out.println("      "+"\n" + employee.getName() + "            " + employee.getSurname() + "                " + employee.getEmployeeId() + "                       " + "R" + employee.getSalary() + "                 " + employee.getHours() + "                    " + employee.getLeaveDays() + "                                    " + employee.getAddress() + "                                  " + employee.getGender() + "                             " + employee.getRace() + "                       " + employee.getEmailAddress() + "                             " + employee.getCity());
        } 
        for (Employee2 employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        
        double averageSalary =0;
        averageSalary = totalSalary / employees.length;
        System.out.format("The average salary of all employees is: %.2f\n", averageSalary);
      
     
    }
   
}
    

