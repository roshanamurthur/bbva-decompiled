package nd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.dasnano.vdphotoselfiecapture.activities.SelfieActivity;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.dasnano.vdphotoselfiecapture.other.WebVTTBuilder;
import com.veridas.activity.DasActivity;

/* JADX INFO: compiled from: SelfieActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelfieActivity f84503a;

    public a(SelfieActivity selfieActivity) {
        this.f84503a = selfieActivity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        byte b10 = -1;
        switch (action.hashCode()) {
            case -1225845578:
                if (action.equals(SelfieFragment.FRAME_CAPTURED)) {
                    b10 = 0;
                }
                break;
            case 107328522:
                if (action.equals("com.dasnano.selfieCapture.showSelfieFragment.finished")) {
                    b10 = 1;
                }
                break;
            case 729125320:
                if (action.equals("com.dasnano.selfieCapture.selfieFragment.challengeRepeated")) {
                    b10 = 2;
                }
                break;
            case 1083874119:
                if (action.equals(SelfieFragment.SELFIE_FINISHED)) {
                    b10 = 3;
                }
                break;
            case 1116173356:
                if (action.equals(SelfieFragment.CHALLENGE_CAPTURED)) {
                    b10 = 4;
                }
                break;
            case 1481446523:
                if (action.equals(SelfieFragment.PHOTO_CAPTURED)) {
                    b10 = 5;
                }
                break;
            case 2058666316:
                if (action.equals(VDPhotoSelfieCapture.FORCE_STOP)) {
                    b10 = 6;
                }
                break;
        }
        SelfieActivity selfieActivity = this.f84503a;
        switch (b10) {
            case 0:
                if (!selfieActivity.f39534s0) {
                    String stringExtra = intent.getStringExtra(SelfieFragment.FRAME_SELFIE_PATH);
                    String stringExtra2 = intent.getStringExtra(SelfieFragment.FRAME_FACE_PATH);
                    Intent intent2 = new Intent(SelfieActivity.FRAME_CAPTURED);
                    intent2.putExtra(SelfieActivity.FRAME_SELFIE_PATH, stringExtra);
                    intent2.putExtra(SelfieActivity.FRAME_FACE_PATH, stringExtra2);
                    selfieActivity.broadcastIntent(intent2);
                } else {
                    selfieActivity.requestShowSelfieFragment();
                }
                break;
            case 1:
                boolean booleanExtra = intent.getBooleanExtra("com.dasnano.selfieCapture.showSelfieFragment.finished", true);
                if (!booleanExtra) {
                    selfieActivity.requestSelfieFragment();
                    if (selfieActivity.f39533r0) {
                        selfieActivity.broadcastIntent(new Intent(SelfieActivity.CHALLENGE_TO_BE_REPEATED));
                    }
                } else {
                    SelfieActivity.h(selfieActivity);
                    String challengeVideoPath = ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getChallengeVideoPath();
                    String strBuildWebVTTString = ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getChallengeToken() != null ? WebVTTBuilder.buildWebVTTString(((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getChallengeToken()) : null;
                    String frameImagePath = ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getFrameImagePath();
                    if (!selfieActivity.f39533r0) {
                        SelfieActivity.g(selfieActivity, ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getFullImagePath(), ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getCroppedFullImagePath());
                    } else if (challengeVideoPath != null && strBuildWebVTTString != null) {
                        Intent intent3 = new Intent(SelfieActivity.CHALLENGE_CAPTURED);
                        intent3.putExtra(SelfieActivity.CHALLENGE_VIDEO_PATH, challengeVideoPath);
                        intent3.putExtra(SelfieActivity.CHALLENGE_VTT, strBuildWebVTTString);
                        selfieActivity.broadcastIntent(intent3);
                        SelfieActivity.g(selfieActivity, ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getFullImagePath(), ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getCroppedFullImagePath());
                    } else if (frameImagePath != null) {
                        String frameImagePath2 = ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getFrameImagePath();
                        String croppedFrameImagePath = ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getCroppedFrameImagePath();
                        Intent intent4 = new Intent(SelfieActivity.FRAME_CAPTURED);
                        intent4.putExtra(SelfieActivity.FRAME_SELFIE_PATH, frameImagePath2);
                        intent4.putExtra(SelfieActivity.FRAME_FACE_PATH, croppedFrameImagePath);
                        selfieActivity.broadcastIntent(intent4);
                        SelfieActivity.g(selfieActivity, ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getFullImagePath(), ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).getCroppedFullImagePath());
                    }
                    selfieActivity.x(booleanExtra);
                }
                break;
            case 2:
                String str = SelfieActivity.SELFIE_TO_BE_REPEATED;
                selfieActivity.getClass();
                selfieActivity.broadcastIntent(new Intent(SelfieActivity.CHALLENGE_TO_BE_REPEATED));
                break;
            case 3:
                boolean booleanExtra2 = intent.getBooleanExtra(SelfieFragment.SELFIE_FINISHED, true);
                SelfieActivity.h(selfieActivity);
                selfieActivity.x(booleanExtra2);
                break;
            case 4:
                if (!selfieActivity.f39534s0) {
                    String stringExtra3 = intent.getStringExtra(SelfieFragment.CHALLENGE_VIDEO_PATH);
                    String stringExtra4 = intent.getStringExtra(SelfieFragment.CHALLENGE_VTT);
                    Intent intent5 = new Intent(SelfieActivity.CHALLENGE_CAPTURED);
                    intent5.putExtra(SelfieActivity.CHALLENGE_VIDEO_PATH, stringExtra3);
                    intent5.putExtra(SelfieActivity.CHALLENGE_VTT, stringExtra4);
                    selfieActivity.broadcastIntent(intent5);
                } else {
                    selfieActivity.requestShowSelfieFragment();
                }
                break;
            case 5:
                if (!selfieActivity.f39534s0) {
                    SelfieActivity.g(selfieActivity, intent.getStringExtra(SelfieFragment.PHOTO_SELFIE_PATH), intent.getStringExtra(SelfieFragment.PHOTO_FACE_PATH));
                } else {
                    selfieActivity.requestShowSelfieFragment();
                }
                break;
            case 6:
                selfieActivity.finish();
                break;
        }
    }
}
