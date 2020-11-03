//package com.example.sse.customlistview_sse;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class KahnActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_kahn);
//    }
//}
package com.example.sse.customlistview_sse;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
public class KahnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kahn_play);
        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.star_trek;
        Uri uri = Uri.parse(videoPath);
        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}