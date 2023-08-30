package basic.bai3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class MainScreen {
	public static void main(String[] args) {
		ArrayList<Student> listStudent = new ArrayList<Student>();	
		//a
		while(true) {
			Student st = new Student();
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Fullname: ");
			st.setFullName(scanner.nextLine());
			System.out.print("Address: ");
			st.setAddress(scanner.nextLine());
			while (true) {
	            try {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	                System.out.print("Dob (exp: 01/01/2000): ");
	                String dob = scanner.nextLine();
	                Date date = formatter.parse(dob);
	               st.setDob(new SimpleDateFormat("dd-MM-yyyy").format(date));
	                break;

	            } catch (Exception e) {
	                System.out.println("Sai định dạng, Enter để nhập lại");
					
	              scanner.nextLine();

	            }
	        }
			System.out.print("Gender: ");
			st.setGender(scanner.nextLine());
			System.out.print("FinalGrade (exp: 8.5): ");
			float figrad = scanner.nextFloat();
			st.setFinalGrade(figrad);
			listStudent.add(st);
			scanner.nextLine();
			System.out.print("Do you want to continue (Y/N)?");
			String stop = scanner.nextLine();
			if(stop.equals("Y")) {continue;}
				else if (stop.equals("N")) {break;}
					else {System.out.print("Nhập lại");}
			scanner.close(); 
		}
		//b
	 	System.out.println();
		int size = listStudent.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Student "+(i+1)+ " :");
            System.out.println("* Fullname :"+listStudent.get(i).getFullName());
            System.out.println("* Address :"+listStudent.get(i).getAddress());
            System.out.println("* DOB :"+listStudent.get(i).getDob());
            System.out.println("* Gender :"+listStudent.get(i).getGender());
            System.out.println("* FinalGrade :"+listStudent.get(i).getFinalGrade());
        }
        //c
     	System.out.println();
        for (int i = 0; i < size; i++) {
        if(listStudent.get(i).getFinalGrade()>=8.5) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực giỏi");}
        else if(listStudent.get(i).getFinalGrade()>=8.0) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực khá giỏi");}
        else if(listStudent.get(i).getFinalGrade()>=7.0) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực khá");}
        else if(listStudent.get(i).getFinalGrade()>=6.5) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực trung bình khá");}
        else if(listStudent.get(i).getFinalGrade()>=5.5) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực trung bình");}
        else if(listStudent.get(i).getFinalGrade()>=5.0) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực trung bình yếu");}
        else if(listStudent.get(i).getFinalGrade()>=4.0) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực yếu");}
        else if(listStudent.get(i).getFinalGrade()<4.0) { System.out.println("* Học sinh "+listStudent.get(i).getFullName()+ " học lực kém");}
        }
        //d
    	float sum = 0;
        for (int i = 0; i < size; i++) {
        	sum = sum + listStudent.get(i).getFinalGrade();    	
        }
    	float avg = sum / size;
    	System.out.println();
        System.out.println("Điểm tổng kết trung bình của học sinh: "+ avg);
        
	}

}
