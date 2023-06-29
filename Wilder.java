public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String whoAmI(){
        if(isAware()){
            return "My name is " + getFirstName() + ", and i am aware.";
        } else {
            return "My name is " + getFirstName() + ", and i am not aware.";
        }
    }

}

