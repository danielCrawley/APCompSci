package me.danielcrawley.compsci.term2;

public class point{
 public int x; 
 public int y; 
 
 public point (){
  x =0; 
  y=0;
 }
 
 
 public point(int a, int b){
 x=a; 
 y=b; 
 }
 public String toString(){
   return ( "(" + this.x + ", " + this.y + ")"); 
   
}
 public int getX(){
  return x; 
 }
 public int getY(){
  return y;  
 }
 public void setX(int x){
   this.x =x; 
 }
 public void setY(int y){
   this.y =y; 
 }


} 