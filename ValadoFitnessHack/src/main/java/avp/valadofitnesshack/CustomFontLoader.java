/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Esta clase permite el uso de fuentes personalizadas, cargándolas desde un archivo local
 * @author albert
 */
package avp.valadofitnesshack;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

/**
 *
 * @author Albert
 */
public class CustomFontLoader {
    public static Font loadCustomFont(String fontPath, float size) {
        try {
            // Cargamos la fuente desde el archivo
            File fontFile = new File(fontPath);
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(size);

            // Registrmos la fuente en el GraphicsEnvironment
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;
        } catch (Exception e) {
            e.printStackTrace();
            
            return null;
        }
    }
}
