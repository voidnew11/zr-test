package com.zr.test1;

public class TestFinally {
public static int testFinally1(){
	int result=1;
	try{
		result=2;
		return result;
	}catch(Exception e){
		return 0;
	}finally{
		result=3;
		System.out.println("execute finally1");
	}
}
public static StringBuffer testFinally2(){
	StringBuffer s=new StringBuffer("hello");
	try{
		return s;
	}catch(Exception e){
		return null;
	}finally{
		s.append("world");
		System.out.println("execute finally2");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int resultVal=testFinally1();
        System.out.println(resultVal);
        StringBuffer resultRef=testFinally2();
        System.out.println(resultRef);
        
	}

}
