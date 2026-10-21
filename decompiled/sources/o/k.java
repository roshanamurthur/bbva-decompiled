package o;

import android.os.Handler;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: FingerprintDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Observer<CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FingerprintDialogFragment f85241a;

    public k(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f85241a = fingerprintDialogFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        FingerprintDialogFragment fingerprintDialogFragment = this.f85241a;
        Handler handler = fingerprintDialogFragment.f1787p0;
        FingerprintDialogFragment.a aVar = fingerprintDialogFragment.f1788q0;
        handler.removeCallbacks(aVar);
        TextView textView = fingerprintDialogFragment.v0;
        if (textView != null) {
            textView.setText(charSequence2);
        }
        fingerprintDialogFragment.f1787p0.postDelayed(aVar, 2000L);
    }
}
