public class Main {
    public static void main(String[] args) {
        LinkedPositionalList<String> itinerary = new LinkedPositionalList<>();

        Position<String> p1 = itinerary.addLast("Eiffel Tower");
        Position<String> p2 = itinerary.addLast("Louvre Museum");
        Position<String> p3 = itinerary.addLast("Notre Dame");

        itinerary.addAfter(p1, "Coffee Shop");
        itinerary.addBefore(p3, "River Cruise");

        System.out.println("Final Itinerary:");
        for (String stop : itinerary) {
            System.out.println("- " + stop);
        }
    }
}
