package cms.user;

public class AdminUser extends User {

    public AdminUser(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}
