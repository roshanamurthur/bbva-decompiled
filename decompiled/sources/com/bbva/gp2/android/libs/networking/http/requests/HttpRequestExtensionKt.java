package com.bbva.gp2.android.libs.networking.http.requests;

import com.bbva.network.constant.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapMethod", "Lcom/bbva/network/constant/Method;", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequest;", "gp2-ethermobile-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HttpRequestExtensionKt {

    /* JADX INFO: compiled from: HttpRequestExtension.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HttpMethod.PATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Method mapMethod(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[httpRequest.getMethod().ordinal()]) {
            case 1:
                return Method.GET;
            case 2:
                return Method.POST;
            case 3:
                return Method.PUT;
            case 4:
                return Method.DELETE;
            case 5:
                return Method.HEAD;
            case 6:
                return Method.PATCH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
