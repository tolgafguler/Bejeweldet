import java.util.ArrayList;

public class W implements Jewels{
	@Override
	public ArrayList<String[]> shifting(ArrayList<String[]> mapNew, int k, int l, int o, int p, int u, int y) {
		int i=0;
		int j=3;
		if(k-j>=0) {
		while(!mapNew.get(k-j)[l].equals(" ")) {
			if(k-i-3>=0) {
			mapNew.get(k-i)[l]=mapNew.get(k-i-3)[l];
			mapNew.get(k-i-3)[l]=" ";
			}
			else {
				break;
			}
			i=i+3;
			j=j+3;	
			if(k-j<0){
			break;
			}
		}
		}
		
		int q=0;
		int w=3;
		if(o-w>=0) {
		while(!mapNew.get(o-w)[p].equals(" ")) {
			if(o-q-3>=0) {
			mapNew.get(o-q)[p]=mapNew.get(o-q-3)[p];
			mapNew.get(o-q-3)[p]=" ";
			}
			else {
				break;
			}
			q=q+3;
			w=w+3;		
			if(o-w<0){
			break;
			}
		}
		}
		int m=0;
		int n=3;
		if(u-n>=0) {
		while(!mapNew.get(u-n)[y].equals(" ")) {
			if(u-m-3>=0) {
			mapNew.get(u-m)[y]=mapNew.get(u-m-3)[y];
			mapNew.get(u-m-3)[y]=" ";
			}
			else {
				break;
			}
			m=m+3;
			n=n+3;	
			if(u-n<0){
			break;
			}
		}
		}
		
		
		return mapNew;
		
	}
	
	public ArrayList<String[]> shifting2(ArrayList<String[]> mapNew, int k, int l, int o, int p, int u, int y) {
		int i=0;
		int j=1;
		if(k-j>=0) {
			while(!mapNew.get(k-j)[l].equals(" ")) {
				if(k-i-1>=0) {
					mapNew.get(k-i)[l]=mapNew.get(k-i-1)[l];
					mapNew.get(k-i-1)[l]=" ";
				}
				else {
					break;
				}
				i++;
				j++;	
				if(k-j<0){
					break;
				}
			}
		}
		
		int q=0;
		int w=1;
		if(o-w>=0) {
			while(!mapNew.get(o-w)[p].equals(" ")) {
				if(o-q-1>=0) {
					mapNew.get(o-q)[p]=mapNew.get(o-q-1)[p];
					mapNew.get(o-q-1)[p]=" ";
				}
				else {
					break;
				}
				q++;
				w++;		
				if(o-w<0){
					break;
				}
			}
		}
		
		int m=0;
		int n=1;
		if(u-n>=0) {
			while(!mapNew.get(u-n)[y].equals(" ")) {
				if(u-m-1>=0) {
					mapNew.get(u-m)[y]=mapNew.get(u-m-1)[y];
					mapNew.get(u-m-1)[y]=" ";
				}
				else {
					break;
				}
				m++;
				n++;	
				if(u-n<0){
					break;
				}
			}
		}
		return mapNew;
	}	
	
int point;
	@Override
	public ArrayList<String[]> deleting(ArrayList<String[]> map, int x, int y) {
		ArrayList<String> lettersD=new ArrayList<String>();
		ArrayList<String> lettersS=new ArrayList<String>();
		ArrayList<String> lettersT=new ArrayList<String>();
		lettersD.add("D");
		lettersD.add("W");
		lettersS.add("S");
		lettersS.add("W");
		lettersT.add("T");
		lettersT.add("W");
		
		ArrayList<String> symbols=new ArrayList<String>();
		symbols.add("/");
		symbols.add("-");
		symbols.add("+");
		symbols.add("\\");
		symbols.add("|");
		
		ArrayList<String> symbols28=new ArrayList<String>();
		ArrayList<String> symbols46=new ArrayList<String>();
		ArrayList<String> symbols37=new ArrayList<String>();
		ArrayList<String> symbols19=new ArrayList<String>();
		
		symbols37.add("/");
		symbols46.add("-");
		symbols46.add("+");
		symbols28.add("+");
		symbols19.add("\\");
		symbols28.add("|");
		//2
		
		if((x-1<=Main.rowCounter && x-1>=0 ) && (x-2<=Main.rowCounter && x-2>=0) &&  ((symbols28.contains(map.get(x-1)[y])==true && symbols.contains(map.get(x-2)[y])==true) || (lettersT.contains(map.get(x-1)[y])==true && lettersT.contains(map.get(x-2)[y])==true) || (map.get(x-1)[y].equals("W")==true && symbols28.contains(map.get(x-2)[y])==true))) {
			if(!(map.get(x-1)[y].equals("T") && map.get(x-2)[y].equals("W"))) {
			  	
			  	if(map.get(x-1)[y].equals("W") && map.get(x-2)[y].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x-1)[y].equals("T") && map.get(x-2)[y].equals("T")){
			  		this.point=40;
			  	}
			  	else if(map.get(x-1)[y].equals("W") && map.get(x-2)[y].equals("T")){
			  		this.point=35;
			  	}
			  	else if(map.get(x-1)[y].equals("W") && symbols28.contains(map.get(x-2)[y])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols28.contains(map.get(x-1)[y])==true && symbols.contains(map.get(x-2)[y])==true) {
			  		this.point=50;
			  	}
			  	
			  	map.get(x)[y]=" ";
			  	map.get(x-1)[y]=" ";
			  	map.get(x-2)[y]=" ";
			  	map=shifting(map,x,y,x-1,y,x-2,y);
			}
			         }
			         
