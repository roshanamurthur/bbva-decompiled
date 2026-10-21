package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements Converter<ResponseBody, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f93901a = new b();

    @Override // retrofit2.Converter
    public final Boolean convert(ResponseBody responseBody) throws IOException {
        return Boolean.valueOf(responseBody.string());
    }
}
