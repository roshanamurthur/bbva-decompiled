package com.bbva.network.model.response.body.impl;

import com.bbva.network.model.response.body.Body;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttpBody.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/network/model/response/body/impl/OkHttpBody;", "Lcom/bbva/network/model/response/body/Body;", "", "contentLength", "", "string", "Ljava/io/InputStream;", "inputStream", "Lokhttp3/ResponseBody;", "responseBody", "<init>", "(Lokhttp3/ResponseBody;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class OkHttpBody implements Body {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ResponseBody f35163a;

    public OkHttpBody(@Nullable ResponseBody responseBody) {
        this.f35163a = responseBody;
    }

    @Override // com.bbva.network.model.response.body.Body
    public long contentLength() {
        ResponseBody responseBody = this.f35163a;
        if (responseBody != null) {
            return responseBody.getF85679r0();
        }
        return 0L;
    }

    @Override // com.bbva.network.model.response.body.Body
    @Nullable
    public InputStream inputStream() {
        ResponseBody responseBody = this.f35163a;
        if (responseBody != null) {
            return responseBody.byteStream();
        }
        return null;
    }

    @Override // com.bbva.network.model.response.body.Body
    @Nullable
    public String string() throws IOException {
        ResponseBody responseBody = this.f35163a;
        if (responseBody != null) {
            return responseBody.string();
        }
        return null;
    }
}
