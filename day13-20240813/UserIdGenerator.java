private static List<String> ids = new ArrayList<>();

	public static String sampleSpace = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String generateId() {
		boolean isUnique = false;
		Random random = new Random();
		String id = "";
		while (!isUnique) {
			id = "";
			for (int i = 1; i <= 20; i++) {
				int index = random.nextInt(sampleSpace.length());
				char c = sampleSpace.charAt(index);
				id = id + c;
			}
			if (!ids.contains(id)) {
				isUnique = true;
				ids.add(id);
			}
		}
		return id;
	}

	public static void main(String[] args) {
		generateId();
	}
}
