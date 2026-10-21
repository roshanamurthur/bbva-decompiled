package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.biometric.R;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: FingerprintDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Observer<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FingerprintDialogFragment f85240a;

    public j(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f85240a = fingerprintDialogFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        int i10;
        Integer num2 = num;
        FingerprintDialogFragment fingerprintDialogFragment = this.f85240a;
        Handler handler = fingerprintDialogFragment.f1787p0;
        FingerprintDialogFragment.a aVar = fingerprintDialogFragment.f1788q0;
        handler.removeCallbacks(aVar);
        int iIntValue = num2.intValue();
        if (fingerprintDialogFragment.f1792u0 != null) {
            int i11 = fingerprintDialogFragment.f1789r0.P0;
            Context context = fingerprintDialogFragment.getContext();
            Drawable drawable = null;
            if (context == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                if (i11 == 0 && iIntValue == 1) {
                    i10 = R.drawable.fingerprint_dialog_fp_icon;
                } else if (i11 == 1 && iIntValue == 2) {
                    i10 = R.drawable.fingerprint_dialog_error;
                } else if (i11 == 2 && iIntValue == 1) {
                    i10 = R.drawable.fingerprint_dialog_fp_icon;
                } else if (i11 == 1 && iIntValue == 3) {
                    i10 = R.drawable.fingerprint_dialog_fp_icon;
                }
                drawable = ContextCompat.getDrawable(context, i10);
            }
            if (drawable != null) {
                fingerprintDialogFragment.f1792u0.setImageDrawable(drawable);
                if ((i11 != 0 || iIntValue != 1) && ((i11 == 1 && iIntValue == 2) || (i11 == 2 && iIntValue == 1))) {
                    FingerprintDialogFragment.c.a(drawable);
                }
                fingerprintDialogFragment.f1789r0.P0 = iIntValue;
            }
        }
        int iIntValue2 = num2.intValue();
        TextView textView = fingerprintDialogFragment.v0;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.f1790s0 : fingerprintDialogFragment.f1791t0);
        }
        fingerprintDialogFragment.f1787p0.postDelayed(aVar, 2000L);
    }
}