		 //8
		
		else if((x+1<=Main.rowCounter && x+1>=0 ) && (x+2<=Main.rowCounter && x+2>=0) &&  ((symbols28.contains(map.get(x+1)[y])==true && symbols.contains(map.get(x+2)[y])==true) || (lettersT.contains(map.get(x+1)[y])==true && lettersT.contains(map.get(x+2)[y])==true) || (map.get(x+1)[y].equals("W")==true && symbols28.contains(map.get(x+2)[y])==true))){
			if(!(map.get(x+1)[y].equals("T") && map.get(x+2)[y].equals("W"))) {
			  	
			  	if(map.get(x+1)[y].equals("W") && map.get(x+2)[y].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x+1)[y].equals("T") && map.get(x+2)[y].equals("T")){
			  		this.point=40;
			  	}
			  	else if(map.get(x+1)[y].equals("W") && map.get(x+2)[y].equals("T")){
			  		this.point=35;
			  	}
			  	else if(map.get(x+1)[y].equals("W") && symbols28.contains(map.get(x+2)[y])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols28.contains(map.get(x+1)[y])==true && symbols.contains(map.get(x+2)[y])==true) {
			  		this.point=50;
			  	}
			  	map.get(x)[y]=" ";
			  	map.get(x+1)[y]=" ";
			  	map.get(x+2)[y]=" ";
			  	map=shifting(map,x,y,x+1,y,x+2,y);
			}
			         } 
		 
		 //4
		
		else if((y-1<=Main.rowCounter && y-1>=0 ) && (y-2<=Main.rowCounter && y-2>=0) &&  ((symbols46.contains(map.get(x)[y-1])==true && symbols.contains(map.get(x)[y-2])==true) || (lettersS.contains(map.get(x)[y-1])==true && lettersS.contains(map.get(x)[y-2])==true) || (map.get(x)[y-1].equals("W")==true && symbols46.contains(map.get(x)[y-2])==true))){
			if(!(map.get(x)[y-1].equals("S") && map.get(x)[y-2].equals("W"))) {
	  			
	  			if(map.get(x)[y-1].equals("W") && map.get(x)[y-2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x)[y-1].equals("S") && map.get(x)[y-2].equals("S")){
			  		this.point=40;
			  	}
			  	else if(map.get(x)[y-1].equals("W") && map.get(x)[y-2].equals("S")){
			  		this.point=35;
			  	}
			  	else if(map.get(x)[y-1].equals("W") && symbols46.contains(map.get(x)[y-2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols46.contains(map.get(x)[y-1])==true && symbols.contains(map.get(x)[y-2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x)[y-1]=" ";
	  			map.get(x)[y-2]=" ";
	  			map=shifting2(map,x,y,x,y-1,x,y-2);
			}
	         }
		
		 //6
		
		else if((y+1<=Main.rowCounter && y+1>=0 ) && (y+2<=Main.rowCounter && y+2>=0) &&  ((symbols46.contains(map.get(x)[y+1])==true && symbols.contains(map.get(x)[y+2])==true) || (lettersS.contains(map.get(x)[y+1])==true && lettersS.contains(map.get(x)[y+2])==true) && (map.get(x)[y+1].equals("W")==true && symbols46.contains(map.get(x)[y+2])==true))) {
			if(!(map.get(x)[y+1].equals("S") && map.get(x)[y+2].equals("W"))) {
	  			
	  			
	  			if(map.get(x)[y+1].equals("W") && map.get(x)[y+2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x)[y+1].equals("S") && map.get(x)[y+2].equals("S")){
			  		this.point=40;
			  	}
			  	else if(map.get(x)[y+1].equals("W") && map.get(x)[y+2].equals("S")){
			  		this.point=35;
			  	}
			  	else if(map.get(x)[y+1].equals("W") && symbols46.contains(map.get(x)[y+2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols46.contains(map.get(x)[y+1])==true && symbols.contains(map.get(x)[y+2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x)[y+1]=" ";
	  			map.get(x)[y+2]=" ";
	  			map=shifting2(map,x,y,x,y+1,x,y+2);
			}
	         }
		
		 //1
		else if((((x-1<=Main.rowCounter && y-1<=Main.columnCounter) && (x-1>=0 && y-1>=0)) && ((x-2<=Main.rowCounter && y-2<=Main.columnCounter) && (x-2>=0 && y-2>=0))) &&  ((symbols19.contains(map.get(x-1)[y-1])==true && symbols.contains(map.get(x-2)[y-2])==true) || (lettersD.contains(map.get(x-1)[y-1])==true && lettersD.contains(map.get(x-2)[y-2])==true) || (map.get(x-1)[y-1].equals("W")==true && symbols19.contains(map.get(x-2)[y-2])==true))) {
			if(!(map.get(x-1)[y-1].equals("D") && map.get(x-2)[y-2].equals("W"))) {
	  			
	  			if(map.get(x-1)[y-1].equals("W") && map.get(x-2)[y-2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x-1)[y-1].equals("D") && map.get(x-2)[y-2].equals("D")){
			  		this.point=70;
			  	}
			  	else if(map.get(x-1)[y-1].equals("W") && map.get(x-2)[y-2].equals("D")){
			  		this.point=50;
			  	}
			  	else if(map.get(x-1)[y-1].equals("W") && symbols19.contains(map.get(x-2)[y-2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols19.contains(map.get(x-1)[y-1])==true && symbols.contains(map.get(x-2)[y-2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x-1)[y-1]=" ";
	  			map.get(x-2)[y-2]=" ";
	  			map=shifting2(map,x,y,x-1,y-1,x-2,y-2);
			}
	         }
		
		 //9
		 
		else if((((x+1<=Main.rowCounter &&  y+1<=Main.columnCounter) && (x+1>=0 && y+1>=0)) && ((x+2<=Main.rowCounter && y+2<=Main.columnCounter) && (x+2>=0 && y+2>=0))) &&  ((symbols19.contains(map.get(x+1)[y+1])==true && symbols.contains(map.get(x+2)[y+2])==true) || (lettersD.contains(map.get(x+1)[y+1])==true && lettersD.contains(map.get(x+2)[y+2])==true) || (map.get(x+1)[y+1].equals("W")==true && symbols19.contains(map.get(x+2)[y+2])==true))){
			if(!(map.get(x+1)[y+1].equals("D") && map.get(x+2)[y+2].equals("W"))) {
	  			
	  			
	  			if(map.get(x+1)[y+1].equals("W") && map.get(x+2)[y+2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x+1)[y+1].equals("D") && map.get(x+2)[y+2].equals("D")){
			  		this.point=70;
			  	}
			  	else if(map.get(x+1)[y+1].equals("W") && map.get(x+2)[y+2].equals("D")){
			  		this.point=50;
			  	}
			  	else if(map.get(x+1)[y+1].equals("W") && symbols19.contains(map.get(x+2)[y+2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols19.contains(map.get(x+1)[y+1])==true && symbols.contains(map.get(x+2)[y+2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x+1)[y+1]=" ";
	  			map.get(x+2)[y+2]=" ";
	  			map=shifting2(map,x,y,x+1,y+1,x+2,y+2);
			}
	         }
		
		 //3
		else if((((x-1<=Main.rowCounter &&  y+1<=Main.columnCounter) && (x-1>=0 && y+1>=0)) && ((x-2<=Main.rowCounter && y+2<=Main.columnCounter) && (x-2>=0 && y+2>=0))) &&  ((symbols37.contains(map.get(x-1)[y+1])==true && symbols.contains(map.get(x-2)[y+2])==true) || (lettersD.contains(map.get(x-1)[y+1])==true && lettersD.contains(map.get(x-2)[y+2])==true) || (map.get(x-1)[y+1].equals("W")==true && symbols37.contains(map.get(x-2)[y+2])==true))){
			if(!(map.get(x-1)[y+1].equals("D") && map.get(x-2)[y+2].equals("W"))) {
	  			
	  			
	  			if(map.get(x-1)[y+1].equals("W") && map.get(x-2)[y+2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x-1)[y+1].equals("D") && map.get(x-2)[y+2].equals("D")){
			  		this.point=70;
			  	}
			  	else if(map.get(x-1)[y+1].equals("W") && map.get(x-2)[y+2].equals("D")){
			  		this.point=50;
			  	}
			  	else if(map.get(x-1)[y+1].equals("W") && symbols37.contains(map.get(x-2)[y+2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols37.contains(map.get(x-1)[y+1])==true && symbols.contains(map.get(x-2)[y+2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x-1)[y+1]=" ";
	  			map.get(x-2)[y+2]=" ";
	  			map=shifting2(map,x,y,x-1,y+1,x-2,y+2);
			}
	         }
		
		 //7
		else if((((x+1<=Main.rowCounter &&  y-1<=Main.columnCounter) && (x+1>=0 && y-1>=0)) && ((x+2<=Main.rowCounter && y-2<=Main.columnCounter) && (x+2>=0 && y-2>=0))) &&  ((symbols37.contains(map.get(x+1)[y-1])==true && symbols.contains(map.get(x+2)[y-2])==true) || (lettersD.contains(map.get(x+1)[y-1])==true && lettersD.contains(map.get(x+2)[y-2])==true) || (map.get(x+1)[y-1].equals("W")==true && symbols37.contains(map.get(x+2)[y-2])==true))){
			if(!(map.get(x+1)[y-1].equals("D") && map.get(x+2)[y-2].equals("W"))) {
	  			

	  			if(map.get(x+1)[y-1].equals("W") && map.get(x+2)[y-2].equals("W")){
			  		this.point=30;	
			  	}
			  	else if(map.get(x+1)[y-1].equals("D") && map.get(x+2)[y-2].equals("D")){
			  		this.point=70;
			  	}
			  	else if(map.get(x+1)[y-1].equals("W") && map.get(x+2)[y-2].equals("D")){
			  		this.point=50;
			  	}
			  	else if(map.get(x+1)[y-1].equals("W") && symbols19.contains(map.get(x+2)[y-2])==true){
			  		this.point=40;		
			  	}
			  	else if(symbols19.contains(map.get(x+1)[y-1])==true && symbols.contains(map.get(x+2)[y-2])==true) {
			  		this.point=50;
			  	}
	  			map.get(x)[y]=" ";
	  			map.get(x+1)[y-1]=" ";
	  			map.get(x+2)[y-2]=" ";
	  			map=shifting2(map,x,y,x+1,y-1,x+2,y-2);
			}
	         }
		
		else {
			System.out.println("There is no matching");
			System.out.println();
		}
								
		return map;
		
	}
	
	

}
