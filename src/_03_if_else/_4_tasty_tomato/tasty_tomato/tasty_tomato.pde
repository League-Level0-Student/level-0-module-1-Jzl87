void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
     fill(0,255,0);
    rect(176, 103, 12, 32);
    fill(255,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    
    if (mousePressed == true) {
      fill(200,200,200);
      ellipse(100,200,75,75);
  }
    
}
