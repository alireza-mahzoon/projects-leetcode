package se.almstudio.projects.leetcode.demo;

public class UserService {
  private final UserManager manager;

  public UserService() {
    this(new UserManager());
  }

  public UserService(UserManager manager) {
    this.manager = manager;
  }

  public void save(String name) {
    manager.save(name);
  }
}
