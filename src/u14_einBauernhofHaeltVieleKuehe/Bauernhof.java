package u14_einBauernhofHaeltVieleKuehe;

public class Bauernhof {
    private String name;
    private int anzKuehe;
    private int maxKuehe;
    private MilchKuh[] kuehe;

    public Bauernhof(String name, int maxKuehe) {
        this.name = name;
        this.maxKuehe = maxKuehe;
        kuehe = new MilchKuh[maxKuehe];
    }

    public void addKuh(MilchKuh kuh) {
        assert anzKuehe < maxKuehe;
        kuehe[anzKuehe] = kuh;
        anzKuehe++;
    }

    public void kueheAuflisten() {
        System.out.printf("Tierbestand Bauernhof %s\n", name);
        System.out.println("--------------------------");
        for(int i = 0; i < anzKuehe; i++) {
            System.out.println(kuehe[i]);
        }
        System.out.println("--------------------------");
    }
}
