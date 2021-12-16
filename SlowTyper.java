public abstract class SlowTyper
{
    public static void print(int milliseconds, String word) {
        char[] x = word.toCharArray();
        for(int i = 0; i < x.length; i++) {
            try {
                Thread.sleep(milliseconds);
                System.out.print(x[i]);
            } catch(Exception e) {
                System.err.println("Error in SlowTyper.print(): " + e.toString());
                break;
            }
        }
    }
}
