package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;

/* JADX INFO: loaded from: classes9.dex */
public class CompatibleFieldSerializer<T> extends FieldSerializer<T> {
    private static final int binarySearchThreshold = 32;
    private final CompatibleFieldSerializerConfig config;

    public CompatibleFieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new CompatibleFieldSerializerConfig());
    }

    private FieldSerializer.CachedField[] readFields(Kryo kryo, Input input) {
        if (Log.TRACE) {
            Log.trace("kryo", "Read fields for class: ".concat(this.type.getName()));
        }
        int varInt = input.readVarInt(true);
        String[] strArr = new String[varInt];
        for (int i10 = 0; i10 < varInt; i10++) {
            strArr[i10] = input.readString();
            if (Log.TRACE) {
                Log.trace("kryo", "Read field name: " + strArr[i10]);
            }
        }
        FieldSerializer.CachedField[] cachedFieldArr = new FieldSerializer.CachedField[varInt];
        FieldSerializer.CachedField[] cachedFieldArr2 = this.cachedFields.f40042q0;
        if (varInt < 32) {
            for (int i11 = 0; i11 < varInt; i11++) {
                String str = strArr[i11];
                int length = cachedFieldArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        if (!Log.TRACE) {
                            break;
                        }
                        Log.trace("kryo", "Unknown field will be skipped: " + str);
                        break;
                    }
                    if (cachedFieldArr2[i12].name.equals(str)) {
                        cachedFieldArr[i11] = cachedFieldArr2[i12];
                        break;
                    }
                    i12++;
                }
            }
        } else {
            int length2 = cachedFieldArr2.length - 1;
            for (int i13 = 0; i13 < varInt; i13++) {
                String str2 = strArr[i13];
                int i14 = 0;
                int i15 = length2;
                while (true) {
                    if (i14 > i15) {
                        if (!Log.TRACE) {
                            break;
                        }
                        Log.trace("kryo", "Unknown field will be skipped: " + str2);
                        break;
                    }
                    int i16 = (i14 + i15) >>> 1;
                    int iCompareTo = str2.compareTo(cachedFieldArr2[i16].name);
                    if (iCompareTo >= 0) {
                        if (iCompareTo <= 0) {
                            cachedFieldArr[i13] = cachedFieldArr2[i16];
                            break;
                        }
                        i14 = i16 + 1;
                    } else {
                        i15 = i16 - 1;
                    }
                }
            }
        }
        kryo.getGraphContext().put(this, cachedFieldArr);
        return cachedFieldArr;
    }

    public CompatibleFieldSerializerConfig getCompatibleFieldSerializerConfig() {
        return this.config;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        InputChunked inputChunked;
        Input inputChunked2;
        boolean z10;
        Kryo kryo2 = kryo;
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo2.reference(tCreate);
        FieldSerializer.CachedField[] fields = (FieldSerializer.CachedField[]) kryo.getGraphContext().get(this);
        if (fields == null) {
            fields = readFields(kryo, input);
        }
        FieldSerializer.CachedField[] cachedFieldArr = fields;
        CompatibleFieldSerializerConfig compatibleFieldSerializerConfig = this.config;
        boolean z11 = compatibleFieldSerializerConfig.chunked;
        boolean z12 = compatibleFieldSerializerConfig.readUnknownFieldData;
        if (z11) {
            inputChunked2 = new InputChunked(input, this.config.chunkSize);
            inputChunked = inputChunked2;
        } else {
            inputChunked = 0;
            inputChunked2 = input;
        }
        int length = cachedFieldArr.length;
        int i10 = 0;
        while (i10 < length) {
            FieldSerializer.CachedField cachedField = cachedFieldArr[i10];
            FieldSerializer.CachedField[] cachedFieldArr2 = cachedFieldArr;
            if (z12) {
                try {
                    Registration registration = kryo2.readClass(inputChunked2);
                    if (registration == null) {
                        if (z11) {
                            inputChunked.nextChunk();
                        }
                        z10 = z12;
                        length = length;
                    } else {
                        z10 = z12;
                        Class type = registration.getType();
                        if (cachedField == null) {
                            if (Log.TRACE) {
                                Log.trace("kryo", "Read unknown data, type: " + Util.className(type) + Util.pos(input.position()));
                            }
                            try {
                                kryo2.readObject(inputChunked2, type);
                            } catch (KryoException e5) {
                                String str = "Unable to read unknown data, type: " + Util.className(type) + " (" + getType().getName() + "#" + cachedField + ")";
                                if (!z11) {
                                    throw new KryoException(str, e5);
                                }
                                if (Log.DEBUG) {
                                    Log.debug("kryo", str, e5);
                                }
                            }
                            if (z11) {
                                inputChunked.nextChunk();
                            }
                        } else {
                            length = length;
                            if (cachedField.valueClass == null || Util.isAssignableTo(type, cachedField.field.getType())) {
                                cachedField.setCanBeNull(false);
                                cachedField.setValueClass(type);
                                cachedField.setReuseSerializer(false);
                                if (Log.TRACE) {
                                    log("Read", cachedField, input.position());
                                }
                                cachedField.read(inputChunked2, tCreate);
                                if (z11) {
                                    inputChunked.nextChunk();
                                }
                            } else {
                                String str2 = "Read type is incompatible with the field type: " + Util.className(type) + " -> " + Util.className(cachedField.valueClass) + " (" + getType().getName() + "#" + cachedField + ")";
                                if (!z11) {
                                    throw new KryoException(str2);
                                }
                                if (Log.DEBUG) {
                                    Log.debug("kryo", str2);
                                }
                                inputChunked.nextChunk();
                            }
                        }
                    }
                } catch (KryoException e7) {
                    z10 = z12;
                    length = length;
                    String str3 = "Unable to read unknown data (unknown type). (" + getType().getName() + "#" + cachedField + ")";
                    if (!z11) {
                        throw new KryoException(str3, e7);
                    }
                    if (Log.DEBUG) {
                        Log.debug("kryo", str3, e7);
                    }
                    inputChunked.nextChunk();
                }
            } else {
                z10 = z12;
                length = length;
                if (cachedField != null) {
                    if (Log.TRACE) {
                        log("Read", cachedField, input.position());
                    }
                    cachedField.read(inputChunked2, tCreate);
                    if (z11) {
                        inputChunked.nextChunk();
                    }
                } else {
                    if (!z11) {
                        throw new KryoException("Unknown field. (" + getType().getName() + ")");
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Skip unknown field.");
                    }
                    inputChunked.nextChunk();
                }
            }
            i10++;
            kryo2 = kryo;
            cachedFieldArr = cachedFieldArr2;
            z12 = z10;
            length = length;
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Output outputChunked;
        OutputChunked outputChunked2;
        Class<?> cls;
        int iPushTypeVariables = pushTypeVariables();
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        ObjectMap graphContext = kryo.getGraphContext();
        if (!graphContext.containsKey(this)) {
            if (Log.TRACE) {
                Log.trace("kryo", "Write fields for class: ".concat(this.type.getName()));
            }
            graphContext.put(this, null);
            output.writeVarInt(cachedFieldArr.length, true);
            int length = cachedFieldArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write field name: " + cachedFieldArr[i10].name + Util.pos(output.position()));
                }
                output.writeString(cachedFieldArr[i10].name);
            }
        }
        CompatibleFieldSerializerConfig compatibleFieldSerializerConfig = this.config;
        boolean z10 = compatibleFieldSerializerConfig.chunked;
        boolean z11 = compatibleFieldSerializerConfig.readUnknownFieldData;
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
            if (z11) {
                if (t10 != null) {
                    try {
                        Object obj = cachedField.field.get(t10);
                        if (obj != null) {
                            cls = obj.getClass();
                        } else {
                            cls = null;
                        }
                    } catch (IllegalAccessException unused) {
                        cls = null;
                    }
                } else {
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

    public static class CompatibleFieldSerializerConfig extends FieldSerializer.FieldSerializerConfig {
        boolean chunked;
        boolean readUnknownFieldData = true;
        int chunkSize = 1024;

        public int getChunkSize() {
            return this.chunkSize;
        }

        public boolean getChunkedEncoding() {
            return this.chunked;
        }

        public boolean getReadUnknownTagData() {
            return this.readUnknownFieldData;
        }

        public void setChunkSize(int i10) {
            this.chunkSize = i10;
            if (Log.TRACE) {
                Log.trace("kryo", "CompatibleFieldSerializerConfig setChunkSize: " + i10);
            }
        }

        public void setChunkedEncoding(boolean z10) {
            this.chunked = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "CompatibleFieldSerializerConfig setChunked: " + z10);
            }
        }

        public void setReadUnknownFieldData(boolean z10) {
            this.readUnknownFieldData = z10;
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.FieldSerializerConfig
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public CompatibleFieldSerializerConfig mo5277clone() {
            return (CompatibleFieldSerializerConfig) super.mo5277clone();
        }
    }

    public CompatibleFieldSerializer(Kryo kryo, Class cls, CompatibleFieldSerializerConfig compatibleFieldSerializerConfig) {
        super(kryo, cls, compatibleFieldSerializerConfig);
        this.config = compatibleFieldSerializerConfig;
    }
}
