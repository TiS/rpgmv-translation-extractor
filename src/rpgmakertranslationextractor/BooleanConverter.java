package rpgmakertranslationextractor;

import org.jdesktop.beansbinding.Converter;

/**
 *
 */
public class BooleanConverter extends Converter<String, Boolean> {

    @Override
    public Boolean convertForward(String value) {
        return value.isEmpty() ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override
    public String convertReverse(Boolean value) {
        return value ? "true" : "false";
    }
    
}
