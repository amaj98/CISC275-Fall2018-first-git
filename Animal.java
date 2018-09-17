class Animal{
  protected String name;
  protected int legs;
  Animal(String name,int legs){
    this.name = name;
    this.legs = legs;
  }
  public String toString(){
    return this.name;
  }
  public int getLegs(){
    return this.legs;
  }
}
