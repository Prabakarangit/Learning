package learn.java;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        //1. Find the second highest number in a list
        List<Integer> nums = List.of(5, 9, 11, 2, 8, 21, 1);
        int ans = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(ans);
       // 2. Find frequency of each character in a string
        String s = "banana";
        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        //3. Find duplicate elements in a list
        List<Integer> nums1 = List.of(1, 2, 3, 4, 2, 3, 5);
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> duplicateValues = nums1.stream().filter(x->!integerSet.add(x)).toList();
        //4. Find first non-repeating character in a string
        String swiss = "swiss";
        Character nonRepeating = swiss.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry-> entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
       // 5. Sum of squares of even numbers
        List<Integer> nums2 = List.of(1, 2, 3, 4, 5);
        int sum = nums2.stream()
                .filter(n->n%2==0)
                .mapToInt(n->(int)n*n)
                .sum();
        //6. Group employees by department
        record Employee(String name, String dept) {}
        List<Employee> emps = List.of(
                new Employee("Ravi", "IT"),
                new Employee("Kumar", "HR"),
                new Employee("Raj", "IT"));
       Map<String, List<Employee>> depMap = emps.stream().collect(Collectors.groupingBy(Employee::dept));
       //7. Find max salary employee in each department
        record Employee1(String name, String dept, int salary) {}
        List<Employee1> emps1 = List.of(
                new Employee1("Ravi", "IT", 5000),
                new Employee1("Kumar", "HR", 4000),
                new Employee1("Raj", "IT", 7000),
                new Employee1("John", "HR", 4500));
       Map<String, Optional<Employee1>> deptSalaryMap  = emps1.stream(). collect(Collectors.groupingBy(Employee1::dept, Collectors.maxBy(Comparator.comparing(employee1 -> employee1.salary()))));
     // 8. Convert List<String> to comma-separated String
        List<String> names = List.of("Ravi", "Kumar", "Raj");
        String joinedString = names.stream().collect(Collectors.joining(","));
       // 9. Find common elements between two lists
        List<Integer> l1 = List.of(1, 2, 3, 4);
        List<Integer> l2 = List.of(3, 4, 5, 6);
        List<Integer> res = l2.stream().filter(e->l1.contains(e)).toList();

        //10. Sort a Map by values using Streams
        Map<String, Integer> map1 = Map.of("A", 3, "B", 5, "C", 1);

        map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));

      //11. Problem: From a list of transactions, get the names of top 3 customers by total transaction amount.
        record Txn(String name, double amount) {}
        List<Txn> txns = List.of(
                new Txn("Ravi", 5000),
                new Txn("Raj", 10000),
                new Txn("Ravi", 7000),
                new Txn("Kumar", 3000)
        );
        txns.stream().collect(Collectors.groupingBy(Txn::name, Collectors.summingDouble(Txn::amount)))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        //even numbers
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.stream().filter(n->n%2==0).toList();

        List<String> nameList = List.of("ravi", "raj", "kumar");
        nameList.stream().map(String::toUpperCase).toList();

        List<Integer> numsList = List.of(10, 23, 11, 54, 19);
        numsList.stream().map(String::valueOf).filter(num->num.startsWith("1")).toList();

        List<String> countLengthGreaterThan3 = List.of("Hi", "Java", "Code", "is", "fun");
        countLengthGreaterThan3.stream().filter(str -> str.length() >3).count();

        List<Integer> sumList = List.of(2, 4, 6, 8);
        sumList.stream().reduce(0,Integer::sum);

        List<Integer> l = List.of(1, 2, 3, 2, 4, 1, 5);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = l.stream().filter(i-> !set.add(i)).toList();
        List<Integer> unique = l.stream().distinct().toList();
        int max = l.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = l.stream().mapToInt(Integer::intValue).min().getAsInt();

        List<Integer> elements = List.of(5, 8, 12, 3, 15);
        int  ae = elements.stream().filter(e->e>10).findFirst().get();


        List<String> namesList = List.of("Java", "Streams", "API");
        String ansJoined = namesList.stream().collect(Collectors.joining(","));

        List<String> words = List.of("hi", "hello", "bye", "code");
        Map<Integer, List<String>> lengthMap = words.stream().collect(Collectors.groupingBy(w->w.length()));

        List<String> namesFreq = List.of("Raj", "Ravi", "Raj", "Kumar");
        namesFreq.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));

        Map<String, List<Employee>> depGrpMap = emps.stream().collect(Collectors.groupingBy(Employee::dept));

        Map<String, Double> avgSalaryByDept = emps1.stream().collect(Collectors.groupingBy(Employee1::dept, Collectors.averagingDouble(Employee1::salary)));

        Map<String, Optional<Employee1>> maxSalaryByDept = emps1.stream().collect(Collectors.groupingBy(Employee1::dept, Collectors.maxBy(Comparator.comparing(Employee1::salary))));

        List<List<Integer>> flat = List.of(List.of(1,2), List.of(3,4), List.of(5));
        flat.stream().flatMap(x->x.stream()).collect(Collectors.toList());


        List<Integer> top3 = List.of(10, 2, 35, 45, 12, 78, 5);
        top3.stream().sorted(Comparator.reverseOrder()).limit(3);


    }





}
