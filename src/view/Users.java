package view;

import java.awt.*;
import javax.swing.*;

public class Users extends JFrame {
	private static final long serialVersionUID = 1L;
	private Font font;
	private ImageIcon iconAddBook, iconAddUser, iconLendBook, iconBooks, iconUser, iconHist, iconStat, image;
	private JPanel contentPanel, researchesPanel, buttonsPanel, navbarPanel, imagePanel, filterPanel, searchPanel;
	private JTextArea textArea_1;
	private JList<String> list;
	private JButton btnAddBookPage, btnAddUserPage, btnLendBookPage, btnLib, btnUsers, btnHist, btnStat, btnFilter, btnFind;
	private JRadioButton rbAllUsers, rbNoBook, rbWithBooks, rbApto, rbName;
	private ButtonGroup group1, group2;
	private JLabel label1, label2, imageLabel;
	private JTextField text;
	
	public Users() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		
		// --- Resolução da Tela ---
		int screenW = d.width;
		int screenH = d.height;
		System.out.println(screenW + " - " + screenH);
		
		
		// --- Medidas para Tela ---
		// --- 30% da Tela ---
		int screen30 = (int) (screenW - (screenW * 0.7));
		// --- 40% da Tela ---
		int screen40 = (int) (screenW - (screenW * 0.6));
		// --- Altura da Tela ---
		int height10 = (int) (screenH - 217);
		
		// --- Frame ---
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setLocationRelativeTo(null);
		
		
		// --- Fontes Utilizadas ---
		font = new Font("Poppins", Font.PLAIN, 12);
		
		// --- Icones Utilizados ---
		iconAddBook = new ImageIcon("./src/assests/add_book.png");
		iconAddUser = new ImageIcon("./src/assests/add_user.png");
		iconLendBook = new ImageIcon("./src/assests/give_book.png");
		iconBooks = new ImageIcon("./src/assests/book_.png");
		iconUser = new ImageIcon("./src/assests/user_.png");
		iconHist = new ImageIcon("./src/assests/historical_.png");
		iconStat = new ImageIcon("./src/assests/analytics_.png");
		
		// --- Imagens Utilizadas ---
		image = new ImageIcon("./src/assests/library.png");
		
