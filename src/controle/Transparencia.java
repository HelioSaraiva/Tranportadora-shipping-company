/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Buzato
 */
public class Transparencia {
    
        public void aplTransparencia(JFrame frame){
            frame.setUndecorated(true);
            frame.setBackground(new Color(0,0,0,0));
        }
}
