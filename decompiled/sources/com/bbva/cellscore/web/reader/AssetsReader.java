package com.bbva.cellscore.web.reader;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppConfigurationReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/cellscore/web/reader/AssetsReader;", "Lcom/bbva/cellscore/web/reader/Reader;", "", "path", "Ljava/io/InputStream;", "read", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public class AssetsReader implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public AssetsReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.bbva.cellscore.web.reader.Reader
    @NotNull
    public InputStream read(@NotNull String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        InputStream inputStreamOpen = this.context.getAssets().open(path);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(path)");
        return inputStreamOpen;
    }
}
