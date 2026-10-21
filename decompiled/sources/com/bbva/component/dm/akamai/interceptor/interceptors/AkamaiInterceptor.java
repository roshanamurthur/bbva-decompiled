package com.bbva.component.dm.akamai.interceptor.interceptors;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.view.a;
import com.bbva.component.dm.akamai.interceptor.models.AkamaiErrorType;
import com.bbva.network.interceptor.NetworkInterceptor;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016R\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/interceptors/AkamaiInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "akamaiListener", "Lkotlin/Function1;", "Lcom/bbva/component/dm/akamai/interceptor/models/AkamaiErrorType;", "", "Lcom/bbva/component/dm/akamai/interceptor/AkamaiInterceptorListener;", "getAkamaiListener", "()Lkotlin/jvm/functions/Function1;", "notify", "akamaiErrorType", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AkamaiInterceptor extends NetworkInterceptor {

    /* JADX INFO: compiled from: AkamaiInterceptor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void notify(@NotNull AkamaiInterceptor akamaiInterceptor, @NotNull AkamaiErrorType akamaiErrorType) {
            Intrinsics.checkNotNullParameter(akamaiErrorType, "akamaiErrorType");
            new Handler(Looper.getMainLooper()).post(new a(akamaiInterceptor, akamaiErrorType, 2));
        }

        public static boolean verifyConnection(@NotNull AkamaiInterceptor akamaiInterceptor, @NotNull String host, @NotNull SSLSession sslSession) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(sslSession, "sslSession");
            return NetworkInterceptor.DefaultImpls.verifyConnection(akamaiInterceptor, host, sslSession);
        }
    }

    @NotNull
    Function1<AkamaiErrorType, Unit> getAkamaiListener();

    void notify(@NotNull AkamaiErrorType akamaiErrorType);
}
