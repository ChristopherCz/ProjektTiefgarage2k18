/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkDeck;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Philipp Höfling
 */
@Stateless
@ManagedBean

public class FahrzeugBean {

    public int getFreieparkplätze() {
        return freieparkplätze;
    }

    private void setFreieparkplätze(int freieparkplätze) {
        this.freieparkplätze = freieparkplätze;
    }

    int freieparkplätze = Fahrzeuganzahl.getFreieStudentenParkplätze();
}
