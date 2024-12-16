import java.awt.Color;

/**
 * This client program performs another striking visual effect:
 * it morphs an image into its grayscaled version
 * For example: java Editor4 thor.ppm 50
 * This action transforms the colored Thor image
 * into a black and white Thor image.
 */
public class Editor4 {
    
    public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage); //the target is the grayscaled version
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n); //morphs in n steps
	}
}
