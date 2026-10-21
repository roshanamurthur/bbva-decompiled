package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import eg.c;
import eg.d;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final eg.a f48364e = new eg.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final eg.b f48365f = new eg.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f48366g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f48367h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48368a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48369b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectEncoder<Object> f48370c = f48364e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48371d = false;

    public static final class b implements ValueEncoder<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f48373a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f48373a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public final void encode(@NonNull Object obj, @NonNull Object obj2) throws IOException {
            ((ValueEncoderContext) obj2).add(f48373a.format((Date) obj));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) f48365f);
        registerEncoder(Boolean.class, (ValueEncoder) f48366g);
        registerEncoder(Date.class, (ValueEncoder) f48367h);
    }

    @NonNull
    public DataEncoder build() {
        return new a();
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z10) {
        this.f48371d = z10;
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.f48370c = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.f48368a.put(cls, objectEncoder);
        this.f48369b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.f48369b.put(cls, valueEncoder);
        this.f48368a.remove(cls);
        return this;
    }

    public class a implements DataEncoder {
        public a() {
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public final void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException {
            JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.this;
            d dVar = new d(writer, jsonDataEncoderBuilder.f48368a, jsonDataEncoderBuilder.f48369b, jsonDataEncoderBuilder.f48370c, jsonDataEncoderBuilder.f48371d);
            dVar.b(obj, false);
            dVar.c();
            dVar.f68345c.flush();
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public final String encode(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }
}
