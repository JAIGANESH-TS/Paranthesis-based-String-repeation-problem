import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        Stack<Character> st=new Stack<>();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<len)
        {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            st.push(ch);i++;
        }
        else if(ch==')')
        {
            while(st.size()>0 && st.peek()!='(')
            sb.insert(0,st.pop());
            st.pop();
            i++;
        }
        else if(ch=='{')
        {
            i++;
            StringBuilder sb1=new StringBuilder();
            while(i<len && s.charAt(i)!='}')
            {
                sb1.append(s.charAt(i));i++;
            }
            String convertedstr=new String(sb1);
            int no=Integer.valueOf(convertedstr);
            //System.out.println(sbtostr);
            String sbtostr=new String(sb);sb=new StringBuilder();
            //System.out.println(sbtostr);
            char first=sbtostr.charAt(0);
           //  System.out.println(first+" "+no);
            String repeat="";i++;StringBuilder sg=new StringBuilder();
            while(st.size()>0 && Character.isLetter(st.peek())) 
            {
                sg.insert(0,st.pop());
            }
            repeat=new String(sg);
          //  System.out.println(repeat);
            if(Character.isUpperCase(first) && no>=0)
            {
                while(no-->0)
                {
                    repeat+=sbtostr;
                    
                }
            }
            else if(Character.isLowerCase(first) && no>=0)
            {
                while(no-->0)
                {
                    repeat+=sbtostr;
                    
                }
            }
            else if(Character.isUpperCase(first) && no<0)
            {
                no-=no;
                while(no-->0)
                {
                    int lenstr=sbtostr.length();int inc=0;
                    while(inc<lenstr)
                    {
                        repeat+=Character.toLowerCase(sbtostr.charAt(inc++));
                    }
                }
            }
            else if(Character.isLowerCase(first) && no<0)
            {
                no=-no;
                
                while(no-->0)
                {
                    int lenstr=sbtostr.length();int inc=0;
                    while(inc<lenstr)
                    {
                        repeat+=Character.toUpperCase(sbtostr.charAt(inc++));
                    }
                }
            }
           // System.out.println(repeat);
            for(int k=0;k<repeat.length();k++)
            {
                st.push(repeat.charAt(k));
            }
        }
        else
        {
            st.push(ch);i++;
        }
        }
        StringBuilder rev=new StringBuilder();
        while(st.size()>0)
        {
            rev.insert(0,st.pop());
        }
        System.out.println(rev);
		}
		catch(Exception e)
		{
		    
		}
	}
}
