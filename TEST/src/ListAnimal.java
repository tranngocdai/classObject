public class ListAnimal {
    private Animal[]animals=new Animal[5];
    private int nextIndex=0;

    public void add(Animal animal){
        if (nextIndex<animals.length){
            animals[nextIndex] = animal;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }
}
