package com.noknok.android.client.utils;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes11.dex */
public class InactivityTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ITimeoutListener f63447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownTimer f63449c = null;

    public InactivityTimer(ITimeoutListener iTimeoutListener, int i10) {
        this.f63447a = iTimeoutListener;
        this.f63448b = i10;
    }

    public void start() {
        stop();
        long j10 = this.f63448b;
        this.f63449c = new CountDownTimer(j10, j10) { // from class: com.noknok.android.client.utils.InactivityTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                InactivityTimer inactivityTimer = InactivityTimer.this;
                if (inactivityTimer.f63449c != null) {
                    inactivityTimer.f63449c = null;
                    Logger.d("InactivityTimer", this + ".onTimeout");
                    InactivityTimer.this.f63447a.onTimeOut();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
            }
        }.start();
    }

    public void stop() {
        CountDownTimer countDownTimer = this.f63449c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f63449c = null;
        }
    }
}
