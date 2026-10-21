package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\bj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "", "", "toString", "()Ljava/lang/String;", "", "setOnFocusChangeListener", "B", "setX", "()B", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setY"}, k = 1, mv = {1, 5, 1})
public final class TransactionProcessingResult {
    public static final TransactionProcessingResult setCompoundDrawableTintBlendMode;
    private static int setLayoutAnimation = 0;
    private static int setNavigationOnClickListener = 1;
    private static final /* synthetic */ TransactionProcessingResult[] setOnDragListener;
    public static final TransactionProcessingResult setX;
    public static final TransactionProcessingResult setY;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    public static final class setOnFocusChangeListener extends openContextMenu<TransactionProcessingResult> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f51933f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f51934g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = i13 | i14;
            int i16 = ~(i15 | i11);
            int i17 = ~i11;
            int i18 = i14 | i17;
            int i19 = ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183));
            if (((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + i19 != 1) {
                TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[0];
                int i20 = f51934g + 43;
                f51933f = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(transactionProcessingResult, "");
                byte x4 = transactionProcessingResult.setX();
                int i22 = f51933f;
                int i23 = (i22 ^ 86) + ((i22 & 86) << 1);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                f51934g = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 83 / 0;
                }
                return Byte.valueOf(x4);
            }
            Enum r10 = (Enum) objArr[1];
            int i26 = f51933f;
            int i27 = i26 & 3;
            int i28 = -(-((i26 ^ 3) | i27));
            int i29 = (i27 & i28) + (i28 | i27);
            f51934g = i29 % 128;
            TransactionProcessingResult transactionProcessingResult2 = (TransactionProcessingResult) r10;
            Object[] objArr2 = new Object[1];
            if (i29 % 2 == 0) {
                objArr2[0] = transactionProcessingResult2;
                bByteValue = ((Byte) setDividerPadding(objArr2, 661361234, -661361234, (int) System.currentTimeMillis())).byteValue();
                int i30 = 30 / 0;
            } else {
                objArr2[0] = transactionProcessingResult2;
                bByteValue = ((Byte) setDividerPadding(objArr2, 661361234, -661361234, (int) System.currentTimeMillis())).byteValue();
            }
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, 1111214186, -1111214185, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        TransactionProcessingResult[] transactionProcessingResultArr;
        TransactionProcessingResult transactionProcessingResult = new TransactionProcessingResult(NotifyProvisionResult.SUCCESS_RESULT, 0, (byte) 0);
        setCompoundDrawableTintBlendMode = transactionProcessingResult;
        TransactionProcessingResult transactionProcessingResult2 = new TransactionProcessingResult("FAILED", 1, (byte) 1);
        setX = transactionProcessingResult2;
        TransactionProcessingResult transactionProcessingResult3 = new TransactionProcessingResult("BYPASSED", 2, (byte) 2);
        setY = transactionProcessingResult3;
        int i10 = 0 - (-120);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        setNavigationOnClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            transactionProcessingResultArr = new TransactionProcessingResult[2];
            transactionProcessingResultArr[0] = transactionProcessingResult;
            transactionProcessingResultArr[1] = transactionProcessingResult2;
            transactionProcessingResultArr[3] = transactionProcessingResult3;
        } else {
            transactionProcessingResultArr = new TransactionProcessingResult[]{transactionProcessingResult, transactionProcessingResult2, transactionProcessingResult3};
        }
        setOnDragListener = transactionProcessingResultArr;
        INSTANCE = new Companion(null);
        new setOnFocusChangeListener(values(), 4009);
        int i12 = setLayoutAnimation;
        int i13 = i12 ^ 47;
        int i14 = -(-((i12 & 47) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        setNavigationOnClickListener = i15 % 128;
        int i16 = i15 % 2;
    }

    public TransactionProcessingResult(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static TransactionProcessingResult valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = ((i10 ^ 97) - (~((i10 & 97) << 1))) - 1;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) Enum.valueOf(TransactionProcessingResult.class, str);
        int i13 = setNavigationOnClickListener;
        int i14 = i13 & 27;
        int i15 = ((i13 ^ 27) | i14) << 1;
        int i16 = -((i13 | 27) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        setLayoutAnimation = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 57 / 0;
        }
        return transactionProcessingResult;
    }

    public static TransactionProcessingResult[] values() {
        int i10 = setLayoutAnimation;
        int i11 = i10 | 103;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 103)) & i11);
        int i14 = (i12 & i13) + (i13 | i12);
        setNavigationOnClickListener = i14 % 128;
        int i15 = i14 % 2;
        TransactionProcessingResult[] transactionProcessingResultArr = (TransactionProcessingResult[]) setOnDragListener.clone();
        int i16 = setNavigationOnClickListener;
        int i17 = ((i16 & (-96)) | ((~i16) & 95)) + ((i16 & 95) << 1);
        setLayoutAnimation = i17 % 128;
        int i18 = i17 % 2;
        return transactionProcessingResultArr;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 115;
        int i12 = -(-((i10 ^ 115) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        setNavigationOnClickListener = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        byte b10 = this.setCompoundDrawableTintBlendMode;
        int i14 = (i10 ^ 41) + ((i10 & 41) << 1);
        setNavigationOnClickListener = i14 % 128;
        int i15 = i14 % 2;
        return b10;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setLayoutAnimation;
        int i11 = (((i10 & (-118)) | ((~i10) & 117)) - (~(-(-((i10 & 117) << 1))))) - 1;
        setNavigationOnClickListener = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = setNavigationOnClickListener + 117;
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return "";
        }
        throw null;
    }
}
