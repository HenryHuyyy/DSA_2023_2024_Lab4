public class LinkList {
    private Link first; // ref to first link on list

    // -------------------------------------------------------------
    public LinkList() {
        first = null; // no links on list yet
    }

    // -------------------------------------------------------------
    public boolean isEmpty() {
        return (first == null);
    }

    // -------------------------------------------------------------
    // insert at start of list
    public void insertFirst(int id, double dd) { // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // -------------------------------------------------------------
    public Link deleteFirst() // delete first item
    { // (assumes list not empty)
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp; // return deleted link
    }

    // -------------------------------------------------------------
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        Link current = first;
        if(current != null) {
            while(current.next != null) {
                current = current.next;
            }
        }
        return current;
    }

    public String toString() {
        String result = "List: ";
        Link current = first;
        while (current != null) {
            result += "{" +current.iData+ " ," +current.dData+ "} ";
            current = current.next;
        }
        return result;
    }
    // -------------------------------------------------------------
}
