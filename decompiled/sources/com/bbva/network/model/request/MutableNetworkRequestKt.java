package com.bbva.network.model.request;

import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutableNetworkRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"request", "Lcom/bbva/network/model/NetworkRequest;", "block", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "", "Lkotlin/ExtensionFunctionType;", "webSocketRequest", "network_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableNetworkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableNetworkRequest.kt\ncom/bbva/network/model/request/MutableNetworkRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class MutableNetworkRequestKt {
    @NotNull
    public static final NetworkRequest request(@NotNull Function1<? super MutableNetworkRequest, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableNetworkRequest mutableNetworkRequest = new MutableNetworkRequest();
        block.invoke(mutableNetworkRequest);
        return mutableNetworkRequest;
    }

    @NotNull
    public static final NetworkRequest webSocketRequest(@NotNull Function1<? super MutableNetworkRequest, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableNetworkRequest mutableNetworkRequest = new MutableNetworkRequest();
        mutableNetworkRequest.setMethod(Method.GET);
        block.invoke(mutableNetworkRequest);
        return mutableNetworkRequest;
    }
}
