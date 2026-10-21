package com.vasco.digipass.sdk.utils.utilities.srp;

import bc.org.bouncycastle.crypto.CryptoException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.d5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class SRP6VascoServer extends d5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f66536n = false;

    private static void a(BigInteger bigInteger) throws UtilitiesSDKException {
        if (bigInteger == null || BigInteger.ZERO.equals(bigInteger)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.PASSWORD_VERIFIER_NULL_OR_EMPTY);
        }
        if (o0.a(bigInteger).length > 256) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.PASSWORD_VERIFIER_INCORRECT_LENGTH);
        }
    }

    public UtilitiesSDKCryptoResponse calculateHashedSecret(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        try {
            if (!this.f66536n) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_SERVER_NOT_INITIALIZED);
            }
            SRP6VascoUtils.b(bigInteger, this.f66005a);
            a(bigInteger2, this.f66005a);
            SRP6VascoUtils.a(bigInteger3, this.f66005a);
            this.f66011g = bigInteger2;
            this.f66012h = bigInteger;
            this.f66010f = e5.validatePublicValue(this.f66005a, bigInteger3);
            this.f66013i = e5.calculateU(this.f66009e, this.f66005a, bigInteger3, bigInteger);
            BigInteger bigIntegerA = a();
            this.f66014j = bigIntegerA;
            return new UtilitiesSDKCryptoResponse(0, SRP6VascoUtils.a(this.f66009e, bigIntegerA));
        } catch (CryptoException unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.d5
    public BigInteger generateServerCredentials() throws UtilitiesSDKException {
        try {
            if (this.f66536n) {
                return super.generateServerCredentials();
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_SERVER_NOT_INITIALIZED);
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public BigInteger getPrivB() {
        return this.f66011g;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, SecureRandom secureRandom) throws UtilitiesSDKException {
        try {
            SRP6VascoUtils.c(bigInteger);
            SRP6VascoUtils.b(bigInteger2);
            a(bigInteger3);
            SRP6VascoUtils.a(b10);
            if (secureRandom == null) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_RANDOM_NULL_OR_EMPTY);
            }
            super.init(bigInteger, bigInteger2, bigInteger3, SRP6VascoUtils.b(b10), secureRandom);
            this.f66536n = true;
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public boolean verifyClientEvidenceMessage(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws UtilitiesSDKException {
        try {
            if (!this.f66536n) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_SERVER_NOT_INITIALIZED);
            }
            SRP6VascoUtils.a(bArr);
            SRP6VascoUtils.a(bigInteger, this.f66005a);
            SRP6VascoUtils.b(bigInteger2, this.f66005a);
            SRP6VascoUtils.c(bArr2);
            SRP6VascoUtils.e(bArr3);
            SRP6VascoUtils.b(bArr4);
            UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseCalculateClientEvidenceMessage = SRP6VascoUtils.calculateClientEvidenceMessage(SRP6VascoUtils.a(this.f66009e), this.f66005a, this.f66006b, bigInteger, bigInteger2, bArr2, bArr4, bArr3);
            int returnCode = utilitiesSDKCryptoResponseCalculateClientEvidenceMessage.getReturnCode();
            if (returnCode == 0) {
                return Arrays.equals(bArr, utilitiesSDKCryptoResponseCalculateClientEvidenceMessage.getOutputData());
            }
            throw new UtilitiesSDKException(returnCode);
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    private static void a(BigInteger bigInteger, BigInteger bigInteger2) throws UtilitiesSDKException {
        if (bigInteger != null) {
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!bigInteger3.equals(bigInteger) && !bigInteger.mod(bigInteger2).equals(bigInteger3)) {
                if (o0.a(bigInteger).length > 256) {
                    throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_PRIVATE_KEY_INCORRECT_LENGTH);
                }
                return;
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_PRIVATE_KEY_INVALID);
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_PRIVATE_KEY_NULL_OR_EMPTY);
    }
}
