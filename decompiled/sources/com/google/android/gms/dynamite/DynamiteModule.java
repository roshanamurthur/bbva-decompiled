package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb = null;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static String zzc = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zzp zzpVar) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z10) throws LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e5) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e5.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff A[Catch: all -> 0x005b, TryCatch #5 {all -> 0x005b, blocks: (B:5:0x002d, B:15:0x0053, B:100:0x018c, B:101:0x0197, B:107:0x01a4, B:109:0x01c2, B:111:0x01d0, B:122:0x01f6, B:123:0x01fe, B:104:0x019a, B:105:0x019b, B:106:0x01a3, B:124:0x01ff, B:125:0x0211, B:126:0x0212, B:127:0x023d, B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:143:0x002d, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #5 {all -> 0x005b, blocks: (B:5:0x002d, B:15:0x0053, B:100:0x018c, B:101:0x0197, B:107:0x01a4, B:109:0x01c2, B:111:0x01d0, B:122:0x01f6, B:123:0x01fe, B:104:0x019a, B:105:0x019b, B:106:0x01a3, B:124:0x01ff, B:125:0x0211, B:126:0x0212, B:127:0x023d, B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:143:0x002d, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: all -> 0x017f, TryCatch #7 {, blocks: (B:23:0x0066, B:25:0x006c, B:26:0x006e, B:96:0x0181, B:97:0x0189), top: B:145:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TRY_ENTER, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TRY_ENTER, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0108 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x010e A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011d A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0137 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0147 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015c A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0164 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016d A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0176 A[Catch: all -> 0x00bb, LoadingException -> 0x00be, RemoteException -> 0x00c1, TryCatch #7 {RemoteException -> 0x00c1, LoadingException -> 0x00be, all -> 0x00bb, blocks: (B:22:0x0065, B:28:0x0071, B:31:0x007a, B:35:0x0080, B:37:0x0088, B:39:0x008c, B:40:0x0099, B:47:0x00a8, B:49:0x00ae, B:57:0x00d7, B:59:0x00df, B:61:0x00e7, B:62:0x00ef, B:56:0x00c4, B:65:0x00f2, B:66:0x00f3, B:67:0x00fb, B:68:0x00fc, B:69:0x0104, B:72:0x0107, B:73:0x0108, B:75:0x010e, B:77:0x0115, B:79:0x011d, B:85:0x0156, B:87:0x015c, B:88:0x0164, B:89:0x016c, B:80:0x012c, B:81:0x0134, B:83:0x0137, B:84:0x0147, B:90:0x016d, B:91:0x0175, B:92:0x0176, B:93:0x017e, B:99:0x018b), top: B:146:0x0065, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0181 A[Catch: all -> 0x017f, TRY_ENTER, TryCatch #7 {, blocks: (B:23:0x0066, B:25:0x006c, B:26:0x006e, B:96:0x0181, B:97:0x0189), top: B:145:0x0066 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x01ff, please report this as an issue */
    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        DynamiteModule dynamiteModuleZzc;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        zzr zzrVar;
        zzn zznVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i10 = selectionResultSelectModule.localVersion;
            int i11 = selectionResultSelectModule.remoteVersion;
            int i12 = selectionResultSelectModule.selection;
            if (i12 != 0) {
                if (i12 != -1) {
                    if (i12 == 1 || i11 != 0) {
                        if (i12 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i12 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i12, null);
                            }
                            try {
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor2 = zznVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            boolValueOf = Boolean.valueOf(zze >= 2);
                                        }
                                        if (boolValueOf.booleanValue()) {
                                            iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor2));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor2));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        zzqVarZzg = zzg(context);
                                        if (zzqVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZze = zzqVarZzg.zze();
                                        if (iZze >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zznVar.zza));
                                        } else if (iZze == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i11);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    dynamiteModuleZzc = dynamiteModule;
                                } catch (RemoteException e5) {
                                    throw new LoadingException("Failed to load remote module.", e5, null);
                                } catch (LoadingException e7) {
                                    throw e7;
                                } catch (Throwable th2) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e10) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                int i13 = selectionResultSelectModule.localVersion;
                                if (i13 == 0 || versionPolicy.selectModule(context, str, new zzo(i13, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e10, null);
                                }
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(Long.valueOf(jLongValue));
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar3);
                        return dynamiteModuleZzc;
                    }
                } else if (i10 != 0) {
                    i12 = -1;
                    if (i12 == 1) {
                    }
                    if (i12 == -1) {
                        dynamiteModuleZzc = zzc(applicationContext, str);
                    } else {
                        if (i12 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i12, null);
                        }
                        synchronized (DynamiteModule.class) {
                            if (zzf(context)) {
                                throw new LoadingException("Remote loading disabled", null);
                            }
                            bool = zzb;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    zzrVar = zzl;
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor", null);
                                }
                            }
                            zzqVarZzg = zzg(context);
                            if (zzqVarZzg != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zznVar = (zzn) threadLocal.get();
                                if (zznVar != null) {
                                    throw new LoadingException("No cached result cursor holder", null);
                                }
                                iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zznVar.zza));
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i11);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i11);
                            }
                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                            if (objUnwrap != null) {
                                throw new LoadingException("Failed to load remote module.", null);
                            }
                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                            dynamiteModuleZzc = dynamiteModule;
                        }
                    }
                    if (jLongValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(Long.valueOf(jLongValue));
                    }
                    cursor = zznVar4.zza;
                    if (cursor != null) {
                        cursor.close();
                    }
                    zzg.set(zznVar3);
                    return dynamiteModuleZzc;
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + Constant.DOT_STRING, null);
        } catch (Throwable th3) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(jLongValue));
            }
            Cursor cursor3 = zznVar4.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zznVar3);
            throw th3;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:139:0x01c4 */
    /* JADX WARN: Code duplicated, block: B:105:0x0177 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00eb, blocks: (B:3:0x0002, B:64:0x00e0, B:66:0x00e6, B:73:0x010a, B:101:0x0169, B:105:0x0177, B:123:0x01c9, B:124:0x01cc, B:118:0x01c1, B:71:0x00ef, B:126:0x01ce, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00dd, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00bb, B:63:0x00df, B:61:0x00c1), top: B:136:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:142:0x0026, inners: #12 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z10) {
        Throwable th2;
        RemoteException e5;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z10, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        b.a();
                                                        String str3 = zzc;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = a.a(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzc;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = bool2;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e7) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e7.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z10, false);
                    } catch (LoadingException e10) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z10, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e11) {
                                            e5 = e11;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e5.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z10);
                            }
                        } catch (RemoteException e12) {
                            e5 = e12;
                        }
                    }
                    return iZzf;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Exception e5;
        ?? r1 = 0;
        ?? r3 = 0;
        ?? r4 = 0;
        ?? r10 = 0;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? SqlContracts.TokenEntry.API : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            zzd = z12;
                                            z13 = z12;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r4 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i10;
                        }
                    } catch (Exception e7) {
                        e5 = e7;
                        if (e5 instanceof LoadingException) {
                            throw e5;
                        }
                        throw new LoadingException("V2 version check failed: " + e5.getMessage(), e5, r3 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r10 == true ? 1 : 0);
            } catch (Throwable th4) {
                th2 = th4;
                r1 = context;
                if (r1 != 0) {
                    r1.close();
                }
                throw th2;
            }
        } catch (Exception e10) {
            e5 = e10;
        } catch (Throwable th5) {
            th2 = th5;
            if (r1 != 0) {
                r1.close();
            }
            throw th2;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return zBooleanValue;
    }

    @Nullable
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e5) {
                e5.getMessage();
            }
            return null;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e5) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e5, null);
        }
    }
}
