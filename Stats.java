  public class Stats{
    private double someHP;
    private double someAtt;
    private double someDef;
    private double someSpatt;
    private double someSpdef;
    private double someSpeed;

    public Stats (double someHP, double someAtt, double someDef, double someSpatt, double someSpdef, double someSpeed) {
        this.someHP = someHP;
        this.someAtt = someAtt;
        this.someDef = someDef;
        this.someSpatt = someSpatt;
        this.someSpdef = someSpdef;
        this.someSpeed = someSpeed;
    }
    
    public double getHP(){
        double d;
        d = (Double) java.lang.Math.floor(someHP);
        return d;
    }
    public double getAtt() {
        double d;
        d = (Double) java.lang.Math.floor(someAtt);
        return d;
    }
    public double getDef() {
        double d;
        d = (Double) java.lang.Math.floor(someDef);
        return d;
    }
    public double getspatt(){
        double d;
        d = (Double) java.lang.Math.floor(someSpatt);
        return d;
    }
    public double getspdef(){
        double d;
        d = (Double) java.lang.Math.floor(someSpdef);
        return d;
    }
    public double getspeed(){
        double d;
        d = (Double) java.lang.Math.floor(someSpeed);
        return d;
    }
    public void cetak(){
        try{
            Thread.sleep(200);
            System.out.println("***************STATUS***************");
            Thread.sleep(200);
            System.out.println("HP: "+ getHP());
            Thread.sleep(200);
            System.out.println("Attack: "+getAtt());
            Thread.sleep(200);
            System.out.println("Defense: "+getDef());
            Thread.sleep(200);
            System.out.println("Sp.Atk: "+getspatt());
            Thread.sleep(200);
            System.out.println("Sp.Def: "+getspdef());
            Thread.sleep(200);
            System.out.println("Speed: "+getspeed());
        } catch(Exception e){ 

        }
    }
}