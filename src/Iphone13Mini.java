public class Iphone13Mini implements Iphone{

    int internalMemory= 512;
    int battery=6000;
    String processorModel="A14 Bionic";
    TypeIphoneEnum type=TypeIphoneEnum.IPHONE_13_MINI;


    @Override
    public String exibirDetalhes() {
        return "Iphone{" +
                "Model= " + type +
                ", internalMemory=" + internalMemory +
                ", battery=" + battery +
                ", processorModel='" + processorModel + '\'' +
                '}';
    }


}
