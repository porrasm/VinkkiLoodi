/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import vinkkiloodi.domain.Vinkki;

/**
 *
 * @author sami
 */
public class TekijaSisaltaa implements Matcher {
    
    private String teksti;
    
    public TekijaSisaltaa(String teksti) {
        this.teksti = teksti;
    }
    
    @Override
    public boolean matches(Vinkki v) {
        return v.getTekija().toLowerCase().contains(teksti);
    }
    
}
