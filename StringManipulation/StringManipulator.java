public class StringManipulator{
    public String trimAndConcat(String x, String y){
        String a = x.trim();
        String b = y.trim();
        return a + b;
    }

    public Integer getIndexOrNull(String x, char c){
        if (x.indexOf(c) != -1){
            return x.indexOf(c);
        }
        return null;
    }

    public Integer getIndexOrNull(String a, String b){
        if (a.indexOf(b) != -1){
            return a.indexOf(b);
        }
        return null;
    }

    public String concatSubstring(String a, int x, int y, String b){
        String newStr = a.substring(x,y);
        return newStr + b;
    }
}