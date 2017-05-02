package composite;


public class CompositeMain {

	public static void main(String[] args) {
		try {
            Directory rootdir = new Directory("root");

            Directory usrdir = new Directory("usr");
            rootdir.add(usrdir);

            Directory yuki = new Directory("yuki");
            usrdir.add(yuki);

            File file = new File("Composite.java", 100);
            yuki.add(file);

            System.out.println("");
            System.out.println("file = " + file.getFullPath());     
            System.out.println("yuki = " + yuki.getFullPath());     
            System.out.println("rootdir = " + rootdir.getFullPath());
            System.out.println("usrdir = " + usrdir.getFullPath());
            


		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}

	}
}
