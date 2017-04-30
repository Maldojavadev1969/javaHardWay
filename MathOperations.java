public class MathOperations
{
	public static void main(String[] args)
	{
		int a, b, c, d, e, f, g;
		double x, y, z; 
		String one, two, both;
		
		a = 10;
		b = 27;
		System.out.println("a is " + a + " , b is " + b);
		
		c = a + b;
		System.out.println("a + b is " + c);
		d = a - b;
		System.out.println("a - b is " + d);
		e = a + b*3;
		System.out.println("a + b * 3 is " + e);
		f = b / 2;
		System.out.println("b / 2 is " + f);
		g = b % 10;
		System.out.println("b % 10 is " + g);
		
		x = 1.1;
		System.out.println("\nx is  " + x);
		y = x * x;
		System.out.println("x * x is  " + y);
		z = b / 2;
		System.out.println("b / 2 is  " + z);
		System.out.println();
		
		one = "dog";
		two = "house";
		both = one + two;
		System.out.println(both);
		
		System.out.println();
		
		int h, i, j, k, l, m, n;
		
		h = 10;
		i = 2;
		System.out.println("h =  " + h + ", i =  " + i);
		
		// add
		j = h + i;
		System.out.println("h + i =  " + j);
		// subtract
		k = h - i;
		System.out.println("h - i =  " + k);
		//multiplication
		l = h * i;
		System.out.println("h * i =  " + l);
		//division
		m = h/i;
		System.out.println("h / i = " +  m);
		//modulus
		n = h % i;
		System.out.println("h modulus i =  " + n);

	
	}

}