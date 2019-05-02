import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.opencv.highgui.Highgui;
public class open_close {
    public static void main(String args[]) {
      // Loading the OpenCV core library
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

      // Reading the Image from the file and storing it in to a Matrix object
       Mat src = Highgui.imread("in.jpg",  Highgui.CV_LOAD_IMAGE_COLOR);

      // Creating an empty matrix to store the result
      Mat dst = new Mat();

      // Creating kernel matrix
      Mat kernel = Mat.ones(5,5, CvType.CV_32F);

      // Applying Blur effect on the Image 
      Imgproc.morphologyEx(src, dst, Imgproc.MORPH_OPEN, kernel);

      // Writing the image
      Highgui.imwrite("open.jpg", dst);

      System.out.println("Image Processed");
   } 
}
