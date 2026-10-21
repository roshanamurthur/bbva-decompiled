package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Binding.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001f\b\u0004\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0006\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"binding", "Lcom/veridas/result/Result;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_EAST, "block", "Lkotlin/Function1;", "Lcom/veridas/result/ResultBinding;", "Lkotlin/ExtensionFunctionType;", "common-core-jvm"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Binding.kt\ncom/veridas/result/BindingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class BindingKt {
    @NotNull
    public static final <V, E> Result<V, E> binding(@NotNull Function1<? super ResultBinding<E>, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ResultBindingImpl resultBindingImpl = new ResultBindingImpl();
        try {
            return new Ok(block.invoke(resultBindingImpl));
        } catch (BindException unused) {
            return resultBindingImpl.getError();
        }
    }
}
