package okhttp3.tls.internal.der;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectIdentifiers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/tls/internal/der/ObjectIdentifiers;", "", "()V", "basicConstraints", "", "commonName", "ecPublicKey", "organizationalUnitName", "rsaEncryption", "sha256WithRSAEncryption", "sha256withEcdsa", "subjectAlternativeName", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class ObjectIdentifiers {
    public static final ObjectIdentifiers INSTANCE = new ObjectIdentifiers();

    @NotNull
    public static final String basicConstraints = "2.5.29.19";

    @NotNull
    public static final String commonName = "2.5.4.3";

    @NotNull
    public static final String ecPublicKey = "1.2.840.10045.2.1";

    @NotNull
    public static final String organizationalUnitName = "2.5.4.11";

    @NotNull
    public static final String rsaEncryption = "1.2.840.113549.1.1.1";

    @NotNull
    public static final String sha256WithRSAEncryption = "1.2.840.113549.1.1.11";

    @NotNull
    public static final String sha256withEcdsa = "1.2.840.10045.4.3.2";

    @NotNull
    public static final String subjectAlternativeName = "2.5.29.17";
}
