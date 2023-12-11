// 8.	A files system is a way of storing data on a storage device. The data is organised in computer files and folders.
// A folder is a container, where many files can be placed. Create a class diagram that shows classes for a folder and file,
// their attributes and methods, and their relationships. Assume that a folder can contain any number of files
// and does not contain other folders. Then, define the classes, their attributes and methods.
// To store any number of files in a folder, you can use a resizable array such as ArrayList. Finally, write a program that:
//     a.	Create a folder
//     b.	Add two files to the folder
//     c.	Display the folder contents
//     d.	Add another file to the folder
//     e.	Display the folder contents 
//     f.	Remove the named file from the folder
//     g.	Display the folder contents 


public class Ex08 {
    public static void main(String[] args) {
        Folder c = new Folder("example_folder");
        
        c.addFile("list.txt");
        c.addFile("photo.jpg");

        c.display();

        c.addFile("document.docx");

        c.display();

        c.remFile("list.txt");

        c.display();
    }
}