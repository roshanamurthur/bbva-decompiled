package org.bouncycastle.crypto.modes;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;

/* JADX INFO: loaded from: classes5.dex */
public class GCFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f89040f = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, MessageUtils.MESSAGE_18_DC2, Constants.CVR_B2b87_11_RFU, -122, -36, -62, ByteSourceJsonBootstrapper.UTF8_BOM_1, 76, -87, 43};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFBBlockCipher f89041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyParameter f89042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f89043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89044e;

    public GCFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.f89043d = 0L;
        this.f89041b = new CFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        long j10 = this.f89043d;
        CFBBlockCipher cFBBlockCipher = this.f89041b;
        if (j10 > 0 && j10 % 1024 == 0) {
            BlockCipher underlyingCipher = cFBBlockCipher.getUnderlyingCipher();
            underlyingCipher.init(false, this.f89042c);
            byte[] bArr = new byte[32];
            byte[] bArr2 = f89040f;
            underlyingCipher.processBlock(bArr2, 0, bArr, 0);
            underlyingCipher.processBlock(bArr2, 8, bArr, 8);
            underlyingCipher.processBlock(bArr2, 16, bArr, 16);
            underlyingCipher.processBlock(bArr2, 24, bArr, 24);
            KeyParameter keyParameter = new KeyParameter(bArr);
            this.f89042c = keyParameter;
            underlyingCipher.init(true, keyParameter);
            byte[] currentIV = cFBBlockCipher.getCurrentIV();
            underlyingCipher.processBlock(currentIV, 0, currentIV, 0);
            cFBBlockCipher.init(this.f89044e, new ParametersWithIV(this.f89042c, currentIV));
        }
        this.f89043d++;
        return cFBBlockCipher.calculateByte(b10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        String algorithmName = this.f89041b.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89041b.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89043d = 0L;
        this.f89041b.init(z10, cipherParameters);
        this.f89044e = z10;
        if (cipherParameters instanceof ParametersWithIV) {
            cipherParameters = ((ParametersWithIV) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            cipherParameters = ((ParametersWithSBox) cipherParameters).getParameters();
        }
        this.f89042c = (KeyParameter) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        CFBBlockCipher cFBBlockCipher = this.f89041b;
        processBytes(bArr, i10, cFBBlockCipher.getBlockSize(), bArr2, i11);
        return cFBBlockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.f89043d = 0L;
        this.f89041b.reset();
    }
}
