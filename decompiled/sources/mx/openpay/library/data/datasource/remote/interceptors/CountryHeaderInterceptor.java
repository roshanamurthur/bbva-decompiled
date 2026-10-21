package mx.openpay.library.data.datasource.remote.interceptors;

import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryHeaderInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmx/openpay/library/data/datasource/remote/interceptors/CountryHeaderInterceptor;", "Lokhttp3/Interceptor;", ContextualDataConstants.CD_COUNTRY_CODE, "", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CountryHeaderInterceptor implements Interceptor {

    @NotNull
    private final String countryCode;

    public CountryHeaderInterceptor(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryCode = countryCode;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        return chain.proceed(request.newBuilder().url(httpUrlUrl.newBuilder().setPathSegment(httpUrlUrl.pathSegments().indexOf("{country}"), this.countryCode).build()).build());
    }
}
