public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); // make new list

        theList.insertFirst(22, 2.99); // insert four items
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList(); // display list

        Link first_element = theList.getFirst();
        System.out.println("First element: {" + first_element.iData + ", " + first_element.dData + "}");
        Link last_element = theList.getLast();
        System.out.println("Last element: {" + last_element.iData + ", " + last_element.dData + "}");
        System.out.println("*****************************");
        System.err.println(theList);


    } // end main()
}
