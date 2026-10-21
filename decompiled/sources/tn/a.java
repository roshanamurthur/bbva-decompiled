package tn;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a<T> implements Converter<T, RequestBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f93624c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f93625d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f93626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f93627b;

    public a(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f93626a = gson;
        this.f93627b = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final RequestBody convert(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f93626a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f93625d));
        this.f93627b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(f93624c, buffer.readByteString());
    }
}
