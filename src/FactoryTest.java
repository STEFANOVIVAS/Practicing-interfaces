public class FactoryTest {
    public static void main(String[] args) {
        IphoneFactory factory=new IphoneFactory();
        TypeIphoneEnum typeIphone9=TypeIphoneEnum.IPHONE_9;
        Iphone iphone9=factory.cadastrarIphone(typeIphone9);

        System.out.println(iphone9.exibirDetalhes());

        TypeIphoneEnum typeIphone13=TypeIphoneEnum.IPHONE_13_MINI;
        Iphone iphone13=factory.cadastrarIphone(typeIphone13);
        System.out.println(iphone13.exibirDetalhes());

        TypeIphoneEnum typeIphoneX=TypeIphoneEnum.IPHONE_X;
        Iphone iphoneX=factory.cadastrarIphone(typeIphoneX);
        System.out.println(iphoneX.exibirDetalhes());
    }
}
