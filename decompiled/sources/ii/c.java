package ii;

import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: KeyUseAndOpsConsistency.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<KeyUse, Set<KeyOperation>> f69716a;

    static {
        HashMap map = new HashMap();
        map.put(KeyUse.SIGNATURE, new HashSet(Arrays.asList(KeyOperation.SIGN, KeyOperation.VERIFY)));
        map.put(KeyUse.ENCRYPTION, new HashSet(Arrays.asList(KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY)));
        f69716a = Collections.unmodifiableMap(map);
    }
}
