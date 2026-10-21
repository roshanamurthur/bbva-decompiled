package com.noknok.android.client.asm.authui.fps;

import android.annotation.TargetApi;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.CancellationSignal;
import android.os.CountDownTimer;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(28)
public class BiometricAuthenticationCallback extends BiometricPrompt$AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BiometricMatcher.BiometricResult f63146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f63147b = new CancellationSignal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownTimer f63148c;

    public BiometricAuthenticationCallback(BiometricMatcher.BiometricResult biometricResult) {
        this.f63146a = biometricResult;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public void onAuthenticationError(int i10, CharSequence charSequence) {
        super.onAuthenticationError(i10, charSequence);
        CountDownTimer countDownTimer = this.f63148c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CancellationSignal cancellationSignal = this.f63147b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f63147b = null;
        }
        BiometricMatcher.BiometricResult biometricResult = this.f63146a;
        biometricResult.f63152b = null;
        if (i10 == 1) {
            biometricResult.f63151a = IMatcher.RESULT.AUTHENTICATOR_UNAVAILABLE;
        } else if (i10 == 3) {
            biometricResult.f63151a = IMatcher.RESULT.TIMEOUT;
        } else if (i10 == 5) {
            biometricResult.f63151a = IMatcher.RESULT.SYSTEM_CANCELED;
        } else if (i10 != 7) {
            switch (i10) {
                case 9:
                    biometricResult.f63151a = IMatcher.RESULT.USER_LOCKOUT;
                    break;
                case 10:
                    biometricResult.f63151a = IMatcher.RESULT.CANCEL;
                    break;
                case 11:
                    biometricResult.f63151a = IMatcher.RESULT.USER_NOT_ENROLLED;
                    break;
                default:
                    biometricResult.f63151a = IMatcher.RESULT.ERRORAUTH;
                    break;
            }
        } else {
            biometricResult.f63151a = IMatcher.RESULT.USER_LOCKOUT;
        }
        biometricResult.f63153c.release();
    }

    public void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        CountDownTimer countDownTimer = this.f63148c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f63148c.start();
        }
        Logger.d("BiometricAuthenticationCallback", "timeout is restarted");
    }

    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
        super.onAuthenticationHelp(i10, charSequence);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        CountDownTimer countDownTimer = this.f63148c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (authenticationResult.getCryptoObject() != null) {
            this.f63146a.f63152b = authenticationResult.getCryptoObject().getSignature();
        }
        BiometricMatcher.BiometricResult biometricResult = this.f63146a;
        biometricResult.f63151a = IMatcher.RESULT.SUCCESS;
        biometricResult.f63153c.release();
    }

    public final void a() {
        this.f63148c = new CountDownTimer() { // from class: com.noknok.android.client.asm.authui.fps.BiometricAuthenticationCallback.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                synchronized (BiometricAuthenticationCallback.this.f63146a.f63153c) {
                    try {
                        CancellationSignal cancellationSignal = BiometricAuthenticationCallback.this.f63147b;
                        if (cancellationSignal != null) {
                            cancellationSignal.cancel();
                            BiometricAuthenticationCallback.this.f63147b = null;
                        }
                        Logger.d("Timer", "Time out: Biometric dialog is closed");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
            }
        }.start();
    }

    public final CancellationSignal b() {
        return this.f63147b;
    }
}
