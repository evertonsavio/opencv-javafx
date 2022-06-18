package com.example.video;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.opencv.videoio.VideoCapture;

import java.util.concurrent.ScheduledExecutorService;

public class HelloController
{
    @FXML
    private Button button;
    @FXML
    private ImageView currentFrame;

    // a timer for acquiring the video stream
    private ScheduledExecutorService timer;
    // the OpenCV object that realizes the video capture
    private VideoCapture capture = new VideoCapture();
    // a flag to change the button behavior
    private boolean cameraActive = false;
    // the id of the camera to be used
    private static int cameraId = 0;

    @FXML
    protected void startCamera(ActionEvent event)
    {
    }

    private void stopAcquisition()
    {
    }

    protected void setClosed()
    {
        this.stopAcquisition();
    }
}