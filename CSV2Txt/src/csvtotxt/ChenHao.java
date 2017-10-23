/*package csvtotxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ChenHao extends FileBase {
	String rFileName[]={"Olym.csv"};
    String wFileName="result.csv";
    ChangeCharset cc=new ChangeCharset();
	@Override
	public void process() throws IOException {
		// TODO Auto-generated method stub
             
			System.out.println(getRows(rFileName[0]));   //  get  the num of items;   hangshu
            int max=  getRows(rFileName[0]);
			
            String test="李伟深S：我接受（冰桶挑战）我挑战的人是.奥巴马.普京.卡梅伦.[笑cry][笑cry][笑cry]桥西路";
            System.out.println(test);	
            
            String content="";
            
            
		for(int i=0;i<max;i++){	
			
			String filename= Integer.toString(i); 
			//String a=getStringValue(rFileName[0],0,i);    //wenjianming,lie,hang    post_ID                                                
		    //System.out.println(a);		                 //  post_id as the filename	
			
			try
			{
				String b=getStringValue(rFileName[0],1,i);
				System.out.println(cc.getEncoding(b));
				System.out.println(b);
			
		    
			String c=getStringValue(rFileName[0],3,i);    // content
			System.out.println(cc.getEncoding(c));
			System.out.println(c);
			System.out.println("\r\n");
			
			
			String mjh="建红";
		
			content=b;
			
			// write  the csv to txt result
			    String filePathout = "D:\\Result\\"+filename;       
	            FileOutputStream fout = new FileOutputStream(filePathout); 
	            File f=new File(filePathout);
	            if(!f.exists()){  
	                f.createNewFile();  
	               } 
	            System.out.println("正在写第" +i + "个文件" + fout);
	            //BufferedWriter output = new BufferedWriter(new FileWriter(fout));
	            OutputStreamWriter osw=new OutputStreamWriter(fout);
	            osw.write(content+mjh);          
	            System.out.println(content);
	             System.out.println("写完第" + i + "个文件" + fout);
	            osw.close(); 
	            write(content);   // test   write to a .csv doc
	            System.out.println(i);	
	            
	            
			}
			catch(Exception e)
			{
				
			}
		}

	}

	@Override
	public void run(FileBase fb) {
		// TODO Auto-generated method stub
	    fb.go(rFileName, wFileName);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileBase fb=new ChenHao();
		fb.run(fb);
	}

}
*/