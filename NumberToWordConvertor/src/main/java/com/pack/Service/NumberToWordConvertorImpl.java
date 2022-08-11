package com.pack.Service;

import com.pack.Repository.UnitsAndTensArray;

public class NumberToWordConvertorImpl {
	
	public NumberToWordConvertorImpl() {

	}
	UnitsAndTensArray array;

	public NumberToWordConvertorImpl(UnitsAndTensArray array) {
		this.array = array;

	}
	public NumberToWordConvertorImpl(NumberToWordConvertorInterface convert) {
		// TODO Auto-generated constructor stub
	}
	public String ConvertNumberGreaterOrLessThanZero(int number) {
	
		if (number < 0) {
			return "-" + ConvertNumberGreaterOrLessThanZero(-(number));
		}
		if (number < 20 ) { 
			return array.unitsArray[number]; 
			}
		
		if (number < 100) {

			return array.tensArray[number / 10] + ((number % 10 != 0) ? " " : "") + array.unitsArray[number % 10];

		}
		if (number < 1000) {

			return array.unitsArray[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "")
					+ ConvertNumberGreaterOrLessThanZero(number % 100);

		}
		if (number < 100000) {

			return ConvertNumberGreaterOrLessThanZero(number / 1000) + " Thousand" + ((number % 10000 != 0) ? " " : "")
					+ ConvertNumberGreaterOrLessThanZero(number % 1000);

		}
		if (number < 1000000) {

			return ConvertNumberGreaterOrLessThanZero(number / 100000) + " Lakhs" + ((number % 100000 != 0) ? " " : "")
					+ ConvertNumberGreaterOrLessThanZero(number % 100000);

		}

		return ConvertNumberGreaterOrLessThanZero(number / 1000000) + " Millions" + ((number % 1000000 != 0) ? " " : "")
				+ ConvertNumberGreaterOrLessThanZero(number % 1000000);
	}
	
	
	public String isConvertNumbertoWord(int number) {
		if(number > 0 || number < 0)
		{
			ConvertNumberGreaterOrLessThanZero(number);
		}
		return "Zero";
	}

}
