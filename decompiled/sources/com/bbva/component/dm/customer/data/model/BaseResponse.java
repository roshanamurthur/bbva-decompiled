package com.bbva.component.dm.customer.data.model;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/customer/data/model/BaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "data", "copy", "(Ljava/lang/Object;)Lcom/bbva/component/dm/customer/data/model/BaseResponse;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Object;", "getData", "<init>", "(Ljava/lang/Object;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BaseResponse<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final T data;

    public BaseResponse(T t10) {
        this.data = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = baseResponse.data;
        }
        return baseResponse.copy(obj);
    }

    public final T component1() {
        return this.data;
    }

    @NotNull
    public final BaseResponse<T> copy(T data) {
        return new BaseResponse<>(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BaseResponse) && Intrinsics.areEqual(this.data, ((BaseResponse) other).data);
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        T t10 = this.data;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @NotNull
    public String toString() {
        return a.e(new StringBuilder("BaseResponse(data="), this.data, ")");
    }
}
