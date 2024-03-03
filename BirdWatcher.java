package exercism;

public class BirdWatcher {
    
	  private final int[] birdsPerDay;

	    public BirdWatcher(int[] birdsPerDay) {
	        this.birdsPerDay = birdsPerDay.clone();
	    }

	    public int[] getLastWeek() {
	        return birdsPerDay;
	    }

	    public int getToday() {
	          if(birdsPerDay.length==0)
	              return 0;
	           return birdsPerDay[birdsPerDay.length-1];
	    }

	    public void incrementTodaysCount() {
	           if(birdsPerDay.length>0)
	               birdsPerDay[birdsPerDay.length-1]++;
	         
	    }

	    public boolean hasDayWithoutBirds() {
	        for(int i:birdsPerDay)
	            {
	                  if(i==0)
	                      return true;
	                       }
	                return false;
	    }

	    public int getCountForFirstDays(int numberOfDays) {
	            int sum=0;
	          if(numberOfDays>birdsPerDay.length)
	              numberOfDays-=(numberOfDays-birdsPerDay.length);
	           for(int i=0;i<numberOfDays;i++)
	               {
	                   sum+=birdsPerDay[i];
	               }
	          
	                               
	        return sum;
	    }

	    public int getBusyDays() {
	           int cnt=0;
	           for(int i=0;i<birdsPerDay.length;i++)
	               {
	                    if(birdsPerDay[i]>4) 
	                        cnt++;
	                   }
	        return cnt;
	    }
	}

	

