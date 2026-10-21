package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public abstract class KeyTypeManager<KeyProtoT extends MessageLite> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyProtoT> f46643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, PrimitiveFactory<?, KeyProtoT>> f46644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f46645c;

    public static abstract class KeyFactory<KeyFormatProtoT extends MessageLite, KeyProtoT extends MessageLite> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<KeyFormatProtoT> f46646a;

        public static final class KeyFormat<KeyFormatProtoT> {
            public KeyFormatProtoT keyFormat;
            public KeyTemplate.OutputPrefixType outputPrefixType;

            public KeyFormat(KeyFormatProtoT keyformatprotot, KeyTemplate.OutputPrefixType outputPrefixType) {
                this.keyFormat = keyformatprotot;
                this.outputPrefixType = outputPrefixType;
            }
        }

        public KeyFactory(Class<KeyFormatProtoT> cls) {
            this.f46646a = cls;
        }

        public static void readFully(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
            int length = bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = inputStream.read(bArr, i10, length - i10);
                if (i11 == -1) {
                    throw new GeneralSecurityException("Not enough pseudorandomness provided");
                }
                i10 += i11;
            }
        }

        public abstract KeyProtoT createKey(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public KeyProtoT deriveKey(KeyFormatProtoT keyformatprotot, InputStream inputStream) throws GeneralSecurityException {
            throw new GeneralSecurityException("deriveKey not implemented for key of type " + this.f46646a);
        }

        public final Class<KeyFormatProtoT> getKeyFormatClass() {
            return this.f46646a;
        }

        public Map<String, KeyFormat<KeyFormatProtoT>> keyFormats() throws GeneralSecurityException {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException;

        public abstract void validateKeyFormat(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    @SafeVarargs
    public KeyTypeManager(Class<KeyProtoT> cls, PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        this.f46643a = cls;
        HashMap map = new HashMap();
        for (PrimitiveFactory<?, KeyProtoT> primitiveFactory : primitiveFactoryArr) {
            boolean zContainsKey = map.containsKey(primitiveFactory.f46671a);
            Class<?> cls2 = primitiveFactory.f46671a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            map.put(cls2, primitiveFactory);
        }
        if (primitiveFactoryArr.length > 0) {
            this.f46645c = primitiveFactoryArr[0].f46671a;
        } else {
            this.f46645c = Void.class;
        }
        this.f46644b = Collections.unmodifiableMap(map);
    }

    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    }

    public final Class<?> firstSupportedPrimitiveClass() {
        return this.f46645c;
    }

    public final Class<KeyProtoT> getKeyClass() {
        return this.f46643a;
    }

    public abstract String getKeyType();

    public final <P> P getPrimitive(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        PrimitiveFactory<?, KeyProtoT> primitiveFactory = this.f46644b.get(cls);
        if (primitiveFactory != null) {
            return (P) primitiveFactory.getPrimitive(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract int getVersion();

    public KeyFactory<?, KeyProtoT> keyFactory() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(ByteString byteString) throws InvalidProtocolBufferException;

    public final Set<Class<?>> supportedPrimitives() {
        return this.f46644b.keySet();
    }

    public abstract void validateKey(KeyProtoT keyprotot) throws GeneralSecurityException;
}
