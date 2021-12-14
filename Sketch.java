import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(211,211,211);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	smooth();
	noStroke();
	//ground
	fill(99,102,106);
	rect(0, (float) (height / 1.2), width, (float) (height * 0.16666667));
	
	//window w space
	fill(0);
	rect(width / 6, height / 6, (float) (width * 0.66), (float) (height * 0.3333333));
	//stars
	fill(255);
	ellipse(width / 5, height / 5, width / 120, height / 120); 
	ellipse((float) (width / 4.37), (float) (height / 4.5), width / 200, height / 200); 
	ellipse(width / 4, (float) (height / 4.61), width / 150, height / 150); 
	ellipse((float) (width / 3.15), height / 5, width / 300, height / 300); 
	ellipse((float) (width / 2.5), height / 4, width / 150, height / 150);
	ellipse((float) (width / 1.714), (float) (height / 2.22), width / 120, height / 120);
	ellipse((float) (width / 1.875), height / 4, width / 120, height / 120);
	ellipse((float) (width / 1.42), (float) (height / 3.55), width / 200, height / 200);
	ellipse(width / 4, (float) (height / 3.52), width / 120, height / 120);
	ellipse((float) (width / 3.2), (float) (height / 3.7), width / 200, height / 200);
	ellipse((float) (width / 1.71), (float) ( width / 2.6), width / 150, height / 150);
	ellipse((float) (width / 1.1), (float) (width / 3.52), width / 300, height / 300);
	ellipse((float) (width / 1.39), height / 3, width / 150, height / 150);
	ellipse((float) (width / 1.33), (float) (height / 2.22), width / 120, height / 120);
	ellipse((float) (width / 1.42), height / 4, width / 120, height / 120);
	ellipse((float) (width / 1.42), (float) (height / 1.875), width / 200, height / 200);

	//vent
	fill(148,147,147);
	rect(width / 30, (float) (height / 1.14285714), width / 4, height / 4);
	//vent lines
	strokeWeight(3);
	stroke(75,75,75);
	line(width / 20, (float) (height / 1.11111111), width / 20, (float) (height / 1.01694915));
	line(width / 15, (float) (height / 1.11111111), width / 15, (float) (height / 1.01694915));
	line(width / 12, (float) (height / 1.11111111), width / 12, (float) (height / 1.01694915));
	line(width / 10, (float) (height / 1.11111111), width / 10, (float) (height / 1.01694915));
	line((float) (width / 8.57142857), (float) (height / 1.11111111), (float) (width / 8.57142857), (float) (height / 1.01694915));
	line((float) (width / 7.5), (float) (height / 1.11111111), (float) (width / 7.5), (float) (height / 1.01694915));
	line((float) (width / 6.66666667), (float) (height / 1.11111111), (float) (width / 6.66666667), (float) (height / 1.01694915));
	line(width / 6, (float) (height / 1.11111111), width / 6, (float) (height / 1.01694915));
	line((float) (width / 5.4545), (float) (height / 1.11111111), (float) (width / 5.4545), (float) (height / 1.01694915));
	line(width / 5, (float) (height / 1.11111111), width / 5, (float) (height / 1.01694915));
	line((float) ( width / 4.61538462), (float) (height / 1.11111111), (float) ( width / 4.61538462), (float) (height / 1.01694915));
	line((float) (width / 4.28571429), (float) (height / 1.11111111), (float) (width / 4.28571429), (float) (height / 1.01694915));
	line(width / 4, (float) (height / 1.11111111), width / 4, (float) (height / 1.01694915));
	line((float) (width / 3.75), (float) (height / 1.11111111), (float) (width / 3.75), (float) (height / 1.01694915));
	
		
	//among us #1
	noStroke();
	fill(199,16,18);
	//body
	rect(width / 8, height / 3, width / 3, height / 2);
	//round head
	ellipse((float) (width / 3.42857143), height / 3, width / 3, height / 6);
	//legs
	ellipse((float) (width / 5.26315789), (float) (height / 1.2), width / 8, height / 6);
	ellipse((float) (width / 2.54237288), (float) (height / 1.2), width / 8, height / 6);
	//backpack
	rect(width / 24, (float) (height / 2.4), width / 6, height / 3);
	//mask
	stroke(0);
	strokeWeight((height * width) / 72000);
	fill(149,202,220);
	ellipse((float) (width / 2.4), (float) (height / 2.1818), width / 4, height / 6);
	
	//among us #2
	noStroke();
	//body
	fill(0, 0, 255);
	rect((float) (width / 1.7699115), (float) (height / 1.71428571), width / 3, height / 4);
	//legs
	ellipse((float) (width / 1.58730159), (float) (height / 1.2), width / 8, height / 6);
	ellipse((float) (width / 1.2), (float) (height / 1.2), width / 8, height / 6);
	//backpack
	rect((float) (width / 1.14285714), (float) (height / 2.4), width / 12, height / 3);
	//bone
	fill(255);
	rect((float) (width / 1.44578313), (float) (height / 2.4), width / 12, height / 6);
	ellipse((float) (width / 1.41176471), (float) (height / 2.4), width / 12, height / 12);
	ellipse((float) (width / 1.31868132), (float) (height / 2.4), width / 12, height / 12);
	
	

	
  }
  
  // define other methods down here.
}