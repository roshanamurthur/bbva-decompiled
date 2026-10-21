package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class f implements Converter<ResponseBody, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f93905a = new f();

    @Override // retrofit2.Converter
    public final Float convert(ResponseBody responseBody) throws IOException {
        return Float.valueOf(responseBody.string());
    }
}
