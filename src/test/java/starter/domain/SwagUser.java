package starter.domain;

public enum SwagUser {
    Colin("standard_user", "secret_sauce");

    public final String username;
    public final String password;

    SwagUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
