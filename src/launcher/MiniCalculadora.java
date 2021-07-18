package launcher;

import view.formPrincipal;

/**
 *
 * @author joarevalos
 */
public class MiniCalculadora {

    public static void main(String[] args) {

        formPrincipal vp = new formPrincipal();
        vp.setTitle("Calculadora básica");
        vp.setSize(1200, 700);
        vp.setLocationRelativeTo(null);
        vp.setDefaultCloseOperation(vp.DO_NOTHING_ON_CLOSE);
        vp.setVisible(true);

    }

}
