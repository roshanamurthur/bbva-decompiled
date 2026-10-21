package com.google.crypto.tink.mac;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ChunkedMacWrapper implements PrimitiveWrapper<ChunkedMac, ChunkedMac> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChunkedMacWrapper f46777a = new ChunkedMacWrapper();

    @Immutable
    public static class a implements ChunkedMac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<ChunkedMac> f46778a;

        public a(PrimitiveSet primitiveSet) {
            this.f46778a = primitiveSet;
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public final ChunkedMacComputation createComputation() throws GeneralSecurityException {
            return this.f46778a.getPrimary().getFullPrimitive().createComputation();
        }

        @Override // com.google.crypto.tink.mac.ChunkedMac
        public final ChunkedMacVerification createVerification(byte[] bArr) throws GeneralSecurityException {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            ArrayList arrayList = new ArrayList();
            PrimitiveSet<ChunkedMac> primitiveSet = this.f46778a;
            Iterator<PrimitiveSet.Entry<ChunkedMac>> it = primitiveSet.getPrimitive(bArrCopyOf).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFullPrimitive().createVerification(bArr));
            }
            Iterator<PrimitiveSet.Entry<ChunkedMac>> it2 = primitiveSet.getRawPrimitives().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFullPrimitive().createVerification(bArr));
            }
            return new b(arrayList);
        }
    }

    public static class b implements ChunkedMacVerification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ChunkedMacVerification> f46779a;

        public b(ArrayList arrayList) {
            this.f46779a = arrayList;
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public final void update(ByteBuffer byteBuffer) throws GeneralSecurityException {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.mark();
            for (ChunkedMacVerification chunkedMacVerification : this.f46779a) {
                byteBufferDuplicate.reset();
                chunkedMacVerification.update(byteBufferDuplicate);
            }
            byteBuffer.position(byteBuffer.limit());
        }

        @Override // com.google.crypto.tink.mac.ChunkedMacVerification
        public final void verifyMac() throws GeneralSecurityException {
            GeneralSecurityException generalSecurityException = new GeneralSecurityException("MAC verification failed for all suitable keys in keyset");
            Iterator<ChunkedMacVerification> it = this.f46779a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().verifyMac();
                    return;
                } catch (GeneralSecurityException e5) {
                    generalSecurityException.addSuppressed(e5);
                }
            }
            throw generalSecurityException;
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<ChunkedMac> getInputPrimitiveClass() {
        return ChunkedMac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<ChunkedMac> getPrimitiveClass() {
        return ChunkedMac.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public ChunkedMac wrap(PrimitiveSet<ChunkedMac> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (primitiveSet.getPrimary() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<PrimitiveSet.Entry<ChunkedMac>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            Iterator<PrimitiveSet.Entry<ChunkedMac>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().getFullPrimitive();
            }
        }
        return new a(primitiveSet);
    }
}
