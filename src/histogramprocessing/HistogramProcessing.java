package histogramprocessing;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class HistogramProcessing extends javax.swing.JFrame {

  
    public HistogramProcessing() {
        initComponents();
    }
    private int[] vectorHistogram;
    private BufferedImage bufferedImage = null;
    private int[][] inputImage;
    private int[][] outputImage;

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graph = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        show = new javax.swing.JMenuItem();
        equalization = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        transformations = new javax.swing.JMenu();
        log = new javax.swing.JMenuItem();
        power = new javax.swing.JMenuItem();
        bit = new javax.swing.JMenuItem();
        smooth = new javax.swing.JMenu();
        min = new javax.swing.JMenuItem();
        max = new javax.swing.JMenuItem();
        median = new javax.swing.JMenuItem();
        average = new javax.swing.JMenuItem();
        weighted = new javax.swing.JMenuItem();
        sharp = new javax.swing.JMenu();
        sobel = new javax.swing.JMenuItem();
        laplacian = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Histogram Processing");
        setResizable(false);

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        menu_file.setText("File");

        open.setText("Open File");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        menu_file.add(open);

        show.setText("Show Histogram");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        menu_file.add(show);

        equalization.setText("Histogram Equalization");
        equalization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalizationActionPerformed(evt);
            }
        });
        menu_file.add(equalization);

        save.setText("Save Image");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        menu_file.add(save);

        transformations.setText("Transformations");

        log.setText("Using Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        transformations.add(log);

        power.setText("Power Law");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });
        transformations.add(power);

        bit.setText("Bit Plane Slicing");
        bit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitActionPerformed(evt);
            }
        });
        transformations.add(bit);

        menu_file.add(transformations);

        smooth.setText("Smoothing Filters");

        min.setText("Min");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        smooth.add(min);

        max.setText("Max");
        max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxActionPerformed(evt);
            }
        });
        smooth.add(max);

        median.setText("Median");
        median.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianActionPerformed(evt);
            }
        });
        smooth.add(median);

        average.setText("Average");
        average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageActionPerformed(evt);
            }
        });
        smooth.add(average);

        weighted.setText("Weighted Smoothing Filters");
        weighted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightedActionPerformed(evt);
            }
        });
        smooth.add(weighted);

        menu_file.add(smooth);

        sharp.setText("Sharpening Filters");

        sobel.setText("Using Sobel Operators");
        sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelActionPerformed(evt);
            }
        });
        sharp.add(sobel);

        laplacian.setText("Using Laplacian Filter");
        laplacian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laplacianActionPerformed(evt);
            }
        });
        sharp.add(laplacian);

        menu_file.add(sharp);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menu_file.add(exit);

        menu.add(menu_file);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(610, 362));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
    
    public int[][] readImage(File filename){
        BufferedImage img;
        try {
            img = ImageIO.read(filename);
            int width = img.getWidth();
            int height = img.getHeight();
            int [][] readImageVal = new int [width][height];
            for (int i = 0; i < height; i++){
                for (int j = 0; j < width; j++){

                    Color c = new Color(img.getRGB(j, i));
                    int r = (int)(c.getRed() * 0.299)&0xff;
                    int g = (int)(c.getGreen() * 0.587)&0xff;
                    int b = (int)(c.getBlue() *0.114)&0xff;
                    int avg = ((r + b + g));
                    readImageVal[j][i] = avg;
                }
            }
            return readImageVal;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
   
    private void marchThroughImage(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        inputImage = new int [width][height];
        inputImage = readImage(new File(StaticVariable.path));
        vectorHistogram = new int[256];
        for (int[] row : inputImage) {
            for(int i = 0; i < row.length; i++) {
                int temp = row[i];
                vectorHistogram[temp]++;
            }
        }
        showHistogram(vectorHistogram);
    }
    
    private void showHistogram(int[] v) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i < v.length; i++) {
            String temp = (double)i / 255 + "";
            dataset.setValue(v[i], temp, "");
        }
        JFreeChart chart = ChartFactory.createBarChart("Histogram", "", "", dataset, PlotOrientation.VERTICAL, 
                                                        false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame f = new ChartFrame("Histogram", chart);
        f.setVisible(true);
        f.setSize(749, 502);
    }
    
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	jfc.setDialogTitle("Select an image");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "png", "jpg");
	jfc.addChoosableFileFilter(filter);
        
	int returnValue = jfc.showOpenDialog(null);
	if (returnValue == JFileChooser.APPROVE_OPTION) {
            StaticVariable.path = jfc.getSelectedFile().getPath();
            try {
                File img = new File(StaticVariable.path);
                bufferedImage = ImageIO.read(img);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            inputImage = new int[bufferedImage.getWidth()][bufferedImage.getHeight()];
            inputImage = readImage(new File(StaticVariable.path));
            outputImage = new int[bufferedImage.getWidth()][bufferedImage.getHeight()];
            ShowImage show = new ShowImage();
            show.setVisible(true);
	}
    }//GEN-LAST:event_openActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        marchThroughImage(bufferedImage);
    }//GEN-LAST:event_showActionPerformed
 
    private void saveImage(BufferedImage bufferedImage) {
        try {
            File outputfile = new File("saved.png");
            ImageIO.write(bufferedImage, "png", outputfile); 
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        saveImage(bufferedImage);
    }//GEN-LAST:event_saveActionPerformed

    private void equalizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalizationActionPerformed
        int sum = 0;
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int area = width * height;
        int Dm = 256;
        outputImage = new int[width][height];
        int[] sum_of_his = new int[256];         // to draw new histogram of img
        
        for(int i = 0; i < 255; i++) {
            sum = sum + vectorHistogram[i];
            sum_of_his[i] = sum;
        }
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                int point = inputImage[i][j];
                double newPixel = ((double)Dm / area) * sum_of_his[point];
                int temp  = (int) Math.round(newPixel);
                if(temp == 0) {
                    outputImage[i][j] = 0;
                } else {
                    outputImage[i][j] = temp - 1;
                }
            }
        }
        
        int[] vectorAfterRun = new int[256];
        for (int[] row : outputImage) {
            for(int i = 0; i < row.length; i++) {
                int temp = row[i];
                vectorAfterRun[temp]++;
            }
        }
        showHistogram(vectorAfterRun);
    }//GEN-LAST:event_equalizationActionPerformed

    public BufferedImage powerTrans(int[][] pixels , int c, double gamma){
        double temp;
        for (int i = 0; i < pixels.length; i ++){
            for (int j = 0; j < pixels[0].length; j++){
                int rgb = pixels[i][j];
                temp = Math.pow((double)rgb/255, gamma);
                rgb = (int) (c * temp);
                rgb *= 255;
                if(rgb > 255) rgb = 255;
                Color col = new Color(rgb, rgb, rgb);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        return bufferedImage;
    }
    
    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        inputImage = readImage(new File(StaticVariable.path));
        String inputNumber = JOptionPane.showInputDialog("Enter c: ");
        int c = Integer.parseInt(inputNumber);
        inputNumber = JOptionPane.showInputDialog("Enter gamma: ");
        double gamma = Double.parseDouble(inputNumber);
        bufferedImage = powerTrans(inputImage, c, gamma);
        saveImage(bufferedImage);
    }//GEN-LAST:event_powerActionPerformed

    public BufferedImage logTrans(int[][] pixels , int c){
        double temp;
        for (int i = 0; i < pixels.length; i ++){
            for (int j = 0; j < pixels[0].length; j++){
                int rgb = pixels[i][j];
                temp = Math.log10((double)rgb/255 + 1);
                rgb = (int) (c * temp);
                rgb *= 255;
                if(rgb > 255) rgb = 255;
                Color col = new Color(rgb, rgb, rgb);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        return bufferedImage;
    }
    
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        inputImage = readImage(new File(StaticVariable.path));
        String inputNumber = JOptionPane.showInputDialog("Enter c: ");
        int c = Integer.parseInt(inputNumber);
        bufferedImage = logTrans(inputImage, c);
        saveImage(bufferedImage);
    }//GEN-LAST:event_logActionPerformed

    public void getImageFromArray(int[] pixels, int width, int height,String name) {
        int k=0;
        for(int i=0;i<width;i++) {
            for(int j=0;j<height;j++) {
                outputImage[i][j] = pixels[k];
                k++;
            }
        }
        k=0;
        for(int i=0;i<width;i++) {
            for(int j=0;j<height;j++) {
                try {
                    if(outputImage[i][j]==1) {
                        //WHITE
                        outputImage[i][j] = 255;
                    }
                    else if(outputImage[i][j]==0) {
                        //BLACK
                        outputImage[i][j] = 0;
                    }
                    k++;
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File(name+".png"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    private void bitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitActionPerformed
        int n = bufferedImage.getWidth();
        int m = bufferedImage.getHeight();
        int [][]pixels = new int[n*m][8];
        String s=null;
        int cnt=0;
        for (int row = 0; row < n; ++row){
            for (int col = 0; col < m; ++col){
                s=Integer.toBinaryString(inputImage[row][col]);
                int len = s.length()-1;
                boolean b = false;
                int len2 = 7;
                if(len<7) b = true;
                for(int i=len;i>=0;i--){
                    char c = s.charAt(i);
                    int x = Character.getNumericValue(c);
                    if(b==false)
                        pixels[cnt][i] = x;
                    else if(b==true) {
                        pixels[cnt][len2] = x;
                        len2--;
                    }
                }
                cnt++;
            }
        }
        int bit0[],bit1[],bit2[],bit3[],bit4[],bit5[],bit6[],bit7[];
        bit0 = new int[(n*m)];
        bit1 = new int[(n*m)];
        bit2 = new int[(n*m)];
        bit3 = new int[(n*m)];
        bit4 = new int[(n*m)];
        bit5 = new int[(n*m)];
        bit6 = new int[(n*m)];
        bit7 = new int[(n*m)];
        // BIT 7
        for(int i=0;i<n*m;i++) {
            bit7[i] = pixels[i][0];
        }
        //BIT 6
        for(int i=0;i<n*m;i++) {
            bit6[i] = pixels[i][1];
        }
        //BIT 5
        for(int i=0;i<n*m;i++) {
            bit5[i] = pixels[i][2];
        }
        //BIT 4
        for(int i=0;i<n*m;i++) {
            bit4[i] = pixels[i][3];
        }
        //BIT 3
        for(int i=0;i<n*m;i++) {
            bit3[i] = pixels[i][4];
        }
        //BIT 2
        for(int i=0;i<n*m;i++) {
            bit2[i] = pixels[i][5];
        }
        //BIT 1
        for(int i=0;i<n*m;i++) {
            bit1[i] = pixels[i][6];
        }
        //BIT 0 
        for(int i=0;i<n*m;i++) {
            bit0[i] = pixels[i][7];
        }
        getImageFromArray(bit7,n,m,"Bit 7");
        getImageFromArray(bit6,n,m,"Bit 6");
        getImageFromArray(bit5,n,m,"Bit 5");
        getImageFromArray(bit4,n,m,"Bit 4");
        getImageFromArray(bit3,n,m,"Bit 3");
        getImageFromArray(bit2,n,m,"Bit 2");
        getImageFromArray(bit1,n,m,"Bit 1");
        getImageFromArray(bit0,n,m,"Bit 0");
        JOptionPane.showMessageDialog(null, "Image saved in your project");
    }//GEN-LAST:event_bitActionPerformed

    private int[][] getNeighborMatrix(int i, int j) {
        int[][] neighbor = new int[3][3];
        for(int x = -1; x < 2; x++) {
            for(int y = -1; y < 2; y++) {
                neighbor[x + 1][y + 1] = inputImage[i + x][j + y];
            }
        }
        return neighbor;
    }
    
    private int minValue(int[][] neighbor) {
        int temp = neighbor[0][0];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(neighbor[i][j] < temp) temp = neighbor[i][j];
            }
        }
        return temp;
    }
    
    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int[][] neighbor;
  
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                neighbor = getNeighborMatrix(i, j);
                outputImage[i][j] = minValue(neighbor);
            }
        }
       
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        
        try {
            
            ImageIO.write(bufferedImage, "png", new File("min"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_minActionPerformed
    
    private void averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageActionPerformed
        int x = bufferedImage.getWidth();
        int y = bufferedImage.getHeight();

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = inputImage[i-1][j-1];
                int val01 = inputImage[i-1][j];
                int val02 = inputImage[i-1][j+1];

                int val10 = inputImage[i][j-1];
                int val11 = inputImage[i][j];
                int val12 = inputImage[i][j+1];

                int val20 = inputImage[i+1][j-1];
                int val21 = inputImage[i+1][j];
                int val22 = inputImage[i+1][j+1];

                double gx =  val00 + val01 + val02 
                        + val10 + val11 + val12
                        + val20 + val21 +  val22;
                gx /= 9;
                int g = (int) gx;
                if(g > 255) g = 255;
                outputImage[i][j] = g;
            }
        }

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("average"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_averageActionPerformed

    private int maxValue(int[][] neighbor) {
        int temp = neighbor[0][0];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(neighbor[i][j] > temp) temp = neighbor[i][j];
            }
        }
        return temp;
    }
    
    private void maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxActionPerformed
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int[][] neighbor;
        
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                neighbor = getNeighborMatrix(i, j);
                outputImage[i][j] = maxValue(neighbor);
            }
        }
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("max"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_maxActionPerformed

    private int medianValue(int[][] neighbor) {
        int[] temp = new int[9];
        int idx = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                temp[idx] = neighbor[i][j];
                idx++;
            }
        }
        for(int i = 0; i < temp.length - 1; i++) {
            for(int j = i + 1; j < temp.length; j++) {
                if(temp[i] > temp[j]) {
                    idx = temp[i];
                    temp[i] = temp[j];
                    temp[j] = idx;
                }
            }
        }
       
        return temp[4];
    }
    
    private void medianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianActionPerformed
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int[][] neighbor;
        
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                neighbor = getNeighborMatrix(i, j);
                outputImage[i][j] = medianValue(neighbor);
            }
        }
        for(int i = 1; i < width - 1; i++) {
            for(int j = 1; j < height - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("median"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_medianActionPerformed

    private void weightedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightedActionPerformed
        int x = bufferedImage.getWidth();
        int y = bufferedImage.getHeight();

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = inputImage[i-1][j-1];
                int val01 = inputImage[i-1][j];
                int val02 = inputImage[i-1][j+1];

                int val10 = inputImage[i][j-1];
                int val11 = inputImage[i][j];
                int val12 = inputImage[i][j+1];

                int val20 = inputImage[i+1][j-1];
                int val21 = inputImage[i+1][j];
                int val22 = inputImage[i+1][j+1];

                double gx = (val00 / 16) + (val01 * 2 /16) + (val02 / 16);
                gx += (val10 * 2 / 16) + (val11 * 4 / 16) + (val12 * 2 / 16);
                gx += (val20 / 16) + (val21 * 2 /16) + (val22 / 16);
                int g = (int) gx;
                if(g > 255) g = 255;
                outputImage[i][j] = g;
            }
        }

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("weighted"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_weightedActionPerformed

    private void sobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobelActionPerformed
        int x = bufferedImage.getWidth();
        int y = bufferedImage.getHeight();

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = inputImage[i-1][j-1];
                int val01 = inputImage[i-1][j];
                int val02 = inputImage[i-1][j+1];

                int val10 = inputImage[i][j-1];
                int val11 = inputImage[i][j];
                int val12 = inputImage[i][j+1];

                int val20 = inputImage[i+1][j-1];
                int val21 = inputImage[i+1][j];
                int val22 = inputImage[i+1][j+1];

                int gx =  ((-1 * val00) + (0 * val01) + (1 * val02)) 
                        + ((-2 * val10) + (0 * val11) + (2 * val12))
                        + ((-1 * val20) + (0 * val21) + (1 * val22));

                int gy =  ((-1 * val00) + (-2 * val01) + (-1 * val02))
                        + ((0 * val10) + (0 * val11) + (0 * val12))
                        + ((1 * val20) + (2 * val21) + (1 * val22));

                double gval = Math.sqrt((gx * gx) + (gy * gy));
                int g = (int) gval;
                if(g > 255) g = 255;
                outputImage[i][j] = g;
            }
        }

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("sobel"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sobelActionPerformed

    private void laplacianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laplacianActionPerformed
        int x = bufferedImage.getWidth();
        int y = bufferedImage.getHeight();

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = inputImage[i-1][j-1];
                int val01 = inputImage[i-1][j];
                int val02 = inputImage[i-1][j+1];

                int val10 = inputImage[i][j-1];
                int val11 = inputImage[i][j];
                int val12 = inputImage[i][j+1];

                int val20 = inputImage[i+1][j-1];
                int val21 = inputImage[i+1][j];
                int val22 = inputImage[i+1][j+1];

                int gx =  ((0 * val00) + (-1 * val01) + (0 * val02)) 
                        + ((-1 * val10) + (5 * val11) + (-1 * val12))
                        + ((0 * val20) + (-1 * val21) + (0 * val22));

                double gval = Math.sqrt(gx * gx);
                int g = (int) gval;
                if(g > 255) g = 255;
                outputImage[i][j] = g;
            }
        }

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int color = outputImage[i][j];
                Color col = new Color(color, color, color);
                bufferedImage.setRGB(i, j, col.getRGB());
            }
        }
        try {
            ImageIO.write(bufferedImage, "png", new File("laplacian"+".png"));
            JOptionPane.showMessageDialog(null, "Image saved in your project");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_laplacianActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistogramProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistogramProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistogramProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistogramProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistogramProcessing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem average;
    private javax.swing.JMenuItem bit;
    private javax.swing.JMenuItem equalization;
    private javax.swing.JMenuItem exit;
    private javax.swing.JPanel graph;
    private javax.swing.JMenuItem laplacian;
    private javax.swing.JMenuItem log;
    private javax.swing.JMenuItem max;
    private javax.swing.JMenuItem median;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenuItem min;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem power;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenu sharp;
    private javax.swing.JMenuItem show;
    private javax.swing.JMenu smooth;
    private javax.swing.JMenuItem sobel;
    private javax.swing.JMenu transformations;
    private javax.swing.JMenuItem weighted;
    // End of variables declaration//GEN-END:variables
}
