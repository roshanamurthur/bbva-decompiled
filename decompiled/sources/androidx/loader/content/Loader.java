package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class Loader<D> {
    private Context mContext;
    private int mId;
    private OnLoadCompleteListener<D> mListener;
    private OnLoadCanceledListener<D> mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public final class ForceLoadContentObserver extends ContentObserver {
        public ForceLoadContentObserver() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Loader.this.onContentChanged();
        }
    }

    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(@NonNull Loader<D> loader);
    }

    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d2);
    }

    public Loader(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @MainThread
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @MainThread
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(@Nullable D d2) {
        StringBuilder sb2 = new StringBuilder(64);
        if (d2 == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            Class<?> cls = d2.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    @MainThread
    public void deliverCancellation() {
        OnLoadCanceledListener<D> onLoadCanceledListener = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.onLoadCanceled(this);
        }
    }

    @MainThread
    public void deliverResult(@Nullable D d2) {
        OnLoadCompleteListener<D> onLoadCompleteListener = this.mListener;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(this, d2);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @MainThread
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @MainThread
    public boolean onCancelLoad() {
        return false;
    }

    @MainThread
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @MainThread
    public void registerListener(int i10, @NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = onLoadCompleteListener;
        this.mId = i10;
    }

    @MainThread
    public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = onLoadCanceledListener;
    }

    @MainThread
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @MainThread
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @MainThread
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        return a.c(sb2, this.mId, "}");
    }

    @MainThread
    public void unregisterListener(@NonNull OnLoadCompleteListener<D> onLoadCompleteListener) {
        OnLoadCompleteListener<D> onLoadCompleteListener2 = this.mListener;
        if (onLoadCompleteListener2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (onLoadCompleteListener2 != onLoadCompleteListener) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    @MainThread
    public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener<D> onLoadCanceledListener) {
        OnLoadCanceledListener<D> onLoadCanceledListener2 = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (onLoadCanceledListener2 != onLoadCanceledListener) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }

    @MainThread
    public void onAbandon() {
    }

    @MainThread
    public void onForceLoad() {
    }

    @MainThread
    public void onReset() {
    }

    @MainThread
    public void onStartLoading() {
    }

    @MainThread
    public void onStopLoading() {
    }
}
