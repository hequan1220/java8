package com.example.java8.lamda;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class BrainTrainer {

    //1.排序
    //2.循环
    //3.递归
    //4.行转列，列转行
    //5.算法
    public static void main(String[] args) {
        //自定义排序
        sort();
        //选择排序
        selectSort();
        //冒泡排序
        bubblingSort();
        //插入排序
        insertSort();
        //递归调用
        dealMenu();
        //阶乘
        factorial(100);
        //斐波那锲
        fibonacci(100);
    }

    /***
     * @Author 贺权
     * @Description 计算阶乘的方法，典型的递归方法
     * @Date 11:21 2022-02-15
     * @param n
     * @return int
     **/
    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    /***
     * @Author 贺权
     * @Description 计算斐波那契数列的方法:斐波纳契数列以如下被以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）
     * @Date 11:21 2022-02-15
     * @param n
     * @return int
     **/
    public static int fibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /***
     * @Author 贺权
     * @Description 组装父子菜单
     * @Date 11:19 2022-02-15
     * @param
     * @return void
     **/
    public static void dealMenu() {
        Menu menu1 = new Menu(1, 0, "目录1", null);
        Menu menu2 = new Menu(2, 0, "目录2", null);
        Menu menu3 = new Menu(3, 1, "目录1-3", null);
        Menu menu4 = new Menu(4, 1, "目录1-4", null);
        Menu menu5 = new Menu(5, 2, "目录2-5", null);
        Menu menu6 = new Menu(6, 2, "目录2-6", null);
        List<Menu> menuList = Lists.newArrayList();
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        menuList.add(menu5);
        menuList.add(menu6);
        Map<Integer, List<Menu>> menuGroupMap = menuList.stream().collect(Collectors.groupingBy(Menu::getPid));
        List<Menu> rootMenuList = menuGroupMap.getOrDefault(0, Collections.emptyList());
        List<Menu> menuTree = getMenuTree(rootMenuList, menuGroupMap);
        System.out.println(JSONArray.toJSONString(menuTree));
    }

    /***
     * @Author 贺权
     * @Description 递归调用获取父子菜单
     * @Date 11:19 2022-02-15
     * @param rootMenuList
     * @param menuGroupMap
     * @return java.util.List<com.example.java8.lamda.Menu>
     **/
    public static List<Menu> getMenuTree(List<Menu> rootMenuList, Map<Integer, List<Menu>> menuGroupMap) {
        List<Menu> menuList = Lists.newArrayList();
        for (Menu rootMenu : rootMenuList) {
            Menu cloneMenu = (Menu) rootMenu.clone();
            List<Menu> subMenus = menuGroupMap.getOrDefault(rootMenu.getId(), Collections.emptyList());
            List<Menu> subMenuList = getMenuTree(subMenus, menuGroupMap);
            cloneMenu.setSubMenuList(subMenuList);
            menuList.add(cloneMenu);
        }
        return menuList;
    }

    /***
     * @Author 贺权
     * @Description 冒泡排序
     * @Date 11:19 2022-02-15
     * @param
     * @return void
     **/
    public static void bubblingSort() {
        int[] array = {8, 5, 3, 2, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /***
     * @Author 贺权
     * @Description 选择排序
     * @Date 11:19 2022-02-15
     * @param
     * @return void
     **/
    public static void selectSort() {
        int[] array = {8, 5, 3, 2, 4};
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    /***
     * @Author 贺权
     * @Description 插入排序
     * @Date 11:19 2022-02-15
     * @param
     * @return void
     **/
    public static void insertSort() {
        int[] array = {8, 5, 3, 2, 4};
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /***
     * @Author 贺权
     * @Description 自定义排序
     * @Date 11:19 2022-02-15
     * @param
     * @return void
     **/
    public static void sort() {
        Beauty beauty10 = new Beauty("10岁少女", 10);
        Beauty beauty20 = new Beauty("20岁美女", 20);
        Beauty beauty30 = new Beauty("30岁妇女", 30);
        List<Beauty> beautyList = Lists.newArrayList();
        beautyList.add(beauty10);
        beautyList.add(beauty20);
        beautyList.add(beauty30);
        //1.类实现Comparable接口
        Collections.sort(beautyList);
        //2.函数式接口写法
        Collections.sort(beautyList, (preBeauty, nextBeauty) -> {
//                return preBeauty.getAge().compareTo(nextBeauty.getAge());
            return nextBeauty.getAge().compareTo(preBeauty.getAge());
        });
        beautyList.stream().forEach(beauty -> {
            System.out.println(beauty);
        });

        //3.实现Comparator接口
        Integer[] numArray = {1, 2, 3};
        MyComparator myComparator = new MyComparator();
        Arrays.sort(numArray, myComparator);
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}

@Data
@AllArgsConstructor
class Beauty implements Comparable<Beauty> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(Beauty nextBeauty) {
//        return this.getAge().compareTo(nextBeauty.getAge());
        return nextBeauty.getAge().compareTo(this.getAge());
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer pre, Integer next) {
        if (pre > next) {
            return 1;
        } else if (pre < next) {
            return -1;
        } else {
            return 0;
        }
    }
}

@Data
@AllArgsConstructor
class Menu implements Cloneable {
    private int id;
    private int pid;
    private String name;
    private List<Menu> subMenuList;

    @Override
    public Object clone() {
        Menu menu = null;
        try {
            menu = (Menu) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return menu;
    }
}