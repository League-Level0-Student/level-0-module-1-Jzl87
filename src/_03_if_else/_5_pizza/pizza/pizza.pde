  
  PImage pepperoni;
  PImage olive ;
  PImage mushroom ;
  
void setup() {
  size(700,700);
   background(255,255,255);
   
   noStroke();
   fill(239,204,162);
   ellipse(350,350, 500,500);
   fill(178,24,7);
   ellipse(350,350, 450,450);
   fill(251, 219,101);
   ellipse(350,350,420,420);
   
   pepperoni  = loadImage("pepperoni.png");
   olive = loadImage("olive.png");
    olive.resize(40,40);
   mushroom = loadImage("mushroom.png");
}
void draw() {
  
  if(mousePressed && mouseButton == LEFT) {
  image(pepperoni, 375,250);
  image(mushroom, 400,100);
  image(olive, 175,260);
  image(pepperoni, 200,300);
  
  }
  if (mousePressed && mouseButton ==RIGHT) {
    image(mushroom, 150,750);
  image(olive, 405,290);
  image(pepperoni, 305,350);
  image(mushroom, 300,400);
  image(olive, 275, 160);
    
  }
}
