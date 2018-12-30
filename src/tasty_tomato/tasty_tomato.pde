void setup() {
    size(400, 400);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#EA4545);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#26BC68);
    rect(176, 103, 12, 32);
    fill(200, 200, 200);
   if(mousePressed){
     ellipse(80,200,50,50);
}
}