package demo3;

public class PrototypeShows implements PrototypeEntertainment{
	private String name; 
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//super clone will make a shallow clones object and all the mutable data mambers, objects needs to 
	//be cloned explicitely using a

	//	public class CloneTest implements Cloneable {
//	    private byte[] a = {1, 2, 3, 4, 5};  //mutable
//	    private byte[] b = {5, 4, 3, 2, 1};  //mutable
//	     
//	    public CloneTest clone(){
//	        CloneTest that = null;
//	        try{
//	            that = (CloneTest)super.clone();        //Make a binary copy
// (important)  that.b = this.b.clone();                //Do customized operation
//	            return that;
//	        } catch (CloneNotSupportedException ex){
//	            ex.printStackTrace();
//	        }
//	        return that;
//	    }
//	     
	//https://www.pixelstech.net/article/1420629927-What-does-super-clone%28%29-do
	
	public PrototypeShows clone () throws CloneNotSupportedException {
		System.out.println("Creating the clone of Shows Object");
		return (PrototypeShows) super.clone();
	}
}
