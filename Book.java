class Book{

private int copiesAvailable;

public Book(){
	copiesAvailable=0;
	
}
public void addcopies(int n){
	if(n>0){
		copiesAvailable+=n;
	}
}
public void removeCopies(int n) {
        if (n > 0 && copiesAvailable >= n) {
            copiesAvailable -= n;
        } else {
            System.out.println("Not enough copies to remove.");
        }
    }
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
	
	public static void main(String args[]){
		Book b1=new Book();
		
		b1.addcopies(3);
		b1.removeCopies(1);
		
		System.out.println("Copies available :" + b1.getCopiesAvailable());
	}
}

