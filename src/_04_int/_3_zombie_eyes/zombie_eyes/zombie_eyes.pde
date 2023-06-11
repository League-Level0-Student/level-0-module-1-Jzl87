
void setup() {
  size(500,500);
}

void draw() {
PImage zombie = loadImage("Zombie.jpg");
zombie.resize(500,500);
background(zombie);

//eye
fill(255,255,255);
noStroke();
rect(145,70, 70, 20);
rect(276,70, 70, 20);

//iris

fill(mouseX+mouseY,mouseY, mouseX);
ellipse(170,80, 20, 20);
ellipse(300, 80, 20, 20);
 }
