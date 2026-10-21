package la;

import android.media.MediaPlayer;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        WelcomeDistributionActivity.Companion companion = WelcomeDistributionActivity.INSTANCE;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(true);
    }
}
