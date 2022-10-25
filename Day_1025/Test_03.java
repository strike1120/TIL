
public class Test_03 {
	

	public static void main(String[] args) {
		int[] score = new int[10];
		int[] rank = new int[10];
		
		for(int i=0; i<score.length; ++i) {
			score[i] = (int)(Math.random()*50 +50);
			
		}
		
		for(int i=0; i<score.length; ++i) {
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
		
		for(int i=0; i<rank.length; ++i) {
			rank[i]=1;
		}
		for(int i=0; i<rank.length; ++i) {
			System.out.printf("%4d",rank[i]);
		}
		System.out.println();
		for(int i=0; i<score.length; ++i) {
			for(int j=0; j<score.length; ++j) {
				if(score[i] < score[j])
					rank[i]=rank[i]+1;
				
				if(score[i] == score[j])
					continue;
			}
		}
		System.out.println();
		for(int i=0; i<score.length; ++i) {
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
		for(int i=0; i<rank.length; ++i) {
			System.out.printf("%4d",rank[i]);
			}	
		}
		
	
	
	}
