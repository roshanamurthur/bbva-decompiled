package org.bouncycastle.crypto.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class JournaledAlgorithm implements Encodable, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient JournalingSecureRandom f89627p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient AlgorithmIdentifier f89628q0;

    public JournaledAlgorithm(AlgorithmIdentifier algorithmIdentifier, JournalingSecureRandom journalingSecureRandom) {
        if (algorithmIdentifier == null) {
            throw new NullPointerException("AlgorithmIdentifier passed to JournaledAlgorithm is null");
        }
        if (journalingSecureRandom == null) {
            throw new NullPointerException("JournalingSecureRandom passed to JournaledAlgorithm is null");
        }
        this.f89627p0 = journalingSecureRandom;
        this.f89628q0 = algorithmIdentifier;
    }

    public static JournaledAlgorithm getState(File file, SecureRandom secureRandom) throws IOException, ClassNotFoundException {
        if (file == null) {
            throw new NullPointerException("File for loading is null in JournaledAlgorithm");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            return new JournaledAlgorithm(Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a((byte[]) objectInputStream.readObject(), CryptoServicesRegistrar.getSecureRandom());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final void a(byte[] bArr, SecureRandom secureRandom) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        this.f89628q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f89627p0 = new JournalingSecureRandom(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), secureRandom);
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.f89628q0;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f89628q0);
        aSN1EncodableVector.add(new DEROctetString(this.f89627p0.getFullTranscript()));
        return new DERSequence(aSN1EncodableVector).getEncoded();
    }

    public JournalingSecureRandom getJournalingSecureRandom() {
        return this.f89627p0;
    }

    public void storeState(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("file for storage is null in JournaledAlgorithm");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            storeState(fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public JournaledAlgorithm(byte[] bArr) {
        this(bArr, CryptoServicesRegistrar.getSecureRandom());
    }

    public static JournaledAlgorithm getState(InputStream inputStream, SecureRandom secureRandom) throws IOException, ClassNotFoundException {
        if (inputStream == null) {
            throw new NullPointerException("stream for loading is null in JournaledAlgorithm");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            return new JournaledAlgorithm(Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    public void storeState(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("output stream for storage is null in JournaledAlgorithm");
        }
        outputStream.write(getEncoded());
    }

    public JournaledAlgorithm(byte[] bArr, SecureRandom secureRandom) {
        if (bArr == null) {
            throw new NullPointerException("encoding passed to JournaledAlgorithm is null");
        }
        if (secureRandom == null) {
            throw new NullPointerException("random passed to JournaledAlgorithm is null");
        }
        a(bArr, secureRandom);
    }
}
