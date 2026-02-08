public class Comments {
    public static void main(String args[]) {

        //its a comment
        System.out.println("//its a comment with 2 backslash");

        /*
        line 1
        line 2
        line 3
        it's a multi line comment
        */
        System.out.println("/*\r\n" + //
                        "        line 1\r\n" + //
                        "        line 2\r\n" + //
                        "        line 3\r\n" + //
                        "        it's a multi line comment\r\n" + //
                        "        */");

    }
}
