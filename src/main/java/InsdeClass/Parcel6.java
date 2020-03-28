package InsdeClass;

public class Parcel6 {

    private void internalTracking(String str) {
        String ss = "这样是可以的";
        class PDestionation {
            private String label;
            public PDestionation() {
                this.label = str;
            }

            public String readLabel() {
                return  label;
            }

            public void printSS() {
                System.out.println(ss);
            }
        }

        PDestionation pDestionation = new PDestionation();
        System.out.println(pDestionation.readLabel());
        pDestionation.printSS();

    }

    public static void main(String[] args) {
        final Parcel6 parcel6 = new Parcel6();
        parcel6.internalTracking("dkfalsf;das");
    }
}
