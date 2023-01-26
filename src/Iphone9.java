public class Iphone9 implements Iphone{

    int internalMemory= 64;
    int battery=4000;
    String processorModel="A10 Bionic";
    TypeIphoneEnum type=TypeIphoneEnum.IPHONE_9;


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
