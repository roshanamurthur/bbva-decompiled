package com.vasco.digipass.sdk.utils.utilities.srp;

import bc.org.bouncycastle.crypto.CryptoException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.b5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class SRP6VascoClient extends b5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f66535n = false;

    private static void a(BigInteger bigInteger, BigInteger bigInteger2) throws UtilitiesSDKException {
        if (bigInteger == null) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_PRIVATE_KEY_NULL_OR_EMPTY);
        }
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger3.equals(bigInteger) || bigInteger.mod(bigInteger2).equals(bigInteger3)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_PRIVATE_KEY_INVALID);
        }
        if (o0.a(bigInteger).length > 256) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.CLIENT_PRIVATE_KEY_INCORRECT_LENGTH);
        }
    }

    public UtilitiesSDKCryptoResponse calculateHashedSecret(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            if (!this.f66535n) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_CLIENT_NOT_INITIALIZED);
            }
            SRP6VascoUtils.b(bigInteger, this.f65943a);
            SRP6VascoUtils.a(bigInteger2, this.f65943a);
            a(bigInteger3, this.f65943a);
            SRP6VascoUtils.e(bArr);
            SRP6VascoUtils.b(bArr2);
            SRP6VascoUtils.d(bArr3);
            this.f65945c = bigInteger3;
            this.f65946d = bigInteger2;
            this.f65948f = e5.calculateX(this.f65954l, this.f65943a, bArr, bArr2, bArr3);
            calculateSecret(bigInteger);
            return new UtilitiesSDKCryptoResponse(0, SRP6VascoUtils.a(this.f65954l, this.f65950h));
        } catch (CryptoException unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        }
    }

    public BigInteger generateClientCredentials() throws UtilitiesSDKException {
        try {
            if (!this.f66535n) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_CLIENT_NOT_INITIALIZED);
            }
            BigInteger bigIntegerB = b();
            this.f65945c = bigIntegerB;
            BigInteger bigIntegerModPow = this.f65944b.modPow(bigIntegerB, this.f65943a);
            this.f65946d = bigIntegerModPow;
            return bigIntegerModPow;
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public BigInteger getPrivA() {
        return this.f65945c;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte b10, SecureRandom secureRandom) throws UtilitiesSDKException {
        try {
            SRP6VascoUtils.c(bigInteger);
            SRP6VascoUtils.b(bigInteger2);
            SRP6VascoUtils.a(b10);
            if (secureRandom == null) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_RANDOM_NULL_OR_EMPTY);
            }
            super.init(bigInteger, bigInteger2, SRP6VascoUtils.b(b10), secureRandom);
            this.f66535n = true;
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public boolean verifyServerEvidenceMessage(byte[] bArr, byte[] bArr2, BigInteger bigInteger, byte[] bArr3) throws UtilitiesSDKException {
        try {
            if (!this.f66535n) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SRP_CLIENT_NOT_INITIALIZED);
            }
            a(bArr);
            SRP6VascoUtils.a(bArr2);
            SRP6VascoUtils.a(bigInteger, this.f65943a);
            SRP6VascoUtils.c(bArr3);
            UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseCalculateServerEvidenceMessage = SRP6VascoUtils.calculateServerEvidenceMessage(SRP6VascoUtils.a(this.f65954l), bArr2, bigInteger, bArr3);
            int returnCode = utilitiesSDKCryptoResponseCalculateServerEvidenceMessage.getReturnCode();
            if (returnCode == 0) {
                return Arrays.equals(bArr, utilitiesSDKCryptoResponseCalculateServerEvidenceMessage.getOutputData());
            }
            throw new UtilitiesSDKException(returnCode);
        } catch (UtilitiesSDKException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    private static void a(byte[] bArr) throws UtilitiesSDKException {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_MESSAGE_INCORRECT_LENGTH);
            }
            return;
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SERVER_MESSAGE_NULL_OR_EMPTY);
    }
}
