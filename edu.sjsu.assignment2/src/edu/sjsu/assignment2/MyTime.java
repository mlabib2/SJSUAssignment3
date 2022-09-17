
package edu.sjsu.assignment2;
/**
@author [Mahir_Labib]
* A public class MyTime that takes in time input in military formats of 'hh:mm' 
*/

public class MyTime {
	
	/**
	 * 
	 * @param X
	 * @param Y
	 */
	public static void printTimeDifference(String X , String Y) {
		try {
			
			 String XHourStr;
			 String XMinuteStr;
			String YHourStr;
			 String YMinuteStr;
			int XHourInt;
			 int XMinuteInt;
			 int YHourInt;
			 int YMintuteInt;
			 int TimeDifferenceMins;
			 int TimeDifferenceHour;
			 int TotalTimeDifferenceMins;
			 if(X.length()!=4 || Y.length() !=4) {
					System.err.println("Input is not in the right format (hhmm)" );
					return;
				}
		// convert both to seconds
		XHourStr = X.substring(0,2);
		XMinuteStr = X.substring(2,4);
		YHourStr = Y.substring(0,2);
		YMinuteStr = Y.substring(2,4);
		
		XHourInt = Integer.parseInt(XHourStr);
		XMinuteInt = Integer.parseInt(XMinuteStr);
		YHourInt = Integer.parseInt(YHourStr);
		YMintuteInt = Integer.parseInt(YMinuteStr);
		
		
		
		
		if ((XHourInt > YHourInt ) || ( (XHourInt == YHourInt) && (  XMinuteInt > YMintuteInt ) )){
			YHourInt = YHourInt + 24;
		}
		
		TotalTimeDifferenceMins = ((YHourInt * 60) + (YMintuteInt)) - ((XHourInt * 60) + (XMinuteInt));
		TimeDifferenceHour = TotalTimeDifferenceMins /60;
		TimeDifferenceMins = TotalTimeDifferenceMins%60;
		
		System.out.print(TimeDifferenceHour + " hour(s) " + TimeDifferenceMins + " minute(s)" );
		}
		catch(NumberFormatException nme)
		{
			System.err.println("Input is not a number " + nme.getLocalizedMessage() );
		}
		catch(Exception e)
		{
			System.err.println("Exception occurred " + e.getLocalizedMessage() );
		}
		
	}

	/**
	 * @return [return The time difference between the two inputs]
	 * @param [String X , String Y] [two times, X and Y in military format taken in as parameters]
	 * @throws [NumberFormatException][It throws an exception when more or less than four integers are given as inputs]
	 * @throws [Input is not in the right format (hh:mm)"][when anything other than numbers are given as inputs]
	 */
	
	public static void main(String [] args) {
		
		MyTime.printTimeDifference("4445", "4444");
	}
}

