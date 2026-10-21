package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.f;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import fg.b;
import fg.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ObjectEncoderContext {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f48385f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f48386g = f.b(1, FieldDescriptor.builder("key"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f48387h = f.b(2, FieldDescriptor.builder("value"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f48388i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f48389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, ObjectEncoder<?>> f48390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, ValueEncoder<?>> f48391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ObjectEncoder<Object> f48392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f48393e = new d(this);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
    public static /* synthetic */ class C0210a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48394a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f48394a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48394a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48394a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f48389a = outputStream;
        this.f48390b = map;
        this.f48391c = map2;
        this.f48392d = objectEncoder;
    }

    public static int h(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return ((AtProtobuf.a) protobuf).f48376a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(@NonNull FieldDescriptor fieldDescriptor, double d2, boolean z10) throws IOException {
        if (z10 && d2 == 0.0d) {
            return;
        }
        i((h(fieldDescriptor) << 3) | 1);
        this.f48389a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        e(FieldDescriptor.of(str), obj, true);
        return this;
    }

    public final void b(@NonNull FieldDescriptor fieldDescriptor, float f6, boolean z10) throws IOException {
        if (z10 && f6 == 0.0f) {
            return;
        }
        i((h(fieldDescriptor) << 3) | 5);
        this.f48389a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f6).array());
    }

    public final void c(@NonNull FieldDescriptor fieldDescriptor, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        AtProtobuf.a aVar = (AtProtobuf.a) protobuf;
        int i11 = C0210a.f48394a[aVar.f48377b.ordinal()];
        int i12 = aVar.f48376a;
        if (i11 == 1) {
            i(i12 << 3);
            i(i10);
        } else if (i11 == 2) {
            i(i12 << 3);
            i((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i11 != 3) {
                return;
            }
            i((i12 << 3) | 5);
            this.f48389a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void d(@NonNull FieldDescriptor fieldDescriptor, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        AtProtobuf.a aVar = (AtProtobuf.a) protobuf;
        int i10 = C0210a.f48394a[aVar.f48377b.ordinal()];
        int i11 = aVar.f48376a;
        if (i10 == 1) {
            i(i11 << 3);
            j(j10);
        } else if (i10 == 2) {
            i(i11 << 3);
            j((j10 >> 63) ^ (j10 << 1));
        } else {
            if (i10 != 3) {
                return;
            }
            i((i11 << 3) | 1);
            this.f48389a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
        }
    }

    public final void e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            i((h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f48385f);
            i(bytes.length);
            this.f48389a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f48388i, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(fieldDescriptor, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            b(fieldDescriptor, ((Float) obj).floatValue(), z10);
            return;
        }
        if (obj instanceof Number) {
            d(fieldDescriptor, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            c(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            i((h(fieldDescriptor) << 3) | 2);
            i(bArr.length);
            this.f48389a.write(bArr);
            return;
        }
        ObjectEncoder<?> objectEncoder = this.f48390b.get(obj.getClass());
        if (objectEncoder != null) {
            f(objectEncoder, fieldDescriptor, obj, z10);
            return;
        }
        ValueEncoder<?> valueEncoder = this.f48391c.get(obj.getClass());
        if (valueEncoder != null) {
            d dVar = this.f48393e;
            dVar.f68447a = false;
            dVar.f68449c = fieldDescriptor;
            dVar.f68448b = z10;
            valueEncoder.encode(obj, dVar);
            return;
        }
        if (obj instanceof ProtoEnum) {
            c(fieldDescriptor, ((ProtoEnum) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f48392d, fieldDescriptor, obj, z10);
        }
    }

    public final void f(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z10) throws IOException {
        fg.a aVar = new fg.a();
        aVar.f68446p0 = 0L;
        try {
            OutputStream outputStream = this.f48389a;
            this.f48389a = aVar;
            try {
                objectEncoder.encode(obj, this);
                this.f48389a = outputStream;
                long j10 = aVar.f68446p0;
                aVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                i((h(fieldDescriptor) << 3) | 2);
                j(j10);
                objectEncoder.encode(obj, this);
            } catch (Throwable th2) {
                this.f48389a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void g(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        ObjectEncoder<?> objectEncoder = this.f48390b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public final void i(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f48389a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f48389a.write(i10 & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        g(obj);
        return this;
    }

    public final void j(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f48389a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f48389a.write(((int) j10) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        nested(FieldDescriptor.of(str));
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d2) throws IOException {
        a(FieldDescriptor.of(str), d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i10) throws IOException {
        c(FieldDescriptor.of(str), i10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j10) throws IOException {
        d(FieldDescriptor.of(str), j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z10) throws IOException {
        c(FieldDescriptor.of(str), z10 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        e(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2) throws IOException {
        a(fieldDescriptor, d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f6) throws IOException {
        b(fieldDescriptor, f6, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i10) throws IOException {
        c(fieldDescriptor, i10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j10) throws IOException {
        d(fieldDescriptor, j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z10) throws IOException {
        c(fieldDescriptor, z10 ? 1 : 0, true);
        return this;
    }
}
