package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;
import java.util.Arrays;


public class HelloWorld {
	public HelloWorld() {

	}

	public String Method1() {
		return "Hello World";
	}

	public int Method2(int a, int b) {
		return a + b;
	}

	public int Method3(int a, int b, int c){
		if((a>5&&b<0)||c>0) {
			System.out.println("Condition 1");
		}
		else if(a<5 && c<-2 ) {
			System.out.println("Condition 2");
		}
		else {
			System.out.println("Condition 3");
		}
		return 0;
	}
	public int Method4(int a, int b, int c, int d, float e) {
		if(a == 0) {
			return 0;
		}
		int x = 0;
		if((a == b) || ((c == d) && (bug(a)))) {
			x = 1;
		}
		e = 1/x;
		return 0;
	}
	public boolean bug(int a) {
		if(a == 5) return true;
		return false;
	}


	public boolean isTriangle(int a, int b, int c) {
		/**
		 * TODO: You need to complete this method to determine whether  a
		 * triangle is formed or not when given the input edge a, b and c.
		 */
		if (a <= 0 || b <= 0 || c <= 0)
		{
			return false;
		}
		if (a + b > c && b + c > a && a + c > b)
		{
			return true;
		}
		return false;
	}
	public boolean isBirthday(int year, int month, int day) {
		/**
		 * TODO: You need to complete this method to determine whether a
		 * legitimate date of birth between 1990/01/01 and 2019/10/01 is
		 * formed or not when given the input year, month and day.
		 */
		int num = year * 10000 + month * 100 + day;
		if ( num < 19900101 || num > 20191001)
		{
			return false;
		}
		if (month <= 0 || day <= 0)
		{
			return false;
		}
		int[] arr1 = {1,3,5,7,8,10,12};
		boolean flag = false;
		for (final int item:arr1)
		{
			if (item == month)
			{
				flag = true;
			}
		}

		//1990-2019没有可以被4整除但是不是闰年的年份，因此没有必要做更复杂的逻辑
		if (year % 4 == 0)
		{
			if (month == 2)
			{
				if(day<=29)
				{
					return true;
				}
			}

			else if(flag && day <= 31)
			{
				return true;
			}
			else if(day<=30)
			{
				return true;
			}
		}
		else
		{
			if (month == 2)
			{
				if(day<=28)
				{
					return true;
				}
			}
			else if(flag && day <= 31)
			{
				return true;
			}
			else if(day<=30)
			{
				return true;
			}
		}
		return false;

	}
	public Double miniCalculator(double a, double b, char op) {
		/**
		 * TODO: You need to complete this method to form a small calculator which
		 * can calculate the formula: "a op b", the op here can be four basic
		 * operation: "+","-","*","/".
		 */
		double result = 0.0;
		switch(op)
		{
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				if(b!=0){
					result = a / b;
				}

				break;
		}
		return result;
	}

}