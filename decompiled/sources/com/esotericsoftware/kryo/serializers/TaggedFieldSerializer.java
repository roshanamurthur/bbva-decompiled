package com.esotericsoftware.kryo.serializers;

import androidx.appcompat.widget.o1;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.util.IntMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class TaggedFieldSerializer<T> extends FieldSerializer<T> {
    private final TaggedFieldSerializerConfig config;
    private IntMap<FieldSerializer.CachedField> readTags;
    private FieldSerializer.CachedField[] writeTags;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Tag {
        int value();
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new TaggedFieldSerializerConfig());
    }

    public TaggedFieldSerializerConfig getTaggedFieldSerializerConfig() {
        return this.config;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void initializeCachedFields() {
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        int length = cachedFieldArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cachedFieldArr[i10].field.getAnnotation(Tag.class) == null) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Ignoring field without tag: " + cachedFieldArr[i10]);
                }
                super.removeField(cachedFieldArr[i10]);
            }
        }
        FieldSerializer.CachedField[] cachedFieldArr2 = this.cachedFields.f40042q0;
        ArrayList arrayList = new ArrayList(cachedFieldArr2.length);
        this.readTags = new IntMap<>((int) (cachedFieldArr2.length / 0.8f));
        for (FieldSerializer.CachedField cachedField : cachedFieldArr2) {
            Field field = cachedField.field;
            int iValue = ((Tag) field.getAnnotation(Tag.class)).value();
            if (this.readTags.containsKey(iValue)) {
                throw new KryoException(String.format("Duplicate tag %d on fields: %s and %s", Integer.valueOf(iValue), field, arrayList.get(iValue)));
            }
            this.readTags.put(iValue, cachedField);
            if (field.getAnnotation(Deprecated.class) == null) {
                arrayList.add(cachedField);
            }
            cachedField.tag = iValue;
        }
        this.writeTags = (FieldSerializer.CachedField[]) arrayList.toArray(new FieldSerializer.CachedField[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        InputChunked inputChunked;
        Input inputChunked2;
        T t10;
        boolean z10;
        Input input2 = input;
        boolean z11 = true;
        int varInt = input2.readVarInt(true);
        if (varInt == 0) {
            return null;
        }
        int i10 = varInt - 1;
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo.reference(tCreate);
        TaggedFieldSerializerConfig taggedFieldSerializerConfig = this.config;
        boolean z12 = taggedFieldSerializerConfig.chunked;
        boolean z13 = taggedFieldSerializerConfig.readUnknownTagData;
        if (z12) {
            inputChunked2 = new InputChunked(input2, this.config.chunkSize);
            inputChunked = inputChunked2;
        } else {
            inputChunked = 0;
            inputChunked2 = input2;
        }
        IntMap<FieldSerializer.CachedField> intMap = this.readTags;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10;
            int varInt2 = input2.readVarInt(z11);
            FieldSerializer.CachedField cachedField = intMap.get(varInt2);
            IntMap<FieldSerializer.CachedField> intMap2 = intMap;
            int i13 = iPushTypeVariables;
            if (z13) {
                try {
                    Registration registration = kryo.readClass(inputChunked2);
                    if (registration == null) {
                        if (z12) {
                            inputChunked.nextChunk();
                        }
                        z10 = z13;
                    } else {
                        z10 = z13;
                        Class type = registration.getType();
                        if (cachedField == null) {
                            if (Log.TRACE) {
                                StringBuilder sbC = o1.c("Read unknown tag ", varInt2, " data, type: ");
                                sbC.append(Util.className(type));
                                Log.trace("kryo", sbC.toString());
                            }
                            try {
                                kryo.readObject(inputChunked2, type);
                            } catch (KryoException e5) {
                                StringBuilder sbC2 = o1.c("Unable to read unknown tag ", varInt2, " data, type: ");
                                sbC2.append(Util.className(type));
                                sbC2.append(" (");
                                sbC2.append(getType().getName());
                                sbC2.append("#");
                                sbC2.append(cachedField);
                                sbC2.append(")");
                                String string = sbC2.toString();
                                if (!z12) {
                                    throw new KryoException(string, e5);
                                }
                                if (Log.DEBUG) {
                                    Log.debug("kryo", string, e5);
                                }
                            }
                            if (z12) {
                                inputChunked.nextChunk();
                            }
                        } else {
                            t10 = tCreate;
                            i11 = i11;
                            cachedField.setCanBeNull(false);
                            cachedField.setValueClass(type);
                            cachedField.setReuseSerializer(false);
                            if (Log.TRACE) {
                                log("Read", cachedField, input.position());
                            }
                            tCreate = t10;
                            cachedField.read(inputChunked2, tCreate);
                            if (z12) {
                                inputChunked.nextChunk();
                            }
                        }
                    }
                } catch (KryoException e7) {
                    t10 = tCreate;
                    z10 = z13;
                    i11 = i11;
                    StringBuilder sbC3 = o1.c("Unable to read unknown tag ", varInt2, " data (unknown type). (");
                    sbC3.append(getType().getName());
                    sbC3.append("#");
                    sbC3.append(cachedField);
                    sbC3.append(")");
                    String string2 = sbC3.toString();
                    if (!z12) {
                        throw new KryoException(string2, e7);
                    }
                    if (Log.DEBUG) {
                        Log.debug("kryo", string2, e7);
                    }
                    inputChunked.nextChunk();
                    tCreate = t10;
                }
            } else {
                t10 = tCreate;
                z10 = z13;
                i11 = i11;
                if (cachedField != null) {
                    if (Log.TRACE) {
                        log("Read", cachedField, input.position());
                    }
                    tCreate = t10;
                    cachedField.read(inputChunked2, tCreate);
                    if (z12) {
                        inputChunked.nextChunk();
                    }
                } else {
                    if (!z12) {
                        StringBuilder sbC4 = o1.c("Unknown field tag: ", varInt2, " (");
                        sbC4.append(getType().getName());
                        sbC4.append(")");
                        throw new KryoException(sbC4.toString());
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Skip unknown field tag: " + varInt2);
                    }
                    inputChunked.nextChunk();
                    tCreate = t10;
                }
            }
            i11++;
            tCreate = tCreate;
            i10 = i12;
            intMap = intMap2;
            iPushTypeVariables = i13;
            z13 = z10;
            z11 = true;
            input2 = input;
        }
        T t11 = tCreate;
        popTypeVariables(iPushTypeVariables);
        return t11;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Output outputChunked;
        OutputChunked outputChunked2;
        Class<?> cls;
        if (t10 == null) {
            output.writeByte((byte) 0);
            return;
        }
        int iPushTypeVariables = pushTypeVariables();
        FieldSerializer.CachedField[] cachedFieldArr = this.writeTags;
        output.writeVarInt(cachedFieldArr.length + 1, true);
        writeHeader(kryo, output, t10);
        TaggedFieldSerializerConfig taggedFieldSerializerConfig = this.config;
        boolean z10 = taggedFieldSerializerConfig.chunked;
        boolean z11 = taggedFieldSerializerConfig.readUnknownTagData;
        if (z10) {
            outputChunked = new OutputChunked(output, this.config.chunkSize);
            outputChunked2 = outputChunked;
        } else {
            outputChunked = output;
            outputChunked2 = 0;
        }
        for (FieldSerializer.CachedField cachedField : cachedFieldArr) {
            if (Log.TRACE) {
                log("Write", cachedField, output.position());
            }
            output.writeVarInt(cachedField.tag, true);
            if (z11) {
                try {
                    Object obj = cachedField.field.get(t10);
                    cls = obj != null ? obj.getClass() : null;
                } catch (IllegalAccessException unused) {
                    cls = null;
                }
                kryo.writeClass(outputChunked, cls);
                if (cls != null) {
                    cachedField.setCanBeNull(false);
                    cachedField.setValueClass(cls);
                    cachedField.setReuseSerializer(false);
                } else if (z10) {
                    outputChunked2.endChunk();
                }
            }
            cachedField.write(outputChunked, t10);
            if (z10) {
                outputChunked2.endChunk();
            }
        }
        popTypeVariables(iPushTypeVariables);
    }

    public static class TaggedFieldSerializerConfig extends FieldSerializer.FieldSerializerConfig {
        int chunkSize = 1024;
        boolean chunked;
        boolean readUnknownTagData;

        public int getChunkSize() {
            return this.chunkSize;
        }

        public boolean getChunkedEncoding() {
            return this.chunked;
        }

        public boolean getReadUnknownTagData() {
            return this.readUnknownTagData;
        }

        public void setChunkSize(int i10) {
            this.chunkSize = i10;
            if (Log.TRACE) {
                Log.trace("kryo", "TaggedFieldSerializerConfig setChunkSize: " + i10);
            }
        }

        public void setChunkedEncoding(boolean z10) {
            this.chunked = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "TaggedFieldSerializerConfig setChunked: " + z10);
            }
        }

        public void setReadUnknownTagData(boolean z10) {
            this.readUnknownTagData = z10;
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.FieldSerializerConfig
        /* JADX INFO: renamed from: clone */
        public TaggedFieldSerializerConfig mo5277clone() {
            return (TaggedFieldSerializerConfig) super.mo5277clone();
        }
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls, TaggedFieldSerializerConfig taggedFieldSerializerConfig) {
        super(kryo, cls, taggedFieldSerializerConfig);
        this.config = taggedFieldSerializerConfig;
        setAcceptsNull(true);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(FieldSerializer.CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }

    public void writeHeader(Kryo kryo, Output output, T t10) {
    }
}
