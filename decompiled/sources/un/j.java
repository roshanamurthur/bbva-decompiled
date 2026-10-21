package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class j implements Converter<ResponseBody, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f93909a = new j();

    @Override // retrofit2.Converter
    public final String convert(ResponseBody responseBody) throws IOException {
        return responseBody.string();
    }
}
