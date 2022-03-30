public class Encapsulation {
    private Integer i_Number;
    private String s_Text;

    public Integer get_i_Number() {
        return i_Number;
    }

    public void set_i_Number(Integer i_Number) {
        this.i_Number = i_Number;
    }

    public String get_s_Text() {
        return s_Text;
    }

    public void set_s_Text(String s_Text) {
        this.s_Text = s_Text;
    }
}

class Encapsulation_Exercise {
    public static void Exercise() {
        Encapsulation enc_Variable = new Encapsulation();
        enc_Variable.set_i_Number(10);
        enc_Variable.set_s_Text("This is the new variable");

        System.out.println("Elements of enc_Variable:");
        System.out.println("i_Number=" + enc_Variable.get_i_Number());
        System.out.println("s_Text" + enc_Variable.get_s_Text());
    }
}