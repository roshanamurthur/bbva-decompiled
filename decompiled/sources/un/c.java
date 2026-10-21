package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c implements Converter<ResponseBody, Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f93902a = new c();

    @Override // retrofit2.Converter
    public final Byte convert(ResponseBody responseBody) throws IOException {
        return Byte.valueOf(responseBody.string());
    }
}
