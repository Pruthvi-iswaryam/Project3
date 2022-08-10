package com.pack.Controller;
import com.pack.Repository.UnitsAndTensArray;
import com.pack.Service.*;
	

public class NumberToWordController {
	
	private NumberToWordConvertorInterface numbertowordService;

		public NumberToWordController(NumberToWordConvertorInterface numbertowordService) {
			super();
			this.numbertowordService = numbertowordService;
		}
		
		public String customNumberInput(int number)
		{
			return numbertowordService.isConvertNumbertoWord(number);
		}
		
		
	}

	

}
