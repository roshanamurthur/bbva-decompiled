package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
@WorkerThread
public class ModelUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GmsLogger f49367a = new GmsLogger("ModelUtils", "");

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static abstract class AutoMLManifest {
        @NonNull
        @KeepForSdk
        public abstract String getLabelsFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelType();
    }

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static abstract class ModelLoggingInfo {
        @NonNull
        @KeepForSdk
        public abstract String getHash();

        @KeepForSdk
        public abstract long getSize();

        @KeepForSdk
        public abstract boolean isManifestModel();
    }

    @Nullable
    public static String a(Context context, String str, boolean z10) {
        AutoMLManifest manifestFile = parseManifestFile(str, z10, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        f49367a.e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    @Nullable
    public static String b(InputStream inputStream) {
        int i10;
        GmsLogger gmsLogger = f49367a;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i11);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (IOException unused) {
            gmsLogger.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            gmsLogger.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    @KeepForSdk
    public static ModelLoggingInfo getModelLoggingInfo(@NonNull Context context, @NonNull LocalModel localModel) throws Throwable {
        long length;
        String string;
        Throwable th2;
        IOException e5;
        InputStream inputStreamZzb;
        String strB;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        GmsLogger gmsLogger = f49367a;
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = a(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th3) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e7) {
                gmsLogger.e("ModelUtils", "Failed to open model file", e7);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = a(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                gmsLogger.e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } catch (Throwable th5) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (IOException e10) {
                gmsLogger.e("ModelUtils", "Failed to open model file", e10);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) Preconditions.checkNotNull(uri)).toString();
        }
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return new b(length, localModel.isManifestFile(), zzu.zzb(strZzb));
        }
        try {
            if (assetFilePath != null) {
                inputStreamZzb = context.getAssets().open(assetFilePath);
            } else if (absoluteFilePath != null) {
                inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
            } else {
                Uri uri2 = (Uri) Preconditions.checkNotNull(uri);
                int i10 = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strB = b(inputStreamZzb);
                    } catch (IOException e11) {
                        e5 = e11;
                        gmsLogger.e("ModelUtils", "Failed to open model file", e5);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e12) {
                                gmsLogger.e("ModelUtils", "Failed to close model file", e12);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e13) {
                            gmsLogger.e("ModelUtils", "Failed to close model file", e13);
                        }
                    }
                    throw th2;
                }
            } else {
                strB = null;
            }
            if (strB != null) {
                sharedPrefManager.zzc(string, length, strB);
            }
            b bVar = new b(length, localModel.isManifestFile(), zzu.zzb(strB));
            if (inputStreamZzb != null) {
                try {
                    inputStreamZzb.close();
                } catch (IOException e14) {
                    gmsLogger.e("ModelUtils", "Failed to close model file", e14);
                }
            }
            return bVar;
        } catch (IOException e15) {
            e5 = e15;
            inputStreamZzb = null;
        } catch (Throwable th8) {
            th2 = th8;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    @Nullable
    @KeepForSdk
    public static String getSHA256(@NonNull File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strB = b(fileInputStream);
                fileInputStream.close();
                return strB;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e5) {
            f49367a.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e5.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (new java.io.File(r6).exists() == false) goto L10;
     */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(@androidx.annotation.NonNull java.lang.String r6, boolean r7, @androidx.annotation.NonNull android.content.Context r8) {
        /*
            java.lang.String r0 = "Json string from the manifest file: "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "Manifest file path: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.internal.model.ModelUtils.f49367a
            java.lang.String r3 = "ModelUtils"
            r2.d(r3, r1)
            r1 = 0
            if (r7 == 0) goto L24
            android.content.res.AssetManager r4 = r8.getAssets()     // Catch: java.io.IOException -> L2f
            java.io.InputStream r4 = r4.open(r6)     // Catch: java.io.IOException -> L2f
            if (r4 == 0) goto L35
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L24:
            java.io.File r4 = new java.io.File
            r4.<init>(r6)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L35
        L2f:
            java.lang.String r6 = "Manifest file does not exist."
            r2.e(r3, r6)
            return r1
        L35:
            boolean r4 = r6.isEmpty()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r5 = 0
            if (r4 == 0) goto L43
            byte[] r6 = new byte[r5]     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L66
        L3f:
            r6 = move-exception
            goto L9d
        L41:
            r6 = move-exception
            goto L9d
        L43:
            if (r7 == 0) goto L4e
            android.content.res.AssetManager r7 = r8.getAssets()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.InputStream r6 = r7.open(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            goto L59
        L4e:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r8.<init>(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r7.<init>(r8)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r6 = r7
        L59:
            int r7 = r6.available()     // Catch: java.lang.Throwable -> L91
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L91
            r6.read(r8, r5, r7)     // Catch: java.lang.Throwable -> L91
            r6.close()     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r6 = r8
        L66:
            java.lang.String r7 = new java.lang.String     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r8 = "UTF-8"
            r7.<init>(r6, r8)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r6 = r0.concat(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r2.d(r3, r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r6.<init>(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r7 = "modelType"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r8 = "modelFile"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            java.lang.String r0 = "labelsFile"
            java.lang.String r6 = r6.getString(r0)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            com.google.mlkit.common.internal.model.a r0 = new com.google.mlkit.common.internal.model.a     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            r0.<init>(r7, r8, r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
            return r0
        L91:
            r7 = move-exception
            if (r6 == 0) goto L9c
            r6.close()     // Catch: java.lang.Throwable -> L98
            goto L9c
        L98:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        L9c:
            throw r7     // Catch: java.io.IOException -> L3f org.json.JSONException -> L41
        L9d:
            java.lang.String r7 = "Error parsing the manifest file."
            r2.e(r3, r7, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest");
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        f49367a.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }
}
