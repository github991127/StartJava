package com.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.domain.Mankind;

/**
 * ClassName: LifeBookTest
 * Package: com.test
 * Description:
 *
 * @Author: Jimbo
 * @Create: 2023/11/6 19:31
 */
public class LifeBookTest {
    public static void main(String[] args) {
        welcome();
        opensystem();
    }

    private static void opensystem() {
        ArrayList<Mankind> list = new ArrayList<>();
        while (true) {
            System.out.println("1 添加，2 删除，3 修改，4 查看，5 退出");
            System.out.println("请输入您的选择:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    add(list);
                    break;
                case 2:
                    delete(list);
                    break;
                case 3:
                    update(list);
                    break;
                case 4:
                    select(list);
                    break;
                case 5:
                    System.out.println("退出成功");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }

        }
    }

    private static void select(ArrayList<Mankind> list) {
        if (list.isEmpty()) {
            System.out.println("名单无人");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        int index = findIndex(list, id);

        if (index == -1) {
            System.out.println("查无此人");
        } else {
            System.out.println(list.get(index).getId() + " " + list.get(index).getName() + " " + list.get(index).getAge() + " " + list.get(index).getBirthday() + " " + list.get(index).getDeathday());
        }
    }

    private static void update(ArrayList<Mankind> list) {
        if (list.isEmpty()) {
            System.out.println("名单无人");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        int index = findIndex(list, id);
        if (index == -1) {
            System.out.println("查无此人，修改失败");
        } else {
            Mankind m1 = list.get(index);
            System.out.println("请输入姓名");
            String name = scanner.next();
            m1.setName(name);
            System.out.println("请输入年龄");
            double age = scanner.nextDouble();
            m1.setAge(age);
            System.out.println("请输入生日");
            String birthday = scanner.next();
            m1.setBirthday(birthday);
            System.out.println("请输入忌日");
            String deathday = scanner.next();
            m1.setDeathday(deathday);

        }
    }

    private static void delete(ArrayList<Mankind> list) {
        if (list.isEmpty()) {
            System.out.println("名单无人");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        int index = findIndex(list, id);
        if (index == -1) {
            System.out.println("查无此人，删除失败");
        } else {
            list.remove(index);
            System.out.println("删除成功");
        }

    }

    private static void add(ArrayList<Mankind> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        while (true) {
            int id = scanner.nextInt();
            if (findIndex(list, id) != -1) {
                System.out.println("id重复，重新输入");
                continue;
            } else {
                System.out.println("请输入姓名");
                String name = scanner.next();
                System.out.println("请输入年龄");
                double age = scanner.nextDouble();
                System.out.println("请输入生日");
                String birthday = scanner.next();
                System.out.println("请输入忌日");
                String deathday = scanner.next();
                list.add(new Mankind(id, name, age, birthday, deathday));
                break;
            }
        }
    }

    private static int findIndex(ArrayList<Mankind> list, int id) {
        if (list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


    private static void welcome() {
        System.out.println("welcome");
        System.out.println("1 添加人类");
        System.out.println("2 删除人类");
        System.out.println("3 修改人类");
        System.out.println("4 查看人类");
        System.out.println("5 退出");

    }
}
