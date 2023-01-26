import java.lang.reflect.Type;

public class IphoneFactory {

    public Iphone cadastrarIphone(TypeIphoneEnum typeIphone) {
        if (typeIphone.equals(TypeIphoneEnum.IPHONE_9)){
            return new Iphone9();
        }
        else if (typeIphone.equals(TypeIphoneEnum.IPHONE_13_MINI)){
            return new Iphone13Mini();
        }
        else {
            return new IphoneX();
        }

    }

}
