package androidx.camera.core;

import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class SettableImageProxyBundle implements ImageProxyBundle {
    private final List<Integer> mCaptureIdList;
    private String mTagBundleKey;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    final SparseArray<CallbackToFutureAdapter.Completer<ImageProxy>> mCompleters = new SparseArray<>();

    @GuardedBy("mLock")
    private final SparseArray<ListenableFuture<ImageProxy>> mFutureResults = new SparseArray<>();

    @GuardedBy("mLock")
    private final List<ImageProxy> mOwnedImageProxies = new ArrayList();

    @GuardedBy("mLock")
    private boolean mClosed = false;

    public SettableImageProxyBundle(List<Integer> list, String str) {
        this.mCaptureIdList = list;
        this.mTagBundleKey = str;
        setup();
    }

    private void setup() {
        synchronized (this.mLock) {
            try {
                Iterator<Integer> it = this.mCaptureIdList.iterator();
                while (it.hasNext()) {
                    final int iIntValue = it.next().intValue();
                    this.mFutureResults.put(iIntValue, CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<ImageProxy>() { // from class: androidx.camera.core.SettableImageProxyBundle.1
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<ImageProxy> completer) {
                            synchronized (SettableImageProxyBundle.this.mLock) {
                                SettableImageProxyBundle.this.mCompleters.put(iIntValue, completer);
                            }
                            return androidx.appcompat.widget.a.c(new StringBuilder("getImageProxy(id: "), iIntValue, ")");
                        }
                    }));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                Integer num = (Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                if (num == null) {
                    throw new IllegalArgumentException("CaptureId is null.");
                }
                CallbackToFutureAdapter.Completer<ImageProxy> completer = this.mCompleters.get(num.intValue());
                if (completer != null) {
                    this.mOwnedImageProxies.add(imageProxy);
                    completer.set(imageProxy);
                } else {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                Iterator<ImageProxy> it = this.mOwnedImageProxies.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                this.mClosed = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @NonNull
    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.mCaptureIdList);
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    @NonNull
    public ListenableFuture<ImageProxy> getImageProxy(int i10) {
        ListenableFuture<ImageProxy> listenableFuture;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    throw new IllegalStateException("ImageProxyBundle already closed.");
                }
                listenableFuture = this.mFutureResults.get(i10);
                if (listenableFuture == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listenableFuture;
    }

    public void reset() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                Iterator<ImageProxy> it = this.mOwnedImageProxies.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                setup();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
