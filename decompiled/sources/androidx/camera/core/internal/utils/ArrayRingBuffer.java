package androidx.camera.core.internal.utils;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class ArrayRingBuffer<T> implements RingBuffer<T> {
    private static final String TAG = "ZslRingBuffer";

    @GuardedBy("mLock")
    private final ArrayDeque<T> mBuffer;
    private final Object mLock;

    @Nullable
    final RingBuffer.OnRemoveCallback<T> mOnRemoveCallback;
    private final int mRingBufferCapacity;

    public ArrayRingBuffer(int i10) {
        this(i10, null);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    @NonNull
    public T dequeue() {
        T tRemoveLast;
        synchronized (this.mLock) {
            tRemoveLast = this.mBuffer.removeLast();
        }
        return tRemoveLast;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(@NonNull T t10) {
        T tDequeue;
        synchronized (this.mLock) {
            try {
                tDequeue = this.mBuffer.size() >= this.mRingBufferCapacity ? dequeue() : null;
                this.mBuffer.addFirst(t10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RingBuffer.OnRemoveCallback<T> onRemoveCallback = this.mOnRemoveCallback;
        if (onRemoveCallback == null || tDequeue == null) {
            return;
        }
        onRemoveCallback.onRemove(tDequeue);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
        return this.mRingBufferCapacity;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.mLock) {
            zIsEmpty = this.mBuffer.isEmpty();
        }
        return zIsEmpty;
    }

    public ArrayRingBuffer(int i10, @Nullable RingBuffer.OnRemoveCallback<T> onRemoveCallback) {
        this.mLock = new Object();
        this.mRingBufferCapacity = i10;
        this.mBuffer = new ArrayDeque<>(i10);
        this.mOnRemoveCallback = onRemoveCallback;
    }
}
