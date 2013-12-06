/**
 * Methods to manipulate the Picture class
 */
public class PictureUtil {
    /**
     * Gets a version of the given Picture in gray scale and flipped left to right
     * @param pic the Picture to convert to gray scale and flip
     * @return a version of the original Picture in gray scale and flipped
     * left to right.
     */
    public static Picture grayAndFlipLeftToRight(Picture pic) {
        // TODO get a gray scale version
        // TODO flip it left to right
        // TODO create and return the new Picture

        int columns = pic.getWidth();
        int rows = pic.getHeight();
        int[][] pixel = pic.getGrayLevels();
        
        int[][] reverse = new int[rows][columns];
        int oldColNumber = columns - 1;
        // System.out.println("Columns: " + columns); //test
        // System.out.println("Rows: " + rows);

        for (int colNumber = 0; colNumber < columns; colNumber++) {
            for (int rowNumber = 0; rowNumber < rows; rowNumber++) {
            reverse[rowNumber][colNumber] = pixel[rowNumber][oldColNumber];
            }
            oldColNumber--;
        }
        
        return new Picture(reverse);
    }

    /**
     * Gets a version of the given Picture in gray scale and rotated 90 degrees clockwise
     * @param pic the Picture to convert to gray scale and rotate 90 degrees clockwise
     * @return a version of the original Picture in gray scale and rotated 90 degrees clockwise
     */
    public static Picture grayAndRotate90(Picture pic) {
        int columns = pic.getWidth();
        int rows = pic.getHeight();
        int[][] pixel = pic.getGrayLevels();
        
        int[][] rotate = new int[columns][rows];
        // prints out the values assigned to columns & rows
        // System.out.println("Columns: " + columns);
        // System.out.println("Rows: " + rows);
        int oldRowNumber = rows - 1;
        for (int rowNumber = 0; rowNumber < rows; rowNumber++) {
            for (int colNumber = 0; colNumber < columns; colNumber++) {
                rotate[colNumber][oldRowNumber] = pixel[rowNumber][colNumber];
            }
            oldRowNumber--;
        }
        
        return new Picture(rotate);
    }
}

