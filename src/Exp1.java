import java.util.ArrayList;
import java.util.List;

import com.jaunt.*;
import com.jaunt.component.*;
import com.jaunt.util.*;

public class Exp1 {
	
	public static ArrayList<String> getDeadline()
	{
		int i=0;
		ArrayList<String> dates=new ArrayList<String>();
	try{
		UserAgent userAgent = new UserAgent();   
		userAgent.visit("http://www.collegesimply.com/guides/application-deadlines");
		//Elements links=userAgent.doc.findEach("<table>").findEach("<tr>").findEach("<td>").findEach("a href=http://www.collegesimply.com/colleges/.*/.*/.*/");
		Elements links=userAgent.doc.findEvery("<table class=table>").findEvery("<tr>");

		for(Element el : links)
		{
			
			if(el.getChildElements().size()>2)
				dates.add(el.getChildElements().get(1).getText());
				//if(el.getChildElements().size()>2)
					//System.out.println((i++)+" "+el.getChildElements().get(1).getText());
		}
		//System.out.println(userAgent.doc.innerHTML());
	}catch(JauntException je)
	{
		System.out.println(je);
	}
		return dates;
	}

}
