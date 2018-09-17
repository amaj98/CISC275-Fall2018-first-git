class Dog extends Animal implements Comparable<Animal>{
  public Dog(String name, int legs){
    super(name,legs);
  }
  @Override
  public int compareTo(Animal other){
    return other.getLegs() - this.getLegs();
  }
}
