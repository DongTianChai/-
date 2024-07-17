package Unite9Setpract;

import java.util.Objects;

public class Account {
    private String username;
    private String cipher;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public Account(String username, String cipher) {
        this.username = username;
        this.cipher = cipher;
    }

    public Account(String username) {
        this.username = username;
    }

    public Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(username, account.username) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", cipher='" + cipher + '\'' +
                '}';
    }
}
