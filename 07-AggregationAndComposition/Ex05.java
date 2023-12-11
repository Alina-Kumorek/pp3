// 4.	Working in a group, create Computer and Processor classes in a class diagram.
// Define class attributes and methods. Create a relationship between the classes assuming
// that objects of those classes cannot exist independently. If the first object is deleted,
// the second one have to be also deleted. What kind of relationship should be used?
// Mark the multiplicity in the class diagram. Save the class diagram to a graphic file.

// 5.	Based on the created class diagram, define the classes in the programming language.
// Put the classes in a separate project. Then write a program that creates objects,
// assigns them attribute values, and calls the available methods.

public class Ex05 {
    public static void main(String[] args) {
        Processor p = new Processor("AMD Ryzen 9 7950X3D", 16, 4.2f);

        Computer c = new Computer();

        c.setCpu(p);
        c.setMotherboard("Asus ROG Strix X670E-E");
        c.setRam("G.Skill Trident Z5 RGB DDR5 (2 x 16GB) DDR5 6400");
        c.setGpu("Nvidia RTX 4090");
        c.setHardDrive("Samsung 990 Pro (4TB)");

        c.displaySpecs();
    }
}