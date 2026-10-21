package mx.openpay.library.domain.util;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0007"}, d2 = {"getSuccessData", ExifInterface.GPS_DIRECTION_TRUE, "", "Lmx/openpay/library/domain/util/Result;", "(Lmx/openpay/library/domain/util/Result;)Ljava/lang/Object;", NetworkErrorFragment.IS_SUCCESS, "", "domain_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ResultKt {
    @NotNull
    public static final <T> T getSuccessData(@NotNull Result<? extends T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        T t10 = (T) ((Result.Success) result).getData();
        Intrinsics.checkNotNull(t10);
        return t10;
    }

    public static final <T> boolean isSuccess(@NotNull Result<? extends T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        return result instanceof Result.Success;
    }
}
