class ExemploArgs{
    public static void main(String[] args){
        int i;
        for ( i = 0; i < args.length; i++){
            // This, however, I was not aware of. It is good to learn. More knowledge to use.
            // Lack of arg does not stop the execution
            System.out.println( args[i] );
        }
    }
}