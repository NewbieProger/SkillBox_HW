public class Ages {
    public static void main(String[] args) {
        int vasyaAge = 23;
        int mashaAge = 20;
        int petyaAge = 0;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge < mashaAge && vasyaAge < petyaAge) {
            min = vasyaAge;
        } else if (vasyaAge < mashaAge || vasyaAge < petyaAge) {
            middle = vasyaAge;
        } else max = vasyaAge;

        if (mashaAge < vasyaAge && vasyaAge < petyaAge) {
            min = mashaAge;
        } else if (mashaAge < vasyaAge || mashaAge < petyaAge) {
            middle = mashaAge;
        } else max = mashaAge;

        if (middle != -1 && max != -1) {
            min = petyaAge;
        } else if (min != -1 && max != -1) {
            middle = petyaAge;
        } else max = petyaAge;

        System.out.println("Minimal age: " + min + "\nMiddle age: " + middle + "\nMaximum age: " + max);
    }
}
