/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgmakertranslationextractor;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Tomasz Struczyński <t.struczynski@gmail.com>
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
