package com.bbva.localstorage.backup;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoBackupProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/backup/NoBackupProperties;", "", "", "key", "value", "", SetCommand.ID, "reset", "", "isEmpty", "Ljava/io/File;", "b", "Ljava/io/File;", "getFile$local_storage_release", "()Ljava/io/File;", "file", "Ljava/util/Properties;", "getProperties$local_storage_release", "()Ljava/util/Properties;", LogKeysKt.PROPERTIES, "Landroid/content/Context;", "context", "filename", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNoBackupProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoBackupProperties.kt\ncom/bbva/localstorage/backup/NoBackupProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class NoBackupProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f34985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    public NoBackupProperties(@NotNull Context context, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f34985a = new Object();
        File file = new File(u.f(context.getNoBackupFilesDir().getPath(), File.separator), u.f(filename, ".boot.properties"));
        NoBackupPropertiesKt.a(file);
        this.file = file;
    }

    @NotNull
    /* JADX INFO: renamed from: getFile$local_storage_release, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Properties getProperties$local_storage_release() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        File file = this.file;
        try {
            Result.Companion companion = Result.INSTANCE;
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                CloseableKt.closeFinally(fileInputStream, null);
                objM5535constructorimpl = Result.m5535constructorimpl(properties);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            try {
                NoBackupPropertiesKt.a(file);
                objM5535constructorimpl2 = Result.m5535constructorimpl(new Properties());
            } catch (Throwable th5) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th5));
            }
            objM5535constructorimpl = objM5535constructorimpl2;
        }
        Properties properties2 = new Properties();
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = properties2;
        }
        return (Properties) objM5535constructorimpl;
    }

    public final synchronized boolean isEmpty() {
        return !getProperties$local_storage_release().containsKey("first_boot");
    }

    public final void reset() {
        synchronized (this.f34985a) {
            Properties properties$local_storage_release = getProperties$local_storage_release();
            properties$local_storage_release.clear();
            properties$local_storage_release.setProperty("first_boot", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            NoBackupPropertiesKt.access$save(properties$local_storage_release, this.file);
        }
    }

    public final void set(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f34985a) {
            Properties properties$local_storage_release = getProperties$local_storage_release();
            try {
                Result.Companion companion = Result.INSTANCE;
                properties$local_storage_release.setProperty(key, value);
                NoBackupPropertiesKt.access$save(properties$local_storage_release, this.file);
                Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }
}
