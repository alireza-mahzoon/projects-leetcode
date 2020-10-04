package se.almstudio.projects.leetcode.service;

public class DefangingAnIPAddress {
  public String defangIPaddr(String address) {

    String ipAddress = address.replace(".", "[.]");
    return ipAddress;
  }
}
