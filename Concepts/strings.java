class strings {
    public static void main(String[] args) {
        // delcaration of Strings
        String str = new String("Hello");
        String str2 = new String("World");
        // + operator used to concatinate two strings
        System.out.println(str + " " + str2);
        // length method used to print the size of string
        System.out.println(str.length());
        // to get a charecter at any index we use chatAt method
        System.out.println(str.charAt(2));
        // to compare to string dont use == in java
        // we use equals mehtod and compareTo method for compare
        System.out.println(str.equals(str2)); // returns true if both equal otherwise false
        // if str > str2 returns positve value
        // if str < str2 returns negative value
        // if str = str2 returns 0
        System.out.println(str.compareTo(str2));
        // to make substring we use substring method
        System.out.println(str.substring(2)); // prints index 2 to end
        System.out.println(str2.substring(1, 3)); // prints 1 to 3-1
        // convert strings to integer we use parseInt method
        String value = new String("234");
        int number = Integer.parseInt(value);
        System.out.println(number);
        // convert integer to string we use toString method
        str = Integer.toString(number+10);
        System.out.println(str);

        // StringBuilder are mutable strings unlike String
        // Declaration
        StringBuilder sb = new StringBuilder("Earth");
        // all methods from string are available in StringBuilder
        // set charecter at index (setCharAt)
        sb.setCharAt(0, 'g');
        System.out.println(sb);
        // insert charcter at any index
        sb.insert(1, 'e');
        System.out.println(sb);
        // delete method to delete char at index
        sb.delete(0, 1); // deleted start to end - 1
        System.out.println(sb);
        // append method use to add(append) string or charecter at the end
        sb.append(" is round");
        System.out.println(sb);
        //convert stringBuilder to string
        number = Integer.parseInt(sb.toString());
    }
}