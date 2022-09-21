package u14_einBauernhofHaeltVieleKuehe;

public class MilchKuh {
    private String name;
    private int alter;
    private int gewicht;

    public MilchKuh(String name, int alter, int gewicht) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return String.format("""
                %s\t \
                %d J\t \
                %d kg\t \
                """, name, alter, gewicht);
    }
}
