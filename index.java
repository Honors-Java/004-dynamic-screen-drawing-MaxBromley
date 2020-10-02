void setup() {
	size(300, 300);
  


}



void draw(){  ellipseMode(CENTER);
    background(200);
  rectMode(CENTER);
 
  fill(255,mouseX,mouseY)
    rect(mouseX, mouseY,mouseX,mouseY);
  
   fill(mouseX,mouseY,255)
     ellipse(120, 110,mouseX,mouseY);
}

void mousePressed(){
  Println ("Color Madness");
}
//dont forget to add mouse and keypressed interaction functions