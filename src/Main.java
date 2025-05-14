public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact("COULIBALY RUTH","95125774");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("SOLANGE","65432");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("PRISCILLE","321");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("Sopie Lambert", "0678912345");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact("Thomas yao","623456789");
        myContactsManager.addContact(contact5);

        String phoneNumber = myContactsManager.searchContact("COULIBALY RUTH");

        if (phoneNumber != null) {
            System.out.println("Le numéro de COULIBALY RUTH est " + phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}