
public class YerelSinifx {

	public void calistir() {
		class yerel {
			public void bul(int a) {
				if (a % 2 == 0) {
					System.out.println("say� �ifttir");
				} else {
					System.out.println("say� tektir");
				}
             
			}

		}
		yerel y1 = new yerel();
		y1.bul(5);
	}

}
