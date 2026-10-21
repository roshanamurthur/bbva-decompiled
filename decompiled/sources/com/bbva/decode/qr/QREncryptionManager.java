package com.bbva.decode.qr;

import br.com.opencs.bincodec.ArrayAlphabet;
import br.com.opencs.bincodec.Base2NCodec;
import br.com.opencs.bincodec.random.RandomAlphabetGenerator;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QREncryptionManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/bbva/decode/qr/QREncryptionManager;", "", "", "encryptedText", "", "getDecryptedQRData", "buffer", "", "Lcom/bbva/decode/qr/QREncryptionManager$Data;", "getDecryptedQRCodeList", "getQRChallenge", "<init>", "()V", "Companion", "Data", "decode_release"}, k = 1, mv = {1, 6, 0})
public final class QREncryptionManager {

    /* JADX INFO: compiled from: QREncryptionManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/decode/qr/QREncryptionManager$Data;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "setId", "(I)V", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "<init>", "(ILjava/lang/String;)V", "decode_release"}, k = 1, mv = {1, 6, 0})
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String name;

        public Data(int i10, @Nullable String str) {
            this.id = i10;
            this.name = str;
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setId(int i10) {
            this.id = i10;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    public static ArrayList a(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = bArr.length - 1;
            int i10 = 3;
            while (i10 < length) {
                byte b10 = bArr[i10 + 1];
                i10 += 2;
                int i11 = bArr[i10];
                if (i11 > 0) {
                    byte[] bArr2 = new byte[i11];
                    for (int i12 = 0; i12 < i11; i12++) {
                        i10++;
                        bArr2[i12] = bArr[i10];
                    }
                    arrayList.add(new Data(b10, new String(bArr2, Charsets.UTF_8)));
                }
            }
            return arrayList;
        } catch (Exception e5) {
            e5.toString();
            return null;
        }
    }

    @Nullable
    public final List<Data> getDecryptedQRCodeList(@NotNull byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return a(buffer);
    }

    @Nullable
    public final byte[] getDecryptedQRData(@Nullable String encryptedText) {
        try {
            return new Base2NCodec(new ArrayAlphabet(RandomAlphabetGenerator.generateRandom(96158743L, 100, RandomAlphabetGenerator.QRCODE_ALPHANUMERIC_NO_SPACE, 32))).decode(encryptedText);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final String getQRChallenge(@NotNull byte[] buffer) {
        ArrayList arrayListA;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            arrayListA = a(buffer);
        } catch (Exception e5) {
            e5.printStackTrace();
            arrayListA = null;
        }
        int size = arrayListA != null ? arrayListA.size() : 0;
        String strReplace = "";
        if (size > 0) {
            int i10 = size - 2;
            String string = "";
            for (int i11 = 0; i11 < i10; i11++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                Intrinsics.checkNotNull(arrayListA);
                sb2.append(((Data) arrayListA.get(i11)).getName());
                string = sb2.toString();
            }
            strReplace = new Regex("[\\s|\\u00A0]+").replace(string, "");
        }
        if (strReplace.length() > 0) {
            for (int length = strReplace.length(); length < 64; length++) {
                strReplace = strReplace + '0';
            }
        }
        return strReplace;
    }
}
