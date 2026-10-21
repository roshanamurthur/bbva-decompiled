package com.bbva.cellscore.web.plugin;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileCacheCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/cellscore/web/plugin/FileCacheCleaner;", "", "()V", "clean", "", "context", "Landroid/content/Context;", "expirationDays", "", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FileCacheCleaner {

    /* JADX INFO: compiled from: FileCacheCleaner.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ File f27196p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f27197q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f27198r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, long j10, long j11) {
            super(0);
            this.f27196p0 = file;
            this.f27197q0 = j10;
            this.f27198r0 = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            File[] fileArrListFiles = this.f27196p0.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (this.f27197q0 - file.lastModified() >= this.f27198r0) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void clean(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        clean(context, 0);
    }

    public final void clean(@NotNull Context context, int expirationDays) {
        Intrinsics.checkNotNullParameter(context, "context");
        ThreadsKt.thread$default(false, false, null, null, 0, new a(new File(context.getCacheDir(), "cells_plugin"), System.currentTimeMillis(), TimeUnit.DAYS.toMicros(expirationDays)), 31, null);
    }
}
