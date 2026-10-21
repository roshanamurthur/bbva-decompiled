package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Header;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0018B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aab;", "", "Lcom/mypinpad/tsdk/i/abw;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/abw;", "setOnFocusChangeListener", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "toString", "()Ljava/lang/String;", "setCompoundDrawableTintBlendMode", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "Lcom/mypinpad/tsdk/i/abw;", "setY", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/mypinpad/tsdk/i/abw;Ljava/lang/String;)V", "(Lcom/mypinpad/tsdk/i/abw;Lcom/mypinpad/tsdk/i/abw;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class aab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52017a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52018b = 1;

    @JvmField
    @NotNull
    public static final abw getNavBarTitleString;

    @JvmField
    @NotNull
    public static final abw setLayoutAnimation;

    @JvmField
    @NotNull
    public static final abw setNavigationOnClickListener;

    @JvmField
    @NotNull
    public static final abw setOnDragListener;

    @JvmField
    @NotNull
    public static final abw setOnLongClickListener;

    @JvmField
    @NotNull
    public static final abw setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @JvmField
    public final int setDividerPadding;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final abw setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final abw setCompoundDrawableTintBlendMode;

    static {
        abw.Companion companion = abw.INSTANCE;
        setY = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        setNavigationOnClickListener = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{Header.RESPONSE_STATUS_UTF8}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        getNavBarTitleString = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{Header.TARGET_METHOD_UTF8}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        setOnDragListener = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{Header.TARGET_PATH_UTF8}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        setOnLongClickListener = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{Header.TARGET_SCHEME_UTF8}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        setLayoutAnimation = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{Header.TARGET_AUTHORITY_UTF8}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = ((~i10) & 1929101768) | (i10 & (-1929101769));
        int i12 = 1929101768 & i10;
        int i13 = ~((i11 & i12) | (i11 ^ i12));
        int i14 = (-585285633) & iCurrentTimeMillis;
        int i15 = ~((((-585285633) | iCurrentTimeMillis) & (~i14)) | i14);
        int i16 = ((~i15) & i13) | ((~i13) & i15);
        int i17 = i13 & i15;
        int i18 = ((i17 & i16) | (i16 ^ i17)) * (-831);
        int i19 = ((-1537950382) | i18) << 1;
        int i20 = -((i18 & 1537950381) | ((-1537950382) & (~i18)));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = ((-151265303) & i10) | (151265302 & iCurrentTimeMillis);
        int i23 = (-151265303) & iCurrentTimeMillis;
        int i24 = (~((i23 & i22) | (i22 ^ i23))) * (-1662);
        int i25 = (i21 & i24) + (i24 | i21);
        int i26 = (~iCurrentTimeMillis) & (i10 | iCurrentTimeMillis);
        int i27 = (i26 & 736550934) | (736550934 ^ i26);
        int i28 = (i27 | (~i27)) & (~i27);
        int i29 = (736550934 & iCurrentTimeMillis) | ((-736550935) & i10);
        int i30 = (-736550935) & iCurrentTimeMillis;
        int i31 = ~((i29 & i30) | (i29 ^ i30));
        int i32 = (i28 & i31) | (i28 ^ i31);
        int i33 = ~((iCurrentTimeMillis & (-1929101769)) | (i10 & (-1929101769)) | (1929101768 & iCurrentTimeMillis));
        int i34 = -(-(((i33 & i32) | (i32 ^ i33)) * 831));
        int i35 = ((i25 | i34) << 1) - (i34 ^ i25);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i36 = (-1082712491) ^ iCurrentTimeMillis2;
        int i37 = (-1082712491) & iCurrentTimeMillis2;
        int i38 = (i37 & i36) | (i36 ^ i37);
        int i39 = (i38 | (~i38)) & (~i38);
        int i40 = ~iCurrentTimeMillis2;
        int i41 = ((~i40) & (-1624893868)) | (1624893867 & i40);
        int i42 = (-1624893868) & i40;
        int i43 = (i41 & i42) | (i41 ^ i42);
        int i44 = (i43 & 962009601) | ((~i43) & (-962009602));
        int i45 = i43 & (-962009602);
        int i46 = ~((i45 & i44) | (i44 ^ i45));
        int i47 = ((~i46) & i39) | ((~i39) & i46);
        int i48 = i39 & i46;
        int i49 = -(~(((i48 & i47) | (i47 ^ i48)) * 497));
        int i50 = (((-1135885414) ^ i49) + ((i49 & (-1135885414)) << 1)) - 1;
        int i51 = (962009601 ^ i40) | (i40 & 962009601);
        int i52 = (i51 | (~i51)) & (~i51);
        int i53 = (2044722091 & i52) | ((~i52) & (-2044722092));
        int i54 = i52 & (-2044722092);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = (iCurrentTimeMillis2 & (-542181378)) | ((-542181378) ^ iCurrentTimeMillis2);
        int i57 = (i56 | (~i56)) & (~i56);
        int i58 = i55 & i57;
        int i59 = (i57 | i55) & (~i58);
        int i60 = ((i59 & i58) | (i59 ^ i58)) * 497;
        int i61 = i50 & i60;
        int i62 = ((i50 ^ i60) | i61) << 1;
        int i63 = -((i60 | i50) & (~i61));
        if (i35 <= (i62 & i63) + (i62 | i63)) {
            throw null;
        }
    }

    public aab(@NotNull abw abwVar, @NotNull abw abwVar2) {
        Intrinsics.checkNotNullParameter(abwVar, "");
        Intrinsics.checkNotNullParameter(abwVar2, "");
        this.setCompoundDrawableTintBlendMode = abwVar;
        this.setY = abwVar2;
        int iIntValue = ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = iIntValue * (-515);
        int i11 = i10 & 16544;
        int i12 = (((i10 | 16544) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        int i13 = (-33) ^ iCurrentTimeMillis;
        int i14 = ~iCurrentTimeMillis;
        int i15 = (-33) & iCurrentTimeMillis;
        int i16 = ~((i15 & i13) | (i13 ^ i15));
        int i17 = ~iCurrentTimeMillis;
        int i18 = ~iIntValue;
        int i19 = (i17 & i18) | ((~i17) & iIntValue);
        int i20 = i17 & iIntValue;
        int i21 = (i19 & i20) | (i19 ^ i20);
        int i22 = (i21 | (~i21)) & (~i21);
        int i23 = i16 & i22;
        int i24 = (i16 | i22) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = i14 & 32;
        int i27 = (~i26) & (i14 | 32);
        int i28 = ~((i26 & i27) | (i27 ^ i26));
        int i29 = i25 & i28;
        int i30 = (i25 | i28) & (~i29);
        int i31 = (i12 - (~(-(-(((i30 & i29) | (i30 ^ i29)) * (-516)))))) - 1;
        int i32 = i18 ^ (-33);
        int i33 = i18 & (-33);
        int i34 = (i32 & i33) | (i32 ^ i33);
        int i35 = ~((i34 & iCurrentTimeMillis) | (i34 ^ iCurrentTimeMillis));
        int i36 = i14 | iCurrentTimeMillis;
        int i37 = ~((i17 & i36) | i18 | 32);
        int i38 = i35 & i37;
        int i39 = -(~((((i35 | i37) & (~i38)) | i38) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i40 = ((i31 ^ i39) + ((i31 & i39) << 1)) - 1;
        int i41 = ~iIntValue;
        int i42 = i41 ^ 32;
        int i43 = i41 & 32;
        int i44 = ~((i43 & i42) | (i42 ^ i43));
        int i45 = (~iCurrentTimeMillis) & i36;
        int i46 = ~((i45 & 32) | (i45 & (-33)) | ((~i45) & 32));
        int i47 = i44 & i46;
        int i48 = (i44 | i46) & (~i47);
        int i49 = (i40 - (~(((i48 & i47) | (i48 ^ i47)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) - 1;
        int iIntValue2 = ((Integer) abw.setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue();
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i50 = iIntValue2 * (-755);
        int i51 = i49 * (-755);
        int i52 = ((i50 ^ i51) | (i50 & i51)) << 1;
        int i53 = -(((~i50) & i51) | ((~i51) & i50));
        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
        int i55 = ~iIntValue2;
        int i56 = ~iIntValue2;
        int i57 = i55 & (i56 | iIntValue2);
        int i58 = ~i49;
        int i59 = i57 & i58;
        int i60 = (i57 | i58) & (~i59);
        int i61 = -(-((~((i60 & i59) | (i60 ^ i59))) * 1512));
        int i62 = i54 ^ i61;
        int i63 = ((i61 & i54) | i62) << 1;
        int i64 = -i62;
        int i65 = (i63 & i64) + (i63 | i64);
        int i66 = ((~i58) & i56) | ((~i56) & i58);
        int i67 = i56 & i58;
        int i68 = ~((i66 & i67) | (i66 ^ i67));
        int i69 = iIntValue2 & i49;
        int i70 = (~i69) & (iIntValue2 | i49);
        int i71 = (i70 & i69) | (i70 ^ i69);
        int i72 = ~((i71 & iCurrentTimeMillis2) | (i71 ^ iCurrentTimeMillis2));
        int i73 = -(-(((i68 & i72) | (i68 ^ i72)) * (-756)));
        int i74 = i65 & i73;
        int i75 = -(-((i73 ^ i65) | i74));
        int i76 = (i74 & i75) + (i75 | i74);
        int i77 = (iIntValue2 ^ i49) | i69;
        int i78 = ~iCurrentTimeMillis2;
        int i79 = i77 ^ i78;
        int i80 = i77 & i78;
        int i81 = -(-(((i80 & i79) | (i79 ^ i80)) * 756));
        int i82 = ((i76 ^ i81) | (i76 & i81)) << 1;
        int i83 = -((i81 & (~i76)) | ((~i81) & i76));
        this.setDividerPadding = (i82 ^ i83) + ((i83 & i82) << 1);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int iHashCode;
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
        if (i15 == 1) {
            aab aabVar = (aab) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            abw abwVar = aabVar.setCompoundDrawableTintBlendMode;
            sb2.append((String) abw.setX(new Object[]{abwVar}, -623922005, 623922012, System.identityHashCode(abwVar)));
            sb2.append(": ");
            abw abwVar2 = aabVar.setY;
            sb2.append((String) abw.setX(new Object[]{abwVar2}, -623922005, 623922012, System.identityHashCode(abwVar2)));
            String string = sb2.toString();
            int i16 = f52017a + 83;
            f52018b = i16 % 128;
            if (i16 % 2 != 0) {
                return string;
            }
            int i17 = 59 / 0;
            return string;
        }
        if (i15 == 2) {
            aab aabVar2 = (aab) objArr[0];
            int i18 = f52018b + 73;
            int i19 = i18 % 128;
            f52017a = i19;
            int i20 = i18 % 2;
            abw abwVar3 = aabVar2.setY;
            int i21 = i19 & 105;
            int i22 = ((i19 | 105) & (~i21)) + (i21 << 1);
            f52018b = i22 % 128;
            int i23 = i22 % 2;
            return abwVar3;
        }
        if (i15 != 3) {
            if (i15 != 4) {
                aab aabVar3 = (aab) objArr[0];
                int i24 = f52017a;
                int i25 = i24 | 115;
                int i26 = ((i25 << 1) - (~(-((~(i24 & 115)) & i25)))) - 1;
                f52018b = i26 % 128;
                int i27 = i26 % 2;
                abw abwVar4 = aabVar3.setCompoundDrawableTintBlendMode;
                if (i27 != 0) {
                    return abwVar4;
                }
                throw null;
            }
            aab aabVar4 = (aab) objArr[0];
            int i28 = f52018b;
            int i29 = i28 & 85;
            int i30 = (i28 ^ 85) | i29;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            f52017a = i31 % 128;
            int i32 = i31 % 2;
            int iHashCode2 = aabVar4.setCompoundDrawableTintBlendMode.hashCode();
            if (i32 != 0) {
                iHashCode = aabVar4.setY.hashCode() + (iHashCode2 % 87);
            } else {
                int i33 = iHashCode2 * 31;
                int iHashCode3 = aabVar4.setY.hashCode();
                iHashCode = (iHashCode3 | i33) + (i33 & iHashCode3);
            }
            return Integer.valueOf(iHashCode);
        }
        Boolean bool = Boolean.FALSE;
        aab aabVar5 = (aab) objArr[0];
        Object obj = objArr[1];
        int i34 = f52018b;
        int i35 = ((i34 & 51) - (~(i34 | 51))) - 1;
        f52017a = i35 % 128;
        int i36 = i35 % 2;
        if (aabVar5 != obj) {
            if (!(!(obj instanceof aab))) {
                aab aabVar6 = (aab) obj;
                if (!Intrinsics.areEqual(aabVar5.setCompoundDrawableTintBlendMode, aabVar6.setCompoundDrawableTintBlendMode)) {
                    System.identityHashCode(aabVar5);
                    System.identityHashCode(aabVar5);
                } else if (!(!Intrinsics.areEqual(aabVar5.setY, aabVar6.setY))) {
                    int i37 = f52017a;
                    int i38 = ((i37 | 97) << 1) - (i37 ^ 97);
                    f52018b = i38 % 128;
                    if (i38 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i39 = f52018b;
                    int i40 = i39 ^ 21;
                    int i41 = ((i39 & 21) | i40) << 1;
                    int i42 = -i40;
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    f52017a = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = (((i39 | 50) << 1) - (i39 ^ 50)) - 1;
                    f52017a = i45 % 128;
                    if (i45 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                int i46 = i34 & 69;
                int i47 = ((~i46) & (i34 | 69)) + (i46 << 1);
                f52017a = i47 % 128;
                int i48 = i47 % 2;
            }
            return bool;
        }
        int i49 = ((i34 ^ 109) | (i34 & 109)) << 1;
        int i50 = -((i34 & (-110)) | ((~i34) & 109));
        int i51 = (i49 & i50) + (i49 | i50);
        int i52 = i51 % 128;
        f52017a = i52;
        int i53 = i51 % 2;
        int i54 = (i52 & 121) + (i52 | 121);
        f52018b = i54 % 128;
        int i55 = i54 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 1933534307, -1933534304, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1440188919, -1440188915, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final abw setDividerPadding() {
        return (abw) setOnFocusChangeListener(new Object[]{this}, 947465407, -947465407, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -785841204, 785841205, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aab(@NotNull String str, @NotNull String str2) {
        this((abw) abw.Companion.setOnFocusChangeListener(new Object[]{str}, 1688839712, -1688839706, (int) System.currentTimeMillis()), (abw) abw.Companion.setOnFocusChangeListener(new Object[]{str2}, 1688839712, -1688839706, (int) System.currentTimeMillis()));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        abw.Companion companion = abw.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aab(@NotNull abw abwVar, @NotNull String str) {
        this(abwVar, (abw) abw.Companion.setOnFocusChangeListener(new Object[]{str}, 1688839712, -1688839706, (int) System.currentTimeMillis()));
        Intrinsics.checkNotNullParameter(abwVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        abw.Companion companion = abw.INSTANCE;
    }

    @NotNull
    public final abw setOnFocusChangeListener() {
        return (abw) setOnFocusChangeListener(new Object[]{this}, -1010199198, 1010199200, System.identityHashCode(this));
    }
}
