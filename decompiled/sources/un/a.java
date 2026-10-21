package un;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarRequestBodyConverter.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a<T> implements Converter<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<Object> f93899a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MediaType f93900b = MediaType.get("text/plain; charset=UTF-8");

    @Override // retrofit2.Converter
    public final RequestBody convert(Object obj) throws IOException {
        return RequestBody.create(f93900b, String.valueOf(obj));
    }
}
