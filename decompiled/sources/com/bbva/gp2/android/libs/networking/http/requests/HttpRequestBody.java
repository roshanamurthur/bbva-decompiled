package com.bbva.gp2.android.libs.networking.http.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestBody.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;", "", "()V", "bytes", "", "Lcom/bbva/gp2/android/libs/networking/http/requests/StringBody;", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class HttpRequestBody {
    private HttpRequestBody() {
    }

    public /* synthetic */ HttpRequestBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract byte[] bytes();
}
