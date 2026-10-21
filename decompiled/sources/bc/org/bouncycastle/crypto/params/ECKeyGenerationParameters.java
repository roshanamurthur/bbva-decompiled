package bc.org.bouncycastle.crypto.params;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.k3;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class ECKeyGenerationParameters extends k3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECDomainParameters f24992c;

    public ECKeyGenerationParameters(ECDomainParameters eCDomainParameters, SecureRandom secureRandom) {
        super(secureRandom, eCDomainParameters.getN().bitLength());
        this.f24992c = eCDomainParameters;
    }

    public ECDomainParameters getDomainParameters() {
        return this.f24992c;
    }
}
