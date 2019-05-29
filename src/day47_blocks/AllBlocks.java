package day47_blocks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int StaticInt = 10;

	static {
		System.out.println("Static block - I run first and only once");
	}

	{
		System.out.println("INIT Block - I run each time object is created before constructor");
		nonStaticInt+=5;
		StaticInt+=5;
	}

	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created after init block");
		nonStaticInt+=3;
		StaticInt+=3;
	}

	public static void main(String[] args) {

		AllBlocks m1 = new AllBlocks();
		System.out.println();
		AllBlocks m2 = new AllBlocks();

	}
}
