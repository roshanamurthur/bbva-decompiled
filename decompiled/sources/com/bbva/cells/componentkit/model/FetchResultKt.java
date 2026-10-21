package com.bbva.cells.componentkit.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0004\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"getOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/model/FetchResult;", "(Lcom/bbva/cells/componentkit/model/FetchResult;)Ljava/lang/Object;", "getOrThrow", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FetchResultKt {
    @Nullable
    public static final <T> T getOrNull(@NotNull FetchResult<T> fetchResult) {
        Intrinsics.checkNotNullParameter(fetchResult, "<this>");
        if (fetchResult instanceof FetchResult.Error) {
            return null;
        }
        if (fetchResult instanceof FetchResult.Success) {
            return (T) ((FetchResult.Success) fetchResult).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> T getOrThrow(@NotNull FetchResult<T> fetchResult) throws Throwable {
        Intrinsics.checkNotNullParameter(fetchResult, "<this>");
        if (fetchResult instanceof FetchResult.Error) {
            throw ((FetchResult.Error) fetchResult).getException();
        }
        if (fetchResult instanceof FetchResult.Success) {
            return (T) ((FetchResult.Success) fetchResult).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
