import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

import org.opencv.imgproc.Imgproc;
public class erosion_dilation {
    public static void main( String[] args ) {
   
      try{	
         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
         Mat source = Highgui.imread("in.jpg",  Highgui.CV_LOAD_IMAGE_COLOR);
         Mat destination = new Mat(source.rows(),source.cols(),source.type());
         
         destination = source;

         int erosion_size = 5;
         int dilation_size = 5;
         
         Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new  Size(2*erosion_size + 1, 2*erosion_size+1));
         Imgproc.erode(source, destination, element);
         Highgui.imwrite("erosion.jpg", destination);

         source = Highgui.imread("in.jpg",  Highgui.CV_LOAD_IMAGE_COLOR);
         
         destination = source;
         
         Mat element1 = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new  Size(2*dilation_size + 1, 2*dilation_size+1));
         Imgproc.dilate(source, destination, element1);
         Highgui.imwrite("dilation.jpg", destination);
         
      } catch (Exception e) {
         System.out.println("error:" + e.getMessage());
      } 
   }
}
