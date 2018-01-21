package User.domain;

public enum Gender {
    Male(0),
    Female(1),
    Secret(2);

    private int type;
    private Gender(int t){
        this.type = t;
    }
}
