package com.bbva.glomohybrid.base.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bbva.io.file.FileIOKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileRemovalWorker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/workers/FileRemovalWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "Landroid/content/Context;", "ctx", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFileRemovalWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRemovalWorker.kt\ncom/bbva/glomohybrid/base/workers/FileRemovalWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,31:1\n1#2:32\n18#3:33\n26#4:34\n*S KotlinDebug\n*F\n+ 1 FileRemovalWorker.kt\ncom/bbva/glomohybrid/base/workers/FileRemovalWorker\n*L\n17#1:33\n17#1:34\n*E\n"})
public final class FileRemovalWorker extends Worker {

    @NotNull
    public static final String KEY_FOLDER_NAME = "foldername";

    @NotNull
    public final Context v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileRemovalWorker(@NotNull Context ctx, @NotNull WorkerParameters params) {
        super(ctx, params);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        this.v0 = ctx;
    }

    @Override // androidx.work.Worker
    @NotNull
    public ListenableWorker.Result doWork() {
        Object objM5535constructorimpl;
        String string = getInputData().getString(KEY_FOLDER_NAME);
        if (string != null) {
            File file = new File(this.v0.getFilesDir(), string);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            if (!(!(fileArrListFiles.length == 0))) {
                file = null;
            }
            if (file != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(FileIOKt.deleteFilesIn(file)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                    objM5535constructorimpl = ((Boolean) objM5535constructorimpl).booleanValue() ? ListenableWorker.Result.success() : ListenableWorker.Result.failure();
                    Intrinsics.checkNotNull(objM5535constructorimpl);
                }
                Object objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
                ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure, "failure(...)");
                if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
                    objM5535constructorimpl2 = resultFailure;
                }
                return (ListenableWorker.Result) objM5535constructorimpl2;
            }
        }
        ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
        Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure(...)");
        return resultFailure2;
    }
}
