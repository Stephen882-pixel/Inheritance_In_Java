package Second_Inheritance;

public class Main {

    public static void main(String[] args){
        HP h = new HP();
        Dell d = new Dell();
        Toshiba t = new Toshiba();


        h.setCore_processor(" core i7 ");
        h.setCost(30000);
        h.setColor(" Grey ");
        h.setRAM(" 8GB ");
        h.setSpeed(" 2.1GHz ");


        d.setCore_processor(" core i9 ");
        d.setCost(450000);
        d.setColor(" Black ");
        d.setRAM(" 16GB ");
        d.setSpeed(" 2.7GHz ");

        t.setCore_processor(" core i5 ");
        t.setCost(40000);
        t.setColor(" Grey ");
        t.setRAM(" 4GB ");
        t.setSpeed(" 2.5Ghz ");

        //System.out.println("The core processor is :" + h.getCore_processor());
        System.out.println(" The HP laptop has got the following properties: ");
        System.out.println(" Cost is : " + h.getCost());
        System.out.println(" Color is : " + h.getColor());
        System.out.println(" RAM is : " + h.getRAM());
        System.out.println(" Speed is : " + h.getSpeed());
        System.out.println(" Core Processor is : " + h.getCore_processor());

        System.out.println(" The Dell laptop has got the following properties: ");
        System.out.println(" Cost is : " + d.getCost());
        System.out.println(" Color is : " + d.getColor());
        System.out.println(" RAM is : " + d.getRAM());
        System.out.println(" Speed is : " + d.getSpeed());
        System.out.println(" Core Processor is : " + d.getCore_processor());

        System.out.println(" The Toshiba laptop has got the following properties: ");
        System.out.println(" Cost is : " + t.getCost());
        System.out.println(" Color is : " + t.getColor());
        System.out.println(" RAM is : " + t.getRAM());
        System.out.println(" Speed is : " + t.getSpeed());
        System.out.println(" Core Processor is : " + t.getCore_processor());

    }
}
