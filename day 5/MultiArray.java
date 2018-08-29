class MultiArray{
	public static void main(String[] args){
	
		int score[][] = new int[5][5];

		for ( int i=0; i <5; i++) {
			for ( int j=0; j<5; j++) {
				score[i][j] = i + 2 * j;
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}	


	}
}