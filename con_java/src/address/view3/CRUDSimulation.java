package address.view3;

import java.util.List;
import java.util.Map;

public class CRUDSimulation {

	public static void main(String[] args) {
		CRUDSimulation cs = new CRUDSimulation();
		
		List<Map<String,Object>> addressList = null;
		
		RetrieveAddrEty retEty = new RetrieveAddrEty();
		
		addressList = retEty.myBatisRetrieve();	
		
		System.out.println(addressList); //결국 while문에 rs.getString("name")~ 긴 코드를 안써도 되기 때문에. 효율적임
		
		

	}
}
