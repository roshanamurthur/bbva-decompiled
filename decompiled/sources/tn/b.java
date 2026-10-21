package tn;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b<T> implements Converter<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f93628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f93629b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f93628a = gson;
        this.f93629b = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        JsonReader jsonReaderNewJsonReader = this.f93628a.newJsonReader(responseBody2.charStream());
        try {
            T t10 = this.f93629b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return t10;
        } catch (Throwable th2) {
            responseBody2.close();
            throw th2;
        }
    }
}
