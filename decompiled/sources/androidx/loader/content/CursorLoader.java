package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Loader<Cursor>.ForceLoadContentObserver f22217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f22218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f22219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f22221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cursor f22223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellationSignal f22224h;

    public CursorLoader(@NonNull Context context) {
        super(context);
        this.f22217a = new Loader.ForceLoadContentObserver();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f22224h;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f22218b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f22219c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f22220d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f22221e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f22222f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f22223g);
    }

    @Nullable
    public String[] getProjection() {
        return this.f22219c;
    }

    @Nullable
    public String getSelection() {
        return this.f22220d;
    }

    @Nullable
    public String[] getSelectionArgs() {
        return this.f22221e;
    }

    @Nullable
    public String getSortOrder() {
        return this.f22222f;
    }

    @NonNull
    public Uri getUri() {
        return this.f22218b;
    }

    @Override // androidx.loader.content.Loader
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f22223g;
        if (cursor != null && !cursor.isClosed()) {
            this.f22223g.close();
        }
        this.f22223g = null;
    }

    @Override // androidx.loader.content.Loader
    public void onStartLoading() {
        Cursor cursor = this.f22223g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f22223g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(@Nullable String[] strArr) {
        this.f22219c = strArr;
    }

    public void setSelection(@Nullable String str) {
        this.f22220d = str;
    }

    public void setSelectionArgs(@Nullable String[] strArr) {
        this.f22221e = strArr;
    }

    public void setSortOrder(@Nullable String str) {
        this.f22222f = str;
    }

    public void setUri(@NonNull Uri uri) {
        this.f22218b = uri;
    }

    @Override // androidx.loader.content.Loader
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f22223g;
        this.f22223g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.f22224h = new CancellationSignal();
        }
        try {
            Cursor cursorQuery = ContentResolverCompat.query(getContext().getContentResolver(), this.f22218b, this.f22219c, this.f22220d, this.f22221e, this.f22222f, this.f22224h);
            if (cursorQuery != null) {
                try {
                    cursorQuery.getCount();
                    cursorQuery.registerContentObserver(this.f22217a);
                } catch (RuntimeException e5) {
                    cursorQuery.close();
                    throw e5;
                }
            }
            synchronized (this) {
                this.f22224h = null;
            }
            return cursorQuery;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f22224h = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public CursorLoader(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f22217a = new Loader.ForceLoadContentObserver();
        this.f22218b = uri;
        this.f22219c = strArr;
        this.f22220d = str;
        this.f22221e = strArr2;
        this.f22222f = str2;
    }
}
