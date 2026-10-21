package com.bbva.glomoutils.usecase;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomoutils/usecase/SuspendUseCase;", ExifInterface.GPS_DIRECTION_TRUE, "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SuspendUseCase<T> {
    @Nullable
    Object execute(@NotNull Continuation<? super T> continuation);
}
