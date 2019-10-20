package hu.test.e2e.enums;

public enum TestUsers {
    ADMIN("admin", "admin");

    private final String userLoginName;
    private final String usersPassword;

    TestUsers(final String user, final String userFullName){
        this.userLoginName = user;
        this.usersPassword = userFullName;
    }

    public String getUserName(){
        return this.userLoginName;
    }

    public String getUsersPassword(){
        return this.usersPassword;
    }
}
