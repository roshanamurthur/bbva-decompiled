package com.bbva.cellscore.extension;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: File.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"createDir", "", "Ljava/io/File;", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FileKt {
    public static final boolean createDir(@NotNull File file) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(!file.exists() ? file.mkdir() : true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }
}
