public class SortingProcessor {

	public static void process(SortingDefault sorting) {
		// this is a typical implementation of the loosely coupled system
		// this class knows nothing about the question and its type (!!!)
		// THIS IS PURE ABSTRACTION
		sorting.doSort();
	}
}