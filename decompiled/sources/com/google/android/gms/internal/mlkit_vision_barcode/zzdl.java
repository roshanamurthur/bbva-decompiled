package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.c;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdl implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("key"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("value"));
    private static final ObjectEncoder zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdk
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            zzdl.zzg((Map.Entry) obj, (ObjectEncoderContext) obj2);
        }
    };
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzdp zzi = new zzdp(this);

    public zzdl(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzdj zzdjVar = (zzdj) fieldDescriptor.getProperty(zzdj.class);
        if (zzdjVar != null) {
            return zzdjVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        zzdg zzdgVar = new zzdg();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzdgVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzdgVar.zza();
                zzdgVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzdgVar.close();
            } catch (Throwable unused) {
            }
            throw th3;
        }
    }

    private static zzdj zzj(FieldDescriptor fieldDescriptor) {
        zzdj zzdjVar = (zzdj) fieldDescriptor.getProperty(zzdj.class);
        if (zzdjVar != null) {
            return zzdjVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzdl zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z10) throws IOException {
        long jZzi = zzi(objectEncoder, obj);
        if (z10 && jZzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private final zzdl zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z10) throws IOException {
        this.zzi.zza(fieldDescriptor, z10);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.zze.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.zze.write(i10 & 127);
    }

    private final void zzo(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.zze.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2) throws IOException {
        zza(fieldDescriptor, d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final ObjectEncoderContext zza(@NonNull FieldDescriptor fieldDescriptor, double d2, boolean z10) throws IOException {
        if (z10 && d2 == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d2).array());
        return this;
    }

    public final ObjectEncoderContext zzb(@NonNull FieldDescriptor fieldDescriptor, float f6, boolean z10) throws IOException {
        if (z10 && f6 == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f6).array());
        return this;
    }

    public final ObjectEncoderContext zzc(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(fieldDescriptor, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            zza(fieldDescriptor, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            zzb(fieldDescriptor, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            zze(fieldDescriptor, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder != null) {
            zzk(objectEncoder, fieldDescriptor, obj, z10);
            return this;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
        if (valueEncoder != null) {
            zzl(valueEncoder, fieldDescriptor, obj, z10);
            return this;
        }
        if (obj instanceof zzdh) {
            zzd(fieldDescriptor, ((zzdh) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
            return this;
        }
        zzk(this.zzh, fieldDescriptor, obj, z10);
        return this;
    }

    public final zzdl zzd(@NonNull FieldDescriptor fieldDescriptor, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        zzdj zzdjVarZzj = zzj(fieldDescriptor);
        zzdi zzdiVar = zzdi.DEFAULT;
        int iOrdinal = zzdjVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzdjVarZzj.zza() << 3);
            zzn(i10);
        } else if (iOrdinal == 1) {
            zzn(zzdjVarZzj.zza() << 3);
            zzn((i10 + i10) ^ (i10 >> 31));
        } else if (iOrdinal == 2) {
            zzn((zzdjVarZzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i10).array());
        }
        return this;
    }

    public final zzdl zze(@NonNull FieldDescriptor fieldDescriptor, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        zzdj zzdjVarZzj = zzj(fieldDescriptor);
        zzdi zzdiVar = zzdi.DEFAULT;
        int iOrdinal = zzdjVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzdjVarZzj.zza() << 3);
            zzo(j10);
        } else if (iOrdinal == 1) {
            zzn(zzdjVarZzj.zza() << 3);
            zzo((j10 >> 63) ^ (j10 + j10));
        } else if (iOrdinal == 2) {
            zzn((zzdjVarZzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j10).array());
        }
        return this;
    }

    public final zzdl zzf(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f6) throws IOException {
        zzb(fieldDescriptor, f6, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i10) throws IOException {
        zzd(fieldDescriptor, i10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j10) throws IOException {
        zze(fieldDescriptor, j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z10) throws IOException {
        zzd(fieldDescriptor, z10 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d2) throws IOException {
        zza(FieldDescriptor.of(str), d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i10) throws IOException {
        zzd(FieldDescriptor.of(str), i10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j10) throws IOException {
        zze(FieldDescriptor.of(str), j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        zzc(FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z10) throws IOException {
        zzd(FieldDescriptor.of(str), z10 ? 1 : 0, true);
        return this;
    }
}
