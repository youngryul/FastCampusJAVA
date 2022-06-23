package ch13;


import java.util.TreeSet;
import java.util.Iterator;


public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}
	

	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
//		for(int i =0; i<arrayList.size();i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
		}
	}
		
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		
		for( Member member : treeSet ) {
			System.out.println(member);
		}
		System.out.println();
	}



	}
	
	
	
	

