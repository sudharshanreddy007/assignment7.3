package methodOverloading;

public class Sales {

	
		private int SalesID ;
	    private double SalesAmt;
	    
	  public Sales() {
		  SalesID =0;
		  SalesAmt=0;
	  }
		public Sales (int sID){
			this.SalesID =sID;
		}	
		public Sales (int sID ,double sAmt){
				this. SalesID =sID;
				this.SalesAmt=sAmt;
		}	
				
			public void display(){
				System.out.println("sales ID:" +SalesID);
				System.out.println("sales Amt:" +SalesAmt);
				
			}
			
	}
