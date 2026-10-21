package com.bbva.gp2.android.libs.networking.http.responses;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBody;", "", "inputStream", "Ljava/io/InputStream;", "string", "", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ResponseBody {
    @Nullable
    InputStream inputStream();

    @Nullable
    String string();
}
