package Package;

import java.util.ArrayList;


import javax.servlet.http.HttpSession;

public class ProductClass {

   private static int count=0;
   public void setData(String name,String price,HttpSession session) {
	   if(count==0) {
	   ArrayList dataList=new ArrayList();
	   ArrayList dataListTemp=new ArrayList();
	   dataListTemp.add(name);
	   dataListTemp.add(price);
	   dataList.add(this.count, dataListTemp);
	   session.setAttribute("dataList", dataList);
	   ++this.count;
	   
	   }
	   else {
		   ArrayList dataList=(ArrayList) session.getAttribute("dataList");
		   ArrayList dataListTemp=new ArrayList();
		   dataListTemp.add(name);
		   dataListTemp.add(price);
		   dataList.add(this.count, dataListTemp);
		   session.setAttribute("dataList", dataList);
		   ++this.count;
	   }
   }
   public ArrayList getData(HttpSession session) {
	   return (ArrayList)session.getAttribute("dataList");
   }
	

}