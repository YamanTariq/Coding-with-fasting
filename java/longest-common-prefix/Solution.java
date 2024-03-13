//this is the initial solution that I thought of. I used a do while loop and a inner loop to traverse the letter
//I came across multiple run time errors due to my code not handling edge cases properly
//I realized that making this many "if" conditions was ineffective AND unreadable

//lessons learned: try to write code that is as simple as possible. 
//... multiple if else conditions can almost ALWAYS be reduced to 1 or two conditions only.
//... take more time thinking the solution of the problem rather than coding it
//... if it's an easy problem DONT think of a complex solution
//...instead go with the simple solution and write it concisely.

//the better version of the solution(same method) will be on the other file





class Solution {
    public String longestCommonPrefix(String[] strs) {

		byte counter = 0;
		char letter = ' ';
		String result = new String();
		result = "";
		
		boolean end = false;
		
		for (int j = 0; j < strs.length; j++){
			if (strs[j].length() == 0)
				return "";
		}
		
		do{
			
			
			for(int i = 0; i < strs.length; i++){
				
				//if this is the last letter of the word, make sure it breaks the next time				
				if (counter >= strs[i].length() - 1)
					end = true;

				//intialize value of letter
				if ( i == 0)
					letter = strs[i].charAt(counter);

				//if the current letter is different than the rest return the result
				if( letter != strs[i].charAt(counter))
					return result;
								

			}
			
			result += letter;
			counter++;
			
		} while(end != true);
		
		return result;
    }
}