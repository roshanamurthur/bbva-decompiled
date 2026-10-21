package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = SVGParser.XML_STYLESHEET_ATTR_MEDIA;
        String str = Build.HARDWARE;
        strArr[1] = (str.equals(EmulatorApi.GOLDFISH) || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : "";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i10 = Build.VERSION.SDK_INT;
        strArr2[0] = i10 <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "";
        strArr2[1] = i10 <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "";
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws FileNotFoundException {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriZzc = zzc(uri);
        String scheme = uriZzc.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uriZzc, "r");
        }
        if ("content".equals(scheme)) {
            if (!zzj(context, uriZzc, 1, zzhVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriZzc, "r");
            zzd(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriZzc, "r");
        zzd(assetFileDescriptorOpenAssetFileDescriptor2);
        try {
            zzi(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriZzc, zzhVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e5) {
            zzg(assetFileDescriptorOpenAssetFileDescriptor2, e5);
            throw e5;
        } catch (IOException e7) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e7);
            zzg(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) throws FileNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriZzc = zzc(uri);
        String scheme = uriZzc.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uriZzc);
        }
        if ("content".equals(scheme)) {
            if (!zzj(context, uriZzc, 1, zzhVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriZzc);
            zzd(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriZzc.getPath()).getCanonicalFile()), "r");
            try {
                zzi(context, parcelFileDescriptorOpenFileDescriptor, uriZzc, zzhVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e5) {
                zzh(parcelFileDescriptorOpenFileDescriptor, e5);
                throw e5;
            } catch (IOException e7) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e7);
                zzh(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e10) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e10);
            throw fileNotFoundException2;
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) throws FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzf(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        } catch (ErrnoException e7) {
            throw new IOException(e7);
        }
    }

    private static void zzg(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e5) {
            fileNotFoundException.addSuppressed(e5);
        }
    }

    private static void zzh(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e5) {
            fileNotFoundException.addSuppressed(e5);
        }
    }

    private static void zzi(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) throws IOException {
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzh.zza(zzhVar);
            File dataDir2 = ContextCompat.getDataDir(context);
            boolean z10 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                Context contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
                if (contextCreateDeviceProtectedStorageContext == null || (dataDir = ContextCompat.getDataDir(contextCreateDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    File[] fileArrZzk = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i10 = zzi.zza;
                            return ContextCompat.getExternalFilesDirs(context, null);
                        }
                    });
                    int length = fileArrZzk.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            File file = fileArrZzk[i10];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            File[] fileArrZzk2 = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i11 = zzi.zza;
                                    return ContextCompat.getExternalCacheDirs(context);
                                }
                            });
                            int length2 = fileArrZzk2.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    File file2 = fileArrZzk2[i11];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (z10 == zzhVar.zzb) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
    }

    private static boolean zzj(Context context, Uri uri, int i10, zzh zzhVar) {
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                return !zzhVar.zzb;
            }
        }
        if (zzh.zzc(zzhVar, context, new zzj(uri, providerInfoResolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return zzhVar.zzb;
        }
        if (zzhVar.zzb) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i11 = 0; i11 < 2; i11++) {
                if (strArr[i11].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i12 = 0; i12 < 3; i12++) {
                if (strArr2[i12].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i13 = 0; i13 < 6; i13++) {
                String str = strArr3[i13];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzk(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
