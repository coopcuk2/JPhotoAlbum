package fi.iki.jka;

import fi.iki.jka.utils.SlideshowViewer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JPhotoFrameTest {



    //Test that JPhotoFrame calls ShowSlideshow with correct interval
    @Test
    public void callingJPhotoFrameShowSlideshowCallsSlideshowViewerShowSlideshowWithIntervalOf5000() throws Exception {

        JPhotoFrame jPhotoFrame = new JPhotoFrame();

        SlideshowViewer slideshowViewer = mock(SlideshowViewer.class);

        jPhotoFrame.showSlideshow(slideshowViewer);

        ArgumentCaptor<Integer> intervalCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(slideshowViewer).showSlideshow(Matchers.any(JPhotoFrame.class), intervalCaptor.capture());

        Assert.assertEquals(5000, intervalCaptor.getValue().intValue());

    }

}