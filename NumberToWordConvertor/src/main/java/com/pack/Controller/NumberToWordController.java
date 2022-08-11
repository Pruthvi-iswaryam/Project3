package com.pack.Controller;

import com.pack.Service.NumberToWordConvertorInterface;

public class NumberToWordController {
	
		private NumberToWordConvertorInterface numbertowordService;

		public NumberToWordController(NumberToWordConvertorInterface numbertowordService) {
			super();
			this.numbertowordService = numbertowordService;
		}
		
		public String CustomConvertor(int number)
		{
			return numbertowordService.isConvertNumbertoWord(number);
		}		
		
}