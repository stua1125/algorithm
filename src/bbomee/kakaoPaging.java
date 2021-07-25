package bbomee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kakaoPaging {

	public static void main(String[] args) {
		String[][] items = {{"item1", "10", "15"}
							,{"item2", "3", "4"}
							,{"item3", "17", "8"}};
		int orderBy = 1;
		int orderDiretion = 0;
		int pageSize = 2;
		int pageNumber = 0;
		//pageSize * (pageNum-1) + 1 ~ pageSize * pageNum;
		// items.length%pageSize== 0이면 items.length/pageSize가 갯수  아니면 items.length/pageSize + 1 

				
		String[] ansArr = solve(items, orderBy, orderDiretion, pageSize, pageNumber);
		for(int i = 0; i < ansArr.length; i++) {
			//System.out.println(ansArr[i]);
		}
	}
	
	public static String[] solve(String[][] items, int orderBy, int orderDiretion, int pageSize, int pageNumber) {
		sortItems(items, orderBy, orderDiretion);
		/*for(int i = 0; i < items.length; i++) {
			System.out.println(items[i][0]);
		}*/
		
		
		int maxPage = items.length/pageSize;
		if(items.length%pageSize != 0) {
			maxPage++;
		}
		System.out.println("maxPage: " +maxPage);
		List<List<String>> al = new ArrayList<List<String>>();
		
		for(int i = 0; i < maxPage; i++) {
			List<String> temp = new ArrayList<String>();
			for(int j = 0; j < pageSize; j++) {
				if(i*pageSize+j > items.length) {
					break;
				}
				temp.add(items[i*pageSize+j][0]);
			}
			al.add(temp);
		}
		System.out.println("pageNumber: " + pageNumber);
		List<String> ansList = al.get(pageNumber);
		for(int i = 0; i < ansList.size(); i++) {
			System.out.println(ansList.get(i));
		}
		
		String[] ans = new String[ansList.size()];
		for(int i = 0; i < ansList.size(); i++) {
			ans[i] = ansList.get(i);
		}
		
		return ans;
	}
	
	public static String[][] sortItems(String[][] items, int order, int direction) {
		if(direction == 0) {
			if(order == 0) {
				for(int i = 0 ; i < items.length; i++) {
					for(int j = 0; j < items.length-i-1; j++) {
						if(items[j][0].compareTo(items[j+1][0]) > 0) {
							String []temp = items[j];
							items[j] = items[j+1];
							items[j+1] = temp;
						}
					}
				}
			} else {
				for(int i = 0 ; i < items.length; i++) {
					for(int j = 0; j < items.length-i-1; j++) {
						if(Integer.parseInt(items[j][order]) > Integer.parseInt(items[j+1][order])) {
							String []temp = items[j];
							items[j] = items[j+1];
							items[j+1] = temp;
						}
					}
				}
			}
		} else {
			if(order == 0) {
				for(int i = 0 ; i < items.length; i++) {
					for(int j = 0; j < items.length-i-1; j++) {
						if(items[j][0].compareTo(items[j+1][0]) < 0) {
							String []temp = items[j];
							items[j] = items[j+1];
							items[j+1] = temp;
						}
					}
				}
			} else {
				for(int i = 0 ; i < items.length; i++) {
					for(int j = 0; j < items.length-i-1; j++) {
						if(Integer.parseInt(items[j][order]) < Integer.parseInt(items[j+1][order])) {
							String []temp = items[j];
							items[j] = items[j+1];
							items[j+1] = temp;
						}
					}
				}
			}
		}
		
		return items;
	}
}
