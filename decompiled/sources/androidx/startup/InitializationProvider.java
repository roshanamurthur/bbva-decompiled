package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;

/* JADX INFO: loaded from: classes2.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        Class<?> cls = getClass();
        Context context2 = appInitializer.f23529c;
        try {
            try {
                Trace.beginSection("Startup");
                appInitializer.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e5) {
                throw new StartupException(e5);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
