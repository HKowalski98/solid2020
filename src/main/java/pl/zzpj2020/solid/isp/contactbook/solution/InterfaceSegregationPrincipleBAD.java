package pl.zzpj2020.solid.isp.contactbook.solution;

class InterfaceSegregationPrincipleBAD {




	public static void main(String[] args) {

		InterfaceSegregationPrincipleBAD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleBAD();
		interfaceSegregationPrinciple.contactPeople();

	}

	public void contactPeople() {

		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
		contact.sendEmail(contact.getEmailAddress(), "promocja", "tanio dzisiaj!");
		contact.makeCall(contact.getTelephone());
	}
	

}
