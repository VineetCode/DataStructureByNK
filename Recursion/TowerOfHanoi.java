public class TowerOfHanoi{
   
   public static void towerOfHanoi(int n, char source, char destination, char auxiliary){
	   //If only 1 disk , make the move and return
      if(n==1){
	    System.out.println("Move disk 1 from source "+source+ " destination "+destination);
		return ;
	  }
	  //Move top n-1 disks from S to D using A as auxiliary
	  towerOfHanoi(n-1,source,auxiliary,destination);
       
	 //Move remaining disks from S to A
	 System.out.println("Move disk from  source "+source+ " destination "+destination);
    
	  //Move n-1 disks from A to D using S as auxiliary
	  towerOfHanoi(n-1,auxiliary,destination,source);

   }

   public static void tower(int n, char sourceRod, char destinationRod, char auxiliaryRod){
	   if(n==0){
	      return ;
	   }
     tower(n-1, sourceRod,   auxiliaryRod,  destinationRod);
	 
	 System.out.println("Move the disk " + n + " from " +sourceRod+ " to " +destinationRod);
     
	  tower(n-1,  auxiliaryRod, destinationRod,  sourceRod);
   }
   
   public static void main(String[] args){
   // towerOfHanoi(3,'S','D','A');
   tower(3, 'S' , 'D' , 'A' );
   }

}