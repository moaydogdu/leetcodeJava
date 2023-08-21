public class Main {
    public static void main(String[] args) {
        //String[] strs = new String[]{};
        //String[] strs = new String[]{"test"};
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefixV3(strs));
    }

    /**
     * 1 ms algorithm.
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }

        if (strs.length == 1){
            return strs[0];
        }

        int length = strs[0].length();


        for(int i = 1; i< strs.length; i++){

            length = Math.min(length,strs[i].length());

            for (int j = 0; j < length; j++){
                char a = strs[0].charAt(j);
                char b = strs[i].charAt(j);

                if(a != b){
                    length = j;
                    break;
                }
            }

        }

        return strs[0].substring(0,length);
    }

    /**
     * 0 ms algorithm.
     * @param strs
     * @return
     */
    public static String longestCommonPrefixV2(String[] strs){
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){

            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }

        }

        return prefix;
    }

    /**
     * 1 ms algorithm.
     * @param strs
     * @return
     */
    public static String longestCommonPrefixV3(String[] strs){
        if(strs.length == 0){
            return "";
        }

        if (strs.length == 1){
            return strs[0];
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){

            if(prefix.length()>strs[i].length()){
                prefix = prefix.substring(0,strs[i].length());
            }

            for (int j = 0; j < prefix.length(); j++){
                if(
                        prefix.charAt(j) != strs[i].charAt(j)
                ){
                    prefix = prefix.substring(0,j);
                    continue;
                }
            }

        }

        return prefix;
    }
}