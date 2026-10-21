package com.bbva.component.dm.naturalauth.data.helper;

import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkResponseExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a?\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"bodyToString", "", "Lcom/bbva/network/model/response/NetworkResponse;", "resultOrThrow", "Output", "responseParser", "Lkotlin/reflect/KFunction1;", "throwBlock", "Lkotlin/Function1;", "", "(Lcom/bbva/network/model/response/NetworkResponse;Lkotlin/reflect/KFunction;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "component-dm-naturalauth_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkResponseExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkResponseExtensions.kt\ncom/bbva/component/dm/naturalauth/data/helper/NetworkResponseExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class NetworkResponseExtensionsKt {
    @NotNull
    public static final String bodyToString(@NotNull NetworkResponse networkResponse) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(String.valueOf(networkResponse.getBody().string()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = "";
        }
        return (String) objM5535constructorimpl;
    }

    public static final <Output> Output resultOrThrow(@NotNull NetworkResponse networkResponse, @NotNull KFunction<? extends Output> responseParser, @NotNull Function1<? super NetworkResponse, ? extends Throwable> throwBlock) throws Throwable {
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        Intrinsics.checkNotNullParameter(throwBlock, "throwBlock");
        if (networkResponse.isSuccessful()) {
            return (Output) ((Function1) responseParser).invoke(String.valueOf(networkResponse.getBody().string()));
        }
        throw throwBlock.invoke(networkResponse);
    }
}
