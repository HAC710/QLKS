
package Controller;


import Bean.DanhMucBean;
import View.StaffHomeJPanel;
import View.RoomJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StaffChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;

    public StaffChuyenManHinhController(JPanel root) {
        this.root = root;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "StaffHome";
        jpnItem.setBackground(new Color(31,36,42));
        jlbItem.setBackground(new Color(31,36,42));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new StaffHomeJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem)
    {
        this.listItem = listItem;
        for(DanhMucBean item : listItem)
        {
            item.getJlb().addMouseListener(new StaffChuyenManHinhController.LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener
    {
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch(kind)
           {
               case "StaffHome":
                   node = new StaffHomeJPanel();
                   break;
               case "Room":
                   node = new RoomJPanel();
                   break;
               default:
                   break;
                           
           }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
        setChangeBackground(kind);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        kindSelected = kind;
        jpnItem.setBackground(new Color(31,36,42));
        jlbItem.setBackground(new Color(31,36,42));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(31,36,42));
            jlbItem.setBackground(new Color(31,36,42));
    }

    @Override
    public void mouseExited(MouseEvent e) {
            jpnItem.setBackground(new Color(153,153,0));
            jlbItem.setBackground(new Color(153,153,0));
    }
    
    }
    
    private void setChangeBackground(String kind)
    {
        for(DanhMucBean item : listItem)
        {
            if(item.getKind().equalsIgnoreCase(kind))
            {
                item.getJpn().setBackground(new Color(31,36,42));
                item.getJlb().setBackground(new Color(31,36,42));
            }
            else
            {
                item.getJpn().setBackground(new Color(153,153,0));
                item.getJlb().setBackground(new Color(153,153,0));
            }
        }
    }  
}


