package GUI;

import java.awt.event.*;

public class Handler extends MouseAdapter implements ActionListener {
    
    private Application model;
    private Form view;
    
    public Handler() {
        model = new Application();
        view = new Form();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.resetView();
        view.setId("M-" + model.newId());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnDaftar())) {
            String id = view.getId();
            String name = view.getName();
            String email = view.getEmail();
            String jenisKelamin = view.getJenisKelamin();
            
            model.addMhs(id, name, email, jenisKelamin);
            
//            Mahasiswa mhs = new Mahasiswa(name, email, jenisKelamin);
            view.resetView();
            view.setId("M-" + model.newId());
        }
    }
    
//    @Override
//    public void mousePressed(MouseEvent me) {
//        Object source = me.getSource();
//        if (source.equals(view))
//    }
    
}
