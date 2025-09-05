package cms.user;

public class EditorUser extends User {

    public EditorUser(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getRole() {
        return "EDITOR";
    }
}
