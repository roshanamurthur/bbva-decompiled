package com.mypinpad.tsdk.isolation;

import androidx.core.view.PointerIconCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.nulabinc.zxcvbn.Guess;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0013\u001a\u00020\u000f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionCompleted;", "", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/TransactionCompleted;)I", "", "", "equals", "(Ljava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "()I", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setDividerPadding", "", "s0", "Lkotlin/Lazy;", "()[B", "setCompoundDrawableTintBlendMode", "p1", "p2", "p3", "<init>", "(IIIZ)V"}, k = 1, mv = {1, 5, 1})
public final class TransactionCompleted implements Comparable<TransactionCompleted> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f51903t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f51904u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f51905p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f51906q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int setDividerPadding;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy setCompoundDrawableTintBlendMode;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<byte[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f51909q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f51910r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~i12;
            int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
            int i18 = ~(i15 | i16);
            int i19 = ~(i12 | i10);
            if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 == 1) {
                a aVar = (a) objArr[0];
                int i20 = f51910r0;
                int i21 = ((i20 & 49) - (~(-(-(i20 | 49))))) - 1;
                f51909q0 = i21 % 128;
                Object[] objArr2 = new Object[1];
                if (i21 % 2 != 0) {
                    objArr2[0] = aVar;
                    bArr = (byte[]) a(objArr2, -1872635699, 1872635699, System.identityHashCode(aVar));
                    int i22 = 88 / 0;
                } else {
                    objArr2[0] = aVar;
                    bArr = (byte[]) a(objArr2, -1872635699, 1872635699, System.identityHashCode(aVar));
                }
                return bArr;
            }
            a aVar2 = (a) objArr[0];
            int i23 = f51909q0;
            int i24 = (-2) - (((i23 & 62) + (i23 | 62)) ^ (-1));
            f51910r0 = i24 % 128;
            int i25 = i24 % 2;
            TransactionCompleted transactionCompleted = TransactionCompleted.this;
            int iIntValue = ((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted}, 2134170877, -2134170873, System.identityHashCode(transactionCompleted))).intValue() % 100;
            Object[] objArr3 = {Integer.valueOf(iIntValue)};
            TransactionCompleted transactionCompleted2 = TransactionCompleted.this;
            int iIntValue2 = ((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2}, -1245394289, 1245394290, (int) System.currentTimeMillis())).intValue();
            Object[] objArr4 = {Integer.valueOf(iIntValue2)};
            int iIntValue3 = ((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2}, -905848849, 905848851, (int) System.currentTimeMillis())).intValue();
            byte[] bArr2 = {((Byte) setShowSoftInputOnFocus.setY(objArr3, 2139358410, -2139358410, iIntValue)).byteValue(), ((Byte) setShowSoftInputOnFocus.setY(objArr4, 2139358410, -2139358410, iIntValue2)).byteValue(), ((Byte) setShowSoftInputOnFocus.setY(new Object[]{Integer.valueOf(iIntValue3)}, 2139358410, -2139358410, iIntValue3)).byteValue()};
            int i26 = f51910r0;
            int i27 = i26 & 103;
            int i28 = ((((i26 ^ 103) | i27) << 1) - (~(-((i26 | 103) & (~i27))))) - 1;
            f51909q0 = i28 % 128;
            int i29 = i28 % 2;
            return bArr2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return a(new Object[]{this}, -1831091022, 1831091023, System.identityHashCode(this));
        }
    }

    public TransactionCompleted(int i10, int i11, int i12, boolean z10) throws IOException {
        this.f51905p0 = i11;
        this.f51906q0 = i12;
        int i13 = Guess.REFERENCE_YEAR;
        if (i10 < 0 || i10 > 49) {
            if (50 > i10 || i10 > 99) {
                throw new setScaleType(PointerIconCompat.TYPE_ALL_SCROLL, Intrinsics.stringPlus("y: ", Integer.valueOf(i10)));
            }
            if (!z10) {
                i13 = ReturnCode.ERR_REPOSITORY;
            }
        }
        int i14 = (i13 * (-519)) - (~(i10 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        int i16 = ~i13;
        int i17 = ~i10;
        int i18 = i16 & i17;
        int i19 = (~i18) & (i16 | i17);
        int i20 = (i18 & i19) | (i19 ^ i18);
        int i21 = ~((i20 & i17) | ((~i17) & i20) | ((~i20) & i17));
        int i22 = i10 & i17;
        int i23 = i22 | i22;
        int i24 = i10 & i10;
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = i21 & i25;
        int i27 = (i21 | i25) & (~i26);
        int i28 = ((i27 & i26) | (i27 ^ i26)) * 520;
        int i29 = (i15 ^ i28) + ((i15 & i28) << 1);
        int i30 = ~i10;
        int i31 = ((~i30) & i17) | ((~i17) & i30);
        int i32 = i30 & i17;
        int i33 = ~((i32 & i31) | (i31 ^ i32));
        int i34 = i13 & i10;
        int i35 = i10 | i13;
        int i36 = (~i34) & i35;
        int i37 = ~((i34 & i36) | (i36 ^ i34));
        int i38 = ((~i37) & i33) | ((~i33) & i37);
        int i39 = i33 & i37;
        int i40 = ((i39 & i38) | (i38 ^ i39)) * (-1040);
        int i41 = i29 & i40;
        int i42 = (i41 - (~(-(-((i40 ^ i29) | i41))))) - 1;
        int i43 = i16 ^ i17;
        int i44 = i16 & i17;
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = (i45 | (~i45)) & (~i45);
        int i47 = ~((i13 & i17) | (i17 ^ i13));
        int i48 = i46 & i47;
        int i49 = (i47 | i46) & (~i48);
        int i50 = (i49 & i48) | (i49 ^ i48);
        int i51 = ~i35;
        int i52 = ((~i51) & i50) | ((~i50) & i51);
        int i53 = i51 & i50;
        int i54 = -(~(-(-(((i53 & i52) | (i52 ^ i53)) * 520))));
        int i55 = ((-1) << 1) - ((((i42 | i54) << 1) - (i54 ^ i42)) ^ (-1));
        this.setDividerPadding = i55;
        copy.setOnFocusChangeListener(new Object[]{copy.INSTANCE, Integer.valueOf(i55), Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z10)}, 544582491, -544582488, i55);
        this.setCompoundDrawableTintBlendMode = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = ~i12;
        int i18 = (~(i14 | i17)) | i16 | (~(i15 | i17));
        int i19 = i10 | i11;
        int i20 = ((i18 | (~(i19 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i21 = i10 | (~(i12 | i15));
        int i22 = ~(i11 | i17);
        int i23 = 1;
        switch (((i22 | (~i19)) * 84) + ((i21 | i22) * (-84)) + i20) {
            case 1:
                TransactionCompleted transactionCompleted = (TransactionCompleted) objArr[0];
                int i24 = f51904u0;
                int i25 = (i24 & (-92)) | ((~i24) & 91);
                int i26 = (i24 & 91) << 1;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f51903t0 = i27 % 128;
                int i28 = i27 % 2;
                int i29 = transactionCompleted.f51905p0;
                int i30 = i24 & 43;
                int i31 = (i24 ^ 43) | i30;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f51903t0 = i32 % 128;
                int i33 = i32 % 2;
                return Integer.valueOf(i29);
            case 2:
                TransactionCompleted transactionCompleted2 = (TransactionCompleted) objArr[0];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i34 = ~iCurrentTimeMillis;
                int i35 = (i34 & 1711046028) | (1711046028 ^ i34);
                int i36 = ~i35;
                int i37 = ((~i36) & 283063560) | (i36 & (-283063561));
                int i38 = i36 & 283063560;
                int i39 = -(-((i37 | i38) * 226));
                int i40 = 1020246576 & i39;
                int i41 = (i39 | 1020246576) & (~i40);
                int i42 = i40 << 1;
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                int i44 = (-283063561) & iCurrentTimeMillis;
                int i45 = (~i44) & ((-283063561) | iCurrentTimeMillis);
                int i46 = (i44 & i45) | (i45 ^ i44);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = (i48 & 14431496) | (14431496 ^ i48);
                int i50 = i38 | ((-283063561) & i35);
                int i51 = i35 & 283063560;
                int i52 = ~((i51 & i50) | (i50 ^ i51));
                int i53 = i49 & i52;
                int i54 = (((i52 | i49) & (~i53)) | i53) * (-113);
                int i55 = ((~i54) & i43) | ((~i43) & i54);
                int i56 = (i54 & i43) << 1;
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                int i58 = (~((iCurrentTimeMillis & 1711046028) | (1711046028 ^ iCurrentTimeMillis))) * 113;
                int i59 = i57 ^ i58;
                int i60 = -(-((i58 & i57) << 1));
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i62 = ~iCurrentTimeMillis2;
                int i63 = ~(((iCurrentTimeMillis2 | i62) & i62) | 1910909746);
                int i64 = (-1728530308) & i63;
                int i65 = -(~((((i63 | (-1728530308)) & (~i64)) | i64) * (-983)));
                int i66 = ((((-904399930) | i65) << 1) - (i65 ^ (-904399930))) - 1;
                int i67 = (-1728530308) & i62;
                int i68 = (~i67) & (i62 | (-1728530308));
                int i69 = ~((i67 & i68) | (i68 ^ i67));
                int i70 = i69 & 1627783938;
                int i71 = (i69 | 1627783938) & (~i70);
                int i72 = (i66 - (~(-(~(((i71 & i70) | (i71 ^ i70)) * 983))))) - 2;
                int i73 = transactionCompleted2.f51906q0;
                if (i61 <= i72) {
                    return Integer.valueOf(i73);
                }
                throw null;
            case 3:
                TransactionCompleted transactionCompleted3 = (TransactionCompleted) objArr[0];
                TransactionCompleted transactionCompleted4 = (TransactionCompleted) objArr[1];
                int i74 = f51904u0 + 75;
                f51903t0 = i74 % 128;
                if (i74 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(transactionCompleted4, "");
                    int i75 = transactionCompleted3.setDividerPadding;
                    int i76 = transactionCompleted4.setDividerPadding;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(transactionCompleted4, "");
                int i77 = transactionCompleted3.setDividerPadding;
                int i78 = transactionCompleted4.setDividerPadding;
                if (i77 >= i78) {
                    if (i77 > i78) {
                        int i79 = f51904u0;
                        int i80 = i79 + 37;
                        f51903t0 = i80 % 128;
                        int i81 = i80 % 2;
                        int i82 = (i79 & 117) + (i79 | 117);
                        f51903t0 = i82 % 128;
                        if (i82 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        int i83 = transactionCompleted3.f51905p0;
                        int i84 = transactionCompleted4.f51905p0;
                        if (i83 < i84) {
                            int i85 = f51903t0;
                            int i86 = i85 & 99;
                            int i87 = (i86 - (~(-(-((i85 ^ 99) | i86))))) - 1;
                            int i88 = i87 % 128;
                            f51904u0 = i88;
                            int i89 = i87 % 2;
                            int i90 = i88 + 59;
                            f51903t0 = i90 % 128;
                            if (i90 % 2 != 0) {
                                int i91 = 15 / 0;
                                return -1;
                            }
                        } else if (i83 > i84) {
                            int i92 = f51904u0;
                            int i93 = ((i92 & 52) + (i92 | 52)) - 1;
                            f51903t0 = i93 % 128;
                            if (i93 % 2 != 0) {
                                i23 = 0;
                            }
                        } else {
                            int i94 = transactionCompleted3.f51906q0;
                            int i95 = transactionCompleted4.f51906q0;
                            if (i94 >= i95) {
                                if (i94 <= i95) {
                                    int i96 = f51903t0;
                                    int i97 = i96 & 93;
                                    int i98 = -(-((i96 ^ 93) | i97));
                                    int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                                    f51904u0 = i99 % 128;
                                    int i100 = i99 % 2;
                                    return 0;
                                }
                                int i101 = f51904u0;
                                int i102 = (-2) - ((((i101 | 106) << 1) - (i101 ^ 106)) ^ (-1));
                                f51903t0 = i102 % 128;
                                int i103 = i102 % 2 != 0 ? 1 : 0;
                                int i104 = i101 & 117;
                                int i105 = -(-(i101 | 117));
                                int i106 = (i104 & i105) + (i105 | i104);
                                f51903t0 = i106 % 128;
                                int i107 = i106 % 2;
                                return Integer.valueOf(i103 ^ 1);
                            }
                            int i108 = f51903t0;
                            int i109 = ((i108 & 48) + (i108 | 48)) - 1;
                            int i110 = i109 % 128;
                            f51904u0 = i110;
                            int i111 = i109 % 2;
                            int i112 = i110 & 85;
                            int i113 = (i110 | 85) & (~i112);
                            int i114 = -(-(i112 << 1));
                            int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
                            f51903t0 = i115 % 128;
                            if (i115 % 2 != 0) {
                                int i116 = 9 / 0;
                                return -1;
                            }
                        }
                    }
                    return Integer.valueOf(i23);
                }
                int i117 = f51904u0;
                int i118 = i117 & 61;
                int i119 = (i118 - (~((i117 ^ 61) | i118))) - 1;
                f51903t0 = i119 % 128;
                if (i119 % 2 != 0) {
                    throw null;
                }
                return -1;
            case 4:
                TransactionCompleted transactionCompleted5 = (TransactionCompleted) objArr[0];
                int i120 = f51903t0 + 43;
                f51904u0 = i120 % 128;
                int i121 = i120 % 2;
                int i122 = transactionCompleted5.setDividerPadding;
                if (i121 != 0) {
                    return Integer.valueOf(i122);
                }
                throw null;
            case 5:
                TransactionCompleted transactionCompleted6 = (TransactionCompleted) objArr[0];
                int i123 = f51904u0 + 115;
                f51903t0 = i123 % 128;
                int i124 = i123 % 2;
                byte[] bArr = (byte[]) transactionCompleted6.setCompoundDrawableTintBlendMode.getValue();
                int i125 = f51904u0;
                int i126 = (i125 & 115) + (i125 | 115);
                f51903t0 = i126 % 128;
                if (i126 % 2 == 0) {
                    return bArr;
                }
                throw null;
            case 6:
                TransactionCompleted transactionCompleted7 = (TransactionCompleted) objArr[0];
                int i127 = f51903t0;
                int i128 = (i127 | 37) << 1;
                int i129 = -(i127 ^ 37);
                int i130 = (i128 & i129) + (i129 | i128);
                int i131 = i130 % 128;
                f51904u0 = i131;
                int i132 = i130 % 2;
                int i133 = transactionCompleted7.f51905p0;
                if (i132 == 0) {
                    i13 = (108 % ((66 << i133) << transactionCompleted7.f51906q0)) << transactionCompleted7.setDividerPadding;
                } else {
                    int i134 = i133 * 31;
                    int i135 = -(~(-(-transactionCompleted7.f51906q0)));
                    int i136 = (((i134 ^ i135) + ((i134 & i135) << 1)) - 1) * 31;
                    int i137 = -(-transactionCompleted7.setDividerPadding);
                    i13 = ((((~i137) & i136) | ((~i136) & i137)) - (~(-(-((i137 & i136) << 1))))) - 1;
                }
                int i138 = i131 + 95;
                f51903t0 = i138 % 128;
                if (i138 % 2 != 0) {
                    int i139 = 57 / 0;
                }
                return Integer.valueOf(i13);
            case 7:
                TransactionCompleted transactionCompleted8 = (TransactionCompleted) objArr[0];
                Object obj = objArr[1];
                int i140 = f51904u0;
                int i141 = (i140 ^ 83) + ((i140 & 83) << 1);
                f51903t0 = i141 % 128;
                int i142 = i141 % 2;
                int iIntValue = ((Integer) setX(new Object[]{transactionCompleted8, (TransactionCompleted) obj}, -354590257, 354590260, System.identityHashCode(transactionCompleted8))).intValue();
                int i143 = f51903t0;
                int i144 = ((i143 & (-104)) | ((~i143) & 103)) + ((i143 & 103) << 1);
                f51904u0 = i144 % 128;
                if (i144 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            default:
                TransactionCompleted transactionCompleted9 = (TransactionCompleted) objArr[0];
                Object obj2 = objArr[1];
                int i145 = f51903t0;
                int i146 = i145 & 23;
                int i147 = i146 + ((i145 ^ 23) | i146);
                f51904u0 = i147 % 128;
                int i148 = i147 % 2;
                if (!(obj2 instanceof TransactionCompleted)) {
                    boolean zEquals = super.equals(obj2);
                    int i149 = f51903t0;
                    int i150 = i149 & 119;
                    int i151 = -(-((i149 ^ 119) | i150));
                    int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                    f51904u0 = i152 % 128;
                    int i153 = i152 % 2;
                    return Boolean.valueOf(zEquals);
                }
                int i154 = (i145 & (-76)) | ((~i145) & 75);
                int i155 = -(-((i145 & 75) << 1));
                int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                int i157 = i156 % 128;
                f51904u0 = i157;
                int i158 = i156 % 2;
                TransactionCompleted transactionCompleted10 = (TransactionCompleted) obj2;
                if (transactionCompleted9.setDividerPadding == transactionCompleted10.setDividerPadding) {
                    int i159 = ((i157 & 47) - (~(-(-(i157 | 47))))) - 1;
                    int i160 = i159 % 128;
                    f51903t0 = i160;
                    int i161 = i159 % 2;
                    if (transactionCompleted9.f51905p0 == transactionCompleted10.f51905p0) {
                        int i162 = i160 & 65;
                        int i163 = i160 | 65;
                        int i164 = (i162 & i163) + (i162 | i163);
                        f51904u0 = i164 % 128;
                        int i165 = i164 % 2;
                        if (transactionCompleted9.f51906q0 == transactionCompleted10.f51906q0) {
                            int i166 = ((i160 & 101) - (~(-(-(i160 | 101))))) - 1;
                            int i167 = i166 % 128;
                            f51904u0 = i167;
                            int i168 = i166 % 2;
                            int i169 = i167 + 14;
                            int i170 = (i169 ^ (-1)) + (i169 << 1);
                            f51903t0 = i170 % 128;
                            int i171 = i170 % 2;
                            return Boolean.TRUE;
                        }
                    }
                }
                int i172 = f51903t0;
                int i173 = ((i172 & (-80)) | ((~i172) & 79)) + ((i172 & 79) << 1);
                f51904u0 = i173 % 128;
                if (i173 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(TransactionCompleted transactionCompleted) {
        return ((Integer) setX(new Object[]{this, transactionCompleted}, 1651253433, -1651253426, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 63109736, -63109736, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -993991314, 993991320, System.identityHashCode(this))).intValue();
    }

    public final int setOnFocusChangeListener(@NotNull TransactionCompleted p4) {
        return ((Integer) setX(new Object[]{this, p4}, -354590257, 354590260, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, 2134170877, -2134170873, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, 2110114174, -2110114169, System.identityHashCode(this));
    }

    public /* synthetic */ TransactionCompleted(int i10, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i13 & 8) != 0 ? false : z10);
    }
}
