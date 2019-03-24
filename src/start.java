public class start {
	int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		start[] st = new start[20];
		int x = 0;

		while (x < 10) {
			st[x] = new start();
			st[x].counter = st[x].counter + 1;
			count = count + 1;
			count = count + st[x].mbNew(x);
			x = x + 1;
		}
		System.out.println(count+" "+ st[5].counter);

	}

	public int mbNew(int index) {
		if (index < 5) {
			start m4 = new start();
			m4.counter = m4.counter + 1;
			return index;
		}
		return 0;
	}
}
