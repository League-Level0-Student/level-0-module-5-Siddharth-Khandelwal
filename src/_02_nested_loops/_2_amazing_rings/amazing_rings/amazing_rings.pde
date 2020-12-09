
  /*** Go to the recipe to run the demonstration before starting this program ***/
int x = 800;
int speed = 1;
int x2 = 200;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1000,650);
  /* Call the noFill() command so all the ellipses will be transparent */
noFill();
}

void draw() {
background(#00CEFF);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
for(int i = 1; i < 375; i +=7){

  ellipse(x,375,i,i); 
} 
x-=speed;
for(int i = 1; i < 375; i +=7){
  ellipse(x2,375,i,i); 
}  
 x2+=speed;
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
if(x2 >= width){
        speed = -speed; 
}
 if(x2 <=0){
   speed=-speed;
 }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
