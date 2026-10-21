package ii;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: JWKMetadata.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static Algorithm a(Map<String, Object> map) throws ParseException {
        return Algorithm.parse(JSONObjectUtils.getString(map, "alg"));
    }

    public static Set<KeyOperation> b(Map<String, Object> map) throws ParseException {
        return KeyOperation.parse(JSONObjectUtils.getStringList(map, "key_ops"));
    }

    public static KeyType c(Map<String, Object> map) throws ParseException {
        try {
            return KeyType.parse(JSONObjectUtils.getString(map, "kty"));
        } catch (IllegalArgumentException e5) {
            throw new ParseException(e5.getMessage(), 0);
        }
    }

    public static KeyUse d(Map<String, Object> map) throws ParseException {
        return KeyUse.parse(JSONObjectUtils.getString(map, "use"));
    }

    public static List<Base64> e(Map<String, Object> map) throws ParseException {
        List<Base64> base64List = X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, "x5c"));
        if (base64List == null || !base64List.isEmpty()) {
            return base64List;
        }
        return null;
    }
}
