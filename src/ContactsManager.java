public class ContactsManager {
    private Contact[] myContacts;
    private int contactsCount;

    public ContactsManager() {
        this.contactsCount = 0;
        this.myContacts = new Contact[500];
    }

    public void addContact(Contact contact) {
        myContacts[contactsCount] = contact;
        contactsCount++;
    }

    public String searchContact(String name) {
        for (int i = 0; i < contactsCount; i++) {
            if (myContacts[i].name().equalsIgnoreCase(name)) {
                return myContacts[i].phoneNumber();
            }
        }
        return null;
    }
}
