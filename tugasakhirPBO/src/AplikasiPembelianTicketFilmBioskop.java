import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiPembelianTicketFilmBioskop extends JFrame {
    private JPanel TicketPanel;
    private JTextField tfSiksa;
    private JTextField tfBudi;
    private JTextField tfJhon;
    private JButton bayarButton;
    private JButton keluarButton;
    private JTextField tfTotal;
    private JButton batalButton;
    private JTextField tfNama;
    private JTextField tfAquaman;


    public AplikasiPembelianTicketFilmBioskop() {

        bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  hasilSiksa, hasilBudi, hasilJhon, hasilAqua, Total;
                String namaPelanggan = tfNama.getText();

                // Mengambil nilai dari text field dan konversi ke angka
                try {
                    hasilSiksa = Integer.parseInt(tfSiksa.getText());
                    hasilBudi = Integer.parseInt(tfBudi.getText());
                    hasilJhon = Integer.parseInt(tfJhon.getText());
                    hasilAqua = Integer.parseInt(tfAquaman.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                    return;
                }
                // Harga tiket film
                double hargaSiksa = 35000;
                double hargaBudi = 30000;
                double hargaJhon = 30000;
                double hargaAqua = 30000;

                // Menghitung total harga tiket
                Total = (hasilSiksa * hargaSiksa) + (hasilBudi * hargaBudi) + (hasilJhon * hargaJhon) + (hasilAqua * hargaAqua);

                // Menampilkan total harga tiket
                tfTotal.setText("Total Harga: Rp." + Total);
            }
        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfSiksa.setText("");
                tfBudi.setText("");
                tfJhon.setText("");
                tfAquaman.setText("");
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double hasilSiksa, hasilBudi, hasilJhon, hasilAqua, Total;
                String namaPelanggan = tfNama.getText();

                // Mengambil nilai dari text field dan konversi ke angka
                try {
                    hasilSiksa = Integer.parseInt(tfSiksa.getText());
                    hasilBudi = Integer.parseInt(tfBudi.getText());
                    hasilJhon = Integer.parseInt(tfJhon.getText());
                    hasilAqua = Integer.parseInt(tfAquaman.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                    return;
                }

                // Harga tiket film
                double hargaSiksa = 35000;
                double hargaBudi = 30000;
                double hargaJhon = 30000;
                double hargaAqua = 30000;

                // Menghitung total harga tiket
                Total = (hasilSiksa * hargaSiksa) + (hasilBudi * hargaBudi) + (hasilJhon * hargaJhon) + (hasilAqua * hargaAqua);

                // Menampilkan total harga tiket
                tfTotal.setText("Total Harga: Rp." + Total);

                // Menampilkan hasil pemesanan
                String detailPemesanan = "Detail Pemesanan:\n" +
                        "Pelanggan: " + namaPelanggan + "\n" +
                        "Jumlah tiket Siksa: " + hasilSiksa + "\n" +
                        "Jumlah tiket Budi: " + hasilBudi + "\n" +
                        "Jumlah tiket Jhon: " + hasilJhon + "\n" +
                        "Jumlah tiket Aquaman: " + hasilAqua + "\n" +
                        "Total Harga: Rp." + Total;

                JOptionPane.showMessageDialog(null, detailPemesanan, "Hasil Pemesanan", JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AplikasiPembelianTicketFilmBioskop");
        frame.setContentPane(new AplikasiPembelianTicketFilmBioskop().TicketPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
