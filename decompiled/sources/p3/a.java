package p3;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f92554b = Logger.tagWithPrefix("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f92555a;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SystemJobInfoConverter.java */
    public static /* synthetic */ class C0477a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92556a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f92556a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92556a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92556a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92556a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92556a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public a(@NonNull Context context) {
        this.f92555a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
