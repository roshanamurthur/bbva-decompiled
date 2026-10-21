package com.noknok.android.client.utils;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes11.dex */
public class ProgressIndicator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ProgressIndicator f63461d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<Boolean> f63462a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63463b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63464c = false;

    public static synchronized ProgressIndicator getInstance() {
        try {
            if (f63461d == null) {
                f63461d = new ProgressIndicator();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63461d;
    }

    public void decCounter() {
        synchronized (this) {
            try {
                int i10 = this.f63463b;
                if (i10 == 0) {
                    throw new IllegalStateException("Counter cannot be decremented");
                }
                int i11 = i10 - 1;
                this.f63463b = i11;
                if (i11 == 0 && !this.f63464c) {
                    this.f63462a.postValue(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public MutableLiveData<Boolean> getLiveData() {
        return this.f63462a;
    }

    public void incCounter() {
        synchronized (this) {
            try {
                int i10 = this.f63463b + 1;
                this.f63463b = i10;
                if (i10 == 1 && !this.f63464c) {
                    this.f63462a.postValue(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resume() {
        synchronized (this) {
            try {
                if (this.f63464c) {
                    this.f63464c = false;
                    if (this.f63463b > 0) {
                        this.f63462a.postValue(Boolean.TRUE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void suspend() {
        synchronized (this) {
            try {
                if (this.f63464c) {
                    return;
                }
                this.f63464c = true;
                if (this.f63463b > 0) {
                    this.f63462a.postValue(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
