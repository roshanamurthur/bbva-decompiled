package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ListUpdateCallback f22578p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f22579q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f22580r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f22581s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f22582t0 = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.f22578p0 = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i10 = this.f22579q0;
        if (i10 == 0) {
            return;
        }
        ListUpdateCallback listUpdateCallback = this.f22578p0;
        if (i10 == 1) {
            listUpdateCallback.onInserted(this.f22580r0, this.f22581s0);
        } else if (i10 == 2) {
            listUpdateCallback.onRemoved(this.f22580r0, this.f22581s0);
        } else if (i10 == 3) {
            listUpdateCallback.onChanged(this.f22580r0, this.f22581s0, this.f22582t0);
        }
        this.f22582t0 = null;
        this.f22579q0 = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i10, int i11, Object obj) {
        int i12;
        if (this.f22579q0 == 3) {
            int i13 = this.f22580r0;
            int i14 = this.f22581s0;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f22582t0 == obj) {
                this.f22580r0 = Math.min(i10, i13);
                this.f22581s0 = Math.max(i14 + i13, i12) - this.f22580r0;
                return;
            }
        }
        dispatchLastEvent();
        this.f22580r0 = i10;
        this.f22581s0 = i11;
        this.f22582t0 = obj;
        this.f22579q0 = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        int i12;
        if (this.f22579q0 == 1 && i10 >= (i12 = this.f22580r0)) {
            int i13 = this.f22581s0;
            if (i10 <= i12 + i13) {
                this.f22581s0 = i13 + i11;
                this.f22580r0 = Math.min(i10, i12);
                return;
            }
        }
        dispatchLastEvent();
        this.f22580r0 = i10;
        this.f22581s0 = i11;
        this.f22579q0 = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        dispatchLastEvent();
        this.f22578p0.onMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        int i12;
        if (this.f22579q0 == 2 && (i12 = this.f22580r0) >= i10 && i12 <= i10 + i11) {
            this.f22581s0 += i11;
            this.f22580r0 = i10;
        } else {
            dispatchLastEvent();
            this.f22580r0 = i10;
            this.f22581s0 = i11;
            this.f22579q0 = 2;
        }
    }
}
