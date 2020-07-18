package StaticNonstatic;

public class StaticExample {
	
	void nonStaticMethod(){
        System.out.println("non static method");
    }
   
    public static void staticMethod(){      
        System.out.println("Static Method");
        StaticExample st=new StaticExample();
        st.nonStaticMethod();
        //new StaticKeywordDemo().nonStaticMethod();
    }
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
