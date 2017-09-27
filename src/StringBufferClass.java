public class StringBufferClass {
    public static void main(String [] args){
        String name = "Tai Tri Phan";
        String fullname = new String("Tai Tri Phan");
        StringBuffer bufName = new StringBuffer("TAIPHAN");
        StringBuffer fullname1 = new StringBuffer("TP");

        int cap = bufName.capacity();
        int lenght = bufName.length();
        bufName.replace(1,7,"JoKeR");
        fullname1.append("joKeR");

        System.out.println(cap);
        System.out.println(lenght);
        System.out.println(bufName);
        System.out.println(fullname1);

    }
}