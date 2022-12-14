import java.util.Scanner;

public class Hotel {
    Scanner sc = new Scanner(System.in);
    String name;
    String egene;
    int numberofstays;
    double usedbedprice;
    String town;

    public void Menu() {
        String start = "Hello! Welcome to our hotel! Please pick your options below vvv";
        String start1 = sc.nextLine();
    }
    public void Semeistvo() {

        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Semeen");
                break;
            case 2:
                System.out.println("Nesemeen");
            default:
                System.out.println("Molq napishi 1 ili 2 shtoto ne mi plashtat dostatychno da ti dam pravoto da pishesh 3");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgene() {
        return egene;
    }

    public void setEgene(String egene) {
        this.egene = egene;
    }

    public int getNumberofstays() {
        return numberofstays;
    }

    public void setNumberofstays(int numberofstays) {
        this.numberofstays = numberofstays;
    }

    public double getUsedbedprice() {
        return usedbedprice;
    }

    public void setUsedbedprice(double usedbedprice) {
        this.usedbedprice = usedbedprice;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", egene='" + egene + '\'' +
                ", numberofstays=" + numberofstays +
                ", usedbedprice=" + usedbedprice +
                ", town='" + town + '\'' +
                '}';
    }



}

