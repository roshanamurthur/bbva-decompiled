package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class BlowfishSerializer extends Serializer {
    private static SecretKeySpec keySpec;
    private final Serializer serializer;

    public BlowfishSerializer(Serializer serializer, byte[] bArr) {
        this.serializer = serializer;
        keySpec = new SecretKeySpec(bArr, "Blowfish");
    }

    private static Cipher getCipher(int i10) {
        try {
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(i10, keySpec);
            return cipher;
        } catch (Exception e5) {
            throw new KryoException(e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        return this.serializer.copy(kryo, obj);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        return this.serializer.read(kryo, new Input(new CipherInputStream(input, getCipher(2)), 256), cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        CipherOutputStream cipherOutputStream = new CipherOutputStream(output, getCipher(1));
        a aVar = new a(cipherOutputStream, 256);
        this.serializer.write(kryo, aVar, obj);
        aVar.flush();
        try {
            cipherOutputStream.close();
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    public class a extends Output {
        @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws KryoException {
        }
    }
}
