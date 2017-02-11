import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;


public class FullPage {
	
	public static void main(String[] args)
	{
	try{
		UserAgent userAgent = new UserAgent();   
		userAgent.visit("http://www.collegesimply.com/guides/application-deadlines");
		System.out.println(userAgent.doc.innerHTML());
			
		//System.out.println(userAgent.doc.innerHTML());
	}catch(JauntException je)
	{
		System.out.println(je);
	}
	}
}
