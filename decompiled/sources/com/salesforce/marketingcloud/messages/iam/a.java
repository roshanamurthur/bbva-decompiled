package com.salesforce.marketingcloud.messages.iam;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes11.dex */
abstract class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f64645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f64646b;

    public a(long j10, long j11) {
        super(j10 - j11, 500L);
        this.f64646b = j10;
    }

    public long a() {
        return this.f64646b - this.f64645a;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f64645a = 0L;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        this.f64645a = j10;
    }
}
