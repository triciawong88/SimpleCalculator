package sg.com.kaplan.simplecalculator;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button)findViewById(R.id.button3);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        //displays a video file
        VideoView mVideoView1 = (VideoView)findViewById(R.id.videoView1);
        String uriPath2 = "android.resource://sg.com.kaplan.simplecalculator/"+R.raw.movie;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView1.setVideoURI(uri2);
        mVideoView1.requestFocus();
        mVideoView1.start();
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mVideoView1 = (VideoView) findViewById(R.id.videoView1);
                // VideoView mVideoView = new VideoView(this);
                String uriPath = "android.resource://sg.com.kaplan.simplecalculator/" + R.raw.movie;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView1.setVideoURI(uri2);
                mVideoView1.requestFocus();
                mVideoView1.start();
            }
        });
    }
}