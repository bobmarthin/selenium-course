package Main;

public class Client {
    private int id;
    public Client(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Client client = (Client) that;
        if (this.id!= client.id)
            return false;
        return true;
    }

}
