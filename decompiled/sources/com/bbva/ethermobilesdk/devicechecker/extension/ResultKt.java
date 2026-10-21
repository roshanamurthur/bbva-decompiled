package com.bbva.ethermobilesdk.devicechecker.extension;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.exception.DeviceCheckerRemoteException;
import com.bbva.ethermobilesdk.devicechecker.model.ServiceResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0001¢\u0006\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"getAsInteger", "", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "getAsIntegerInt", "toBooleanResult", "toResult", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ResultKt {
    public static final int getAsInteger(@NotNull Result<Boolean> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Success) {
            return (((Boolean) ((Result.Success) result).getValue()).booleanValue() ? ServiceResponse.SERVICE_TRUE : ServiceResponse.SERVICE_FALSE).getCode();
        }
        if (result instanceof Result.Error) {
            return ServiceResponse.SERVICE_ERROR.getCode();
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName(name = "getAsIntegerInt")
    public static final int getAsIntegerInt(@NotNull Result<Integer> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Number) ((Result.Success) result).getValue()).intValue();
        }
        if (result instanceof Result.Error) {
            return ServiceResponse.SERVICE_ERROR.getCode();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Result<Boolean> toBooleanResult(@NotNull Result<Integer> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        return toResult(getAsIntegerInt(result));
    }

    @NotNull
    public static final Result<Boolean> toResult(int i10) {
        if (i10 == ServiceResponse.SERVICE_FALSE.getCode()) {
            return new Result.Success(Boolean.FALSE);
        }
        return i10 == ServiceResponse.SERVICE_TRUE.getCode() ? new Result.Success(Boolean.TRUE) : new Result.Error(new DeviceCheckerRemoteException("An exception between process has just occurred"));
    }
}
