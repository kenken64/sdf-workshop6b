package vtp2022.workshop6b;

public class App 
{
    public static void main( String[] args )
    {
        BoxString b = new BoxString();
        b.setContent("This is a string");

        System.out.println(b.getContent());

        BoxString b2 = new BoxString("This is not a string !");
        System.out.println(b2.getContent());

        Box b3 = new Box();
        b3.setContent(2333);
        System.out.println(b3.getContent());

        b3.setContent(false);
        System.out.println(b3.getContent());

        b3.setContent(new BoxString());
        System.out.println(b3.getContent());

        BoxG<Integer> ggInt = new BoxG<>();

        ggInt.setContent(111);

        BoxG<Boolean> ggBol = new BoxG<>();
        ggBol.setContent(true);
        //ggBol.setContent(1);
        BoxG<Double> ggDbl = new BoxG<>();
        
        ggDbl.setContent(new Double(ggInt.getContent()));;

        String[] lines = new String[10];
        lines[0] = "hello";
        System.out.println(lines);

        // 3x3 matrix of floats
        Float[][] mat = new Float[3][3];

        float[][] mat2 = new float[3][];
        for(int i =0; i < mat2.length; i++){
            mat2[i] = new float[3];
            mat2[i][0] = i;
            mat2[i][1] = i;
            mat2[i][2] = i;
        }

        for(int i =0; i < mat2.length; i++){
            System.out.println(mat2[i][0]);
            System.out.println(mat2[i][1]);
            System.out.println(mat2[i][2]);   
        }
    }
}
