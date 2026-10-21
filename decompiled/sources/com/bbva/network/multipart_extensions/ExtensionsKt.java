package com.bbva.network.multipart_extensions;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.NetworkWorker;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.multipart_extensions.response.MultipartNetworkResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\u001a#\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"multipartMixedOf", "", EventDataKeys.Audience.UUID, "boundary", "Lcom/bbva/network/model/response/NetworkResponse;", "fetchMultipart", "Lcom/bbva/network/multipart_extensions/response/MultipartNetworkResponse;", "Lcom/bbva/network/NetworkWorker;", "requestBlock", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "", "Lkotlin/ExtensionFunctionType;", "network-multipart-extensions_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionsKt {
    @Nullable
    public static final String boundary(@NotNull NetworkResponse networkResponse) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        String str = networkResponse.getHeaders().get(DigipassManagerConstants.KEY_CONTENT_TYPE);
        if (str == null && (str = networkResponse.getHeaders().get(c.f84798c)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MatchResult matchResultFind$default = Regex.find$default(new Regex(".+boundary=\"(.+)\""), str, 0, 2, null);
            Intrinsics.checkNotNull(matchResultFind$default);
            objM5535constructorimpl = Result.m5535constructorimpl(matchResultFind$default.getDestructured().getMatch().getGroupValues().get(1));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @NotNull
    public static final MultipartNetworkResponse fetchMultipart(@NotNull NetworkWorker networkWorker, @NotNull Function1<? super MutableNetworkRequest, Unit> requestBlock) {
        Intrinsics.checkNotNullParameter(networkWorker, "<this>");
        Intrinsics.checkNotNullParameter(requestBlock, "requestBlock");
        return new MultipartNetworkResponse(networkWorker.execute(requestBlock));
    }

    @NotNull
    public static final String multipartMixedOf(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return "multipart/mixed; boundary=\"" + uuid + "\";charset=UTF-8";
    }
}
