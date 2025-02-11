class string{
    public static void main(String[] args){
        String name = "vscode";
        int size = name.length(); //to find the length of the string it is just like the strlen function of c 
        System.out.println("size of the string is: "+size);

        String str1 = "AsHuGoswAMi";

        String lowerstr = str1.toLowerCase();
        System.out.println("lower string is: "+ lowerstr);

        String upperstr = str1.toUpperCase();
        System.out.println("upper string is: "+ upperstr);
    }
}