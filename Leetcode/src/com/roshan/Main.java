package com.roshan;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String[] stars = {"flower", "flo", "flow"};

        String res = longestCommonPrefix(stars);
        System.out.println(res);
//        boolean res = isValid("()");
//        System.out.println(res);

//        int[] numbs = {2,7,11,15};
//        int target = 9;
//        int[] res = twoSum(numbs,target);
//        System.out.println(res);

    }

    // two sum
//    public static int[] twoSum(int[] numbers, int target) {
//        HashMap indexMap = new HashMap();
//        for (int i = 0; i < numbers.length; i++) {
//            Integer requiredNum =  (target - numbers[i]);
//            if (indexMap.containsKey(requiredNum)) {
//                return new int[]{(int) indexMap.get(requiredNum), i};
//            }
//
//            indexMap.put(numbers[i], i);
//        }
//        return null;
//    }
//}
    // merging two list in sorted way
//    public static <ListNode> ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode pointerOne = list1, pointerTwo = list2;
//        ListNode merged = null, temp = null;
//
//        if (pointerOne == null) {
//            return pointerTwo;
//        } else if (pointerTwo == null) {
//            return pointerOne;
//        }
//
//        if (pointerOne.val <= pointerTwo.val) {
//            merged = pointerOne;
//            pointerOne = pointerOne.next;
//        } else {
//            merged = pointerTwo;
//            pointerTwo = pointerTwo.next;
//        }
//
//        temp = merged;
//        while (pointerOne != null && pointerTwo != null) {
//            if (pointerOne.val <= pointerTwo.val) {
//                temp.next = pointerOne;
//                pointerOne = pointerOne.next;
//            } else if (pointerOne.val > pointerTwo.val) {
//                temp.next = pointerTwo;
//                pointerTwo = pointerTwo.next;
//            }
//            temp = temp.next;
//        }
//
//        if (pointerOne != null) {
//            temp.next = pointerOne;
//        }
//
//        if (pointerTwo != null) {
//            temp.next = pointerTwo;
//        }
//
//        return merged;
//    }

    // valid parenthesis
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (char var : s.toCharArray()) {
//            if (var == '(' || var == '[' || var == '{' ) {
//                stack.push(var);
//            } else {
//                if ( !stack.empty() && var ==  ')' && stack.peek() == '(')
//                    stack.pop();
//                else if ( !stack.empty() && var ==  ']' && stack.peek() == '[')
//                    stack.pop();
//                else if ( !stack.empty() && var ==  '}' && stack.peek() == '{')
//                    stack.pop();
//                else
//                    return false;
//            }
//        }
//        return stack.empty();
//    }
//}

    // longest Common Prefix
    public static String longestCommonPrefix(String[] stars) {
        if (stars == null || stars.length == 0) return "";

        for (int i = 0; i < stars[0].length(); i++) {
            char c = stars[0].charAt(i);
            for (int j = 1; j < stars.length; j++) {
                if (stars[j].charAt(i) != c || i == stars[j].length())
                    return stars[0].substring(0, i);
            }
        }
        return stars[0];

    }
}

