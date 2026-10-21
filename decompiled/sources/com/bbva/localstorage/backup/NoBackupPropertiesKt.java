package com.bbva.localstorage.backup;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;

/* JADX INFO: compiled from: NoBackupProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"local-storage_release"}, k = 2, mv = {1, 8, 0})
public final class NoBackupPropertiesKt {
    public static final void a(File file) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (file.exists()) {
                return;
            }
            File parentFile = file.getParentFile();
            boolean zCreateNewFile = true;
            if (parentFile != null && parentFile.exists()) {
                zCreateNewFile = file.createNewFile();
            } else if (!file.mkdirs() || !file.createNewFile()) {
                zCreateNewFile = false;
            }
            Result.m5535constructorimpl(Boolean.valueOf(zCreateNewFile));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static final void access$save(Properties properties, File file) {
        try {
            Result.Companion companion = Result.INSTANCE;
            a(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                properties.store(fileOutputStream, (String) null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th4));
        }
    }
}
