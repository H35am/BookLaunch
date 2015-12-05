
package testees;

/**
 * * Tools | Templates and open the template in the editor 
 * @author 0775768 <Hesam.Zarza>
 */
public class Student extends Persoon{

    public void method1() {
	Persoon s = new Student();
	method2(s);
}

public void method2(Persoon p) {
	Persoon s = p;
}

}
