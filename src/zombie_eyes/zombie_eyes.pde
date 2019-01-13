void setup (){
  PImage face = loadImage("face.jpg");
  image(face, 0, 0);
  size(320, 400);
}
void draw (){
  fill(255, mouseX, mouseY);
  ellipse(115, 185, 50, 20);
  fill(225, mouseX, mouseY);
  ellipse(205, 183, 50, 20);
  fill(#030000);
  ellipse(115, 185, 20, 20);
  ellipse(205, 183, 20, 20);
  
}