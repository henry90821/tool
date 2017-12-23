
public class AA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String aa = "123,123";
		byte[] bytes = aa.getBytes();
		System.out.println(bytes);
		String string = new String(bytes);
		System.out.println(string);
	}

}
