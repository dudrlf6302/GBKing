package com.hanbat.base.util;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import oracle.sql.CLOB;
import sun.misc.Regexp;

public class StringUtil {
	
	public StringUtil() {

	}

	/**
	 *	���ڿ��� Ư�����ڷ� �и��Ͽ� ���
	 *	@param String str	�и��� �� ���ڿ�
	 *	@param String delim	�����ڷ� ���� ����
	 *	@return String[]
	 *
	 *	@sample StringUtil.strSplit("aaa,bbb", "," )
	 */
	public static String[] strSplit(String str, String delim) {
		StringTokenizer st = new StringTokenizer(str, delim);
		Vector vec = new Vector();
		int cnt = st.countTokens();
		String[] tokens = null;

		if (cnt == 1) {
			tokens = new String[1];
			tokens[0] = str;
		} else {
			for (int i = 0; i < cnt; i++)
				vec.addElement(st.nextToken());
			tokens = new String[cnt];
			vec.copyInto(tokens);
			vec.clear();
			vec = null;
		}
		return tokens;
	}

	/**
	 * �Էµ� ���ڿ��� null �ϰ�� �⺻���ڿ��� �����Ѵ�.
	 * @param str ���ڿ�
	 * @return
	 */
	public static String convNull(String str) {
		if (isNull(str))
			return "";
		return str;
	}
	
	/**
	 * textarea���� �޾ƿ� ���� �ٹٲ� �±׸� �Է�
	 * @param str ���ڿ�
	 * @return
	 */
	public static String addNextLine(String str) {
		if (isNull(str))
			return "";
		String content = str.replaceAll("\r\n", "<p>");
		return content;
	}

	/**
	 * �Էµ� ���ڿ��� null �ϰ�� �⺻���ڿ��� �����Ѵ�.
	 * @param str ���ڿ�
	 * @param def �⺻ ���ڿ�
	 * @return
	 */
	public static String convNull(String str, String def) {
		if (isNull(str))
			return def;
		return str;
	}

	/**
	 * null �Ǵ� ��鹮������ Ȯ���Ѵ�.
	 * @param str ���ڿ�
	 * @return
	 */
	public static boolean isNull(String str) {
		return (str == null || str.trim().length() < 1);
	}

	/**
	 * ���� �� �ӿ� ���� �� Ư�� ���ڸ� ���ο� ���ڷ� ����
	 * @param String s1 ���ڿ�
	 * @param String s2 ������
	 * @param String s3 �ٲ���
	 * @return String  ��ȯ �� ���ڿ�
	 */
	public static String strReplace(String s1, String s2, String s3) {
		if (s1 == null)
			return "";
		String res = "";
		StringTokenizer str = new StringTokenizer(s1, s2);

		while (str.hasMoreTokens()) {
			res += str.nextToken() + s3;
		}

		return res;
	}

	/**
	 * ���ڿ����� HTML �±� ����
	 * @param s
	 * @return
	 */
	public static String removeTag(String s) {
		if (s == null)
			return "";
		final int NORMAL_STATE = 0;
		final int TAG_STATE = 1;
		final int START_TAG_STATE = 2;
		final int END_TAG_STATE = 3;
		final int SINGLE_QUOT_STATE = 4;
		final int DOUBLE_QUOT_STATE = 5;
		int state = NORMAL_STATE;
		int oldState = NORMAL_STATE;
		char[] chars = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		char a;
		for (int i = 0; i < chars.length; i++) {
			a = chars[i];
			switch (state) {
			case NORMAL_STATE:
				if (a == '<')
					state = TAG_STATE;
				else
					sb.append(a);
				break;
			case TAG_STATE:
				if (a == '>')
					state = NORMAL_STATE;
				else if (a == '\"') {
					oldState = state;
					state = DOUBLE_QUOT_STATE;
				} else if (a == '\'') {
					oldState = state;
					state = SINGLE_QUOT_STATE;
				} else if (a == '/')
					state = END_TAG_STATE;
				else if (a != ' ' && a != '\t' && a != '\n' && a != '\r'
						&& a != '\f')
					state = START_TAG_STATE;
				break;
			case START_TAG_STATE:
			case END_TAG_STATE:
				if (a == '>')
					state = NORMAL_STATE;
				else if (a == '\"') {
					oldState = state;
					state = DOUBLE_QUOT_STATE;
				} else if (a == '\'') {
					oldState = state;
					state = SINGLE_QUOT_STATE;
				} else if (a == '\"')
					state = DOUBLE_QUOT_STATE;
				else if (a == '\'')
					state = SINGLE_QUOT_STATE;
				break;
			case DOUBLE_QUOT_STATE:
				if (a == '\"')
					state = oldState;
				break;
			case SINGLE_QUOT_STATE:
				if (a == '\'')
					state = oldState;
				break;
			}
		}
		return sb.toString();

	}

