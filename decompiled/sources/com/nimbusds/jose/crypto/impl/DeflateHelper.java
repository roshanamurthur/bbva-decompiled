package com.nimbusds.jose.crypto.impl;

import ci.a;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.DeflateUtils;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DeflateHelper {
    public static byte[] applyCompression(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            try {
                return DeflateUtils.compress(bArr);
            } catch (Exception e5) {
                throw new JOSEException(a.b(e5, new StringBuilder("Couldn't compress plain text: ")), e5);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + compressionAlgorithm);
    }

    public static byte[] applyDecompression(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            try {
                return DeflateUtils.decompress(bArr);
            } catch (Exception e5) {
                throw new JOSEException(a.b(e5, new StringBuilder("Couldn't decompress plain text: ")), e5);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + compressionAlgorithm);
    }
}
