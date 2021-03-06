package guiModule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	public void setup(){
		size(400, 400);
		background(0, 204, 255);
		stroke(0);
	}
	public void draw(){
		int[] color = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		fill(color[0],color[1],color[2]);
		ellipse(width/2, height/2, 100, 100);
		fill(color[0]/2,color[1]/2,color[1]);
		ellipse(width/2, height/2, 20, 20);
		
	}
	public int[] sunColorSec(float seconds){
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[0]=0;
		
		return rgb;
	}
}