	/**
	 * Method cropByte. ���ڿ� ����Ʈ����ŭ �����ְ�, ��ǥ���ϱ�
	 * @param str ���ڿ�
	 * @param i ����Ʈ��
	 * @param trail �� ���ڿ�. ��) "..."
	 * @return String
	 */
	public static String cropByte(String str, int i, String trail) {
		if (str == null)
			return "";
		String tmp = str;
		int slen = 0, blen = 0;
		char c;
		try {
			//if (tmp.getBytes("UTF-8").length > i) {//3-byte character..
			if(tmp.getBytes("MS949").length>i) {//2-byte character..
				while (blen + 1 < i) {
					c = tmp.charAt(slen);
					blen++;
					slen++;
					if (c > 127)
						blen++;
				}
				tmp = tmp.substring(0, slen) + trail;
			}
		} catch (Exception e) {
		}
		return tmp;
	}

	/**
	 * DB�� ����� enter key���� <br>�� ��ȯ�Ѵ�.
	 *@param String
	 *@return String
	 **/
	public static String convertHtmlBr(String comment) {
		if (comment == null)
			return "";
		int length = comment.length();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < length; ++i) {
			String comp = comment.substring(i, i + 1);
			if ("\r".compareTo(comp) == 0) {
				comp = comment.substring(++i, i + 1);
				if ("\n".compareTo(comp) == 0)
					sb.append("<br/>");
			} else {
				sb.append(comp);
			}
		}
		return sb.toString();

	}
	
	public static String convertHtmlBrForUnix(String comment) {
		  if (comment == null)
		   return "";
		  int length = comment.length();
		  StringBuffer sb = new StringBuffer();

		  for (int i = 0; i < length; ++i) {
		   String comp = comment.substring(i, i + 1);
		   if ("\r".compareTo(comp) == 0) {
		    comp = comment.substring(++i, i + 1);
		    if ("\n".compareTo(comp) == 0)
		     sb.append("<br/>");
		   }else if("\n".compareTo(comp) == 0){
		    sb.append("<br/>");
		   } else {
		    sb.append(comp);
		   }
		  }
		  return sb.toString();
	}
	/**
	 * �� �ε����� ���ڰ� �ҹ��ڶ�� �빮�ڷ� ��ȯ
	 * @param str ���ڿ�
	 * @return String
	 */
	public static String bigLetter(String str) {
		//String tmp = str;
		String convertStr = "";
		char[] charArray = str.toCharArray(); //Char[]�� ��ȯ

		for (int i = 0; i < str.length(); i++) {
			//System.out.println("Char["+i+"] = "+charArray[i]); //��ȯ�� Char ���
			if ((charArray[i] >= 97) && (charArray[i] <= 122)) {
				charArray[i] -= 32; //�� �ε����� ���ڰ� �ҹ��ڶ�� �빮�ڷ� ��ȯ
				convertStr += charArray[i];
			}
		}

		return convertStr;
	}

	/**
	 * �� �ε����� ���ڰ� �빮�ڶ�� �ҹ��ڷ� ��ȯ
	 * @param str ���ڿ�
	 * @return String
	 */
	public static String smallLetter(String str) {
		//String tmp = str;
		String convertStr = "";
		char[] charArray = str.toCharArray(); //Char[]�� ��ȯ

		for (int i = 0; i < str.length(); i++) {
			//System.out.println("Char["+i+"] = "+charArray[i]); //��ȯ�� Char ���
			if ((charArray[i] >= 65) && (charArray[i] <= 90)) {
				charArray[i] += 32; //�� �ε����� ���ڰ� �빮�ڶ�� �ҹ��ڷ� ��ȯ
				convertStr += charArray[i];
			}
		}

		return convertStr;
	}

	/**
	 * Character Set�� UTF-8�� ������
	 * @param   str     ��ȯ�� ����
	 * @return  String  ��ȯ����
	 */
	public String convUTF(String str) {
		String tmp = new String("");
		if (str == null || str.length() == 0)
			return "";
		try {
			tmp = new String(str.getBytes("MS-949"), "UTF-8");
		} catch (Exception e) {

		}
		return tmp;
	}

	/**
	 * getParameterMap() ���� ���� �Ķ���͸� HashMap���� ġȯ
	 * @version
	 * @param Map requestMap
	 * @return HashMap hm
	 * @throws Exception
	 *
	 */
	public Map paramsToHashMap(Map requestMap) throws Exception {
		HashMap hm = new HashMap();

		try {
			Iterator it = requestMap.keySet().iterator();
			Object key = null;
			String[] value = null;

			while (it.hasNext()) {
				key = it.next();
				value = (String[]) requestMap.get(key);

				for (int i = 0; i < value.length; i++) {
					hm.put(key, value[i].toString());
				}
			}
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return hm;
	}

	/**
	 * getParameterMap() ���� ���� �Ķ���͸� QueryString���� ġȯ
	 * @version
	 * @param Map requestMap
	 * @return String (a=1&b=2&c=3....)
	 * @throws Exception
	 *
	 */
	public String paramsToQueryString(Map requestMap) throws Exception {
		StringBuffer sp = new StringBuffer();
		int loopCnt = 0;

		try {
			Iterator it = requestMap.keySet().iterator();
			Object key = null;
			String[] value = null;

			while (it.hasNext()) {
				key = it.next();
				value = (String[]) requestMap.get(key);

				for (int i = 0; i < value.length; i++) {
					if (!"cmd".equals(key.toString())
							&& !"returnCmd".equals(key.toString())) {
						if (loopCnt > 0)
							sp.append("&");
						sp.append(key.toString() + "=" + value[i].toString());
					}
				}

				loopCnt++;
			}
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return sp.toString();
	}

	/**
	 * getParameterMap() ���� ���� �Ķ���͸� QueryString���� ġȯ
	 * cmd����
	 * @version
	 * @param Map requestMap
	 * @return String (a=1&b=2&c=3....)
	 * @throws Exception
	 *
	 */
	public String paramsToQueryStringWithCmd(Map requestMap) throws Exception {
		StringBuffer sp = new StringBuffer();
		int loopCnt = 0;

		try {
			Iterator it = requestMap.keySet().iterator();
			Object key = null;
			String[] value = null;

			while (it.hasNext()) {
				key = it.next();
				value = (String[]) requestMap.get(key);

				for (int i = 0; i < value.length; i++) {
					if (loopCnt > 0)
						sp.append("&");
					sp.append(key.toString() + "=" + value[i].toString());
				}

				loopCnt++;
			}
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return sp.toString();
	}

	/**
	 * ���ڿ��� ��ū���� �����ؼ� 1���� �迭�� �����Ѵ�.
	 * @param s - ��ū�� ���� ���ڿ�
	 * @param token - ������
	 * @return �����ڷ� �и��� 1����迭
	 */
	public static String[] cutTokenToArray(String s, String token) {
		StringTokenizer stz = new StringTokenizer(s, token);
		String result[] = new String[stz.countTokens()];
		try {
			for (int j = 0; j < result.length; j++)
				result[j] = stz.nextToken();
		} catch (Exception exception) {
		}
		return result;
	}

	/**
	 * CLOB�� String���� ��ȯ�Ѵ�.
	 *@param CLOB
	 *@return String
	 **/
	public static String getStringForCLOB(CLOB clob) {
		String str = "";
		StringBuffer sbf = new StringBuffer();
		Reader br = null;
		char[] buf = new char[2048];
		int readcnt;

		try {
			br = clob.getCharacterStream(0L);

			while ((readcnt = br.read(buf, 0, 1024)) != -1) {
				sbf.append(buf, 0, readcnt);
			}

		} catch (Exception e) {
			System.out.println("Failed to eate String object from CLOB");
			System.out.println(e.getMessage());
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Failed to close BufferedReader object");
					System.out.println(e.getMessage());
				}
		}
		return sbf.toString();
	}

	public static String subString(String str, int startidx, int endidx) {
		String returnString = "";
		try {
			returnString = str.substring(startidx, endidx);
		} catch (Exception e) {
			return "";
		}

		return returnString;
	}
	
    public static String fineImgTag(String s) {
     	if(s == null || s.equals("")){
     		s = "";
     	}else{     		
     		     		
     	    Pattern p = Pattern.compile("\\<(\\/?)(img|IMG)([^<>]*)>");
     	    Matcher m = p.matcher(s);     	         
     	    
     	    s = "";
     	     while(m.find()) { 
     	        s += m.group(0);
     	     }     	    
     	}    	
     	return s;         
     }
        
    public static String convNumber(String s) {
    	String chars = "0123456789";
    	boolean isCheck = false;    	
    	s = convNull(s,"0");    	
		for(int inx = 0; inx < s.length(); inx++) {
			if(chars.indexOf(s.charAt(inx)) == -1){
				isCheck = true;
			}
		}
		if(isCheck){
			s = "0";
		}
		
    	return s;
    }
    
    
    public static List randomInt(int len, int count){
    	List list = new ArrayList();
    	Random random = new Random();
    	
    	int i = 0;    	
    	String tm ="";
    	boolean checkEquals = false;
    	
    	if(len < count){
    		return list;
    	}
    	
		while(true){
    		checkEquals = false;
    		tm = String.valueOf(random.nextInt(len));
    		if("0".equals(tm)) tm = "1";
    		
    		if(i >= count)
    			break;
    		    		
    		if(list.size() ==0){    			
    			list.add(tm);
    			i++;    			
    		}else{
    			for(int z=0; z < list.size(); z++){
    				if(tm.equals(list.get(z))){
    					checkEquals = true;
    				}
    			}
    			
    			if(!checkEquals){     				
    				list.add(tm);
    				i++;    				
    			}
    		}    		    		    		   
    	}
    	
    	return list;
    }
 
}
