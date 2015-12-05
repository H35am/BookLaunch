package testees;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */


public class Testera {
//        public int a;
//	public int b;
//	String s;


    public static void main(String[] args) {
            
//        for (int i = 0; i < 7; i++) {
//			if (i == 3) {
//				continue;
//			}
//			if (i == 5) {
//				break;
//			}
//			System.out.print(i);
//		}
//		System.out.println("end");
//
//        
//        
//        Testera t = new Testera();
//            t.a = t.a * t.b;
//            System.err.println(t.a + t.s);
//        int a = 1;
//        m1(a);
//        System.out.println(a);
//        
        	A a1 = new A();
		a1.x = 1;
		m1(a1);
		System.out.println(a1.x);

   
}
//public static void m1(int a) {
//        a = 2;
//        System.out.println(a);
//    }
//}
	
	public static void m1(A a2) {
		a2.x = 2;
	}
}

class A {
	public int x = 3;
}
