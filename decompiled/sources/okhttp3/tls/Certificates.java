package okhttp3.tls;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, d2 = {"certificatePem", "", "Ljava/security/cert/X509Certificate;", "decodeCertificatePem", "encodeBase64Lines", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "data", "Lokio/ByteString;", "okhttp-tls"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "Certificates")
public final class Certificates {
    @NotNull
    public static final String certificatePem(@NotNull X509Certificate certificatePem) throws CertificateEncodingException {
        Intrinsics.checkNotNullParameter(certificatePem, "$this$certificatePem");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-----BEGIN CERTIFICATE-----\n");
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = certificatePem.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "encoded");
        encodeBase64Lines(sb2, ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null));
        sb2.append("-----END CERTIFICATE-----\n");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final X509Certificate decodeCertificatePem(@NotNull String decodeCertificatePem) {
        Intrinsics.checkNotNullParameter(decodeCertificatePem, "$this$decodeCertificatePem");
        try {
            Collection<? extends Certificate> certificates = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificates(new Buffer().writeUtf8(decodeCertificatePem).inputStream());
            Intrinsics.checkNotNullExpressionValue(certificates, "certificates");
            Object objSingle = CollectionsKt___CollectionsKt.single(certificates);
            if (objSingle != null) {
                return (X509Certificate) objSingle;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException("failed to decode certificate", e5);
        } catch (GeneralSecurityException e7) {
            throw new IllegalArgumentException("failed to decode certificate", e7);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException("failed to decode certificate", e10);
        }
    }

    public static final void encodeBase64Lines(@NotNull StringBuilder encodeBase64Lines, @NotNull ByteString data) {
        Intrinsics.checkNotNullParameter(encodeBase64Lines, "$this$encodeBase64Lines");
        Intrinsics.checkNotNullParameter(data, "data");
        String strBase64 = data.base64();
        IntProgression intProgressionStep = c.step(c.until(0, strBase64.length()), 64);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step >= 0) {
            if (first > last) {
                return;
            }
        } else if (first < last) {
            return;
        }
        while (true) {
            encodeBase64Lines.append((CharSequence) strBase64, first, Math.min(first + 64, strBase64.length()));
            encodeBase64Lines.append('\n');
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }
}
