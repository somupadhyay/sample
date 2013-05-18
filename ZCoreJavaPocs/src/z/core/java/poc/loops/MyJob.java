package z.core.java.poc.loops;


public class MyJob implements Comparable<MyJob>{

	private int jobid;
	public static enum PRIORITIES{LOW,NORMAL,HIGH};
	private PRIORITIES prority;
	private int executionTime;
	private long jobintime;
	
	@Override
	public int compareTo(MyJob o) {
		
		if(this.prority.ordinal()>=o.prority.ordinal()){
			if(this.executionTime<o.executionTime){
				return -1;
			}else if(this.executionTime==o.executionTime){
				return (int) (this.jobintime-o.jobintime);
			}else if(this.executionTime>o.executionTime){
				return 1;
			}
		}else {
			return 1;
		}
		//Greater the jobintime the last the job in.
		return 1;
	}


	public int getJobid() {
		return jobid;
	}

	
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}


	public int getExecutionTime() {
		return executionTime;
	}


	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}


	public long getJobintime() {
		return jobintime;
	}


	public void setJobintime(long jobintime) {
		this.jobintime = jobintime;
	}


	public PRIORITIES getPrority() {
		return prority;
	}


	public void setPrority(PRIORITIES prority) {
		this.prority = prority;
	}


	@Override
	public String toString() {
		return "MyJob [jobid=" + jobid + ", prority=" + prority.name()
				+ ", executionTime=" + executionTime + ", jobintime="
				+ jobintime + "]\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + executionTime;
		result = prime * result + jobid;
		result = prime * result + (int) (jobintime ^ (jobintime >>> 32));
		result = prime * result + ((prority == null) ? 0 : prority.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyJob other = (MyJob) obj;
		if (executionTime != other.executionTime)
			return false;
		if (jobid != other.jobid)
			return false;
		if (jobintime != other.jobintime)
			return false;
		if (prority != other.prority)
			return false;
		return true;
	}
	
	
}
