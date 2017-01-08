//Alice and Bob are playing a new game of stones. There are N
//stones placed on the ground, both picks up stones consecutively
//If the number of stone left is odd, Alice wins. Otherwise, Bob wins.
//Assume both Alice and Bob play optimally and Alice plays first, do you know who the winner is?

//Sample solution for https://open.kattis.com/problems/twostones

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoStones {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int stones = Integer.parseInt(reader.readLine());
		System.out.println(stones % 2 == 1 ? "Alice" : "Bob");
	}
}