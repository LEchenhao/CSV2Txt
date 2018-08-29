package csvtotxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import com.csvreader.*;




public class CtoT extends FileBase {
	
	public void  readeCsv(){  
	    try {      
	        ArrayList<String[]> csvList = new ArrayList<String[]>(); //用来保存数据  
	        String csvFilePath = "d:/test1.csv";  
	         CsvReader reader = new CsvReader(csvFilePath,',',Charset.forName("SJIS"));    //一般用这编码读就可以了      
	           
	        // reader.readHeaders(); // 跳过表头   如果需要表头的话，不要写这句。  
	           
	         while(reader.readRecord()){ //逐行读入除表头的数据      
	             csvList.add(reader.getValues());  
	         }              
	         reader.close();  
	           
	         for(int row=0;row<csvList.size();row++){  
	               
	             String  cell = csvList.get(row)[3]; //取得第row行第0列的数据  
	             System.out.println(cell);  
	               
	         }  
	           
	           
	    }catch(Exception ex){  
	        System.out.println(ex);  
	    }  
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CtoT fb=new CtoT();
		fb.readeCsv();
	}

	@Override
	public void process() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(FileBase fb) {
		// TODO Auto-generated method stub
		
	}

}
