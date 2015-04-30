import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTela {
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) screensize.getWidth();
    int height = (int) screensize.getHeight();
    
    public String toString(){
    	return "A resolução da sua tela é " + width + "x" + height;
    }
}
