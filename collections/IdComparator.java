package collectionsdemo;

import arraysdemo.Developer;
import java.util.Comparator; // Added missing import

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :4:47:53 pm
 *email :ridhima.gadalay@gmail.com
 */
public class IdComparator implements Comparator<Developer>{

	@Override // Good practice to include this annotation
	public int compare(Developer d1, Developer d2) {

		// Using getters instead of direct private field access
		if(d1.getId() == d2.getId())
			return 0;
		else if (d1.getId() > d2.getId())
			return 1;
		else
			return -1;
		}


	}

