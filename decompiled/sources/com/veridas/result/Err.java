package com.veridas.result;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Err.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/veridas/result/Err;", ExifInterface.LONGITUDE_EAST, "Lcom/veridas/result/Result;", "", "okValue", "errValue", "()Ljava/lang/Object;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/Object;", "getError", "error", "<init>", "(Ljava/lang/Object;)V", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
public final class Err<E> extends Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final E error;

    public Err(E e5) {
        super(null);
        this.error = e5;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Err.class == other.getClass() && Intrinsics.areEqual(this.error, ((Err) other).error);
    }

    @Override // com.veridas.result.Result
    public E errValue() {
        return this.error;
    }

    public final E getError() {
        return this.error;
    }

    public int hashCode() {
        E e5 = this.error;
        if (e5 != null) {
            return e5.hashCode();
        }
        return 0;
    }

    @Override // com.veridas.result.Result
    @Nullable
    public Void okValue() {
        return null;
    }

    @NotNull
    public String toString() {
        return a.e(new StringBuilder("Err("), this.error, ")");
    }
}
