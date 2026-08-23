
public class Main {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updatedIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];

        // Copy every element into snapshot.
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;

        // Update through liveView.
        liveView[updatedIndex] = updatedValue;

        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int value : original) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("Snapshot: ");
        for (int value : snapshot) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Same object: " + (original == liveView));
        // Validate requestedIndex before accessing original.
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
