public class Practice_1_1_4 {
    public static void main(String[] args) {
        String s = "abbceedfff";
        String[] sArr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] == sArr[i + 1]) {
                s.replace(sArr[i+1],"").replace(sArr[i], "");
            }
        }
        System.out.println(s);
    }
}
