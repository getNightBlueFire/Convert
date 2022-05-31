package Vote;

public abstract class VoteMath implements IVoting{
    //ivate int id = 1;
    private String name;
    private String surname;
    private int vot;
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getVot() {
        return vot;
    }

    public void setVot(int vot) {
        this.vot = vot;
    }

    @Override
    public String toString() {
        return "VoteMath{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", vot=" + vot +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
