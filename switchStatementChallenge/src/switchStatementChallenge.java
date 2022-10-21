public class switchStatementChallenge {
    public static void main(String[] args) {
        char switchValue = 'E';
        switch(switchValue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchValue+" is found");
                break;
            default:
                System.out.println("Not found");

        }
    }
}
