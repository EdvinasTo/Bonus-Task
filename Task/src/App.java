public class App {
    public static void main(String[] args) throws Exception {
        TaskUtils utils = new TaskUtils();
        System.out.println(utils.compress("aaabb"));
        System.out.println(utils.compress("abc"));   
        System.out.println(utils.compress(""));      

        System.out.println(utils.decompress("a3b2"));
        System.out.println(utils.decompress("a1b1c1"));
        System.out.println(utils.decompress(""));
    }
}