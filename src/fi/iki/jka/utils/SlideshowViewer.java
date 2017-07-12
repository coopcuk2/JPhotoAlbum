package fi.iki.jka.utils;

import fi.iki.jka.JPhotoCollection;
import fi.iki.jka.JPhotoFrame;
import fi.iki.jka.JPhotoList;
import fi.iki.jka.JPhotoShow;

import javax.swing.*;

public class SlideshowViewer {

    private JPhotoCollection photos;
    private JPhotoList list;
    private JOptionsPaneHelper jOptionsPaneHelper;


    public SlideshowViewer(JPhotoCollection photos, JPhotoList list, JOptionsPaneHelper jOptionsPaneHelper) {
        this.photos = photos;
        this.list = list;
        this.jOptionsPaneHelper = jOptionsPaneHelper;
    }

    public void showSlideshow(JPhotoFrame jPhotoFrame, int interval) {
        if (photos.getSize()>0) {
            JPhotoShow show = new JPhotoShow(photos, interval, list);
            show.setVisible(true);
        }
        else
            jOptionsPaneHelper.showMessageDialog(jPhotoFrame, "No photos to show!", JPhotoFrame.APP_NAME, JOptionPane.ERROR_MESSAGE);
    }


}
