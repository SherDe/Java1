public class MyFirstApplications {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;

        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }}}