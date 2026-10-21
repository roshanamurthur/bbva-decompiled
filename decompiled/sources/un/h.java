package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class h implements Converter<ResponseBody, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f93907a = new h();

    @Override // retrofit2.Converter
    public final Long convert(ResponseBody responseBody) throws IOException {
        return Long.valueOf(responseBody.string());
    }
}
