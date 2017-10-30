public class StringManipulator{
    public String trimAndConcat(String str1 , String str){
        String ninja = String.format("%s%s", str1.trim(), str1.trim());
        return ninja;
    }

    public Integer getIndexOrNull(String str, char letter){
        int idx = str.indexOf(letter);
        return idx == -1 ? null : idx;
    }
    public String concatSubstring(String, int, int, String)
        String substring = string1.substring(int1, int2);
        return substring + string2;
    }
}