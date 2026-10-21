package eg;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.NumberedEnum;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonValueObjectEncoderContext.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ObjectEncoderContext, ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f68343a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f68344b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f68345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, ObjectEncoder<?>> f68346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, ValueEncoder<?>> f68347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ObjectEncoder<Object> f68348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68349g;

    public d(@NonNull Writer writer, @NonNull HashMap map, @NonNull HashMap map2, ObjectEncoder objectEncoder, boolean z10) {
        this.f68345c = new JsonWriter(writer);
        this.f68346d = map;
        this.f68347e = map2;
        this.f68348f = objectEncoder;
        this.f68349g = z10;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d add(@Nullable Object obj, @NonNull String str) throws IOException {
        boolean z10 = this.f68349g;
        JsonWriter jsonWriter = this.f68345c;
        if (z10) {
            if (obj != null) {
                c();
                jsonWriter.name(str);
                b(obj, false);
            }
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            b(obj, false);
        }
        return this;
    }

    @NonNull
    public final d b(@Nullable Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10 && (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number))) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        JsonWriter jsonWriter = this.f68345c;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    b(it.next(), false);
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        add(entry.getValue(), (String) key);
                    } catch (ClassCastException e5) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e5);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ObjectEncoder<?> objectEncoder = this.f68346d.get(obj.getClass());
            if (objectEncoder != null) {
                if (!z10) {
                    jsonWriter.beginObject();
                }
                objectEncoder.encode(obj, this);
                if (!z10) {
                    jsonWriter.endObject();
                }
                return this;
            }
            ValueEncoder<?> valueEncoder = this.f68347e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                if (!z10) {
                    jsonWriter.beginObject();
                }
                this.f68348f.encode(obj, this);
                if (!z10) {
                    jsonWriter.endObject();
                }
                return this;
            }
            if (obj instanceof NumberedEnum) {
                int number = ((NumberedEnum) obj).getNumber();
                c();
                jsonWriter.value(number);
            } else {
                String strName = ((Enum) obj).name();
                c();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                c();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number2 : (Number[]) obj) {
                b(number2, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                b(obj2, false);
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void c() throws IOException {
        if (!this.f68344b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        d dVar = this.f68343a;
        if (dVar != null) {
            dVar.c();
            this.f68343a.f68344b = false;
            this.f68343a = null;
            this.f68345c.endObject();
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        b(obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        c();
        this.f68343a = new d(this);
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(str);
        jsonWriter.beginObject();
        return this.f68343a;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d2) throws IOException {
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i10) throws IOException {
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i10);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        return nested(fieldDescriptor.getName());
    }

    public d(d dVar) {
        this.f68345c = dVar.f68345c;
        this.f68346d = dVar.f68346d;
        this.f68347e = dVar.f68347e;
        this.f68348f = dVar.f68348f;
        this.f68349g = dVar.f68349g;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j10) throws IOException {
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j10);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z10) throws IOException {
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z10);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(obj, fieldDescriptor.getName());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f6) throws IOException {
        String name = fieldDescriptor.getName();
        double d2 = f6;
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(name);
        c();
        jsonWriter.value(d2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2) throws IOException {
        String name = fieldDescriptor.getName();
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(name);
        c();
        jsonWriter.value(d2);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i10) throws IOException {
        String name = fieldDescriptor.getName();
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(name);
        c();
        jsonWriter.value(i10);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j10) throws IOException {
        String name = fieldDescriptor.getName();
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(name);
        c();
        jsonWriter.value(j10);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z10) throws IOException {
        String name = fieldDescriptor.getName();
        c();
        JsonWriter jsonWriter = this.f68345c;
        jsonWriter.name(name);
        c();
        jsonWriter.value(z10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        c();
        this.f68345c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f6) throws IOException {
        c();
        this.f68345c.value(f6);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d2) throws IOException {
        c();
        this.f68345c.value(d2);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i10) throws IOException {
        c();
        this.f68345c.value(i10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j10) throws IOException {
        c();
        this.f68345c.value(j10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z10) throws IOException {
        c();
        this.f68345c.value(z10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable byte[] bArr) throws IOException {
        c();
        JsonWriter jsonWriter = this.f68345c;
        if (bArr == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }
}
