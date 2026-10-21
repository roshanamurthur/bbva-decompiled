package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/veridas/result/Result;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_EAST, "", "()V", "errValue", "()Ljava/lang/Object;", "okValue", "Lcom/veridas/result/Err;", "Lcom/veridas/result/Ok;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Result<V, E> {
    public Result() {
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract E errValue();

    @Nullable
    public abstract V okValue();
}
