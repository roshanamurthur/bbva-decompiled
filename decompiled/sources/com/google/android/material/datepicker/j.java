package com.google.android.material.datepicker;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f44581p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44582q0;

    public j(MaterialCalendar materialCalendar, int i10) {
        this.f44582q0 = materialCalendar;
        this.f44581p0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44582q0.f44482x0.smoothScrollToPosition(this.f44581p0);
    }
}