		// --- Teste Lista ---
		//String week[] = {"SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO"};
		String week[] = {"SEGUNDA-", "TERÇA-", "QUARTA-", "QUINTA-", "SEXTA-", "SABADO-", "DOMINGO-"};
		//String week[] = {"-SEGUNDA", "-TERÇA", "-QUARTA", "-QUINTA", "-SEXTA", "-SABADO", "-DOMINGO"};
		
		
		// --- Painel Principal ---
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(0,139, 139));
		contentPanel.setLayout(null);
		setContentPane(contentPanel);
		
		
		// --- Painel dos Botões ---
		buttonsPanel = new JPanel();
		buttonsPanel.setBackground(new Color(255, 0, 0));
		buttonsPanel.setBounds(0, 0, screenW+1, 89);
		buttonsPanel.setLayout(null);
		
			// --- Botões ---
			// --- Botão da Pagina de Adicionar Livro ---
			btnAddBookPage = new JButton("Adicionar Livro",iconAddBook);
			btnAddBookPage.setBackground(new Color(106, 90, 205));
			btnAddBookPage.setBounds(32, 22, 158, 44);
			btnAddBookPage.setFont(font);
	
			// --- Botão da Pagina de Adicionar Usuario ---
			btnAddUserPage = new JButton("Adicionar Usuário",iconAddUser);
			btnAddUserPage.setBackground(new Color(106, 90, 205));
			btnAddUserPage.setBounds(215, 22, 176, 44);
			btnAddUserPage.setFont(font);
			
			// --- Botão da Pagina de Emprestar Livro ---
			btnLendBookPage = new JButton("Emprestar Livro",iconLendBook);
			btnLendBookPage.setBackground(new Color(106, 90, 205));
			btnLendBookPage.setBounds(415, 22, 163, 44);
			btnLendBookPage.setFont(font);
		
		
		// --- Painel Navbar ---
		navbarPanel = new JPanel();
		navbarPanel.setBackground(new Color(203, 82, 82));
		navbarPanel.setBounds(0, 89, screen30+screen40+1, 58);
		navbarPanel.setLayout(null);
		
			// --- Botões ---
			// --- Botão de Lista de Livros
			btnLib = new JButton("Biblioteca",iconBooks);
			btnLib.setBackground(new Color(106, 90, 205));
			btnLib.setBounds(32, 14, 145, 44);
			btnLib.setFont(font);
			
			// --- Botão de Lista dos Usuários
			btnUsers = new JButton("Usuários",iconUser);
			btnUsers.setBackground(new Color(106, 90, 205));
			btnUsers.setBounds(215, 14, 141, 44);
			btnUsers.setFont(font);
			
			// --- Botão de Lista do Historico
			btnHist = new JButton("Histórico",iconHist);
			btnHist.setBackground(new Color(106, 90, 205));
			btnHist.setBounds(398, 14, 145, 44);
			btnHist.setFont(font);
			
			// --- Botão de Lista de Estatísticas
			btnStat = new JButton("Estatísticas",iconStat);
			btnStat.setBackground(new Color(106, 90, 205));
			btnStat.setBounds(581, 14, 145, 44);
			btnStat.setFont(font);
		
		
		// --- Lista com os Titulos dos Livros ---
		list = new JList<String>(week);
		list.setBounds(0, 147, screen30+10, height10);
		list.setFont(font);
		

		// --- Área Informações dos Livros ---
		textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(192, 192, 192));
		textArea_1.setFont(font);
		textArea_1.setBounds(screen30+10, 147, screen40-9, height10);
		textArea_1.setText("Titulo:");
		textArea_1.setEditable(false);
		
		
		// --- Área das Pesquisas (Painel) ---
		researchesPanel = new JPanel();
		researchesPanel.setBackground(new Color(140, 45, 45));
		researchesPanel.setBounds(screen30+screen40+1, 89, screen30, height10+58);
		researchesPanel.setLayout(null);
		
			// --- Área da Imagem ---
			imagePanel = new JPanel();
			//imagePanel.setBackground(new Color(65, 105, 225));
			imagePanel.setBounds(0, 0, screen30, 160);
			imageLabel = new JLabel(image);
			imagePanel.add(imageLabel);
			
			// --- Painel de Filtar ---
			filterPanel = new JPanel();
			filterPanel.setBackground(new Color(136, 110, 110));
			filterPanel.setBounds(0, 160, screen30, 105);
			filterPanel.setLayout(null);
			
				// --- Label do Painel de Filtro ---
				label1 = new JLabel("--- Filtrar Por ---");
				label1.setBounds(7, 12, 150, 21);
				label1.setFont(font);
			
				// --- RadioButton dos Filtros ---
				rbAllUsers = new JRadioButton("Todos os Moradores", true);
				rbAllUsers.setBounds(5, 44, 120, 15);
				rbAllUsers.setOpaque(false);
				rbAllUsers.setFont(font);
				
				rbNoBook = new JRadioButton("Sem Empréstimo", false);
				rbNoBook.setBounds(125, 44, 120, 15);
				rbNoBook.setOpaque(false);
				rbNoBook.setFont(font);
				
				rbWithBooks = new JRadioButton("Com Empréstimo", false);
				rbWithBooks.setBounds(225, 44, 145, 15);
				rbWithBooks.setOpaque(false);
				rbWithBooks.setFont(font);
			
				// --- Botão de Aplicar Filtro ---
				btnFilter = new JButton("Aplicar Filtro");
				btnFilter.setBackground(new Color(106, 90, 205));
				btnFilter.setBounds(123, 70, 115, 30);
				btnFilter.setFont(font);
				
			// --- Painel de Pesquisar ---
			searchPanel = new JPanel();
			searchPanel.setBackground(new Color(80, 34, 34));
			searchPanel.setBounds(0, 265, screen30, 132);
			searchPanel.setLayout(null);
			
				// --- Label do Painel de Pesquisa ---
				label2 = new JLabel("--- Pesquisar Por ---");
				label2.setBounds(7, 7, 150, 21);
				label2.setFont(font);
			
				// --- RadioButton da Pesquisa ---
				rbApto = new JRadioButton("Apartamento", false);
				rbApto.setBounds(5, 36, 120, 15);
				rbApto.setOpaque(false);
				rbApto.setFont(font);
				
				rbName = new JRadioButton("Nome", false);
				rbName.setBounds(125, 36, 120, 15);
				rbName.setOpaque(false);
				rbName.setFont(font);
				
				// --- Campo para Digitar a Pesquisa ---
				text = new JTextField();
				text.setBounds(22, 66, 315, 28);
				text.setFont(font);
				
				// --- Botão de Procurar ---
				btnFind= new JButton("Procurar");
				btnFind.setBackground(new Color(106, 90, 205));
				btnFind.setBounds(127, 100, 115, 28);
				btnFind.setFont(font);
		
		
		// --- Adiciona Botões no Painel de Botões ---
		buttonsPanel.add(btnAddBookPage);
		buttonsPanel.add(btnAddUserPage);
		buttonsPanel.add(btnLendBookPage);
		
		// --- Adiciona Botões na Navbar ---
		navbarPanel.add(btnLib);
		navbarPanel.add(btnUsers);
		navbarPanel.add(btnHist);
		navbarPanel.add(btnStat);
		
		// --- Adiciona Itens no Painel de Pesquisas ---
		researchesPanel.add(imagePanel);
		researchesPanel.add(filterPanel);
		researchesPanel.add(searchPanel);
		
		// --- Adiciona Itens no Painel de Filtro ---
		filterPanel.add(label1);
		filterPanel.add(rbAllUsers);
		filterPanel.add(rbNoBook);
		filterPanel.add(rbWithBooks);
		filterPanel.add(btnFilter);
		
		// --- Adiciona Itens no Painel de Pesquisa ---
		searchPanel.add(label2);
		searchPanel.add(rbApto);
		searchPanel.add(rbName);
		searchPanel.add(text);
		searchPanel.add(btnFind);
		
		// --- Adiciona RadioButton no Grupo ---
		group1 = new ButtonGroup();
		group1.add(rbAllUsers);
		group1.add(rbNoBook);
		group1.add(rbWithBooks);
		
		group2 = new ButtonGroup();
		group2.add(rbApto);
		group2.add(rbName);
		
		// --- Adiciona Itens no Painel ---
		contentPanel.add(buttonsPanel);
		contentPanel.add(navbarPanel);
		contentPanel.add(list);
		contentPanel.add(textArea_1);
		contentPanel.add(researchesPanel);
		
	}
	
}
