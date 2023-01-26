public class IphoneX implements Iphone{

    int internalMemory= 128;
    int battery=5000;
    String processorModel="A11 Bionic";
    TypeIphoneEnum type=TypeIphoneEnum.IPHONE_X;


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
