package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class g implements Converter<ResponseBody, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f93906a = new g();

    @Override // retrofit2.Converter
    public final Integer convert(ResponseBody responseBody) throws IOException {
        return Integer.valueOf(responseBody.string());
    }
}
