package utils;

import utils.AjaxWaiter;

import java.util.Random;

public class Values {
    static Random random = new Random();
    static int random_id = random.nextInt(10000);
    static String randomid1 = String.valueOf(random_id);

    static String fullname = "rasim1234";
    static String VKN = randomid1;
    static String company = "Ronwell";
    static String phone = "05624521245";
    static String address = "Edirne";
    static String email = "rasim3@gmail.com";
    static String password = "1234";


    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Values.random = random;
    }

    public static int getRandom_id() {
        return random_id;
    }

    public static void setRandom_id(int random_id) {
        Values.random_id = random_id;
    }

    public static String getRandomid1() {
        return randomid1;
    }

    public static void setRandomid1(String randomid1) {
        Values.randomid1 = randomid1;
    }

    public static String getFullname() {
        return fullname;
    }

    public static void setFullname(String fullname) {
        Values.fullname = fullname;
    }

    public static String getVKN() {
        return VKN;
    }

    public static void setVKN(String VKN) {
        Values.VKN = VKN;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Values.company = company;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Values.phone = phone;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Values.address = address;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Values.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Values.password = password;
    }


}
