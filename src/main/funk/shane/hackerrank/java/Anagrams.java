/*
 *   Copyright (c) 2020 Shane Funk - Javaseeds Consulting
 *   All rights reserved.

 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 
 *   The above copyright notice and this permission notice shall be included in all
 *   copies or substantial portions of the Software.
 
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *   SOFTWARE.
 */

package funk.shane.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shane on 9/28/2015.
 */
public class Anagrams {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String a = sc.nextLine();
        final String b = sc.nextLine();

        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        System.out.println( (Arrays.toString(achar).equalsIgnoreCase(Arrays.toString(bchar))) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();
        char[] achar = A.toCharArray();
        char[] bchar = B.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        return (Arrays.toString(achar).equals(Arrays.toString(bchar)));
    }

}
