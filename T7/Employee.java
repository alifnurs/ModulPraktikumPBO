public abstract class Employee {
    private String name;
    private String noKTP;
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP());
    }
    public abstract double earnings();//pendapatan
}