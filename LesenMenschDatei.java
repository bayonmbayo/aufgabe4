import java.io.*;

public class LesenMenschDatei {

		public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
			Mensch[] daten;
			Mensch[] serialdaten;
			int arrayLaenge;
			try(BufferedReader in = new BufferedReader(new FileReader("datei.txt"))){
				arrayLaenge = Integer.parseInt(in.readLine());
				daten = new Mensch[arrayLaenge];
				
				for(int i = 0; i < arrayLaenge; i++){
					String name = in.readLine(); 
					double groesse = Double.parseDouble(in.readLine());
					int alter = Integer.parseInt(in.readLine());
					daten[i] = new Mensch(name,groesse,alter);
				}
				
				for(int i = 0; i < 5; i++){
					System.out.println(daten[i].toString());
				}
				
				
			}
			
			try(FileOutputStream fos = new FileOutputStream("datei2");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
						
						for(int i = 0; i < arrayLaenge; i++){
							oos.writeObject(daten[i]);
						}
			System.out.println("\n");			
			System.out.println("Serialisation von Daten................ in \"datei2\" \n\n");			
						
					}	
			try(FileInputStream fos = new FileInputStream("datei2");
					ObjectInputStream oos = new ObjectInputStream(fos)){
							serialdaten = new Mensch [arrayLaenge];
							for(int i = 0; i < arrayLaenge; i++){
								serialdaten[i] = (Mensch) oos.readObject();
								System.out.println(serialdaten[i].toString());
							}
							
						}	
			
		}
}
