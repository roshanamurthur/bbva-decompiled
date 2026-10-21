package bf;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25203a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static KeysetInfo a(Keyset keyset) {
        KeysetInfo.Builder primaryKeyId = KeysetInfo.newBuilder().setPrimaryKeyId(keyset.getPrimaryKeyId());
        for (Keyset.Key key : keyset.getKeyList()) {
            primaryKeyId.addKeyInfo(KeysetInfo.KeyInfo.newBuilder().setTypeUrl(key.getKeyData().getTypeUrl()).setStatus(key.getStatus()).setOutputPrefixType(key.getOutputPrefixType()).setKeyId(key.getKeyId()).build());
        }
        return primaryKeyId.build();
    }
}
