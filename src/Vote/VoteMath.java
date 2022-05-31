package Vote;

public abstract class VoteMath implements IVoting{
    private String name;
    private String surname;
    private int vot;
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
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
