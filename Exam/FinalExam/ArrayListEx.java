package FinalExam;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		int i, l = 0;
		ArrayList <String> a = new ArrayList <String>();
		Scanner sc = new Scanner(System.in);
		for(i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			a.add(sc.next());
		}
		for(i=0; i<a.size(); i++)
			System.out.print(a.get(i)+" ");
		for(i=1; i<a.size(); i++)
			if(a.get(l).length() > a.get(i).length())
				l = i;
		System.out.println("\n가장 짧은 이름: "+ a.get(l));
		sc.close();
	}
}