package com.pack.Controller;
import com.pack.repository.UnitsAndTensArray;
import com.pack.service.*;
	

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
