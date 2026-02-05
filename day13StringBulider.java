public class day13StringBulider {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Aditya");
        System.out.println(sb);
        //Char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0, '@');
        System.out.println(sb);

        //Insert
        sb.insert(0,'@');
        System.out.println(sb);

        // Delete
        sb.delete(2,5);
        System.out.println(sb);

        //Append
//        StringBuilder sb = new StringBuilder("A");
        sb.append("d");//str = str + "e"     IN CASE OF STRING.
        sb.append("i");//str = str + "i"
        sb.append("t");
        sb.append("y");
        sb.append("a");
        System.out.println(sb);
        System.out.println(sb.length());

     // Que:Reverse a string.

//     StringBuilder sb = new StringBuilder("Aditya");
        for (int i=0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;//6-1=5
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    
    }
}
