package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import fg.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ProtobufEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ObjectEncoder<?>> f48378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, ValueEncoder<?>> f48379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObjectEncoder<Object> f48380c;

    public ProtobufEncoder(HashMap map, HashMap map2, ObjectEncoder objectEncoder) {
        this.f48378a = map;
        this.f48379b = map2;
        this.f48380c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new a(outputStream, this.f48378a, this.f48379b, this.f48380c).g(obj);
    }

    public static final class Builder implements EncoderConfig<Builder> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f48381d = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f48382a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f48383b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ObjectEncoder<Object> f48384c = f48381d;

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.f48382a), new HashMap(this.f48383b), this.f48384c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.f48384c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f48382a.put(cls, objectEncoder);
            this.f48383b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.f48383b.put(cls, valueEncoder);
            this.f48382a.remove(cls);
            return this;
        }
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
