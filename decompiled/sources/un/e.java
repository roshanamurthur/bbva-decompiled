package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class e implements Converter<ResponseBody, Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f93904a = new e();

    @Override // retrofit2.Converter
    public final Double convert(ResponseBody responseBody) throws IOException {
        return Double.valueOf(responseBody.string());
    }
}
