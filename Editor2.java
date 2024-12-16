import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		String fileName = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		Color[][] imageIn = Runigram.read(fileName);	
		Color[][] imageOut = Runigram.scaled(imageIn, width, height);	
		// Creates a canvas in which the input image will be displayed.
		// Next, displays the input image, and pauses for a few seconds. 
		// Next, Creates a canvas in which the output image will be displayed
		// Finally, displays the output image.
		Runigram.setCanvas(imageIn);
		Runigram.display(imageIn);
		StdDraw.pause(3000); 
		Runigram.setCanvas(imageOut); //input and output arent the same size
		Runigram.display(imageOut);		
	}
}
