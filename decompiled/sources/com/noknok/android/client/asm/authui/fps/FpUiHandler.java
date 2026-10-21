package com.noknok.android.client.asm.authui.fps;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.TextView;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(23)
public class FpUiHandler extends FingerprintManager.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f63175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f63176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CancellationSignal f63177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callback f63178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FingerprintManager f63179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63180f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FingerprintManager.CryptoObject f63182h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63181g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f63183i = new Runnable() { // from class: com.noknok.android.client.asm.authui.fps.FpUiHandler.1
        @Override // java.lang.Runnable
        public void run() {
            TextView textView = FpUiHandler.this.f63176b;
            textView.setTextColor(textView.getResources().getColor(R.color.nnl_hint_color, null));
            TextView textView2 = FpUiHandler.this.f63176b;
            textView2.setText(UiConfig.getText(textView2.getContext(), UIConfigTags.LEVELS_FINGERPRINT_VIEW, UIConfigTags.TAG_NATIVE_FINGERPRINT_HINT, R.string.nnl_asm_native_fps_hint));
            FpUiHandler.this.f63175a.setImageResource(R.drawable.nnl_asm_native_fps_ic);
        }
    };

    public interface Callback {
        void onAuthenticated(FingerprintManager.AuthenticationResult authenticationResult);

        void onAuthenticationFailed();

        void onError(int i10);
    }

    public FpUiHandler(ImageView imageView, TextView textView, Callback callback) {
        this.f63179e = (FingerprintManager) imageView.getContext().getSystemService(FingerprintManager.class);
        this.f63175a = imageView;
        this.f63176b = textView;
        this.f63178d = callback;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int i10, CharSequence charSequence) {
        int i11;
        if (this.f63180f) {
            return;
        }
        if (i10 != 5 || (i11 = this.f63181g) >= 5) {
            this.f63178d.onError(i10);
        } else {
            this.f63181g = i11 + 1;
            this.f63179e.authenticate(this.f63182h, this.f63177c, 0, this, null);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        a(UiConfig.getText(this.f63175a.getContext(), UIConfigTags.LEVELS_FINGERPRINT_VIEW, UIConfigTags.TAG_NATIVE_FINGERPRINT_NOT_RECOGNIZED, R.string.nnl_asm_native_fps_not_recognized));
        this.f63178d.onAuthenticationFailed();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
        a(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f63178d.onAuthenticated(authenticationResult);
    }

    public void startListening(FingerprintManager.CryptoObject cryptoObject) {
        if (this.f63179e.isHardwareDetected() && this.f63179e.hasEnrolledFingerprints()) {
            this.f63182h = cryptoObject;
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f63177c = cancellationSignal;
            this.f63180f = false;
            this.f63181g = 0;
            this.f63179e.authenticate(this.f63182h, cancellationSignal, 0, this, null);
            this.f63175a.setImageResource(R.drawable.nnl_asm_native_fps_ic);
        }
    }

    public void stopListening() {
        CancellationSignal cancellationSignal = this.f63177c;
        if (cancellationSignal != null) {
            this.f63180f = true;
            cancellationSignal.cancel();
            this.f63177c = null;
        }
    }

    private void a(CharSequence charSequence) {
        this.f63175a.setImageResource(R.drawable.nnl_asm_native_fps_ic_fingerprint_error);
        this.f63176b.setText(charSequence);
        TextView textView = this.f63176b;
        textView.setTextColor(textView.getResources().getColor(R.color.nnl_warning_color, null));
        this.f63176b.removeCallbacks(this.f63183i);
        this.f63176b.postDelayed(this.f63183i, 1600L);
        this.f63176b.announceForAccessibility(charSequence);
    }
}
