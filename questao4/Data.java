public class Data {
    private String d="";
    private String m="";
    private String a="";
    int mode = -1;
    
    public Data(int dia, int mes, int ano){
        this.d="" +dia;
        this.m= "" + mes ;
        this.a="" +ano;
        this.mode=1;
        this.mostrar();
    }
    
    public Data(int dia, String mes, int ano){
        this.d="" +dia;
        this.m="" +mes;
        this.a="" +ano;
        this.mode=2;
        this.mostrar();
    }
    
    public Data(int dia,int ano){
        this.d="" +dia;
        this.a="" +ano;
        this.mode=3;
        this.mostrar();
    }

    void mostrar(){
        int tamD = d.length();
        int tamA = a.length();
        int tamM = m.length();
        int i;
        switch (mode) {
            case 1:
                for (i=0;i<2-tamD;i++){
                    d='0'+d;
                }
                for (i=0;i<2-tamM;i++){
                    m='0'+m;
                }
                for (i=0;i<4-tamA;i++){
                    a='0'+a;
                }
                System.out.printf("%s/%s/%s \n",d,m,a);
                break;
            case 2:
                for (i=0;i<2-tamD;i++){
                    d='0'+d;
                }
                System.out.printf("%s %s, %s\n",m,d,a);
                break;
            case 3:
                for (i=0;i<3-tamD;i++){
                    d='0'+d;
                }
                for (i=0;i<4-tamA;i++){
                    a='0'+a;
                }
                System.out.printf("%s %s\n",d,a);
                break;
            default:
                break;
        }
    }
}