package fi.iki.jka.utils;

import fi.iki.jka.JPhotoFrame;

import javax.swing.*;

public class JOptionsPaneHelper {

    public void showMessageDialog(JPhotoFrame parentComponent, String message, String appName, int errorMessage) {
        JOptionPane.showMessageDialog(parentComponent, message,
                appName, errorMessage);
    }
}
