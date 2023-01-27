class Solution {
  private int getBinaryGap(String binaryString) {
    if (binaryString.length() == 0) {
      return 0;
    }
    int gap = 0;
    while (gap != binaryString.length() && binaryString.charAt(gap) == '0') {
      gap++;
    }
    if (gap >= binaryString.length()) {
      return 0;
    }
    int index = gap;
    while (index != binaryString.length() && binaryString.charAt(index) == '1') {
      index++;
    }
    int nestedGap = getBinaryGap(binaryString.substring(index));
    return nestedGap > gap ? nestedGap : gap;
  }

  public int solution(int N) {
    String binaryString;
    binaryString = Integer.toBinaryString(N);
    return getBinaryGap(binaryString);
  }
}
