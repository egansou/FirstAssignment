 
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
    	if (array.length >= 1){
    		return array[0];
    	}
    	else return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
    	if(array.length >= 2){
    		return array[1];
    	}
    	else return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array.length >= 1){
        	return array[array.length - 1];        }
        else return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
    	if(array.length >= 2){
    		return array[array.length - 2];
    	}
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
    	for (int i = 0; i < array.length; i++){
    		if(array[i].equals(value)){
    			return true;
    		}
    	}
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
    	
    	int len = array.length;
    	
    	String temp;
  
    	for (int i = 0; i < len/2; i++){
    		temp = array[i];
    		array[i] = array[len - 1 - i];
    		array[len - 1 - i] = temp;
    	}
    	
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
    	
    	int len =  array.length;
    	for (int i = 0; i < len/2; i++){
    		if ( !(array[i].equals(array[len - 1 - i])) ){
    			return false;
    		}
    	}
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
    	
    	int len = array.length;   	
    	
    	HashSet<Character> letters = new HashSet<Character>();
    	
    	HashSet<Character> alphabet = new HashSet<Character>();
    	
    	for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
    		alphabet.add(c);
    	}
    	
    	char [] characters;	
    	
    	for(int i = 0; i < len; i++){
    		 characters = array[i].toLowerCase().toCharArray();
    		 
    		 for ( char c : characters){
    			 letters.add(c);
    		 }	
    	} 
    	
    	if (letters.containsAll(alphabet)) return true;
    	else return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
    	
    	int count = 0;
    	int len = array.length;
    	
    	for ( int i = 0; i < len; i++){
    		if (array[i].equals(value)){
    			count++;
    		}
    	}
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
    	
    	ArrayList<String> arr = new ArrayList<String>();
    
    	
    	for(int i = 0; i < array.length; i++){
    		if(!(array[i].equals(valueToRemove))){
    			arr.add(array[i]);
    		}
    	}
    
        return arr.toArray(new String[arr.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    	
    	if (array.length < 2) return array;
    	
    	int i = 0, j = i + 1;
    	ArrayList<String> arr =  new ArrayList<String>();
    	
    	while (true){
    		
    		if( array[i].equals(array[j])){
    			j++;
    		}
    		else{
    			arr.add(array[i]);
    			i = j;
    			j = i + 1;
    			
    		}
    		
    		if (j == array.length){
    			
				arr.add(array[i]);
				return arr.toArray(new String[arr.size()]);
			}
    	}
    			
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
    	
    	
    	if (array.length < 2) return array;
    	
    	int i = 0, j = i + 1;
    	ArrayList<String> arr =  new ArrayList<String>();
    	String currString;
    	
    	
    	while (true){
    		
    		if( array[i].equals(array[j])){
    			j++;
    		}
    		else{
    			
    			currString = "";	
    			for (int y = 0; y < j - i; y++){
    				currString += array[i];
    			}		
    			arr.add(currString);
    			
    			i = j;
    			j = i + 1;
    			
    		}
    		
    		if (j == array.length){
    			
    			currString = "";	
    			for (int y = 0; y < j - i; y++){
    				currString += array[i];
    			}		
    			arr.add(currString);
    			
				return arr.toArray(new String[arr.size()]);
			}
    	}
    }
}
