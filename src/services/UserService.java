/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import connexion.Connexion;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author X1 YOGA
 */
public class UserService {

    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            System.out.println("Erreur hashPassword : " + e.getMessage());
            return null;
        }
    }

    public boolean updatePasswordByEmail(String email, String newPass) {
        try {
            String hashedPassword = hashPassword(newPass);
            String sql = "UPDATE utilisateur SET password = ? WHERE email = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);

            ps.setString(1, hashedPassword);
            ps.setString(2, email);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Erreur updatePasswordByEmail : " + e.getMessage());
            return false;
        }
    }

    public boolean checkLogin(String email, String password) {
        try {
            String hashedPassword = hashPassword(password);
            String sql = "SELECT * FROM utilisateur WHERE email = ? AND password = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, hashedPassword);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (Exception e) {
            System.out.println("Erreur checkLogin : " + e.getMessage());
            return false;
        }
    }

    public String generateRandomPassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@_!)(&?%$#";
        StringBuilder password = new StringBuilder();
        java.util.Random rnd = new java.util.Random();
        for (int i = 0; i < 8; i++) {
            password.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return password.toString();
    }

    public void resetPassword(String emailTo) {

        final String newPassword = generateRandomPassword();

        boolean updated = updatePasswordByEmail(emailTo, newPassword);

        if (!updated) {
            JOptionPane.showMessageDialog(null,
                    "Erreur : Email introuvable dans la base !",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        final String senderEmail = "salmalaouy133@gmail.com";
        final String senderPassword = "vttf bhqq kock alqi";

        final String subject = "Réinitialisation du mot de passe";
        String msg
                = "Bonjour,\n\nVotre nouveau mot de passe est : "
                + newPassword
                + "\n\nAtelier de reparation automobilr ";

        try {
            java.util.Properties props = new java.util.Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            javax.mail.Session session = javax.mail.Session.getInstance(
                    props,
                    new javax.mail.Authenticator() {
                        @Override
                        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                            return new javax.mail.PasswordAuthentication(senderEmail, senderPassword);
                        }
                    }
            );

            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new javax.mail.internet.InternetAddress(senderEmail));
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                    javax.mail.internet.InternetAddress.parse(emailTo));
            message.setSubject(subject);
            message.setText(msg);

            javax.mail.Transport.send(message);

            JOptionPane.showMessageDialog(null,
                    "Votre nouveau mot de passe envoyé par email  ET enregistré !",
                    "Succès",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erreur envoi email : " + e.getMessage(),
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public boolean checkUserExists(String email) {
        try {
            String sql = "SELECT * FROM utilisateur WHERE email = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.out.println("Erreur checkUserExists : " + e.getMessage());
            return false;
        }
    }

}
