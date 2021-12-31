package practice.compression;

import java.util.ArrayList;
import java.util.List;

public class CpsSolution {

    public int solution(String s) {
        int answer = 0;
        int maxLiteral = getMaxLiteral(s);
        if(maxLiteral == 0) {
            return s.length();
        }

        for(int i = 0; i < maxLiteral; i++) {
            List<String> stringBuffer = convertStringBuffer(s, i + 1);
            String output = "";
            int isSame = 0;
            for(int j = 0 ; j < stringBuffer.size() ; j++ ) {
                if (j == stringBuffer.size() - 1) {
                    if(isSame > 0 ) {
                        output += (isSame + 1) + stringBuffer.get(j);
                    } else {
                        output += stringBuffer.get(j);
                    }
                } else {
                    if(stringBuffer.get(j).equals(stringBuffer.get(j+1))) {
                        isSame++;
                    } else {
                        if(isSame > 0 ) {
                            output += (isSame + 1) + stringBuffer.get(j);
                        } else {
                            output += stringBuffer.get(j);
                        }
                        isSame = 0;
                    }
                }
            }
            answer = i == 0 ? output.length() : (Math.min(answer, output.length()));
        }
        return answer;
    }

    public int getMaxLiteral(String str) {
        return (str.length() / 2);
    }

    public List<String> convertStringBuffer(String str, int cutLength) {
        List<String> buffer = new ArrayList<>();
        for(int i = 0; i < (str.length() / cutLength); i++) {
            int startIdx = i*cutLength;
            buffer.add(str.substring(startIdx, startIdx + cutLength));
        }
        if(str.length() % cutLength != 0) {
            String extraStr = str.substring((str.length() / cutLength)*cutLength);
            buffer.add(extraStr);
        }
        return buffer;
    }
}
