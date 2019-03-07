import java.util.ArrayList;

public class Symbol5 implements Jewels {
int point;
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
	@Override
	public ArrayList<String[]> deleting(ArrayList<String[]> map, int x, int y) {
		ArrayList<String> symbols=new ArrayList<String>();
		symbols.add("/");
		symbols.add("-");
		symbols.add("+");
		symbols.add("|");
		symbols.add("\\");
		
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
		
		 if((x-1<=Main.rowCounter && x-1>=0 ) && (x-2<Main.rowCounter && x-2>=0) && (symbols28.contains(map.get(x-1)[y])==true && symbols.contains(map.get(x-2)[y])==true)){
			map.get(x)[y]=" ";
		  	map.get(x-1)[y]=" ";
		  	map.get(x-2)[y]=" ";
		  	this.point=60;
		  	map=shifting(map,x,y,x-1,y,x-2,y);
		         }
		
			
		else if((x+1<=Main.rowCounter && x+1>=0) && (x+2<=Main.rowCounter && x+2>=0)  && (symbols28.contains(map.get(x+1)[y])==true && symbols.contains(map.get(x+2)[y])==true)) {  		
		  	map.get(x)[y]=" ";
		  	map.get(x+1)[y]=" ";
		  	map.get(x+2)[y]=" ";
		  	this.point=60;
		  	map=shifting(map,x,y,x+1,y,x+2,y);
		         }
		
		else {
			System.out.println("There is no matching");
			System.out.println();
		}
		
		return map;
	}
	
	
	

}
