public class Mesa {
    private boolean isFree;
    public Mesa(){
        this.isFree = true;
    }
    public void ocupaMesa()
    {
        this.isFree = false;
    }

}
