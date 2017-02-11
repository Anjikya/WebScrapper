import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;
import  java.util.*;

public class Colleges {
	public static ArrayList<String> getColleges()
	{
		//int i=1;
		ArrayList<String> colg=new ArrayList<String>();
	try{
		UserAgent userAgent = new UserAgent();   
		userAgent.visit("http://www.collegesimply.com/guides/application-deadlines");
		Elements links=userAgent.doc.findEach("<table>").findEach("<tr>").findEach("<td>").findEach("a href=http://www.collegesimply.com/colleges/.*/.*/.*/");
		

		for(Element el : links)
		{
			colg.add(el.getText());
		}
		//System.out.println(userAgent.doc.innerHTML());
	}catch(JauntException je)
	{
		System.out.println(je);
	}
		return colg;
	}
}
