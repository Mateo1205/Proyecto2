package consola;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelCliente extends JPanel implements ActionListener{
	private Image imagen ;
	private InterfazPrincipal interfazPrincipal;
	private JButton botonRegistrarEmpleado;
	private JButton BtonRegistrarCliente;
	private JButton btonEliminar;
	
	public PanelCliente(InterfazPrincipal interfazPrincipal) {
		this.interfazPrincipal = interfazPrincipal;
		cargarImagen();
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		// Image
				c.gridx = 0;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				imagen = imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
				JLabel lJLabel = new JLabel(new ImageIcon(imagen)) ;
				lJLabel.setSize(50,50);
				add(lJLabel, c);
				c = new GridBagConstraints();
				
		// JLabel "Cliente"
		c.gridx = 0;
		c.gridy = 5; 
		JLabel labelCliente = new JLabel("Cliente");
		labelCliente.setFont(new Font(labelCliente.getFont().getName(),Font.ITALIC,25));
		add(labelCliente, c);
		
		
		// Label Nombre y Nombre Cliente
		//Label
		JPanel PanelInfo = new JPanel();
		PanelInfo.setLayout(new GridLayout(3,2));
		JLabel labelNombre = new JLabel("Nombre");
		Font fontnombre = labelNombre.getFont();
		labelNombre.setFont(new Font(fontnombre.getName(), Font.PLAIN, 25));
		PanelInfo.add(labelNombre);
		//NombreCliente
		JLabel labelNombreValor = new JLabel(administradorLocal.getNombre());
		Font fontNombre = labelNombreValor.getFont();
		labelNombreValor.setFont(new Font(fontNombre.getName(), Font.ITALIC, 25));
		PanelInfo.add(labelNombreValor);

		// JLabel "Usuario"
		JLabel labelUsuario = new JLabel("Usuario:");
		Font fontu = labelUsuario.getFont();
		labelUsuario.setFont(new Font(fontu.getName(),Font.PLAIN,25));
		PanelInfo.add(labelUsuario);

		// JLabel con el nombre de usuario del administrador
		JLabel labelUsuarioValor = new JLabel(administradorLocal.getUsuario());
		Font fontUsuario = labelUsuarioValor.getFont();
		labelUsuarioValor.setFont(new Font(fontUsuario.getName(), Font.ITALIC, 25)); 
		PanelInfo.add(labelUsuarioValor);

		// JLabel "Sede"
		JLabel labelSede = new JLabel("Sede:");
		labelSede.setFont(new Font(labelSede.getFont().getName(),Font.PLAIN,25));
		PanelInfo.add(labelSede);

		// JLabel con el nombre de la sede del administrador
		JLabel labelSedeValor = new JLabel(administradorLocal.getSede());
		Font fontSede = labelSedeValor.getFont();
		labelSedeValor.setFont(new Font(fontSede.getName(), Font.ITALIC, 25)); 
		PanelInfo.add(labelSedeValor);
		// JLabel "Nombre"
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.insets=new Insets(1, 10, 1, 1);
		add(PanelInfo,c);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void cargarImagen() {
		try {
			imagen  = ImageIO.read(new File("./data/Imagenes/usuario.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
