package 数据结构与算法.Leetcode;

/** LeetCode000: 无重复字符的最长字串
 *
 *      问题描述:
 *          给定一个字符串, 请你找出其中不含有重复字符的最长子串的长度
 *
 *      示例:
 *          输入: s = "abcabcbb"
 *          输出: 3
 *          解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 *          输入: s = "bbbbb"
 *          输出: 1
 *          解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 *          输入: s = "pwwkew"
 *          输出: 3
 *          解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 *          输入: s = ""
 *          输出: 0
 */
public class LeetCode_0003 {

    public static void main(String[] args) {
        String s = "abcabd";
        System.out.println(s.charAt(3));
        int solution = lenthOfLongestSubstring(s);
        System.out.println(solution);
    }

    public static int lenthOfLongestSubstring(String s){
        int stIdx = 0, maxLen = 0;
        int arr[] = new int[128];
        for (int i = 0; i < s.length(); i++){
            stIdx = Math.max(arr[s.charAt(i)], stIdx);
            maxLen = Math.max(maxLen, i - stIdx + 1);
            arr[s.charAt(i)] = i + 1;
        }
        return maxLen;
    }

}
