package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellationSignal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnCancelListener f19994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.CancellationSignal f19995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19996d;

    public interface OnCancelListener {
        void onCancel();
    }

    @RequiresApi(16)
    public static class a {
        @DoNotInline
        public static void a(Object obj) {
            ((android.os.CancellationSignal) obj).cancel();
        }

        @DoNotInline
        public static android.os.CancellationSignal b() {
            return new android.os.CancellationSignal();
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f19993a) {
                    return;
                }
                this.f19993a = true;
                this.f19996d = true;
                OnCancelListener onCancelListener = this.f19994b;
                android.os.CancellationSignal cancellationSignal = this.f19995c;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f19996d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    a.a(cancellationSignal);
                }
                synchronized (this) {
                    this.f19996d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Nullable
    public Object getCancellationSignalObject() {
        android.os.CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.f19995c == null) {
                    android.os.CancellationSignal cancellationSignalB = a.b();
                    this.f19995c = cancellationSignalB;
                    if (this.f19993a) {
                        a.a(cancellationSignalB);
                    }
                }
                cancellationSignal = this.f19995c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cancellationSignal;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this) {
            z10 = this.f19993a;
        }
        return z10;
    }

    public void setOnCancelListener(@Nullable OnCancelListener onCancelListener) {
        synchronized (this) {
            while (this.f19996d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f19994b == onCancelListener) {
                return;
            }
            this.f19994b = onCancelListener;
            if (this.f19993a && onCancelListener != null) {
                onCancelListener.onCancel();
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new OperationCanceledException();
        }
    }
}
