public class Person1{
    private int dispatchID;
    private Integer orderlD;

    public void dispatcher(double ticketID)
    {
        dispatchID = (int) ticketID; // Assigning ticketID to dispatchID
        final Double dispTicket = Double.valueOf(ticketID);
        System.out.println("Dispatch ticket ID: " + dispTicket);
        synchronized (this)
        {
            System.out.print("Dispatching product for orderID: " + orderlD);
            System.out.println(" with dispatch ID: " + dispatchID); // Using dispatchID
        }
    }  
    public void dispatcherWithoutID(double ticketID)
    {
        final Double dispTicket = Double.valueOf(ticketID);
        System.out.println("Dispatch ticket ID: " + dispTicket);
        synchronized (this)
        {
            System.out.print("Dispatching product for orderID: " + orderlD);
            
        }
    }  
}