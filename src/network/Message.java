package network;

//import org.apache.commons.httpclient.Header;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.NameValuePair;
//import org.apache.commons.httpclient.methods.PostMethod;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Message {
	    public static void main(String[] args) throws Exception {
	    	Message api = new Message();
	        String httpResponse =  api.testSend();
	         try {
	            JSONObject jsonObj = new JSONObject( httpResponse );
	            int error_code = jsonObj.getInt("error");
	            String error_msg = jsonObj.getString("msg");
	            if(error_code==0){
	                System.out.println("Send message success.");
	            }else{
	                System.out.println("Send message failed,code is "+error_code+",msg is "+error_msg);
	            }
	        } catch (JSONException ex) {
	            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
	        }

	        httpResponse =  api.testStatus();
	        try {
	            JSONObject jsonObj = new JSONObject( httpResponse );
	            int error_code = jsonObj.getInt("error");
	            if( error_code == 0 ){
	                int deposit = jsonObj.getInt("deposit");
	                System.out.println("Fetch deposit success :"+deposit);
	            }else{
	                String error_msg = jsonObj.getString("msg");
	                System.out.println("Fetch deposit failed,code is "+error_code+",msg is "+error_msg);
	            }
	        } catch (JSONException ex) {
	            Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
	        }


	    }

	    private String testSend() throws Exception{
	        // just replace key here
	        Client client = Client.create();
	        client.addFilter(new HTTPBasicAuthFilter(
	            "api","key-f8def4101c049babbbb7f0debfa10384"));
	        WebResource webResource = client.resource(
	            "http://sms-api.luosimao.com/v1/send.json");
	        MultivaluedMapImpl formData = new MultivaluedMapImpl();
	        formData.add("mobile", "18351926682");
	        InputStreamReader in=new InputStreamReader(System.in);
	        System.out.println("输入你要发送的信息:");
	        BufferedReader br=new BufferedReader(in);
	        String mes=br.readLine();
	        String md5Digest=DigestUtils.md5Hex(mes);
	        formData.add("message", md5Digest+"【铁壳测试】");
	        ClientResponse response =  webResource.type( MediaType.APPLICATION_FORM_URLENCODED ).
	        post(ClientResponse.class, formData);
	        String textEntity = response.getEntity(String.class);
	        int status = response.getStatus();
	        //System.out.print(textEntity);
	        System.out.print(status);
	        return textEntity;
	    }

	    private String testStatus(){
	        Client client = Client.create();
	        client.addFilter(new HTTPBasicAuthFilter(
	            "api","key-f8def4101c049babbbb7f0debfa10384"));
	        WebResource webResource = client.resource( "http://sms-api.luosimao.com/v1/status.json" );
	        MultivaluedMapImpl formData = new MultivaluedMapImpl();
	        ClientResponse response =  webResource.get( ClientResponse.class );
	        String textEntity = response.getEntity(String.class);
	        int status = response.getStatus();
	        //System.out.print(status);
	        //System.out.print(textEntity);
	        return textEntity;
	    }
//	public static void main(String[] args) throws Exception{
//
////		HttpClient client=new HttpClient();
////		PostMethod post=new PostMethod("http://gbk.sms.webchinese.cn");
////		post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");
////		NameValuePair[] data= {new NameValuePair("Uid","本站用户名"),new NameValuePair("key","接口安全密码"),new NameValuePair("getphone","手机号码"),new NameValuePair("getcontext","短信内容")};
////		post.setRequestBody(data);
////		
////		client.executeMethod(post);
////		Header[] headers=post.getResponseHeaders();
////		int statusCode=post.getStatusCode();
////		System.out.println("statusCode:"+statusCode);
////		for(Header h:headers) {
////			System.out.println(h.toString());
////		}
////		String result=new String(post.getResponseBodyAsString().getBytes("gbk"));
////		System.out.println(result);
////		
////		post.releaseConnection();
//	}

}
