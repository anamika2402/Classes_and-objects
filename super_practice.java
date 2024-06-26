class super_practice {
	super_practice(){
		System.out.println(System.identityHashCode(super));
	}
}
class Demo{
	public static void main(String[] args){
		super_practice sp = new super_practice();
	}
}



