package com.bbva.gp2.android.libs.networking.http.ether.responses;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.gp2.android.libs.networking.http.responses.ResponseBody;
import com.bbva.network.model.response.body.Body;
import com.mypinpad.tsdk.isolation.y2;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherResponseBody.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/ether/responses/EtherResponseBody;", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "body", "Lcom/bbva/network/model/response/body/Body;", "(Lcom/bbva/network/model/response/body/Body;)V", "inputStream", "Ljava/io/InputStream;", "string", "", "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EtherResponseBody implements ResponseBody {

    @Nullable
    private final InputStream inputStream;

    @Nullable
    private final String string;

    public EtherResponseBody(@NotNull Body body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.inputStream = body.inputStream();
        this.string = body.string();
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.ResponseBody
    @Nullable
    /* JADX INFO: renamed from: inputStream, reason: from getter */
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.responses.ResponseBody
    @Nullable
    /* JADX INFO: renamed from: string, reason: from getter */
    public String getString() {
        return this.string;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EtherResponseBody(inputStream=");
        sb2.append(this.inputStream);
        sb2.append(", string=");
        return y2.b(sb2, this.string, RootService.CLOSE_BRACKET);
    }
}
