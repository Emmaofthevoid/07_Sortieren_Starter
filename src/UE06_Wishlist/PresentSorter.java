package UE06_Wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
//        Present temp;
//        for (int i = 1; i < presents.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (presents[j].desire > presents[j - 1].desire) {
//                    temp = presents[j];
//                    presents[j] = presents[j - 1];
//                    presents[j - 1] = temp;
//                } else {
//                    break;
//                }
//
//            }
//
//        }
        //BubbleSort
        //Äussere schleife
        for (int n = 0; n < presents.length - 1; n++) {
            //Innere Schleife
            for (int i = 0; i < (presents.length - n - 1); i++) {
                if (presents[i].desire > presents[i + 1].desire) {
                    Present temp = presents[i];
                    presents[i] = presents[i + 1];
                    presents[i + 1] = temp;

                }
            }
        }
    }
}
