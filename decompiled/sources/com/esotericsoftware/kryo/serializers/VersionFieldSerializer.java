package com.esotericsoftware.kryo.serializers;

import androidx.appcompat.widget.o1;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes9.dex */
public class VersionFieldSerializer<T> extends FieldSerializer<T> {
    private final VersionFieldSerializerConfig config;
    private int[] fieldVersion;
    private int typeVersion;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Since {
        int value() default 0;
    }

    public VersionFieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new VersionFieldSerializerConfig());
    }

    public VersionFieldSerializerConfig getVersionFieldSerializerConfig() {
        return this.config;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void initializeCachedFields() {
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        this.fieldVersion = new int[cachedFieldArr.length];
        int length = cachedFieldArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Since since = (Since) cachedFieldArr[i10].field.getAnnotation(Since.class);
            if (since != null) {
                this.fieldVersion[i10] = since.value();
                this.typeVersion = Math.max(this.fieldVersion[i10], this.typeVersion);
            } else {
                this.fieldVersion[i10] = 0;
            }
        }
        if (Log.DEBUG) {
            Log.debug("Version for type " + getType().getName() + ": " + this.typeVersion);
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        int varInt = input.readVarInt(true);
        if (varInt == 0) {
            return null;
        }
        int i10 = varInt - 1;
        if (!this.config.compatible && i10 != this.typeVersion) {
            StringBuilder sbC = o1.c("Version is not compatible: ", i10, " != ");
            sbC.append(this.typeVersion);
            throw new KryoException(sbC.toString());
        }
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo.reference(tCreate);
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        int length = cachedFieldArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.fieldVersion[i11] <= i10) {
                if (Log.TRACE) {
                    log("Read", cachedFieldArr[i11], input.position());
                }
                cachedFieldArr[i11].read(input, tCreate);
            } else if (Log.DEBUG) {
                Log.debug("Skip field: " + cachedFieldArr[i11].field.getName());
            }
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        if (t10 == null) {
            output.writeByte((byte) 0);
            return;
        }
        int iPushTypeVariables = pushTypeVariables();
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        output.writeVarInt(this.typeVersion + 1, true);
        int length = cachedFieldArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Log.TRACE) {
                log("Write", cachedFieldArr[i10], output.position());
            }
            cachedFieldArr[i10].write(output, t10);
        }
        popTypeVariables(iPushTypeVariables);
    }

    public static class VersionFieldSerializerConfig extends FieldSerializer.FieldSerializerConfig {
        boolean compatible = true;

        public boolean getCompatible() {
            return this.compatible;
        }

        public void setCompatible(boolean z10) {
            this.compatible = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "VersionFieldSerializerConfig setCompatible: " + z10);
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.FieldSerializerConfig
        /* JADX INFO: renamed from: clone */
        public VersionFieldSerializerConfig mo5277clone() {
            return (VersionFieldSerializerConfig) super.mo5277clone();
        }
    }

    public VersionFieldSerializer(Kryo kryo, Class cls, VersionFieldSerializerConfig versionFieldSerializerConfig) {
        super(kryo, cls, versionFieldSerializerConfig);
        this.config = versionFieldSerializerConfig;
        setAcceptsNull(true);
        initializeCachedFields();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(FieldSerializer.CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }
}
