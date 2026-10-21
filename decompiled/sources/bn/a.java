package bn;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.CSHAKEDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static void a(byte[] bArr, int i10, short s4, byte[] bArr2, int i11) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(128, null, new byte[]{(byte) s4, (byte) (s4 >> 8)});
        cSHAKEDigest.update(bArr2, i11, 32);
        cSHAKEDigest.doFinal(bArr, 0, i10);
    }

    public static void b(byte[] bArr, int i10, short s4, byte[] bArr2, int i11) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(256, null, new byte[]{(byte) s4, (byte) (s4 >> 8)});
        cSHAKEDigest.update(bArr2, i11, 32);
        cSHAKEDigest.doFinal(bArr, 0, i10);
    }

    public static AlgorithmIdentifier c(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA1)) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, DERNull.INSTANCE);
        }
        if (str.equals("SHA-256")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, DERNull.INSTANCE);
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, DERNull.INSTANCE);
        }
        if (str.equals("SHA-512")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, DERNull.INSTANCE);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(str));
    }

    public static Digest d(AlgorithmIdentifier algorithmIdentifier) {
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return DigestFactory.createSHA1();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return DigestFactory.createSHA224();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return DigestFactory.createSHA256();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return DigestFactory.createSHA384();
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return DigestFactory.createSHA512();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + algorithmIdentifier.getAlgorithm());
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (Character.isDigit(c10)) {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public static void f(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr2, 0, i12);
        sHAKEDigest.doFinal(bArr, i10, i11);
    }

    public static void g(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, i12);
        sHAKEDigest.doFinal(bArr, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Observable observable, Function function, CompletableObserver completableObserver) {
        if (!(observable instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) observable).call();
            CompletableSource completableSource = objCall != null ? (CompletableSource) ObjectHelper.requireNonNull(function.apply(objCall), "The mapper returned a null CompletableSource") : null;
            if (completableSource == null) {
                EmptyDisposable.complete(completableObserver);
            } else {
                completableSource.subscribe(completableObserver);
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, completableObserver);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(Observable observable, Function function, Observer observer) {
        if (!(observable instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) observable).call();
            MaybeSource maybeSource = objCall != null ? (MaybeSource) ObjectHelper.requireNonNull(function.apply(objCall), "The mapper returned a null MaybeSource") : null;
            if (maybeSource == null) {
                EmptyDisposable.complete((Observer<?>) observer);
            } else {
                maybeSource.subscribe(MaybeToObservable.create(observer));
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, (Observer<?>) observer);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(Observable observable, Function function, Observer observer) {
        if (!(observable instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) observable).call();
            SingleSource singleSource = objCall != null ? (SingleSource) ObjectHelper.requireNonNull(function.apply(objCall), "The mapper returned a null SingleSource") : null;
            if (singleSource == null) {
                EmptyDisposable.complete((Observer<?>) observer);
            } else {
                singleSource.subscribe(SingleToObservable.create(observer));
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, (Observer<?>) observer);
            return true;
        }
    }
}
