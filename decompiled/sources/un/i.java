package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class i implements Converter<ResponseBody, Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f93908a = new i();

    @Override // retrofit2.Converter
    public final Short convert(ResponseBody responseBody) throws IOException {
        return Short.valueOf(responseBody.string());
    }
}
