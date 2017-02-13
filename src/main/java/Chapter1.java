/**
 * </p>
 * <pre>
 *
 * </pre>
 *
 * @author <a href="mailto:kiora1120@sk.com">TJune</a>
 * @version 0.8.0
 * @since 0.8.0
 */
public class Chapter1 {


    public static void main(String[] args){
        Chapter1 chapter1 = new Chapter1();
        chapter1.exam1_5();
    }

    private void exam1_5() {
        String toBeExtract = "aabccccccccaaa";
//        String toBeExtract = "abcd";
        String result = "";
        int skipIdx = 0;
        for(int i=skipIdx; i < toBeExtract.length(); i++){
            char charAt = toBeExtract.charAt(i);
            skipIdx = getCount(charAt, toBeExtract, i);
            result += charAt+""+skipIdx;
            i = i+(skipIdx-1);
        }

        if(toBeExtract.length() >= result.length()){
            System.out.println(result);
        }   else {
            System.out.println(toBeExtract);
        }

    }

    private int getCount(char charAt, String toBeExtract, int i) {
        int duplCnt = 1;
        int nextIdx = i+1;
        try {
            char charAt1 = toBeExtract.charAt(nextIdx);
            if(charAt == charAt1){
                duplCnt+=getCount(charAt,toBeExtract, nextIdx);
            }else{
                return duplCnt;
            }
        } catch (Exception e) {
//            System.out.println(charAt+":"+duplCnt+":"+e.getMessage());
        }
        return duplCnt;

    }
}
