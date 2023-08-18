package oop.class_object.equals_and_hashcode;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Muhammad Yusuf", 2025);
        Child child2 = new Child("Hadicha", 2027);
        Child child3 = new Child("Umarjon", 2030);
        Child child4 = new Child("Oyisha", 2035);

        Child[] children = {child1, child2, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        for (Child child : childrenGarden.getChildren()) {
            if (child.getName().equals("Umarjon") && child.getYear() == 2030) {
                result = true;
                break;
            }
            
        }
        System.out.println(result);


    }
}
