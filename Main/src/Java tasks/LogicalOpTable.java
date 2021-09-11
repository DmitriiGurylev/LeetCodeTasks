class LogicalOpTable {
	public static void main(String args[]){
		boolean p,q;
		byte pp,qq,p_and_q,p_or_q,p_xor_q,not_p;
		pp=qq=p_and_q=p_or_q=p_xor_q=not_p = 0;
		
		System.out.println("P \tQ \tAND \tOR \tXOR \tNOT");
		
		p = false;
		q = false;
		if (p) pp = 1;
		if (!p) pp = 0;
		if (q) qq = 1;
		if (!q) qq = 0;
		if (p&q) p_and_q = 1;
		if (!(p&q)) p_and_q = 0;
		if (p|q) p_or_q = 1;
		if (!(p|q)) p_or_q = 0;
		if (p^q) p_xor_q = 1;
		if (!(p^q)) p_xor_q = 0;
		if (!p) not_p = 1;
		if (p) not_p = 0;
		System.out.println(pp +"\t"+ pp +"\t"+ p_and_q +"\t"+ p_or_q +"\t"+ p_xor_q +"\t"+ not_p);
		
		p = false;
		q = true;if (p) pp = 1;
		if (!p) pp = 0;
		if (q) qq = 1;
		if (!q) qq = 0;
		if (p&q) p_and_q = 1;
		if (!(p&q)) p_and_q = 0;
		if (p|q) p_or_q = 1;
		if (!(p|q)) p_or_q = 0;
		if (p^q) p_xor_q = 1;
		if (!(p^q)) p_xor_q = 0;
		if (!p) not_p = 1;
		if (p) not_p = 0;
		System.out.println(pp +"\t"+ pp +"\t"+ p_and_q +"\t"+ p_or_q +"\t"+ p_xor_q +"\t"+ not_p);
		
		p = true;
		q = false;if (p) pp = 1;
		if (!p) pp = 0;
		if (q) qq = 1;
		if (!q) qq = 0;
		if (p&q) p_and_q = 1;
		if (!(p&q)) p_and_q = 0;
		if (p|q) p_or_q = 1;
		if (!(p|q)) p_or_q = 0;
		if (p^q) p_xor_q = 1;
		if (!(p^q)) p_xor_q = 0;
		if (!p) not_p = 1;
		if (p) not_p = 0;
		System.out.println(pp +"\t"+ pp +"\t"+ p_and_q +"\t"+ p_or_q +"\t"+ p_xor_q +"\t"+ not_p);
					
		p = true;
		q = true;if (p) pp = 1;
		if (!p) pp = 0;
		if (q) qq = 1;
		if (!q) qq = 0;
		if (p&q) p_and_q = 1;
		if (!(p&q)) p_and_q = 0;
		if (p|q) p_or_q = 1;
		if (!(p|q)) p_or_q = 0;
		if (p^q) p_xor_q = 1;
		if (!(p^q)) p_xor_q = 0;
		if (!p) not_p = 1;
		if (p) not_p = 0;
		System.out.println(pp +"\t"+ pp +"\t"+ p_and_q +"\t"+ p_or_q +"\t"+ p_xor_q +"\t"+ not_p);
		}
	
}