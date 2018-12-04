package be.upgrade.it.adventofcode2018.day3;

public class PieceOfFabric {
    private int[][] fabric = new int[1000][1000];

    public void claim(Claim claim){
        int startX = claim.getX();
        int stopX = startX + claim.getWidth();

        int startY = claim.getY();
        int stopY = startY + claim.getHeight();

        int id = claim.getId();

        for (int i = startX; i < stopX; i++) {
            int[] row = fabric[i];
            for (int j = startY; j < stopY; j++) {
                if(row[j] != 0){
                    row[j] = -1;
                } else {
                    row[j] = id;
                }
            }
        }
    }

    public int calculateOverlap(){
        int count = 0;

        for (int i = 0; i < fabric.length; i++) {
            int[] row = fabric[i];
            for (int j = 0; j < row.length; j++) {
                if(row[j] == -1){
                    count++;
                }
            }
        }
        return count;
    }

    
}
