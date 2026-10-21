package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.salesforce.marketingcloud.sfmcsdk.components.http.RequestKt;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import ik.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"SDK_PACKAGE_PREFIX", "", "getFilenameForModuleInstallation", "filename", "moduleApplicationId", Constants.registrationId, "getFilenamePrefixForModule", "getFilenamePrefixForModuleInstallation", "getFilenamePrefixForSFMCSdk", "retrieveModuleKey", "context", "Landroid/content/Context;", "storeModuleKey", "", "moduleName", "keyValue", "wipeModuleFiles", "readAll", "Ljava/io/InputStream;", "sfmcsdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FileUtilsKt {

    @NotNull
    public static final String SDK_PACKAGE_PREFIX = "com.salesforce.marketingcloud";

    @NotNull
    public static final String getFilenameForModuleInstallation(@NotNull String filename, @NotNull String moduleApplicationId, @NotNull String registrationId) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        Intrinsics.checkNotNullParameter(registrationId, "registrationId");
        return getFilenamePrefixForModuleInstallation(moduleApplicationId, registrationId) + '_' + filename;
    }

    @NotNull
    public static final String getFilenamePrefixForModule(@NotNull String moduleApplicationId) {
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        return "com.salesforce.marketingcloud_" + moduleApplicationId;
    }

    @NotNull
    public static final String getFilenamePrefixForModuleInstallation(@NotNull String moduleApplicationId, @NotNull String registrationId) {
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        Intrinsics.checkNotNullParameter(registrationId, "registrationId");
        return getFilenamePrefixForModule(moduleApplicationId) + '_' + registrationId;
    }

    @NotNull
    public static final String getFilenamePrefixForSFMCSdk(@NotNull String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return "com.salesforce.marketingcloud_sfmcsdk_" + filename;
    }

    @Nullable
    public static final String readAll(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, RequestKt.getUTF_8()));
        try {
            StringBuilder sb2 = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb2.append(line);
                sb2.append('\n');
            }
            String string = sb2.toString();
            CloseableKt.closeFinally(bufferedReader, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public static final String retrieveModuleKey(@NotNull Context context, @NotNull String moduleApplicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        try {
            File file = new File(context.getNoBackupFilesDir(), moduleApplicationId);
            if (file.exists()) {
                String text$default = c.readText$default(file, null, 1, null);
                if (true ^ l.isBlank(text$default)) {
                    return text$default;
                }
            }
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.e("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.retrieveModuleKey.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to retrieve module key from file";
                }
            });
        }
        return null;
    }

    public static final void storeModuleKey(@NotNull Context context, @NotNull String moduleName, @NotNull String keyValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        try {
            c.writeText$default(new File(context.getNoBackupFilesDir(), moduleName), keyValue, null, 2, null);
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.e("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.storeModuleKey.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Failed to write module key to file";
                }
            });
        }
    }

    public static final void wipeModuleFiles(@NotNull Context context, @NotNull final String moduleApplicationId) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        try {
            File parentFile = context.getDatabasePath(moduleApplicationId).getParentFile();
            if (parentFile != null && parentFile.isDirectory() && (fileArrListFiles2 = parentFile.listFiles(new FilenameFilter() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.a
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return FileUtilsKt.m5509wipeModuleFiles$lambda0(moduleApplicationId, file, str);
                }
            })) != null) {
                for (final File file : fileArrListFiles2) {
                    SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt$wipeModuleFiles$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Deleting Database File: " + file.getName();
                        }
                    });
                    file.delete();
                }
            }
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.wipeModuleFiles.3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to delete database file";
                }
            });
        }
        try {
            File file2 = new File(context.getFilesDir().getParent() + "/shared_prefs");
            if (!file2.isDirectory() || (fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str) {
                    return FileUtilsKt.m5510wipeModuleFiles$lambda2(moduleApplicationId, file3, str);
                }
            })) == null) {
                return;
            }
            for (final File file3 : fileArrListFiles) {
                SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt$wipeModuleFiles$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Deleting SharedPreferences File: " + file3.getName();
                    }
                });
                file3.delete();
            }
        } catch (Exception unused2) {
            SFMCSdkLogger.INSTANCE.w("~$SFMCSdkStorage", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.wipeModuleFiles.6
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Caught exception trying to delete SharedPreferences file";
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wipeModuleFiles$lambda-0, reason: not valid java name */
    public static final boolean m5509wipeModuleFiles$lambda0(String moduleApplicationId, File file, String name) {
        Intrinsics.checkNotNullParameter(moduleApplicationId, "$moduleApplicationId");
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return l.startsWith$default(name, getFilenamePrefixForModule(moduleApplicationId), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wipeModuleFiles$lambda-2, reason: not valid java name */
    public static final boolean m5510wipeModuleFiles$lambda2(String moduleApplicationId, File file, String name) {
        Intrinsics.checkNotNullParameter(moduleApplicationId, "$moduleApplicationId");
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return l.startsWith$default(name, getFilenamePrefixForModule(moduleApplicationId), false, 2, null);
    }
}
