class Demo{
    public static int reverse(int x) {
        int num=0;
        while(x>0){
            num=num*10+x%10;
            x/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        
        System.out.println(reverse(120));
    }
}

