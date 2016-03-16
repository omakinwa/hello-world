# hello-world
Getting started

public class Card
{
  boolean show;
  String back;
  int front;
  
  public Card(String theBack, int theFront)
  {
    show = false;
    back = theBack;
    front = theFront;
  }
  
  public void showCard()
  {
    if (show)
      System.out.println("
