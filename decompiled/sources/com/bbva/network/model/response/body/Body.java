package com.bbva.network.model.response.body;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Body.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/network/model/response/body/Body;", "", "contentLength", "", "inputStream", "Ljava/io/InputStream;", "string", "", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Body {

    /* JADX INFO: compiled from: Body.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static long contentLength(@NotNull Body body) {
            return 0L;
        }
    }

    long contentLength();

    @Nullable
    InputStream inputStream();

    @Nullable
    String string() throws IOException;
}
