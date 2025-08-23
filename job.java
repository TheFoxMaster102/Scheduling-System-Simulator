package Proj4;

public  class job implements java.lang.Comparable{
	int jobID,length,priority;
	String i;
	public job(int jobID, int length, int priority) {
		this.jobID=jobID;
		this.length=length;
		this.priority=priority;
	}
	public int getprio() {
		return priority;
	}
	public int getID()
	{
		return jobID;
	}
	public int getlength()
	{
		return length;
	}
	public String toString()
	{
		String output="";
		output+=jobID;
		while(output.length()<=6)
		{
			output+=" ";
		}
		output+=length;
		while(output.length()<=13)
		{
			output+=" ";
		}
		output+=priority;
		while(output.length()<=21)
		{
			output+=" ";
		}
		return output;
	}
	@Override
	public int compareTo(Object o) {
		if(o.getClass()==this.getClass())
			return this.getprio()-((job) o).getprio();
		return 0;
	}
	

	
}
