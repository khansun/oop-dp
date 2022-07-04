package labexam17;


public class Range {
	int initial, terminal;
	public Range(int initial , int terminal) {
		this.initial = initial;
		this.terminal = terminal;
		// TODO Auto-generated constructor stub
	}
	
	boolean contains(int number){
		
			return (initial<= number && terminal >= number) ;
}
	boolean containsRange(Range range) {
		return (initial<=range.initial && terminal >= range.terminal) ;
	}
}