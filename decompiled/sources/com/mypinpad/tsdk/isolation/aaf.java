package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.bbva.component.dm.headers.EtagInterceptor;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.esotericsoftware.asm.Opcodes;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\nB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/aaf;", "", "Lcom/mypinpad/tsdk/i/abw;", "p0", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/abw;)Lcom/mypinpad/tsdk/i/abw;", "", "Lcom/mypinpad/tsdk/i/aab;", "a", "[Lcom/mypinpad/tsdk/i/aab;", "setDividerPadding", "()[Lcom/mypinpad/tsdk/i/aab;", "setCompoundDrawableTintBlendMode", "", "", "b", "Ljava/util/Map;", "setX", "()Ljava/util/Map;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class aaf {

    @NotNull
    public static final aaf INSTANCE = new aaf();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final aab[] setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<abw, Integer> setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52028c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52029d = 1;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/aaf$setOnFocusChangeListener;", "", "", "Lcom/mypinpad/tsdk/i/aab;", "setDividerPadding", "()Ljava/util/List;", "", "setX", "()V", "", "setCompoundDrawableTintBlendMode", "[Lcom/mypinpad/tsdk/i/aab;", "setOnFocusChangeListener", "", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setY"}, k = 1, mv = {1, 6, 0})
    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52037f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52038g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f52041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final aby f52042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52043e;

        /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public aab[] setOnFocusChangeListener;

        /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
        @JvmField
        public int setY;

        /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
        @JvmField
        public int setDividerPadding;

        public setOnFocusChangeListener(acp acpVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            i11 = (i12 & 4) != 0 ? i10 : i11;
            Intrinsics.checkNotNullParameter(acpVar, "");
            this.f52039a = i10;
            this.f52040b = i11;
            this.f52041c = new ArrayList();
            this.f52042d = (aby) ach.setOnFocusChangeListener(new Object[]{acpVar}, -878740537, 878740541, (int) System.currentTimeMillis());
            this.setOnFocusChangeListener = new aab[8];
            int i13 = ~i10;
            int i14 = ((-9) ^ i13) | ((-9) & i13);
            int i15 = ~i14;
            int i16 = ~((i14 & i15) | (i15 ^ i14));
            int i17 = ~((i13 ^ i10) | (i13 & i10));
            int i18 = i16 ^ i17;
            int i19 = i16 & i17;
            int i20 = ((i19 & i18) | (i18 ^ i19)) * (-712);
            int i21 = 6415 & i20;
            int i22 = ((((6415 ^ i20) | i21) << 1) - (~(-((i20 | 6415) & (~i21))))) - 1;
            int i23 = i13 & (i10 | i13);
            int i24 = ~i23;
            int i25 = ~((i23 & i24) | (i24 ^ i23));
            int i26 = (-9) & i25;
            int i27 = (i25 | (-9)) & (~i26);
            int i28 = -(-(((i27 & i26) | (i27 ^ i26)) * 712));
            int i29 = ((~i28) & i22) | ((~i22) & i28);
            int i30 = (i28 & i22) << 1;
            this.f52043e = (i29 & i30) + (i30 | i29);
        }

        public static /* synthetic */ void a(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            aab aabVar = (aab) objArr[1];
            int i10 = f52037f;
            int i11 = ((i10 ^ 63) | (i10 & 63)) << 1;
            int i12 = -(((~i10) & 63) | (i10 & (-64)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f52038g = i13 % 128;
            int i14 = i13 % 2;
            setonfocuschangelistener.f52041c.add(aabVar);
            int i15 = aabVar.setDividerPadding;
            int i16 = setonfocuschangelistener.f52040b;
            if (i15 > i16) {
                int i17 = f52037f + 35;
                f52038g = i17 % 128;
                if (i17 % 2 == 0) {
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1056635289, 1056635305, System.identityHashCode(setonfocuschangelistener));
                    throw null;
                }
                setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1056635289, 1056635305, System.identityHashCode(setonfocuschangelistener));
                int i18 = f52038g;
                int i19 = i18 & 105;
                int i20 = (i18 | 105) & (~i19);
                int i21 = -(-(i19 << 1));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f52037f = i22 % 128;
                int i23 = i22 % 2;
                return;
            }
            int i24 = setonfocuschangelistener.setDividerPadding;
            int i25 = i24 & i15;
            int i26 = ((i24 ^ i15) | i25) << 1;
            int i27 = -((i24 | i15) & (~i25));
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = -i16;
            int i30 = ((i28 ^ i29) | (i28 & i29)) << 1;
            int i31 = -((i29 & (~i28)) | ((~i29) & i28));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(i32)}, 44008342, -44008333, i32)).intValue();
            int i33 = setonfocuschangelistener.setY;
            int i34 = i33 & 1;
            int i35 = (i34 - (~(-(-((i33 ^ 1) | i34))))) - 1;
            aab[] aabVarArr = setonfocuschangelistener.setOnFocusChangeListener;
            if (i35 > aabVarArr.length) {
                int i36 = f52038g + 45;
                f52037f = i36 % 128;
                if (i36 % 2 != 0) {
                    int length = aabVarArr.length;
                    int i37 = length << 1;
                    int i38 = -length;
                    aab[] aabVarArr2 = new aab[(i37 & i38) + (i38 | i37)];
                    System.arraycopy(aabVarArr, 0, aabVarArr2, aabVarArr.length, aabVarArr.length);
                    setonfocuschangelistener.f52043e = setonfocuschangelistener.setOnFocusChangeListener.length;
                    setonfocuschangelistener.setOnFocusChangeListener = aabVarArr2;
                } else {
                    aab[] aabVarArr3 = new aab[aabVarArr.length << 1];
                    System.arraycopy(aabVarArr, 0, aabVarArr3, aabVarArr.length, aabVarArr.length);
                    int length2 = setonfocuschangelistener.setOnFocusChangeListener.length;
                    int i39 = -(-((length2 ^ (-1)) | length2));
                    setonfocuschangelistener.f52043e = (length2 & i39) + (length2 | i39);
                    setonfocuschangelistener.setOnFocusChangeListener = aabVarArr3;
                }
                int i40 = f52038g;
                int i41 = i40 & 67;
                int i42 = -(-((i40 ^ 67) | i41));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f52037f = i43 % 128;
                int i44 = i43 % 2;
            }
            int i45 = setonfocuschangelistener.f52043e;
            int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener);
            int i46 = i45 * 302;
            int i47 = ((300 | i46) << 1) - (i46 ^ 300);
            int i48 = ~i45;
            int i49 = (i48 ^ i45) | (i48 & i45);
            int i50 = ~iIdentityHashCode;
            int i51 = (i49 & i50) | ((~i49) & iIdentityHashCode);
            int i52 = i49 & iIdentityHashCode;
            int i53 = (i52 & i51) | (i51 ^ i52);
            int i54 = ~i53;
            int i55 = -(-(((i53 | i54) & i54) * (-301)));
            int i56 = i47 & i55;
            int i57 = -(-(i55 | i47));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            int i59 = i48 & iIdentityHashCode;
            int i60 = (iIdentityHashCode | i48) & (~i59);
            int i61 = ~((i60 & i59) | (i60 ^ i59));
            int i62 = ~i50;
            int i63 = ~((i62 & i50) | (i62 ^ i50));
            int i64 = i61 & i63;
            int i65 = (i61 | i63) & (~i64);
            int i66 = -(~(-(-(((i65 & i64) | (i65 ^ i64)) * (-301)))));
            int i67 = (i58 & i66) + (i66 | i58);
            int i68 = (i67 ^ (-1)) + (i67 << 1);
            int i69 = i48 & (i48 | i45);
            int i70 = i69 ^ i50;
            int i71 = i69 & i50;
            int i72 = ((i71 & i70) | (i70 ^ i71)) * 301;
            int i73 = i68 & i72;
            int i74 = (i68 | i72) & (~i73);
            int i75 = -(-(i73 << 1));
            setonfocuschangelistener.f52043e = (i74 ^ i75) + ((i74 & i75) << 1);
            setonfocuschangelistener.setOnFocusChangeListener[i45] = aabVar;
            setonfocuschangelistener.setY++;
            int i76 = setonfocuschangelistener.setDividerPadding;
            int iIdentityHashCode2 = System.identityHashCode(setonfocuschangelistener);
            int i77 = ((i15 * (-958)) - (~(i76 * (-958)))) - 1;
            int i78 = ~i76;
            int i79 = i78 & (i78 | i76);
            int i80 = ~iIdentityHashCode2;
            int i81 = i80 & (i80 | iIdentityHashCode2);
            int i82 = ~((i79 ^ i81) | (i79 & i81));
            int i83 = ~i15;
            int i84 = i83 ^ iIdentityHashCode2;
            int i85 = i83 & iIdentityHashCode2;
            int i86 = ~((i84 & i85) | (i84 ^ i85));
            int i87 = (i82 & i86) | ((~i86) & i82) | ((~i82) & i86);
            int i88 = i81 ^ i15;
            int i89 = i81 & i15;
            int i90 = ~((i88 & i89) | (i88 ^ i89));
            int i91 = ((~i90) & i87) | ((~i87) & i90);
            int i92 = i87 & i90;
            int i93 = -(-(((i92 & i91) | (i91 ^ i92)) * 959));
            int i94 = ((i77 ^ i93) | (i77 & i93)) << 1;
            int i95 = -(((~i77) & i93) | ((~i93) & i77));
            int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
            int i97 = i15 & i76;
            int i98 = (i76 | i15) & (~i97);
            int i99 = -(~(-(-((~((i98 & i97) | (i98 ^ i97))) * (-959)))));
            int i100 = ((i96 ^ i99) + ((i99 & i96) << 1)) - 1;
            int i101 = (i83 | i15) & i83;
            int i102 = ~((i101 & i81) | ((~i81) & i101) | ((~i101) & i81));
            int i103 = ~((i79 & iIdentityHashCode2) | (i79 ^ iIdentityHashCode2));
            int i104 = i102 & i103;
            int i105 = (i102 | i103) & (~i104);
            int i106 = (i105 & i104) | (i105 ^ i104);
            int i107 = i15 & iIdentityHashCode2;
            int i108 = (iIdentityHashCode2 | i15) & (~i107);
            int i109 = ~((i108 & i107) | (i108 ^ i107));
            int i110 = -(-(((i106 & i109) | (i106 ^ i109)) * 959));
            int i111 = i100 & i110;
            setonfocuschangelistener.setDividerPadding = (i111 - (~(-(-((i110 ^ i100) | i111))))) - 1;
            int i112 = f52037f;
            int i113 = i112 ^ 91;
            int i114 = ((((i112 & 91) | i113) << 1) - (~(-i113))) - 1;
            f52038g = i114 % 128;
            int i115 = i114 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:33:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:57:0x020a A[SYNTHETIC] */
        public static /* synthetic */ void b(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            int i10;
            int i11;
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i12 = f52038g;
            int i13 = (((i12 ^ 63) | (i12 & 63)) << 1) - ((i12 & (-64)) | ((~i12) & 63));
            f52037f = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 & 7;
            int i16 = (((i12 ^ 7) | i15) << 1) - ((i12 | 7) & (~i15));
            while (true) {
                f52037f = i16 % 128;
                int i17 = i16 % 2;
                while (true) {
                    if (setonfocuschangelistener.f52042d.setX()) {
                        int i18 = f52037f;
                        int i19 = i18 & 105;
                        int i20 = (((i18 | 105) & (~i19)) - (~(i19 << 1))) - 1;
                        f52038g = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 35 / 0;
                            return;
                        }
                        return;
                    }
                    int i22 = f52038g;
                    int i23 = (i22 & 23) + (i22 | 23);
                    f52037f = i23 % 128;
                    int i24 = i23 % 2;
                    int x4 = yt.setX(setonfocuschangelistener.f52042d.getNavBarTitleString());
                    if (x4 == 128) {
                        throw new IOException("index == 0");
                    }
                    if ((x4 & 128) == 128) {
                        int i25 = f52037f + 47;
                        f52038g = i25 % 128;
                        int i26 = i25 % 2;
                        int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(x4), 127}, -84275340, 84275352, x4)).intValue();
                        int i27 = ~iIntValue;
                        int i28 = -(-(iIntValue << 1));
                        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                        setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(i29)}, 206831895, -206831888, i29);
                        i10 = f52037f + 73;
                    } else if (x4 == 64) {
                        int i30 = f52038g + 54;
                        int i31 = (i30 ^ (-1)) + (i30 << 1);
                        f52037f = i31 % 128;
                        if (i31 % 2 != 0) {
                            setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1391071838, 1391071846, System.identityHashCode(setonfocuschangelistener));
                            throw null;
                        }
                        setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1391071838, 1391071846, System.identityHashCode(setonfocuschangelistener));
                        int i32 = f52037f;
                        int i33 = i32 & 93;
                        i10 = ((i32 | 93) & (~i33)) + (i33 << 1);
                    } else {
                        if ((x4 & 64) == 64) {
                            int i34 = f52038g;
                            int i35 = (i34 & (-2)) | ((~i34) & 1);
                            int i36 = -(-((i34 & 1) << 1));
                            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                            f52037f = i37 % 128;
                            int i38 = i37 % 2;
                            int iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(x4), 63}, -84275340, 84275352, x4)).intValue();
                            int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener);
                            int i39 = iIntValue2 * (-751);
                            int i40 = 751 ^ i39;
                            int i41 = -(-((i39 & 751) << 1));
                            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                            int i43 = ~iIntValue2;
                            int i44 = ~i43;
                            int i45 = ~iIdentityHashCode;
                            int i46 = i44 & i45;
                            int i47 = (i44 | i45) & (~i46);
                            int i48 = i42 - (~(((i47 & i46) | (i47 ^ i46)) * ReturnCode.ERR_CONN_IO));
                            int i49 = (i48 ^ (-1)) + (i48 << 1);
                            int i50 = iIntValue2 & iIdentityHashCode;
                            int i51 = -(-((~(((iIdentityHashCode | iIntValue2) & (~i50)) | i50)) * (-1504)));
                            int i52 = i49 ^ i51;
                            int i53 = -(-((i51 & i49) << 1));
                            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                            int i55 = (iIntValue2 | i43) & i43;
                            int i56 = ~i43;
                            int i57 = ~((i56 & i43) | (i56 ^ i43));
                            int i58 = ((i55 & i57) | (i55 ^ i57)) * 752;
                            int i59 = i54 & i58;
                            int i60 = ((i58 | i54) & (~i59)) + (i59 << 1);
                            setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(i60)}, 1634523395, -1634523384, i60);
                            int i61 = f52038g;
                            i16 = (i61 & 55) + (i61 | 55);
                            break;
                        }
                        if ((x4 & 32) != 32) {
                            if (x4 != 16) {
                                int i62 = f52037f + 15;
                                f52038g = i62 % 128;
                                if (i62 % 2 == 0) {
                                    throw null;
                                }
                                if (x4 != 0) {
                                    int iIntValue3 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(x4), 15}, -84275340, 84275352, x4)).intValue();
                                    int i63 = ((iIntValue3 << 1) - iIntValue3) - 1;
                                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(i63)}, 2053739069, -2053739069, i63);
                                    int i64 = f52038g;
                                    i11 = ((i64 & (-46)) | ((~i64) & 45)) + ((i64 & 45) << 1);
                                    f52037f = i11 % 128;
                                }
                            }
                            setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 45522186, -45522182, System.identityHashCode(setonfocuschangelistener));
                            int i65 = f52038g;
                            i16 = (((i65 & (-116)) | ((~i65) & 115)) - (~(-(-((i65 & 115) << 1))))) - 1;
                            break;
                        }
                        int i66 = f52037f;
                        int i67 = i66 & 87;
                        int i68 = (i66 | 87) & (~i67);
                        int i69 = -(-(i67 << 1));
                        int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                        f52038g = i70 % 128;
                        if (i70 % 2 == 0) {
                            int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(x4), 31}, -84275340, 84275352, x4)).intValue();
                            setonfocuschangelistener.f52040b = iIntValue4;
                            if (iIntValue4 >= 0) {
                                if (setonfocuschangelistener.f52040b <= setonfocuschangelistener.f52039a) {
                                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1879394367, 1879394380, System.identityHashCode(setonfocuschangelistener));
                                    int i71 = f52037f;
                                    i11 = (((i71 ^ 119) | (i71 & 119)) << 1) - (((~i71) & 119) | (i71 & (-120)));
                                    f52038g = i11 % 128;
                                }
                            }
                        } else {
                            int iIntValue5 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(x4), 31}, -84275340, 84275352, x4)).intValue();
                            setonfocuschangelistener.f52040b = iIntValue5;
                            if (iIntValue5 >= 0) {
                                if (setonfocuschangelistener.f52040b <= setonfocuschangelistener.f52039a) {
                                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1879394367, 1879394380, System.identityHashCode(setonfocuschangelistener));
                                    int i72 = f52037f;
                                    i11 = (((i72 ^ 119) | (i72 & 119)) << 1) - (((~i72) & 119) | (i72 & (-120)));
                                    f52038g = i11 % 128;
                                }
                            }
                        }
                        throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(setonfocuschangelistener.f52040b)));
                        int i73 = i11 % 2;
                    }
                    f52038g = i10 % 128;
                    int i74 = i10 % 2;
                }
            }
        }

        public static /* synthetic */ abw c(Object[] objArr) throws IOException {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i10 = f52037f + 125;
            f52038g = i10 % 128;
            if (i10 % 2 == 0) {
                ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue)}, -906679585, 906679590, iIntValue)).booleanValue();
                throw null;
            }
            if (!(!((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue)}, -906679585, 906679590, iIntValue)).booleanValue())) {
                int i11 = f52037f;
                int i12 = ((i11 | 105) << 1) - (i11 ^ 105);
                f52038g = i12 % 128;
                if (i12 % 2 == 0) {
                    aaf aafVar = aaf.INSTANCE;
                    abw abwVar = ((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setCompoundDrawableTintBlendMode;
                    throw null;
                }
                aaf aafVar2 = aaf.INSTANCE;
                abw abwVar2 = ((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setCompoundDrawableTintBlendMode;
                int i13 = f52037f + 111;
                f52038g = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 31 / 0;
                }
                return abwVar2;
            }
            aaf aafVar3 = aaf.INSTANCE;
            int i15 = -((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis())).length;
            int i16 = i15 * 829;
            int i17 = iIntValue * 829;
            int i18 = i16 & i17;
            int i19 = (i16 ^ i17) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = ~i15;
            int i22 = (i21 | i15) & i21;
            int i23 = ~iIntValue;
            int i24 = i22 & i23;
            int i25 = ((i22 | i23) & (~i24)) | i24;
            int i26 = ~i25;
            int i27 = (i25 | i26) & i26;
            int i28 = ~(i23 | i15 | iIntValue);
            int i29 = i27 ^ i28;
            int i30 = i27 & i28;
            int i31 = -(-(((i30 & i29) | (i29 ^ i30)) * (-828)));
            int i32 = ((i20 ^ i31) | (i20 & i31)) << 1;
            int i33 = -(((~i20) & i31) | ((~i31) & i20));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            int i35 = i15 & iIntValue;
            int i36 = -(~(-(-(((i15 ^ iIntValue) | i35 | i23) * (-828)))));
            int i37 = (-2) - (((i34 ^ i36) + ((i36 & i34) << 1)) ^ (-1));
            int i38 = (i15 & i23) | (i21 & iIntValue);
            int i39 = (i38 & i35) | (i38 ^ i35);
            int i40 = ~i39;
            int i41 = -(~(-(-(((i39 | i40) & i40) * 828))));
            int i42 = (((i37 | i41) << 1) - (i41 ^ i37)) - 1;
            int iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener, Integer.valueOf(i42)}, -164877785, 164877795, i42)).intValue();
            if (iIntValue2 >= 0) {
                int i43 = f52038g;
                int i44 = i43 ^ 81;
                int i45 = ((i43 & 81) | i44) << 1;
                int i46 = -i44;
                int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                f52037f = i47 % 128;
                int i48 = i47 % 2;
                aab[] aabVarArr = setonfocuschangelistener.setOnFocusChangeListener;
                if (iIntValue2 < aabVarArr.length) {
                    aab aabVar = aabVarArr[iIntValue2];
                    Intrinsics.checkNotNull(aabVar);
                    abw abwVar3 = aabVar.setCompoundDrawableTintBlendMode;
                    int i49 = f52037f;
                    int i50 = (i49 & 63) + (i49 | 63);
                    f52038g = i50 % 128;
                    if (i50 % 2 == 0) {
                        int i51 = 50 / 0;
                    }
                    return abwVar3;
                }
            }
            int i52 = (-521) - (~(-(-(iIntValue * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY))));
            int i53 = (-2) & iIntValue;
            int i54 = (~i53) & ((-2) | iIntValue);
            int i55 = (i53 & i54) | (i54 ^ i53);
            int i56 = i55 & iIntValue;
            int i57 = (i55 | iIntValue) & (~i56);
            int i58 = -(-((~((i57 & i56) | (i57 ^ i56))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
            int i59 = (i52 ^ i58) + ((i52 & i58) << 1);
            int i60 = (~((i23 ^ 1) | (i23 & 1))) * (-1042);
            int i61 = (i59 & i60) + (i60 | i59);
            int i62 = (i23 | iIntValue) & i23;
            int i63 = i62 & (-2);
            int i64 = ((~i62) & 1) | i63;
            int i65 = i62 & 1;
            int i66 = ~((i64 & i65) | (i64 ^ i65));
            int i67 = (i62 ^ (-2)) | i63;
            int i68 = ~((iIntValue & i67) | (i67 ^ iIntValue));
            int i69 = i66 & i68;
            int i70 = -(-((((i68 | i66) & (~i69)) | i69) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(((i61 & i70) - (~(-(-(i70 | i61))))) - 1)));
        }

        public static /* synthetic */ Integer d(Object[] objArr) {
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i14 = 1;
            int iIntValue = ((Number) objArr[1]).intValue();
            int i15 = f52038g;
            int i16 = (i15 ^ 31) + ((i15 & 31) << 1);
            f52037f = i16 % 128;
            int i17 = i16 % 2;
            if (iIntValue > 0) {
                int i18 = ((i15 ^ 81) | (i15 & 81)) << 1;
                int i19 = -(((~i15) & 81) | (i15 & (-82)));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f52037f = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = -(-setonfocuschangelistener.setOnFocusChangeListener.length);
                    i11 = (i21 << 1) - i21;
                } else {
                    int length = setonfocuschangelistener.setOnFocusChangeListener.length;
                    i11 = ((((length ^ (-1)) | length) << 1) - (~(-(~length)))) - 1;
                }
                int i22 = 0;
                int i23 = iIntValue;
                while (true) {
                    i12 = setonfocuschangelistener.f52043e;
                    if (i11 < i12) {
                        break;
                    }
                    int i24 = f52038g;
                    int i25 = i24 + 97;
                    f52037f = i25 % 128;
                    if (i25 % 2 == 0) {
                        if (i23 <= 0) {
                            break;
                        }
                        int i26 = i24 + 3;
                        f52037f = i26 % 128;
                        int i27 = i26 % 2;
                        aab aabVar = setonfocuschangelistener.setOnFocusChangeListener[i11];
                        Intrinsics.checkNotNull(aabVar);
                        int i28 = -aabVar.setDividerPadding;
                        int i29 = ((i28 * 595) - (~(-(-(i23 * (-1187)))))) - i14;
                        int i30 = ~i28;
                        int i31 = i30 & i23;
                        int i32 = (~i31) & (i30 | i23);
                        int i33 = ~i23;
                        int i34 = ~((i32 & i31) | (i32 ^ i31));
                        int i35 = ~iIntValue;
                        int i36 = ~((i35 ^ i23) | (i35 & i23));
                        int i37 = -(-(((i34 ^ i36) | (i36 & i34)) * (-1188)));
                        int i38 = ((i29 & i37) - (~(i37 | i29))) - i14;
                        int i39 = ~((i30 ^ i23) | i31);
                        int i40 = i33 & i35;
                        int i41 = ~i33;
                        int i42 = (iIntValue & i41) | i40 | (i33 & iIntValue);
                        int i43 = ~i42;
                        int i44 = i43 & (i42 | i43);
                        int i45 = i39 & i44;
                        int i46 = (i39 | i44) & (~i45);
                        int i47 = (i46 & i45) | (i46 ^ i45);
                        int i48 = ~i35;
                        int i49 = (i35 & i30) | (i28 & i48);
                        int i50 = i35 & i28;
                        int i51 = (i49 ^ i50) | (i49 & i50);
                        int i52 = ~i51;
                        int i53 = i52 & (i51 | i52);
                        int i54 = i11;
                        int i55 = ((~i53) & i47) | ((~i47) & i53);
                        int i56 = i47 & i53;
                        int i57 = ((i56 & i55) | (i55 ^ i56)) * 594;
                        int i58 = i38 & i57;
                        int i59 = ((i38 ^ i57) | i58) << 1;
                        int i60 = -((i57 | i38) & (~i58));
                        int i61 = (i59 & i60) + (i60 | i59);
                        int i62 = (i33 & i48) | (i35 & i41);
                        int i63 = ~((i62 & i40) | (i62 ^ i40));
                        int i64 = i33 ^ i28;
                        int i65 = i33 & i28;
                        int i66 = ~((i64 & i65) | (i64 ^ i65));
                        int i67 = i63 & i66;
                        int i68 = (i63 | i66) & (~i67);
                        int i69 = (i68 & i67) | (i68 ^ i67);
                        int i70 = i35 ^ i28;
                        int i71 = ~((i70 & i50) | (i70 ^ i50));
                        int i72 = i69 & i71;
                        int i73 = (i69 | i71) & (~i72);
                        int i74 = -(-(((i73 & i72) | (i73 ^ i72)) * 594));
                        int i75 = i61 ^ i74;
                        int i76 = (i74 & i61) << 1;
                        i23 = (i75 & i76) + (i76 | i75);
                        int i77 = setonfocuschangelistener.setDividerPadding;
                        int i78 = i28 * (-563);
                        int i79 = -(-(i77 * 565));
                        int i80 = i78 & i79;
                        int i81 = i80 + ((i78 ^ i79) | i80);
                        int i82 = ~i77;
                        int i83 = (i82 & i35) | (i82 ^ i35);
                        int i84 = ~i83;
                        int i85 = (i83 | i84) & i84;
                        int i86 = (i85 & i30) | (i30 ^ i85);
                        int i87 = i77 ^ iIntValue;
                        int i88 = i77 & iIntValue;
                        int i89 = ~((i87 & i88) | (i87 ^ i88));
                        int i90 = i86 & i89;
                        int i91 = (i86 | i89) & (~i90);
                        int i92 = (i81 - (~(((i91 & i90) | (i91 ^ i90)) * (-564)))) - 1;
                        int i93 = (i30 ^ i77) | (i30 & i77);
                        int i94 = i93 & iIntValue;
                        int i95 = (i93 | iIntValue) & (~i94);
                        int i96 = (i95 & i94) | (i95 ^ i94);
                        int i97 = ~i96;
                        int i98 = (i92 - (~(-(~(-(-(((i96 | i97) & i97) * 1128))))))) - 2;
                        int i99 = (i30 | i28) & i30;
                        int i100 = (i99 & i35) | (i99 ^ i35);
                        int i101 = ~i100;
                        int i102 = (i100 | i101) & i101;
                        int i103 = i28 & i77;
                        int i104 = (i77 | i28) & (~i103);
                        int i105 = ~((i104 & i103) | (i104 ^ i103));
                        int i106 = -(~(-(-(((i105 & i102) | (i102 ^ i105)) * 564))));
                        setonfocuschangelistener.setDividerPadding = (((i98 | i106) << 1) - (i106 ^ i98)) - 1;
                        int i107 = setonfocuschangelistener.setY;
                        int i108 = 494 - (~(-(-(i107 * (-494)))));
                        int i109 = (i108 ^ (-1)) + (i108 << 1);
                        int i110 = i109 << 1;
                        int i111 = -i109;
                        int i112 = (i110 & i111) + (i110 | i111);
                        int i113 = i112 & (-495);
                        int i114 = i113 + ((i112 ^ (-495)) | i113);
                        int i115 = ~i107;
                        int i116 = ~((i107 | i115) & i115);
                        int i117 = (i35 | iIntValue) & i35;
                        int i118 = ~i117;
                        int i119 = (i118 ^ i117) | (i118 & i117);
                        int i120 = ~i119;
                        int i121 = (i116 | ((i119 | i120) & i120)) * 495;
                        int i122 = i114 & i121;
                        setonfocuschangelistener.setY = (i122 - (~(-(-((i121 ^ i114) | i122))))) - 1;
                        int i123 = i22 * (-215);
                        int i124 = ((((217 ^ i123) | (217 & i123)) << 1) - (~(-((i123 & (-218)) | (217 & (~i123)))))) - 1;
                        int i125 = i35 & 1;
                        int i126 = (iIntValue & (-2)) | i125 | (iIntValue & 1);
                        int i127 = ~i126;
                        int i128 = ((i126 | i127) & i127) * 216;
                        int i129 = i124 & i128;
                        int i130 = (i128 | i124) & (~i129);
                        int i131 = i129 << 1;
                        int i132 = (i130 & i131) + (i130 | i131);
                        int i133 = ~i22;
                        int i134 = ((~i133) & 1) | (i133 & (-2));
                        int i135 = i133 & 1;
                        int i136 = (i135 & i134) | (i134 ^ i135);
                        int i137 = (i136 & i48) | ((~i136) & i35);
                        int i138 = i136 & i35;
                        int i139 = (i132 - (~(((i138 & i137) | (i137 ^ i138)) * (-216)))) - 1;
                        int i140 = (i35 & (-2)) | (i48 & 1);
                        int i141 = ~((i125 & i140) | (i140 ^ i125));
                        int i142 = -(-(((i141 & i22) | (i22 ^ i141)) * 216));
                        int i143 = i139 & i142;
                        int i144 = ((i142 | i139) & (~i143)) + (i143 << 1);
                        int i145 = -(-(i54 * (-139)));
                        int i146 = (((-141) | i145) << 1) - ((-141) ^ i145);
                        int i147 = ~i54;
                        int i148 = (i147 | i54) & i147;
                        int i149 = ~iIntValue;
                        int i150 = i148 & i149;
                        int i151 = (i148 | i149) & (~i150);
                        int i152 = ((i151 & i150) | (i151 ^ i150)) * (-280);
                        int i153 = i146 & i152;
                        int i154 = ((i152 | i146) & (~i153)) + (i153 << 1);
                        int i155 = ~(i147 | iIntValue);
                        int i156 = i35 & i155;
                        int i157 = (i155 | i35) & (~i156);
                        int i158 = (i154 - (~(((i157 & i156) | (i157 ^ i156)) * 140))) - 1;
                        int i159 = ~i147;
                        int i160 = (i147 & i35) | (iIntValue & i159);
                        int i161 = i147 & iIntValue;
                        int i162 = ~((i160 & i161) | (i160 ^ i161));
                        int i163 = (i54 & i117) | (i117 ^ i54);
                        int i164 = ~i163;
                        int i165 = (i163 | i164) & i164;
                        int i166 = i162 & i165;
                        int i167 = (i165 | i162) & (~i166);
                        int i168 = (i167 & i166) | (i167 ^ i166);
                        int i169 = (i118 & i147) | (i117 & i159);
                        int i170 = i117 & i147;
                        int i171 = (i170 & i169) | (i169 ^ i170);
                        int i172 = ~i171;
                        int i173 = ~((i171 & i172) | (i172 ^ i171));
                        int i174 = i168 & i173;
                        int i175 = -(-((((i168 | i173) & (~i174)) | i174) * 140));
                        int i176 = ((((~i175) & i158) | ((~i158) & i175)) - (~((i175 & i158) << 1))) - 1;
                        int i177 = f52037f;
                        int i178 = (-2) - ((((i177 | 102) << 1) - (i177 ^ 102)) ^ (-1));
                        f52038g = i178 % 128;
                        int i179 = i178 % 2;
                        i22 = i144;
                        i11 = i176;
                        i13 = 0;
                        i14 = 1;
                    } else {
                        int i180 = 10 / i13;
                        if (i23 <= 0) {
                            break;
                        }
                        int i210 = i24 + 3;
                        f52037f = i210 % 128;
                        int i211 = i210 % 2;
                        aab aabVar2 = setonfocuschangelistener.setOnFocusChangeListener[i11];
                        Intrinsics.checkNotNull(aabVar2);
                        int i212 = -aabVar2.setDividerPadding;
                        int i213 = ((i212 * 595) - (~(-(-(i23 * (-1187)))))) - i14;
                        int i310 = ~i212;
                        int i311 = i310 & i23;
                        int i312 = (~i311) & (i310 | i23);
                        int i313 = ~i23;
                        int i314 = ~((i312 & i311) | (i312 ^ i311));
                        int i315 = ~iIntValue;
                        int i316 = ~((i315 ^ i23) | (i315 & i23));
                        int i317 = -(-(((i314 ^ i316) | (i316 & i314)) * (-1188)));
                        int i318 = ((i213 & i317) - (~(i317 | i213))) - i14;
                        int i319 = ~((i310 ^ i23) | i311);
                        int i410 = i313 & i315;
                        int i411 = ~i313;
                        int i412 = (iIntValue & i411) | i410 | (i313 & iIntValue);
                        int i413 = ~i412;
                        int i414 = i413 & (i412 | i413);
                        int i415 = i319 & i414;
                        int i416 = (i319 | i414) & (~i415);
                        int i417 = (i416 & i415) | (i416 ^ i415);
                        int i418 = ~i315;
                        int i419 = (i315 & i310) | (i212 & i418);
                        int i510 = i315 & i212;
                        int i511 = (i419 ^ i510) | (i419 & i510);
                        int i512 = ~i511;
                        int i513 = i512 & (i511 | i512);
                        int i514 = i11;
                        int i515 = ((~i513) & i417) | ((~i417) & i513);
                        int i516 = i417 & i513;
                        int i517 = ((i516 & i515) | (i515 ^ i516)) * 594;
                        int i518 = i318 & i517;
                        int i519 = ((i318 ^ i517) | i518) << 1;
                        int i610 = -((i517 | i318) & (~i518));
                        int i611 = (i519 & i610) + (i610 | i519);
                        int i612 = (i313 & i418) | (i315 & i411);
                        int i613 = ~((i612 & i410) | (i612 ^ i410));
                        int i614 = i313 ^ i212;
                        int i615 = i313 & i212;
                        int i616 = ~((i614 & i615) | (i614 ^ i615));
                        int i617 = i613 & i616;
                        int i618 = (i613 | i616) & (~i617);
                        int i619 = (i618 & i617) | (i618 ^ i617);
                        int i710 = i315 ^ i212;
                        int i711 = ~((i710 & i510) | (i710 ^ i510));
                        int i712 = i619 & i711;
                        int i713 = (i619 | i711) & (~i712);
                        int i714 = -(-(((i713 & i712) | (i713 ^ i712)) * 594));
                        int i715 = i611 ^ i714;
                        int i716 = (i714 & i611) << 1;
                        i23 = (i715 & i716) + (i716 | i715);
                        int i717 = setonfocuschangelistener.setDividerPadding;
                        int i718 = i212 * (-563);
                        int i719 = -(-(i717 * 565));
                        int i810 = i718 & i719;
                        int i811 = i810 + ((i718 ^ i719) | i810);
                        int i812 = ~i717;
                        int i813 = (i812 & i315) | (i812 ^ i315);
                        int i814 = ~i813;
                        int i815 = (i813 | i814) & i814;
                        int i816 = (i815 & i310) | (i310 ^ i815);
                        int i817 = i717 ^ iIntValue;
                        int i818 = i717 & iIntValue;
                        int i819 = ~((i817 & i818) | (i817 ^ i818));
                        int i910 = i816 & i819;
                        int i911 = (i816 | i819) & (~i910);
                        int i912 = (i811 - (~(((i911 & i910) | (i911 ^ i910)) * (-564)))) - 1;
                        int i913 = (i310 ^ i717) | (i310 & i717);
                        int i914 = i913 & iIntValue;
                        int i915 = (i913 | iIntValue) & (~i914);
                        int i916 = (i915 & i914) | (i915 ^ i914);
                        int i917 = ~i916;
                        int i918 = (i912 - (~(-(~(-(-(((i916 | i917) & i917) * 1128))))))) - 2;
                        int i919 = (i310 | i212) & i310;
                        int i1010 = (i919 & i315) | (i919 ^ i315);
                        int i1011 = ~i1010;
                        int i1012 = (i1010 | i1011) & i1011;
                        int i1013 = i212 & i717;
                        int i1014 = (i717 | i212) & (~i1013);
                        int i1015 = ~((i1014 & i1013) | (i1014 ^ i1013));
                        int i1016 = -(~(-(-(((i1015 & i1012) | (i1012 ^ i1015)) * 564))));
                        setonfocuschangelistener.setDividerPadding = (((i918 | i1016) << 1) - (i1016 ^ i918)) - 1;
                        int i1017 = setonfocuschangelistener.setY;
                        int i1018 = 494 - (~(-(-(i1017 * (-494)))));
                        int i1019 = (i1018 ^ (-1)) + (i1018 << 1);
                        int i1110 = i1019 << 1;
                        int i1111 = -i1019;
                        int i1112 = (i1110 & i1111) + (i1110 | i1111);
                        int i1113 = i1112 & (-495);
                        int i1114 = i1113 + ((i1112 ^ (-495)) | i1113);
                        int i1115 = ~i1017;
                        int i1116 = ~((i1017 | i1115) & i1115);
                        int i1117 = (i315 | iIntValue) & i315;
                        int i1118 = ~i1117;
                        int i1119 = (i1118 ^ i1117) | (i1118 & i1117);
                        int i1210 = ~i1119;
                        int i1211 = (i1116 | ((i1119 | i1210) & i1210)) * 495;
                        int i1212 = i1114 & i1211;
                        setonfocuschangelistener.setY = (i1212 - (~(-(-((i1211 ^ i1114) | i1212))))) - 1;
                        int i1213 = i22 * (-215);
                        int i1214 = ((((217 ^ i1213) | (217 & i1213)) << 1) - (~(-((i1213 & (-218)) | (217 & (~i1213)))))) - 1;
                        int i1215 = i315 & 1;
                        int i1216 = (iIntValue & (-2)) | i1215 | (iIntValue & 1);
                        int i1217 = ~i1216;
                        int i1218 = ((i1216 | i1217) & i1217) * 216;
                        int i1219 = i1214 & i1218;
                        int i1310 = (i1218 | i1214) & (~i1219);
                        int i1311 = i1219 << 1;
                        int i1312 = (i1310 & i1311) + (i1310 | i1311);
                        int i1313 = ~i22;
                        int i1314 = ((~i1313) & 1) | (i1313 & (-2));
                        int i1315 = i1313 & 1;
                        int i1316 = (i1315 & i1314) | (i1314 ^ i1315);
                        int i1317 = (i1316 & i418) | ((~i1316) & i315);
                        int i1318 = i1316 & i315;
                        int i1319 = (i1312 - (~(((i1318 & i1317) | (i1317 ^ i1318)) * (-216)))) - 1;
                        int i1410 = (i315 & (-2)) | (i418 & 1);
                        int i1411 = ~((i1215 & i1410) | (i1410 ^ i1215));
                        int i1412 = -(-(((i1411 & i22) | (i22 ^ i1411)) * 216));
                        int i1413 = i1319 & i1412;
                        int i1414 = ((i1412 | i1319) & (~i1413)) + (i1413 << 1);
                        int i1415 = -(-(i514 * (-139)));
                        int i1416 = (((-141) | i1415) << 1) - ((-141) ^ i1415);
                        int i1417 = ~i514;
                        int i1418 = (i1417 | i514) & i1417;
                        int i1419 = ~iIntValue;
                        int i1510 = i1418 & i1419;
                        int i1511 = (i1418 | i1419) & (~i1510);
                        int i1512 = ((i1511 & i1510) | (i1511 ^ i1510)) * (-280);
                        int i1513 = i1416 & i1512;
                        int i1514 = ((i1512 | i1416) & (~i1513)) + (i1513 << 1);
                        int i1515 = ~(i1417 | iIntValue);
                        int i1516 = i315 & i1515;
                        int i1517 = (i1515 | i315) & (~i1516);
                        int i1518 = (i1514 - (~(((i1517 & i1516) | (i1517 ^ i1516)) * 140))) - 1;
                        int i1519 = ~i1417;
                        int i1610 = (i1417 & i315) | (iIntValue & i1519);
                        int i1611 = i1417 & iIntValue;
                        int i1612 = ~((i1610 & i1611) | (i1610 ^ i1611));
                        int i1613 = (i514 & i1117) | (i1117 ^ i514);
                        int i1614 = ~i1613;
                        int i1615 = (i1613 | i1614) & i1614;
                        int i1616 = i1612 & i1615;
                        int i1617 = (i1615 | i1612) & (~i1616);
                        int i1618 = (i1617 & i1616) | (i1617 ^ i1616);
                        int i1619 = (i1118 & i1417) | (i1117 & i1519);
                        int i1710 = i1117 & i1417;
                        int i1711 = (i1710 & i1619) | (i1619 ^ i1710);
                        int i1712 = ~i1711;
                        int i1713 = ~((i1711 & i1712) | (i1712 ^ i1711));
                        int i1714 = i1618 & i1713;
                        int i1715 = -(-((((i1618 | i1713) & (~i1714)) | i1714) * 140));
                        int i1716 = ((((~i1715) & i1518) | ((~i1518) & i1715)) - (~((i1715 & i1518) << 1))) - 1;
                        int i1717 = f52037f;
                        int i1718 = (-2) - ((((i1717 | 102) << 1) - (i1717 ^ 102)) ^ (-1));
                        f52038g = i1718 % 128;
                        int i1719 = i1718 % 2;
                        i22 = i1414;
                        i11 = i1716;
                        i13 = 0;
                        i14 = 1;
                    }
                }
                aab[] aabVarArr = setonfocuschangelistener.setOnFocusChangeListener;
                int i181 = 317 - (~(-(~(-(-(i12 * (-317)))))));
                int i182 = ~i12;
                int i183 = (i182 | i12) & i182;
                int i184 = (-2) ^ iIntValue;
                int i185 = ~iIntValue;
                int i186 = (-2) & iIntValue;
                int i187 = ~((i184 ^ i186) | (i184 & i186));
                int i188 = ((~i187) & i183) | ((~i183) & i187);
                int i189 = i187 & i183;
                int i190 = ((i189 & i188) | (i188 ^ i189)) * (-318);
                int i191 = i181 & i190;
                int i192 = -(-((i181 ^ i190) | i191));
                int i193 = ((i191 | i192) << 1) - (i192 ^ i191);
                int i194 = i182 ^ iIntValue;
                int i195 = i182 & iIntValue;
                int i196 = (i194 & i195) | (i194 ^ i195);
                int i197 = ~i196;
                int i198 = (i196 | i197) & i197;
                int i199 = i185 ^ 1;
                int i200 = i185 & 1;
                int i201 = (i199 & i200) | (i199 ^ i200);
                int i202 = ~((i201 & i12) | (i201 ^ i12));
                int i203 = -(-(((i198 & i202) | (i198 ^ i202)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i204 = i193 & i203;
                int i205 = ((i193 ^ i203) | i204) << 1;
                int i206 = -((i203 | i193) & (~i204));
                int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                int i208 = (i185 | iIntValue) & i185;
                int i209 = i183 & i208;
                int i214 = (i208 | i183) & (~i209);
                int i215 = (i214 & i209) | (i214 ^ i209);
                int i216 = i215 ^ 1;
                int i217 = i215 & 1;
                int i218 = (i217 & i216) | (i216 ^ i217);
                int i219 = ~i218;
                int i220 = (i218 | i219) & i219;
                int i221 = i12 & 1;
                int i222 = (~i221) & (i12 | 1);
                int i223 = (i222 & i221) | (i222 ^ i221);
                int i224 = ~((i223 & iIntValue) | (i223 ^ iIntValue));
                int i225 = -(-(((i220 & i224) | ((~i224) & i220) | ((~i220) & i224)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i226 = (i207 ^ i225) + ((i225 & i207) << 1);
                int i227 = i221 + ((i12 ^ 1) | i221);
                int i228 = i22 * (-520);
                int i229 = -(~(i227 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY));
                int i230 = (-2) - (((i228 ^ i229) + ((i228 & i229) << 1)) ^ (-1));
                int i231 = ~i22;
                int i232 = (i231 ^ i227) | (i231 & i227);
                int i233 = i232 & iIntValue;
                int i234 = (i232 | iIntValue) & (~i233);
                int i235 = (i234 & i233) | (i234 ^ i233);
                int i236 = ~i235;
                int i237 = (((i235 | i236) & i236) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i230;
                int i238 = ~i227;
                int i239 = i238 ^ i22;
                int i240 = i238 & i22;
                int i241 = (~((i239 & i240) | (i239 ^ i240))) * (-1042);
                int i242 = i237 & i241;
                int i243 = -(-((i237 ^ i241) | i242));
                int i244 = ((i242 | i243) << 1) - (i243 ^ i242);
                int i245 = (i238 | i227) & i238;
                int i246 = ~((i245 & i22) | (i245 ^ i22));
                int i247 = i231 | i185;
                int i248 = ~((i227 & i247) | (i247 ^ i227));
                int i249 = i246 & i248;
                int i250 = (i248 | i246) & (~i249);
                int i251 = ((i250 & i249) | (i250 ^ i249)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                System.arraycopy(aabVarArr, i226, aabVarArr, (((~i251) & i244) | ((~i244) & i251)) + ((i251 & i244) << 1), setonfocuschangelistener.setY);
                int i252 = setonfocuschangelistener.f52043e;
                int i253 = i22 * 46;
                int i254 = i252 * 46;
                int i255 = i253 ^ i254;
                int i256 = ((i253 & i254) | i255) << 1;
                int i257 = -i255;
                int i258 = (i256 ^ i257) + ((i256 & i257) << 1);
                int i259 = ~i252;
                int i260 = (i259 | i252) & i259;
                int i261 = ~((i260 & i185) | ((~i185) & i260) | ((~i260) & i185));
                int i262 = -(-(((i261 & i22) | ((~i261) & i22) | (i261 & i231)) * (-90)));
                int i263 = ((((~i262) & i258) | ((~i258) & i262)) - (~(-(-((i262 & i258) << 1))))) - 1;
                int i264 = (i259 ^ iIntValue) | (i259 & iIntValue);
                int i265 = ~i264;
                int i266 = (i264 | i265) & i265;
                int i267 = (i22 & i259) | (i252 & i231);
                int i268 = i252 & i22;
                int i269 = (i268 & i267) | (i267 ^ i268);
                int i270 = ~i269;
                int i271 = (i269 | i270) & i270;
                int i272 = i266 & i271;
                int i273 = -(-((((i271 | i266) & (~i272)) | i272) * (-45)));
                int i274 = i263 & i273;
                int i275 = (i273 ^ i263) | i274;
                int i276 = (i274 ^ i275) + ((i275 & i274) << 1);
                int i277 = (i231 | i22) & i231;
                int i278 = i277 & iIntValue;
                int i279 = ~(((i277 | iIntValue) & (~i278)) | i278);
                int i280 = i259 & i279;
                int i281 = (i279 | i259) & (~i280);
                int i282 = (i281 & i280) | (i281 ^ i280);
                int i283 = ~(i185 | i22);
                int i284 = i282 ^ i283;
                int i285 = i282 & i283;
                int i286 = -(-(((i285 & i284) | (i284 ^ i285)) * 45));
                int i287 = i276 & i286;
                int i288 = (i286 | i276) & (~i287);
                int i289 = -(-(i287 << 1));
                setonfocuschangelistener.f52043e = ((i288 | i289) << 1) - (i288 ^ i289);
                int i290 = f52038g + 41;
                f52037f = i290 % 128;
                int i291 = i290 % 2;
                i10 = i22;
            } else {
                i10 = 0;
            }
            int i292 = f52037f;
            int i293 = ((i292 | 81) << 1) - (i292 ^ 81);
            f52038g = i293 % 128;
            int i294 = i293 % 2;
            return Integer.valueOf(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
        
            if ((r2 % 2) == 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        
            r13 = 88 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
        
            r5 = com.mypinpad.tsdk.isolation.aaf.INSTANCE;
            r4 = -((com.mypinpad.tsdk.isolation.aab[]) com.mypinpad.tsdk.isolation.aaf.setY(new java.lang.Object[0], -1294994487, 1294994488, (int) java.lang.System.currentTimeMillis())).length;
            r6 = (r13 * (-97)) + (r4 * 50);
            r5 = ~r13;
            r7 = r5 | r13;
            r8 = r5 & r7;
            r9 = r8 & r5;
            r8 = (r8 | r5) & (~r9);
            r10 = ~r5;
            r8 = ~((r8 & r9) | (r8 ^ r9));
            r9 = ~((r5 ^ r4) | (r5 & r4));
            r11 = r8 & r9;
            r8 = (r8 | r9) & (~r11);
            r8 = ((r8 & r11) | (r8 ^ r11)) * 98;
            r9 = ((r6 ^ r8) - (~((r6 & r8) << 1))) - 1;
            r6 = ~r4;
            r6 = ~((r6 & r5) | ((r6 & r10) | ((~r6) & r5)));
            r6 = (r6 & r5) | (r5 ^ r6);
            r10 = r4 & r13;
            r8 = ~((r4 ^ r13) | r10);
            r11 = r6 & r8;
            r6 = (r6 | r8) & (~r11);
            r6 = ((r6 & r11) | (r6 ^ r11)) * (-49);
            r11 = r9 & r6;
            r8 = (((r9 ^ r6) | r11) << 1) - ((r6 | r9) & (~r11));
            r5 = r5 & r13;
            r6 = (~r5) & r7;
            r5 = ~((r5 & r6) | (r6 ^ r5));
            r4 = (r4 | r13) & (~r10);
            r4 = ~((r4 & r10) | (r4 ^ r10));
            r4 = ((r4 & r5) | (r5 ^ r4)) * 49;
            r5 = (r8 | r4) << 1;
            r4 = -(r4 ^ r8);
            r6 = (r5 & r4) + (r4 | r5);
            r0 = ((java.lang.Integer) setOnFocusChangeListener(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r6)}, -164877785, 164877795, r6)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0125, code lost:
        
            if (r0 < 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0127, code lost:
        
            r4 = com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52038g;
            r5 = (r4 & (-6)) | ((~r4) & 5);
            r4 = (r4 & 5) << 1;
            r6 = ((r5 | r4) << 1) - (r4 ^ r5);
            com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52037f = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x013c, code lost:
        
            if ((r6 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x013e, code lost:
        
            r4 = r1.setOnFocusChangeListener;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0141, code lost:
        
            if (r0 >= r4.length) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0143, code lost:
        
            r13 = r1.f52041c;
            r0 = r4[r0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
            r13.add(r0);
            r13 = com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52038g;
            r0 = ((r13 ^ 110) + ((r13 & 110) << 1)) - 1;
            com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52037f = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x015b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x015c, code lost:
        
            r13 = r1.setOnFocusChangeListener.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0160, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0172, code lost:
        
            throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("Header index too large ", java.lang.Integer.valueOf(r13 + 1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{java.lang.Integer.valueOf(r13)}, -906679585, 906679590, r13)).booleanValue() != true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{java.lang.Integer.valueOf(r13)}, -906679585, 906679590, r13)).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
        
            r5 = com.mypinpad.tsdk.isolation.aaf.INSTANCE;
            r1.f52041c.add(((com.mypinpad.tsdk.isolation.aab[]) com.mypinpad.tsdk.isolation.aaf.setY(new java.lang.Object[0], -1294994487, 1294994488, (int) java.lang.System.currentTimeMillis()))[r13]);
            r13 = com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52038g;
            r1 = (r13 | 33) << 1;
            r13 = -(r13 ^ 33);
            r2 = (r1 & r13) + (r13 | r1);
            com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.f52037f = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void e(java.lang.Object[] r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 371
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aaf.setOnFocusChangeListener.e(java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0455 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x01b4 A[PHI: r1
          0x01b4: PHI (r1v111 int) = (r1v110 int), (r1v134 int) binds: [B:21:0x01b2, B:18:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x01c7 A[PHI: r1
          0x01c7: PHI (r1v130 int) = (r1v110 int), (r1v134 int) binds: [B:21:0x01b2, B:18:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x035d A[PHI: r6
          0x035d: PHI (r6v5 int) = (r6v4 int), (r6v17 int) binds: [B:49:0x035b, B:46:0x0356] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:51:0x036d  */
        /* JADX WARN: Code duplicated, block: B:54:0x0394 A[LOOP:0: B:52:0x037e->B:54:0x0394, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:79:0x05b2 A[PHI: r2
          0x05b2: PHI (r2v21 int A[IMMUTABLE_TYPE]) = (r2v20 int), (r2v28 int) binds: [B:78:0x05b0, B:75:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:81:0x05cb  */
        /* JADX WARN: Code duplicated, block: B:83:0x05e4  */
        /* JADX WARN: Code duplicated, block: B:86:0x05f2  */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            int i13;
            int i14;
            Object objValueOf;
            int i15;
            int i16;
            int i17;
            int iIntValue;
            int iIntValue2;
            boolean z10;
            int i18;
            int i19 = ~i12;
            int i20 = ~i10;
            int i21 = ~i11;
            int i22 = i19 | (~(i20 | i21));
            int i23 = ~(i10 | i11);
            int i24 = (((~(i12 | i11)) | (~(i10 | i12)) | i23) * (-1444)) + ((i22 | i23) * 1444) + (i11 * (-721)) + (i10 * (-721));
            int i25 = 196679929;
            int i26 = -196679914;
            int i27 = 2;
            char c10 = 0;
            switch ((((~(i10 | i21)) | (~(i11 | i20))) * ErrorCodes.STORAGE_PERMISSION) + i24) {
                case 1:
                    return c(objArr);
                case 2:
                    setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    int i28 = f52037f;
                    int i29 = (i28 ^ 59) + ((i28 & 59) << 1);
                    f52038g = i29 % 128;
                    if (i29 % 2 != 0) {
                        List list = CollectionsKt___CollectionsKt.toList(setonfocuschangelistener.f52041c);
                        setonfocuschangelistener.f52041c.clear();
                        return list;
                    }
                    CollectionsKt___CollectionsKt.toList(setonfocuschangelistener.f52041c);
                    setonfocuschangelistener.f52041c.clear();
                    throw null;
                case 3:
                    b(objArr);
                    return null;
                case 4:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    aaf aafVar = aaf.INSTANCE;
                    setonfocuschangelistener2.f52041c.add(new aab((abw) aaf.setY(new Object[]{(abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener2}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener2))}, -746635788, 746635788, (int) System.currentTimeMillis()), (abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener2}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener2))));
                    int i30 = f52037f;
                    int i31 = ((i30 | 69) << 1) - (i30 ^ 69);
                    f52038g = i31 % 128;
                    int i32 = i31 % 2;
                    return null;
                case 5:
                    int iIntValue3 = ((Number) objArr[0]).intValue();
                    int i33 = f52038g;
                    int i34 = (i33 & 113) + (i33 | 113);
                    f52037f = i34 % 128;
                    if (i34 % 2 == 0) {
                        i13 = 0;
                        if (iIntValue3 >= 0) {
                            aaf aafVar2 = aaf.INSTANCE;
                            if (iIntValue3 <= ((aab[]) aaf.setY(new Object[i13], -1294994487, 1294994488, (int) System.currentTimeMillis())).length - 1) {
                                int i35 = f52038g;
                                int i36 = (i35 & (-120)) | ((~i35) & 119);
                                int i37 = (i35 & 119) << 1;
                                int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                                f52037f = i38 % 128;
                                if (i38 % 2 == 0) {
                                }
                                i14 = (i35 & 53) + (i35 | 53);
                                f52037f = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i39 = 48 / 0;
                                }
                                objValueOf = Boolean.valueOf(z);
                            }
                        }
                    } else {
                        i13 = 0;
                        int i40 = 16 / 0;
                        if (iIntValue3 >= 0) {
                            aaf aafVar3 = aaf.INSTANCE;
                            if (iIntValue3 <= ((aab[]) aaf.setY(new Object[i13], -1294994487, 1294994488, (int) System.currentTimeMillis())).length - 1) {
                                int i310 = f52038g;
                                int i311 = (i310 & (-120)) | ((~i310) & 119);
                                int i312 = (i310 & 119) << 1;
                                int i313 = (i311 ^ i312) + ((i311 & i312) << 1);
                                f52037f = i313 % 128;
                                boolean z11 = i313 % 2 == 0;
                                i14 = (i310 & 53) + (i310 | 53);
                                f52037f = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i314 = 48 / 0;
                                }
                                objValueOf = Boolean.valueOf(z11);
                            }
                        }
                    }
                    int i41 = f52038g;
                    int i42 = (i41 & 39) + (i41 | 39);
                    f52037f = i42 % 128;
                    if (i42 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                    break;
                    break;
                case 6:
                    a(objArr);
                    return null;
                case 7:
                    e(objArr);
                    return null;
                case 8:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    aaf aafVar4 = aaf.INSTANCE;
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener3, new aab((abw) aaf.setY(new Object[]{(abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener3}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener3))}, -746635788, 746635788, (int) System.currentTimeMillis()), (abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener3}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener3)))}, -425134663, 425134669, System.identityHashCode(setonfocuschangelistener3));
                    int i43 = f52038g;
                    int i44 = i43 & 69;
                    int i45 = (i43 ^ 69) | i44;
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    f52037f = i46 % 128;
                    if (i46 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 9:
                    return d(objArr);
                case 10:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue4 = ((Number) objArr[1]).intValue();
                    int i47 = f52037f;
                    int i48 = i47 & 65;
                    int i49 = (((i47 | 65) & (~i48)) - (~(-(-(i48 << 1))))) - 1;
                    int i50 = i49 % 128;
                    f52038g = i50;
                    int i51 = i49 % 2;
                    int i52 = setonfocuschangelistener4.f52043e;
                    if (i51 == 0) {
                        i15 = (i52 - 1) % iIntValue4;
                    } else {
                        int i53 = (((i52 & (-2)) | ((~i52) & 1)) - (~(-(-((i52 & 1) << 1))))) - 1;
                        int i54 = -(-iIntValue4);
                        i15 = ((i54 & i53) << 1) + (i53 ^ i54);
                    }
                    int i55 = (i50 & 117) + (i50 | 117);
                    f52037f = i55 % 128;
                    int i56 = i55 % 2;
                    return Integer.valueOf(i15);
                case 11:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue5 = ((Number) objArr[1]).intValue();
                    setOnFocusChangeListener(new Object[]{setonfocuschangelistener5, new aab((abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener5, Integer.valueOf(iIntValue5)}, -1252413586, 1252413587, iIntValue5), (abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener5}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener5)))}, -425134663, 425134669, System.identityHashCode(setonfocuschangelistener5));
                    int i57 = f52038g;
                    int i58 = ((i57 ^ 76) + ((i57 & 76) << 1)) - 1;
                    f52037f = i58 % 128;
                    if (i58 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 12:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue6 = ((Number) objArr[1]).intValue();
                    int iIntValue7 = ((Number) objArr[2]).intValue();
                    int i59 = f52038g;
                    int i60 = i59 + 81;
                    int i61 = i60 % 128;
                    f52037f = i61;
                    if (i60 % 2 == 0) {
                        i16 = iIntValue6 & iIntValue7;
                        if (i16 >= iIntValue7) {
                            int i62 = i61 & 97;
                            int i63 = (~i62) & (i61 | 97);
                            int i64 = i62 << 1;
                            int i65 = (i63 & i64) + (i64 | i63);
                            f52038g = i65 % 128;
                            int i66 = i65 % 2;
                            i17 = 0;
                            while (true) {
                                Object[] objArr2 = new Object[1];
                                objArr2[c10] = setonfocuschangelistener6;
                                iIntValue = ((Integer) setOnFocusChangeListener(objArr2, i26, i25, System.identityHashCode(setonfocuschangelistener6))).intValue();
                                if ((iIntValue & 128) != 0) {
                                    int i67 = iIntValue << i17;
                                    int i68 = iIntValue7 & i67;
                                    int i69 = (i67 ^ iIntValue7) | i68;
                                    int i70 = (i68 & i69) + (i69 | i68);
                                    int i71 = f52038g;
                                    int i72 = (i71 ^ 9) + ((i71 & 9) << 1);
                                    f52037f = i72 % 128;
                                    int i73 = i72 % 2;
                                    objValueOf = Integer.valueOf(i70);
                                } else {
                                    int i74 = f52037f;
                                    int i75 = ((i74 ^ 59) - (~(-(-((i74 & 59) << 1))))) - 1;
                                    f52038g = i75 % 128;
                                    int i76 = i75 % i27;
                                    int i77 = (iIntValue & 127) << i17;
                                    int i78 = i77 * 399;
                                    int i79 = -(~(iIntValue7 * 399));
                                    int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                                    int i81 = (i80 ^ (-1)) + (i80 << 1);
                                    int i82 = ~i77;
                                    int i83 = i82 & (i82 | i77);
                                    int i84 = i83 & iIntValue7;
                                    int i85 = (~i84) & (i83 | iIntValue7);
                                    int i86 = ~iIntValue7;
                                    int i87 = i86 & i77;
                                    int i88 = (~((i86 ^ i77) | i87)) | (~((i85 ^ i84) | (i85 & i84)));
                                    int i89 = (i86 ^ iIntValue6) | (i86 & iIntValue6);
                                    int i90 = ~i89;
                                    int i91 = i90 & (i89 | i90);
                                    int i92 = i88 & i91;
                                    int i93 = (i88 | i91) & (~i92);
                                    int i94 = -(-(((i93 & i92) | (i93 ^ i92)) * 398));
                                    int i95 = (((i81 | i94) << 1) - (~(-((i94 & (~i81)) | ((~i94) & i81))))) - 1;
                                    int i96 = i77 & iIntValue7;
                                    int i97 = -(~(-(-((i96 | ((~i96) & (i77 | iIntValue7))) * (-1194)))));
                                    int i98 = (((i95 | i97) << 1) - (i97 ^ i95)) - 1;
                                    int i99 = (i86 | iIntValue7) & i86;
                                    int i100 = ~iIntValue6;
                                    int i101 = ((~i100) & i99) | ((~i99) & i100);
                                    int i102 = i99 & i100;
                                    int i103 = ~((i102 & i101) | (i101 ^ i102));
                                    int i104 = (iIntValue7 ^ i83) | i84;
                                    int i105 = ~i104;
                                    int i106 = (i104 | i105) & i105;
                                    int i107 = i103 & i106;
                                    int i108 = (i106 | i103) & (~i107);
                                    int i109 = (i108 & i107) | (i108 ^ i107);
                                    int i110 = (~i87) & (i77 | i86);
                                    int i111 = ~((i87 & i110) | (i110 ^ i87));
                                    int i112 = i109 & i111;
                                    int i113 = (i109 | i111) & (~i112);
                                    iIntValue7 = (i98 - (~(-(-(((i113 & i112) | (i113 ^ i112)) * 398))))) - 1;
                                    int i114 = i17 & 7;
                                    i17 = i114 + ((i17 ^ 7) | i114);
                                    int i115 = i74 + 55;
                                    f52038g = i115 % 128;
                                    int i116 = i115 % 2;
                                    i25 = 196679929;
                                    i26 = -196679914;
                                    i27 = 2;
                                    c10 = 0;
                                }
                            }
                        } else {
                            int i117 = (i59 & 7) + (i59 | 7);
                            f52037f = i117 % 128;
                            int i118 = i117 % 2;
                            objValueOf = Integer.valueOf(i16);
                        }
                    } else {
                        i16 = iIntValue6 & iIntValue7;
                        int i119 = 47 / 0;
                        if (i16 >= iIntValue7) {
                            int i610 = i61 & 97;
                            int i611 = (~i610) & (i61 | 97);
                            int i612 = i610 << 1;
                            int i613 = (i611 & i612) + (i612 | i611);
                            f52038g = i613 % 128;
                            int i614 = i613 % 2;
                            i17 = 0;
                            while (true) {
                                Object[] objArr3 = new Object[1];
                                objArr3[c10] = setonfocuschangelistener6;
                                iIntValue = ((Integer) setOnFocusChangeListener(objArr3, i26, i25, System.identityHashCode(setonfocuschangelistener6))).intValue();
                                if ((iIntValue & 128) != 0) {
                                    int i615 = iIntValue << i17;
                                    int i616 = iIntValue7 & i615;
                                    int i617 = (i615 ^ iIntValue7) | i616;
                                    int i710 = (i616 & i617) + (i617 | i616);
                                    int i711 = f52038g;
                                    int i712 = (i711 ^ 9) + ((i711 & 9) << 1);
                                    f52037f = i712 % 128;
                                    int i713 = i712 % 2;
                                    objValueOf = Integer.valueOf(i710);
                                } else {
                                    int i714 = f52037f;
                                    int i715 = ((i714 ^ 59) - (~(-(-((i714 & 59) << 1))))) - 1;
                                    f52038g = i715 % 128;
                                    int i716 = i715 % i27;
                                    int i717 = (iIntValue & 127) << i17;
                                    int i718 = i717 * 399;
                                    int i719 = -(~(iIntValue7 * 399));
                                    int i810 = ((i718 | i719) << 1) - (i718 ^ i719);
                                    int i811 = (i810 ^ (-1)) + (i810 << 1);
                                    int i812 = ~i717;
                                    int i813 = i812 & (i812 | i717);
                                    int i814 = i813 & iIntValue7;
                                    int i815 = (~i814) & (i813 | iIntValue7);
                                    int i816 = ~iIntValue7;
                                    int i817 = i816 & i717;
                                    int i818 = (~((i816 ^ i717) | i817)) | (~((i815 ^ i814) | (i815 & i814)));
                                    int i819 = (i816 ^ iIntValue6) | (i816 & iIntValue6);
                                    int i910 = ~i819;
                                    int i911 = i910 & (i819 | i910);
                                    int i912 = i818 & i911;
                                    int i913 = (i818 | i911) & (~i912);
                                    int i914 = -(-(((i913 & i912) | (i913 ^ i912)) * 398));
                                    int i915 = (((i811 | i914) << 1) - (~(-((i914 & (~i811)) | ((~i914) & i811))))) - 1;
                                    int i916 = i717 & iIntValue7;
                                    int i917 = -(~(-(-((i916 | ((~i916) & (i717 | iIntValue7))) * (-1194)))));
                                    int i918 = (((i915 | i917) << 1) - (i917 ^ i915)) - 1;
                                    int i919 = (i816 | iIntValue7) & i816;
                                    int i1010 = ~iIntValue6;
                                    int i1011 = ((~i1010) & i919) | ((~i919) & i1010);
                                    int i1012 = i919 & i1010;
                                    int i1013 = ~((i1012 & i1011) | (i1011 ^ i1012));
                                    int i1014 = (iIntValue7 ^ i813) | i814;
                                    int i1015 = ~i1014;
                                    int i1016 = (i1014 | i1015) & i1015;
                                    int i1017 = i1013 & i1016;
                                    int i1018 = (i1016 | i1013) & (~i1017);
                                    int i1019 = (i1018 & i1017) | (i1018 ^ i1017);
                                    int i1110 = (~i817) & (i717 | i816);
                                    int i1111 = ~((i817 & i1110) | (i1110 ^ i817));
                                    int i1112 = i1019 & i1111;
                                    int i1113 = (i1019 | i1111) & (~i1112);
                                    iIntValue7 = (i918 - (~(-(-(((i1113 & i1112) | (i1113 ^ i1112)) * 398))))) - 1;
                                    int i1114 = i17 & 7;
                                    i17 = i1114 + ((i17 ^ 7) | i1114);
                                    int i1115 = i714 + 55;
                                    f52038g = i1115 % 128;
                                    int i1116 = i1115 % 2;
                                    i25 = 196679929;
                                    i26 = -196679914;
                                    i27 = 2;
                                    c10 = 0;
                                }
                            }
                        } else {
                            int i1117 = (i59 & 7) + (i59 | 7);
                            f52037f = i1117 % 128;
                            int i1118 = i1117 % 2;
                            objValueOf = Integer.valueOf(i16);
                        }
                    }
                    break;
                case 13:
                    setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
                    int i120 = f52038g;
                    int i121 = i120 ^ 27;
                    int i122 = (((i120 & 27) | i121) << 1) - i121;
                    int i123 = i122 % 128;
                    f52037f = i123;
                    if (i122 % 2 != 0) {
                        int i124 = setonfocuschangelistener7.f52040b;
                        throw null;
                    }
                    int i125 = setonfocuschangelistener7.f52040b;
                    int i126 = setonfocuschangelistener7.setDividerPadding;
                    if (i125 < i126) {
                        if (i125 == 0) {
                            int i127 = i123 & 65;
                            int i128 = (i127 - (~((i123 ^ 65) | i127))) - 1;
                            f52038g = i128 % 128;
                            int i129 = i128 % 2;
                            setOnFocusChangeListener(new Object[]{setonfocuschangelistener7}, -1056635289, 1056635305, System.identityHashCode(setonfocuschangelistener7));
                            int i130 = f52038g;
                            int i131 = i130 & 59;
                            int i132 = (i131 - (~((i130 ^ 59) | i131))) - 1;
                            f52037f = i132 % 128;
                            int i133 = i132 % 2;
                            return null;
                        }
                        int i134 = -i125;
                        System.identityHashCode(setonfocuschangelistener7);
                        int i135 = i134 * (-623);
                        int i136 = -(-(i126 * (-623)));
                        int i137 = i135 & i136;
                        int i138 = (i137 - (~(-(-((i135 ^ i136) | i137))))) - 1;
                        int i139 = ~i134;
                        int i140 = (-2) - ((i138 - (~(-(-(i139 * (-624)))))) ^ (-1));
                        int i141 = (~i139) & i126;
                        int i142 = ~i126;
                        int i143 = i141 | (i139 & i142);
                        int i144 = i139 & i126;
                        int i145 = (i143 | i144) * 624;
                        int i146 = (i140 & i145) + (i140 | i145);
                        int i147 = i144 | (i134 & i142);
                        int i148 = i134 & i126;
                        int i149 = -(-(((i148 & i147) | (i147 ^ i148)) * 624));
                        int i150 = i146 & i149;
                        int i151 = ((i149 | i146) & (~i150)) + (i150 << 1);
                        ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener7, Integer.valueOf(i151)}, 44008342, -44008333, i151)).intValue();
                        int i152 = f52037f;
                        int i153 = i152 & 111;
                        int i154 = (i152 ^ 111) | i153;
                        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                        f52038g = i155 % 128;
                        int i156 = i155 % 2;
                    }
                    int i157 = f52037f;
                    int i158 = i157 & 111;
                    int i159 = (i157 | 111) & (~i158);
                    int i160 = i158 << 1;
                    int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                    f52038g = i161 % 128;
                    if (i161 % 2 != 0) {
                        return null;
                    }
                    throw null;
                case 14:
                    setOnFocusChangeListener setonfocuschangelistener8 = (setOnFocusChangeListener) objArr[0];
                    int i162 = f52038g;
                    int i163 = (i162 ^ 99) + ((i162 & 99) << 1);
                    f52037f = i163 % 128;
                    if (i163 % 2 != 0) {
                        iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener8}, -196679914, 196679929, System.identityHashCode(setonfocuschangelistener8))).intValue();
                        if ((iIntValue2 & 7598) == 30028) {
                            int i164 = f52037f;
                            int i165 = i164 & 101;
                            int i166 = (i164 ^ 101) | i165;
                            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                            f52038g = i167 % 128;
                            int i168 = i167 % 2;
                            z10 = true;
                        } else {
                            int i169 = f52037f;
                            int i170 = (((i169 | 122) << 1) - (i169 ^ 122)) - 1;
                            f52038g = i170 % 128;
                            int i171 = i170 % 2;
                            z10 = false;
                        }
                    } else {
                        iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener8}, -196679914, 196679929, System.identityHashCode(setonfocuschangelistener8))).intValue();
                        if ((iIntValue2 & 128) == 128) {
                            int i1610 = f52037f;
                            int i1611 = i1610 & 101;
                            int i1612 = (i1610 ^ 101) | i1611;
                            int i1613 = (i1611 ^ i1612) + ((i1612 & i1611) << 1);
                            f52038g = i1613 % 128;
                            int i1614 = i1613 % 2;
                            z10 = true;
                        } else {
                            int i1615 = f52037f;
                            int i172 = (((i1615 | 122) << 1) - (i1615 ^ 122)) - 1;
                            f52038g = i172 % 128;
                            int i173 = i172 % 2;
                            z10 = false;
                        }
                    }
                    long jIntValue = ((Integer) setOnFocusChangeListener(new Object[]{setonfocuschangelistener8, Integer.valueOf(iIntValue2), 127}, -84275340, 84275352, iIntValue2)).intValue();
                    if (z10) {
                        abx abxVar = new abx();
                        aal aalVar = aal.INSTANCE;
                        aal.setOnFocusChangeListener(new Object[]{setonfocuschangelistener8.f52042d, Long.valueOf(jIntValue), abxVar}, -598334378, 598334381, (int) System.currentTimeMillis());
                        objValueOf = (abw) abx.setOnFocusChangeListener(new Object[]{abxVar}, -2117584587, 2117584601, System.identityHashCode(abxVar));
                        int i174 = f52037f;
                        int i175 = i174 | 77;
                        i18 = ((i175 << 1) - (~(-((~(i174 & 77)) & i175)))) - 1;
                        f52038g = i18 % 128;
                    } else {
                        objValueOf = setonfocuschangelistener8.f52042d.setY(jIntValue);
                        int i176 = f52038g;
                        int i177 = i176 & 93;
                        int i178 = (i176 | 93) & (~i177);
                        int i179 = i177 << 1;
                        i18 = ((i178 | i179) << 1) - (i178 ^ i179);
                        f52037f = i18 % 128;
                    }
                    int i180 = i18 % 2;
                    break;
                case 15:
                    setOnFocusChangeListener setonfocuschangelistener9 = (setOnFocusChangeListener) objArr[0];
                    int i181 = f52038g;
                    int i182 = i181 ^ 117;
                    int i183 = (i181 & 117) << 1;
                    int i184 = (i182 & i183) + (i183 | i182);
                    f52037f = i184 % 128;
                    int i185 = i184 % 2;
                    int x4 = yt.setX(setonfocuschangelistener9.f52042d.getNavBarTitleString());
                    int i186 = f52038g;
                    int i187 = i186 & 79;
                    int i188 = (i186 | 79) & (~i187);
                    int i189 = -(-(i187 << 1));
                    int i190 = ((i188 | i189) << 1) - (i188 ^ i189);
                    f52037f = i190 % 128;
                    if (i190 % 2 == 0) {
                        return Integer.valueOf(x4);
                    }
                    throw null;
                case 16:
                    setOnFocusChangeListener setonfocuschangelistener10 = (setOnFocusChangeListener) objArr[0];
                    int i191 = f52037f;
                    int i192 = ((i191 | 111) << 1) - (i191 ^ 111);
                    f52038g = i192 % 128;
                    int i193 = i192 % 2;
                    ArraysKt___ArraysJvmKt.fill$default(setonfocuschangelistener10.setOnFocusChangeListener, (Object) null, 0, 0, 6, (Object) null);
                    int length = setonfocuschangelistener10.setOnFocusChangeListener.length;
                    int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener10);
                    int i194 = -(~(length * (-448)));
                    int i195 = ((((-450) | i194) << 1) - (i194 ^ (-450))) - 1;
                    int i196 = ~length;
                    int i197 = (length | i196) & i196;
                    int i198 = ~i196;
                    int i199 = (i198 ^ i196) | (i198 & i196);
                    int i200 = i199 & iIdentityHashCode;
                    int i201 = (i199 | iIdentityHashCode) & (~i200);
                    int i202 = ~iIdentityHashCode;
                    int i203 = ~(i201 | i200);
                    int i204 = i197 & i203;
                    int i205 = (i203 | i197) & (~i204);
                    int i206 = ((i205 & i204) | (i205 ^ i204)) * 449;
                    int i207 = i195 & i206;
                    int i208 = (i195 | i206) & (~i207);
                    int i209 = i207 << 1;
                    int i210 = (i208 ^ i209) + ((i208 & i209) << 1);
                    int i211 = i197 * (-1347);
                    int i212 = i210 & i211;
                    int i213 = (i211 | i210) & (~i212);
                    int i214 = -(-(i212 << 1));
                    int i215 = (i213 ^ i214) + ((i213 & i214) << 1);
                    int i216 = ((~i202) & i196) | (i198 & i202);
                    int i217 = i202 & i196;
                    int i218 = (i216 & i217) | (i216 ^ i217);
                    int i219 = ~i218;
                    int i220 = (i218 & i219) | (i219 ^ i218);
                    int i221 = ~i220;
                    int i222 = (i220 | i221) & i221;
                    int i223 = i196 & i222;
                    int i224 = -(-((((i222 | i196) & (~i223)) | i223) * 449));
                    int i225 = i215 & i224;
                    int i226 = -(-((i224 ^ i215) | i225));
                    setonfocuschangelistener10.f52043e = (i225 ^ i226) + ((i226 & i225) << 1);
                    setonfocuschangelistener10.setY = 0;
                    setonfocuschangelistener10.setDividerPadding = 0;
                    int i227 = f52038g;
                    int i228 = (i227 ^ 67) + ((i227 & 67) << 1);
                    f52037f = i228 % 128;
                    if (i228 % 2 == 0) {
                        return null;
                    }
                    int i229 = 2 / 0;
                    return null;
                default:
                    setOnFocusChangeListener setonfocuschangelistener11 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue8 = ((Number) objArr[1]).intValue();
                    setonfocuschangelistener11.f52041c.add(new aab((abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener11, Integer.valueOf(iIntValue8)}, -1252413586, 1252413587, iIntValue8), (abw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener11}, -638870461, 638870475, System.identityHashCode(setonfocuschangelistener11))));
                    int i230 = f52038g;
                    int i231 = i230 ^ 39;
                    int i232 = ((i230 & 39) | i231) << 1;
                    int i233 = -i231;
                    int i234 = (i232 ^ i233) + ((i232 & i233) << 1);
                    f52037f = i234 % 128;
                    if (i234 % 2 == 0) {
                        return null;
                    }
                    throw null;
            }
            return objValueOf;
        }

        @NotNull
        public final List<aab> setDividerPadding() {
            return (List) setOnFocusChangeListener(new Object[]{this}, -1990918445, 1990918447, System.identityHashCode(this));
        }

        public final void setX() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setOnFocusChangeListener(new Object[]{this}, 1916548618, -1916548615, System.identityHashCode(this));
        }
    }

    static {
        abw abwVar = aab.getNavBarTitleString;
        abw abwVar2 = aab.setOnDragListener;
        abw abwVar3 = aab.setOnLongClickListener;
        abw abwVar4 = aab.setNavigationOnClickListener;
        setCompoundDrawableTintBlendMode = new aab[]{new aab(aab.setLayoutAnimation, ""), new aab(abwVar, "GET"), new aab(abwVar, "POST"), new aab(abwVar2, "/"), new aab(abwVar2, "/index.html"), new aab(abwVar3, ProxyConfig.MATCH_HTTP), new aab(abwVar3, ProxyConfig.MATCH_HTTPS), new aab(abwVar4, Result.OK_RESPONSE_CODE), new aab(abwVar4, "204"), new aab(abwVar4, "206"), new aab(abwVar4, "304"), new aab(abwVar4, "400"), new aab(abwVar4, AsoResponse.ERROR_TYPE_TOKEN_INCORRECT), new aab(abwVar4, Result.INTERNAL_ERROR_RESPONSE_CODE), new aab("accept-charset", ""), new aab("accept-encoding", "gzip, deflate"), new aab("accept-language", ""), new aab("accept-ranges", ""), new aab("accept", ""), new aab("access-control-allow-origin", ""), new aab("age", ""), new aab("allow", ""), new aab("authorization", ""), new aab("cache-control", ""), new aab("content-disposition", ""), new aab("content-encoding", ""), new aab("content-language", ""), new aab(c.f84797b, ""), new aab("content-location", ""), new aab("content-range", ""), new aab(c.f84798c, ""), new aab("cookie", ""), new aab("date", ""), new aab(EtagInterceptor.HEADER_ETAG, ""), new aab("expect", ""), new aab("expires", ""), new aab("from", ""), new aab("host", ""), new aab("if-match", ""), new aab("if-modified-since", ""), new aab("if-none-match", ""), new aab("if-range", ""), new aab("if-unmodified-since", ""), new aab("last-modified", ""), new aab(DynamicLink.Builder.KEY_LINK, ""), new aab("location", ""), new aab("max-forwards", ""), new aab("proxy-authenticate", ""), new aab("proxy-authorization", ""), new aab("range", ""), new aab("referer", ""), new aab("refresh", ""), new aab("retry-after", ""), new aab("server", ""), new aab("set-cookie", ""), new aab("strict-transport-security", ""), new aab("transfer-encoding", ""), new aab("user-agent", ""), new aab("vary", ""), new aab("via", ""), new aab("www-authenticate", "")};
        setDividerPadding = (Map) setY(new Object[0], 984051422, -984051420, (int) System.currentTimeMillis());
        int i10 = f52028c + 103;
        f52029d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public static aab[] setDividerPadding() {
        return (aab[]) setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis());
    }

    @NotNull
    public static abw setOnFocusChangeListener(@NotNull abw p4) throws IOException {
        return (abw) setY(new Object[]{p4}, -746635788, 746635788, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setX")
    @NotNull
    public static Map<abw, Integer> setX() {
        return (Map) setY(new Object[0], 176569539, -176569536, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711));
        aab[] aabVarArr = setCompoundDrawableTintBlendMode;
        if (i17 == 1) {
            int i18 = f52029d;
            int i19 = i18 & 9;
            int i20 = (i18 ^ 9) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            f52028c = i22;
            int i23 = i21 % 2;
            int i24 = i22 & 11;
            int i25 = (((i22 | 11) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            f52029d = i25 % 128;
            int i26 = i25 % 2;
            return aabVarArr;
        }
        int i27 = 0;
        if (i17 == 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(aabVarArr.length);
            int length = aabVarArr.length;
            System.currentTimeMillis();
            System.currentTimeMillis();
            while (i27 < length) {
                int i28 = f52028c + 75;
                f52029d = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i27 + 1;
                if (!linkedHashMap.containsKey(aabVarArr[i27].setCompoundDrawableTintBlendMode)) {
                    int i31 = f52029d;
                    int i32 = i31 & 63;
                    int i33 = (i32 - (~(-(-((i31 ^ 63) | i32))))) - 1;
                    f52028c = i33 % 128;
                    int i34 = i33 % 2;
                    linkedHashMap.put(aabVarArr[i27].setCompoundDrawableTintBlendMode, Integer.valueOf(i27));
                    int i35 = f52028c + 71;
                    f52029d = i35 % 128;
                    int i36 = i35 % 2;
                }
                i27 = i30;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
            int i37 = f52029d;
            int i38 = i37 & 17;
            int i39 = -(-(i37 | 17));
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            f52028c = i40 % 128;
            int i41 = i40 % 2;
            return mapUnmodifiableMap;
        }
        if (i17 == 3) {
            int i42 = f52029d;
            int i43 = i42 & 3;
            int i44 = (i42 | 3) & (~i43);
            int i45 = i43 << 1;
            int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
            int i47 = i46 % 128;
            f52028c = i47;
            int i48 = i46 % 2;
            int i49 = (i47 ^ 5) + ((i47 & 5) << 1);
            f52029d = i49 % 128;
            int i50 = i49 % 2;
            return setDividerPadding;
        }
        abw abwVar = (abw) objArr[0];
        int i51 = f52028c;
        int i52 = i51 & 19;
        int i53 = (((i51 | 19) & (~i52)) - (~(i52 << 1))) - 1;
        f52029d = i53 % 128;
        int i54 = i53 % 2;
        Intrinsics.checkNotNullParameter(abwVar, "");
        int iIntValue = ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
        int i55 = f52029d;
        int i56 = (i55 & 51) + (i55 | 51);
        f52028c = i56 % 128;
        int i57 = i56 % 2;
        int i58 = 0;
        while (i58 < iIntValue) {
            int i59 = f52028c;
            int i60 = i59 & 115;
            int i61 = i60 + ((i59 ^ 115) | i60);
            f52029d = i61 % 128;
            int i62 = i61 % 2;
            int i63 = ((i58 ^ (-110)) | (i58 & (-110))) << 1;
            int i64 = -((i58 & 109) | ((~i58) & (-110)));
            int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
            int i66 = (((i65 ^ 111) | (i65 & 111)) << 1) - ((i65 & (-112)) | ((~i65) & 111));
            byte bByteValue = ((Byte) abw.setX(new Object[]{abwVar, Integer.valueOf(i58)}, 2055130869, -2055130861, i58)).byteValue();
            if (65 <= bByteValue) {
                int i67 = f52029d;
                int i68 = ((i67 | 85) << 1) - (i67 ^ 85);
                int i69 = i68 % 128;
                f52028c = i69;
                if (i68 % 2 != 0) {
                    if (bByteValue <= 118) {
                        int i70 = ((i69 & 116) + (i69 | 116)) - 1;
                        f52029d = i70 % 128;
                        int i71 = i70 % 2;
                        throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", (String) abw.setX(new Object[]{abwVar}, -623922005, 623922012, System.identityHashCode(abwVar))));
                    }
                    int i72 = i69 & 29;
                    int i73 = i72 + ((i69 ^ 29) | i72);
                    f52029d = i73 % 128;
                    int i74 = i73 % 2;
                } else {
                    if (bByteValue <= 90) {
                        int i75 = ((i69 & 116) + (i69 | 116)) - 1;
                        f52029d = i75 % 128;
                        int i76 = i75 % 2;
                        throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", (String) abw.setX(new Object[]{abwVar}, -623922005, 623922012, System.identityHashCode(abwVar))));
                    }
                    int i77 = i69 & 29;
                    int i78 = i77 + ((i69 ^ 29) | i77);
                    f52029d = i78 % 128;
                    int i79 = i78 % 2;
                }
            } else {
                int i80 = f52029d;
                int i81 = (i80 & 11) + (i80 | 11);
                f52028c = i81 % 128;
                int i82 = i81 % 2;
            }
            i58 = i66;
        }
        int i83 = f52029d + 23;
        f52028c = i83 % 128;
        int i84 = i83 % 2;
        return abwVar;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0006\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/aaf$setDividerPadding;", "", "", "Lcom/mypinpad/tsdk/i/aab;", "p0", "", "setOnFocusChangeListener", "(Ljava/util/List;)V", "", "setDividerPadding", "(I)V", "setCompoundDrawableTintBlendMode", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "setOnDragListener", "", "setY", "[Lcom/mypinpad/tsdk/i/aab;"}, k = 1, mv = {1, 6, 0})
    public static final class setDividerPadding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52030f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52031g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final abx f52033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f52035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52036e;

        /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
        @JvmField
        public int setX;

        /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
        @JvmField
        public int setOnDragListener;

        /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
        @JvmField
        public int setY;

        /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
        @JvmField
        public int setOnFocusChangeListener;

        /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public aab[] setCompoundDrawableTintBlendMode;

        public setDividerPadding(int i10, boolean z10, abx abxVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            i10 = (i11 & 1) != 0 ? 4096 : i10;
            z10 = (i11 & 2) != 0 ? true : z10;
            Intrinsics.checkNotNullParameter(abxVar, "");
            this.setX = i10;
            this.f52032a = z10;
            this.f52033b = abxVar;
            this.f52034c = Integer.MAX_VALUE;
            this.setOnDragListener = i10;
            this.setCompoundDrawableTintBlendMode = new aab[8];
            this.f52036e = 7;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0135 A[DONT_INVERT, PHI: r7
          0x0135: PHI (r7v42 int) = (r7v41 int), (r7v47 int) binds: [B:23:0x0133, B:20:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0137  */
        /* JADX WARN: Code duplicated, block: B:28:0x014f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0151  */
        /* JADX WARN: Code duplicated, block: B:31:0x0167 A[PHI: r7
          0x0167: PHI (r7v45 int) = (r7v41 int), (r7v47 int) binds: [B:23:0x0133, B:20:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x0170  */
        /* JADX WARN: Code duplicated, block: B:35:0x0176  */
        /* JADX WARN: Code duplicated, block: B:37:0x0193  */
        /* JADX WARN: Code duplicated, block: B:40:0x01ae A[PHI: r18
          0x01ae: PHI (r18v16 com.mypinpad.tsdk.i.aaf$setDividerPadding) = (r18v14 com.mypinpad.tsdk.i.aaf$setDividerPadding), (r18v17 com.mypinpad.tsdk.i.aaf$setDividerPadding) binds: [B:42:0x01cf, B:38:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:43:0x01d1 A[PHI: r18
          0x01d1: PHI (r18v15 com.mypinpad.tsdk.i.aaf$setDividerPadding) = (r18v14 com.mypinpad.tsdk.i.aaf$setDividerPadding), (r18v17 com.mypinpad.tsdk.i.aaf$setDividerPadding) binds: [B:42:0x01cf, B:38:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:61:0x0533  */
        /* JADX WARN: Code duplicated, block: B:67:0x0625  */
        /* JADX WARN: Code duplicated, block: B:69:0x0679  */
        /* JADX WARN: Code duplicated, block: B:71:0x0682  */
        /* JADX WARN: Code duplicated, block: B:72:0x06e4  */
        /* JADX WARN: Code duplicated, block: B:74:0x0705  */
        /* JADX WARN: Code duplicated, block: B:77:0x071c  */
        public static /* synthetic */ void a(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setDividerPadding setdividerpadding;
            int i10;
            int iIntValue;
            char c10;
            int i11;
            char c11;
            byte b10;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = 0;
            setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
            int i17 = 1;
            List list = (List) objArr[1];
            int i18 = f52031g;
            int i19 = ((i18 & 34) + (i18 | 34)) - 1;
            f52030f = i19 % 128;
            int i20 = 2;
            if (i19 % 2 != 0) {
                Intrinsics.checkNotNullParameter(list, "");
                boolean z10 = setdividerpadding2.f52035d;
                throw null;
            }
            Intrinsics.checkNotNullParameter(list, "");
            int i21 = 8;
            int i22 = 83;
            int i23 = -2;
            if (setdividerpadding2.f52035d) {
                int i24 = setdividerpadding2.f52034c;
                if (i24 < setdividerpadding2.setOnDragListener) {
                    int i25 = f52030f;
                    int i26 = (-2) - ((((i25 | 8) << 1) - (i25 ^ 8)) ^ (-1));
                    f52031g = i26 % 128;
                    if (i26 % 2 == 0) {
                        setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i24), 68, 83}, -1280719878, 1280719885, i24);
                    } else {
                        setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i24), 31, 32}, -1280719878, 1280719885, i24);
                    }
                }
                setdividerpadding2.f52035d = false;
                setdividerpadding2.f52034c = Integer.MAX_VALUE;
                int i27 = setdividerpadding2.setOnDragListener;
                setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i27), 31, 32}, -1280719878, 1280719885, i27);
                int i28 = f52030f;
                int i29 = (i28 & 73) + (i28 | 73);
                f52031g = i29 % 128;
                int i30 = i29 % 2;
            }
            int size = list.size();
            int i31 = f52031g;
            int i32 = (i31 ^ 95) + ((i31 & 95) << 1);
            f52030f = i32 % 128;
            int i33 = i32 % 2;
            int i34 = 0;
            while (i34 < size) {
                int i35 = f52031g;
                int i36 = i35 & 83;
                int i37 = (i36 - (~(-(-((i35 ^ i22) | i36))))) - i17;
                f52030f = i37 % 128;
                int i38 = i37 % i20;
                int i39 = i34 & 1;
                int i40 = (i34 ^ 1) | i39;
                int i41 = (i39 & i40) + (i39 | i40);
                aab aabVar = (aab) list.get(i34);
                abw navBarTitleString = aabVar.setCompoundDrawableTintBlendMode.getNavBarTitleString();
                abw abwVar = aabVar.setY;
                aaf aafVar = aaf.INSTANCE;
                Integer num = (Integer) ((Map) aaf.setY(new Object[i16], 176569539, -176569536, (int) System.currentTimeMillis())).get(navBarTitleString);
                if (num != null) {
                    int i42 = f52031g + 17;
                    f52030f = i42 % 128;
                    if (i42 % i20 != 0) {
                        iIntValue = num.intValue() % i17;
                        if (i20 > iIntValue) {
                            System.identityHashCode(setdividerpadding2);
                            System.identityHashCode(setdividerpadding2);
                        } else if (iIntValue < i21) {
                            int i43 = f52030f;
                            i12 = (((i43 ^ 1) | (i43 & 1)) << i17) - ((i43 & (-2)) | ((~i43) & i17));
                            f52031g = i12 % 128;
                            if (i12 % i20 == 0) {
                                i13 = i17;
                            }
                            if (i13 != i17) {
                                setdividerpadding = setdividerpadding2;
                            } else {
                                int i44 = f52031g;
                                int i45 = ((i44 ^ 69) | (i44 & 69)) << i17;
                                int i46 = -((i44 & (-70)) | ((~i44) & 69));
                                i14 = (i45 & i46) + (i46 | i45);
                                f52030f = i14 % 128;
                                if (i14 % i20 != 0) {
                                    setdividerpadding = setdividerpadding2;
                                    if (((Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar) ? 1 : 0) ^ i17) != i17) {
                                        int i47 = f52030f;
                                        int i48 = ((i47 ^ 116) + ((i47 & 116) << i17)) - i17;
                                        f52031g = i48 % 128;
                                        int i49 = i48 % i20;
                                        i10 = iIntValue;
                                    } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                        int i50 = f52031g;
                                        int i51 = i50 & 109;
                                        int i52 = (i50 | 109) & (~i51);
                                        int i53 = i51 << i17;
                                        int i54 = ((i52 | i53) << i17) - (i52 ^ i53);
                                        f52030f = i54 % 128;
                                        int i55 = i54 % i20;
                                        int iIdentityHashCode = System.identityHashCode(setdividerpadding);
                                        int i56 = (iIntValue * 85) + 85;
                                        int i57 = ~iIntValue;
                                        int i58 = i57 & (i57 | iIntValue);
                                        int i59 = i23 & i58;
                                        int i60 = (~i59) & (i23 | i58);
                                        int i61 = ~((i60 ^ i59) | (i59 & i60));
                                        int i62 = ~iIdentityHashCode;
                                        int i63 = i23 & i62;
                                        int i64 = ~(i63 | ((~i63) & (i23 | i62)));
                                        int i65 = ((~i61) & i64) | ((~i64) & i61);
                                        int i66 = i61 & i64;
                                        int i67 = (i66 & i65) | (i65 ^ i66);
                                        int i68 = (~i62) & i57;
                                        int i69 = ~i57;
                                        int i70 = i57 & i62;
                                        int i71 = i68 | (i62 & i69) | i70;
                                        int i72 = ~i71;
                                        int i73 = i72 & (i71 | i72);
                                        int i74 = ((~i67) & i73) | ((~i73) & i67);
                                        int i75 = i73 & i67;
                                        int i76 = (i74 & i75) | (i74 ^ i75);
                                        int i77 = iIntValue & 1;
                                        int i78 = ~((iIntValue ^ 1) | i77 | iIdentityHashCode);
                                        int i79 = i76 & i78;
                                        int i80 = (i76 | i78) & (~i79);
                                        int i81 = -(-(((i80 & i79) | (i80 ^ i79)) * (-84)));
                                        int i82 = ((~i81) & i56) | ((~i56) & i81);
                                        int i83 = (i56 & i81) << 1;
                                        int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                                        int i85 = (iIdentityHashCode & i69) | i70;
                                        int i86 = i57 & iIdentityHashCode;
                                        int i87 = ~((i85 & i86) | (i85 ^ i86));
                                        int i88 = ((~i87) & 1) | (i87 & (-2));
                                        int i89 = i87 & 1;
                                        int i90 = (i89 & i88) | (i88 ^ i89);
                                        int i91 = (iIdentityHashCode | i62) & i62;
                                        int i92 = i91 & iIntValue;
                                        int i93 = ~((i91 & i57) | ((~i91) & iIntValue) | i92);
                                        int i94 = i90 & i93;
                                        int i95 = (i90 | i93) & (~i94);
                                        int i96 = -(-(((i95 & i94) | (i95 ^ i94)) * (-84)));
                                        int i97 = i84 & i96;
                                        int i98 = -(-((i96 ^ i84) | i97));
                                        int i99 = (i97 & i98) + (i98 | i97);
                                        int i100 = i91 ^ iIntValue;
                                        int i101 = ~((i100 & i92) | (i100 ^ i92));
                                        int i102 = ~((iIntValue & (-2)) | (i57 & 1) | i77);
                                        int i103 = ((~i102) & i101) | ((~i101) & i102);
                                        int i104 = i101 & i102;
                                        int i105 = ((i104 & i103) | (i103 ^ i104)) * 84;
                                        int i106 = i99 & i105;
                                        int i107 = ((i99 ^ i105) | i106) << 1;
                                        int i108 = -((i105 | i99) & (~i106));
                                        i10 = ((i107 | i108) << 1) - (i108 ^ i107);
                                        int i109 = f52030f;
                                        int i110 = (i109 & 105) + (i109 | 105);
                                        f52031g = i110 % 128;
                                        int i111 = i110 % 2;
                                    }
                                } else {
                                    setdividerpadding = setdividerpadding2;
                                    i15 = -(iIntValue ^ (-1));
                                    if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[(i23 ^ i15) + ((i15 & i23) << i17)].setY, abwVar)) {
                                        int i410 = f52030f;
                                        int i411 = ((i410 ^ 116) + ((i410 & 116) << i17)) - i17;
                                        f52031g = i411 % 128;
                                        int i412 = i411 % i20;
                                        i10 = iIntValue;
                                    } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                        int i510 = f52031g;
                                        int i511 = i510 & 109;
                                        int i512 = (i510 | 109) & (~i511);
                                        int i513 = i511 << i17;
                                        int i514 = ((i512 | i513) << i17) - (i512 ^ i513);
                                        f52030f = i514 % 128;
                                        int i515 = i514 % i20;
                                        int iIdentityHashCode2 = System.identityHashCode(setdividerpadding);
                                        int i516 = (iIntValue * 85) + 85;
                                        int i517 = ~iIntValue;
                                        int i518 = i517 & (i517 | iIntValue);
                                        int i519 = i23 & i518;
                                        int i610 = (~i519) & (i23 | i518);
                                        int i611 = ~((i610 ^ i519) | (i519 & i610));
                                        int i612 = ~iIdentityHashCode2;
                                        int i613 = i23 & i612;
                                        int i614 = ~(i613 | ((~i613) & (i23 | i612)));
                                        int i615 = ((~i611) & i614) | ((~i614) & i611);
                                        int i616 = i611 & i614;
                                        int i617 = (i616 & i615) | (i615 ^ i616);
                                        int i618 = (~i612) & i517;
                                        int i619 = ~i517;
                                        int i710 = i517 & i612;
                                        int i711 = i618 | (i612 & i619) | i710;
                                        int i712 = ~i711;
                                        int i713 = i712 & (i711 | i712);
                                        int i714 = ((~i617) & i713) | ((~i713) & i617);
                                        int i715 = i713 & i617;
                                        int i716 = (i714 & i715) | (i714 ^ i715);
                                        int i717 = iIntValue & 1;
                                        int i718 = ~((iIntValue ^ 1) | i717 | iIdentityHashCode2);
                                        int i719 = i716 & i718;
                                        int i810 = (i716 | i718) & (~i719);
                                        int i811 = -(-(((i810 & i719) | (i810 ^ i719)) * (-84)));
                                        int i812 = ((~i811) & i516) | ((~i516) & i811);
                                        int i813 = (i516 & i811) << 1;
                                        int i814 = ((i812 | i813) << 1) - (i813 ^ i812);
                                        int i815 = (iIdentityHashCode2 & i619) | i710;
                                        int i816 = i517 & iIdentityHashCode2;
                                        int i817 = ~((i815 & i816) | (i815 ^ i816));
                                        int i818 = ((~i817) & 1) | (i817 & (-2));
                                        int i819 = i817 & 1;
                                        int i910 = (i819 & i818) | (i818 ^ i819);
                                        int i911 = (iIdentityHashCode2 | i612) & i612;
                                        int i912 = i911 & iIntValue;
                                        int i913 = ~((i911 & i517) | ((~i911) & iIntValue) | i912);
                                        int i914 = i910 & i913;
                                        int i915 = (i910 | i913) & (~i914);
                                        int i916 = -(-(((i915 & i914) | (i915 ^ i914)) * (-84)));
                                        int i917 = i814 & i916;
                                        int i918 = -(-((i916 ^ i814) | i917));
                                        int i919 = (i917 & i918) + (i918 | i917);
                                        int i1010 = i911 ^ iIntValue;
                                        int i1011 = ~((i1010 & i912) | (i1010 ^ i912));
                                        int i1012 = ~((iIntValue & (-2)) | (i517 & 1) | i717);
                                        int i1013 = ((~i1012) & i1011) | ((~i1011) & i1012);
                                        int i1014 = i1011 & i1012;
                                        int i1015 = ((i1014 & i1013) | (i1013 ^ i1014)) * 84;
                                        int i1016 = i919 & i1015;
                                        int i1017 = ((i919 ^ i1015) | i1016) << 1;
                                        int i1018 = -((i1015 | i919) & (~i1016));
                                        i10 = ((i1017 | i1018) << 1) - (i1018 ^ i1017);
                                        int i1019 = f52030f;
                                        int i112 = (i1019 & 105) + (i1019 | 105);
                                        f52031g = i112 % 128;
                                        int i113 = i112 % 2;
                                    }
                                }
                            }
                            i10 = -1;
                        } else {
                            int i114 = f52031g;
                            int i115 = i114 & 29;
                            int i116 = -(-(i114 | 29));
                            int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                            f52030f = i117 % 128;
                            int i118 = i117 % i20;
                        }
                        i13 = i16;
                        if (i13 != i17) {
                            setdividerpadding = setdividerpadding2;
                        } else {
                            int i413 = f52031g;
                            int i414 = ((i413 ^ 69) | (i413 & 69)) << i17;
                            int i415 = -((i413 & (-70)) | ((~i413) & 69));
                            i14 = (i414 & i415) + (i415 | i414);
                            f52030f = i14 % 128;
                            if (i14 % i20 != 0) {
                                setdividerpadding = setdividerpadding2;
                                if (((Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar) ? 1 : 0) ^ i17) != i17) {
                                    int i416 = f52030f;
                                    int i417 = ((i416 ^ 116) + ((i416 & 116) << i17)) - i17;
                                    f52031g = i417 % 128;
                                    int i418 = i417 % i20;
                                    i10 = iIntValue;
                                } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                    int i5110 = f52031g;
                                    int i5111 = i5110 & 109;
                                    int i5112 = (i5110 | 109) & (~i5111);
                                    int i5113 = i5111 << i17;
                                    int i5114 = ((i5112 | i5113) << i17) - (i5112 ^ i5113);
                                    f52030f = i5114 % 128;
                                    int i5115 = i5114 % i20;
                                    int iIdentityHashCode3 = System.identityHashCode(setdividerpadding);
                                    int i5116 = (iIntValue * 85) + 85;
                                    int i5117 = ~iIntValue;
                                    int i5118 = i5117 & (i5117 | iIntValue);
                                    int i5119 = i23 & i5118;
                                    int i6110 = (~i5119) & (i23 | i5118);
                                    int i6111 = ~((i6110 ^ i5119) | (i5119 & i6110));
                                    int i6112 = ~iIdentityHashCode3;
                                    int i6113 = i23 & i6112;
                                    int i6114 = ~(i6113 | ((~i6113) & (i23 | i6112)));
                                    int i6115 = ((~i6111) & i6114) | ((~i6114) & i6111);
                                    int i6116 = i6111 & i6114;
                                    int i6117 = (i6116 & i6115) | (i6115 ^ i6116);
                                    int i6118 = (~i6112) & i5117;
                                    int i6119 = ~i5117;
                                    int i7110 = i5117 & i6112;
                                    int i7111 = i6118 | (i6112 & i6119) | i7110;
                                    int i7112 = ~i7111;
                                    int i7113 = i7112 & (i7111 | i7112);
                                    int i7114 = ((~i6117) & i7113) | ((~i7113) & i6117);
                                    int i7115 = i7113 & i6117;
                                    int i7116 = (i7114 & i7115) | (i7114 ^ i7115);
                                    int i7117 = iIntValue & 1;
                                    int i7118 = ~((iIntValue ^ 1) | i7117 | iIdentityHashCode3);
                                    int i7119 = i7116 & i7118;
                                    int i8110 = (i7116 | i7118) & (~i7119);
                                    int i8111 = -(-(((i8110 & i7119) | (i8110 ^ i7119)) * (-84)));
                                    int i8112 = ((~i8111) & i5116) | ((~i5116) & i8111);
                                    int i8113 = (i5116 & i8111) << 1;
                                    int i8114 = ((i8112 | i8113) << 1) - (i8113 ^ i8112);
                                    int i8115 = (iIdentityHashCode3 & i6119) | i7110;
                                    int i8116 = i5117 & iIdentityHashCode3;
                                    int i8117 = ~((i8115 & i8116) | (i8115 ^ i8116));
                                    int i8118 = ((~i8117) & 1) | (i8117 & (-2));
                                    int i8119 = i8117 & 1;
                                    int i9110 = (i8119 & i8118) | (i8118 ^ i8119);
                                    int i9111 = (iIdentityHashCode3 | i6112) & i6112;
                                    int i9112 = i9111 & iIntValue;
                                    int i9113 = ~((i9111 & i5117) | ((~i9111) & iIntValue) | i9112);
                                    int i9114 = i9110 & i9113;
                                    int i9115 = (i9110 | i9113) & (~i9114);
                                    int i9116 = -(-(((i9115 & i9114) | (i9115 ^ i9114)) * (-84)));
                                    int i9117 = i8114 & i9116;
                                    int i9118 = -(-((i9116 ^ i8114) | i9117));
                                    int i9119 = (i9117 & i9118) + (i9118 | i9117);
                                    int i10110 = i9111 ^ iIntValue;
                                    int i10111 = ~((i10110 & i9112) | (i10110 ^ i9112));
                                    int i10112 = ~((iIntValue & (-2)) | (i5117 & 1) | i7117);
                                    int i10113 = ((~i10112) & i10111) | ((~i10111) & i10112);
                                    int i10114 = i10111 & i10112;
                                    int i10115 = ((i10114 & i10113) | (i10113 ^ i10114)) * 84;
                                    int i10116 = i9119 & i10115;
                                    int i10117 = ((i9119 ^ i10115) | i10116) << 1;
                                    int i10118 = -((i10115 | i9119) & (~i10116));
                                    i10 = ((i10117 | i10118) << 1) - (i10118 ^ i10117);
                                    int i10119 = f52030f;
                                    int i119 = (i10119 & 105) + (i10119 | 105);
                                    f52031g = i119 % 128;
                                    int i1110 = i119 % 2;
                                }
                            } else {
                                setdividerpadding = setdividerpadding2;
                                i15 = -(iIntValue ^ (-1));
                                if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[(i23 ^ i15) + ((i15 & i23) << i17)].setY, abwVar)) {
                                    int i419 = f52030f;
                                    int i4110 = ((i419 ^ 116) + ((i419 & 116) << i17)) - i17;
                                    f52031g = i4110 % 128;
                                    int i4111 = i4110 % i20;
                                    i10 = iIntValue;
                                } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                    int i51110 = f52031g;
                                    int i51111 = i51110 & 109;
                                    int i51112 = (i51110 | 109) & (~i51111);
                                    int i51113 = i51111 << i17;
                                    int i51114 = ((i51112 | i51113) << i17) - (i51112 ^ i51113);
                                    f52030f = i51114 % 128;
                                    int i51115 = i51114 % i20;
                                    int iIdentityHashCode4 = System.identityHashCode(setdividerpadding);
                                    int i51116 = (iIntValue * 85) + 85;
                                    int i51117 = ~iIntValue;
                                    int i51118 = i51117 & (i51117 | iIntValue);
                                    int i51119 = i23 & i51118;
                                    int i61110 = (~i51119) & (i23 | i51118);
                                    int i61111 = ~((i61110 ^ i51119) | (i51119 & i61110));
                                    int i61112 = ~iIdentityHashCode4;
                                    int i61113 = i23 & i61112;
                                    int i61114 = ~(i61113 | ((~i61113) & (i23 | i61112)));
                                    int i61115 = ((~i61111) & i61114) | ((~i61114) & i61111);
                                    int i61116 = i61111 & i61114;
                                    int i61117 = (i61116 & i61115) | (i61115 ^ i61116);
                                    int i61118 = (~i61112) & i51117;
                                    int i61119 = ~i51117;
                                    int i71110 = i51117 & i61112;
                                    int i71111 = i61118 | (i61112 & i61119) | i71110;
                                    int i71112 = ~i71111;
                                    int i71113 = i71112 & (i71111 | i71112);
                                    int i71114 = ((~i61117) & i71113) | ((~i71113) & i61117);
                                    int i71115 = i71113 & i61117;
                                    int i71116 = (i71114 & i71115) | (i71114 ^ i71115);
                                    int i71117 = iIntValue & 1;
                                    int i71118 = ~((iIntValue ^ 1) | i71117 | iIdentityHashCode4);
                                    int i71119 = i71116 & i71118;
                                    int i81110 = (i71116 | i71118) & (~i71119);
                                    int i81111 = -(-(((i81110 & i71119) | (i81110 ^ i71119)) * (-84)));
                                    int i81112 = ((~i81111) & i51116) | ((~i51116) & i81111);
                                    int i81113 = (i51116 & i81111) << 1;
                                    int i81114 = ((i81112 | i81113) << 1) - (i81113 ^ i81112);
                                    int i81115 = (iIdentityHashCode4 & i61119) | i71110;
                                    int i81116 = i51117 & iIdentityHashCode4;
                                    int i81117 = ~((i81115 & i81116) | (i81115 ^ i81116));
                                    int i81118 = ((~i81117) & 1) | (i81117 & (-2));
                                    int i81119 = i81117 & 1;
                                    int i91110 = (i81119 & i81118) | (i81118 ^ i81119);
                                    int i91111 = (iIdentityHashCode4 | i61112) & i61112;
                                    int i91112 = i91111 & iIntValue;
                                    int i91113 = ~((i91111 & i51117) | ((~i91111) & iIntValue) | i91112);
                                    int i91114 = i91110 & i91113;
                                    int i91115 = (i91110 | i91113) & (~i91114);
                                    int i91116 = -(-(((i91115 & i91114) | (i91115 ^ i91114)) * (-84)));
                                    int i91117 = i81114 & i91116;
                                    int i91118 = -(-((i91116 ^ i81114) | i91117));
                                    int i91119 = (i91117 & i91118) + (i91118 | i91117);
                                    int i101110 = i91111 ^ iIntValue;
                                    int i101111 = ~((i101110 & i91112) | (i101110 ^ i91112));
                                    int i101112 = ~((iIntValue & (-2)) | (i51117 & 1) | i71117);
                                    int i101113 = ((~i101112) & i101111) | ((~i101111) & i101112);
                                    int i101114 = i101111 & i101112;
                                    int i101115 = ((i101114 & i101113) | (i101113 ^ i101114)) * 84;
                                    int i101116 = i91119 & i101115;
                                    int i101117 = ((i91119 ^ i101115) | i101116) << 1;
                                    int i101118 = -((i101115 | i91119) & (~i101116));
                                    i10 = ((i101117 | i101118) << 1) - (i101118 ^ i101117);
                                    int i101119 = f52030f;
                                    int i1111 = (i101119 & 105) + (i101119 | 105);
                                    f52031g = i1111 % 128;
                                    int i1112 = i1111 % 2;
                                }
                            }
                        }
                        i10 = -1;
                    } else {
                        int iIntValue2 = num.intValue();
                        int i120 = iIntValue2 & 1;
                        int i121 = -(-(iIntValue2 | i17));
                        iIntValue = ((i120 | i121) << i17) - (i121 ^ i120);
                        if (i20 > iIntValue) {
                            System.identityHashCode(setdividerpadding2);
                            System.identityHashCode(setdividerpadding2);
                        } else if (iIntValue < i21) {
                            int i420 = f52030f;
                            i12 = (((i420 ^ 1) | (i420 & 1)) << i17) - ((i420 & (-2)) | ((~i420) & i17));
                            f52031g = i12 % 128;
                            if (i12 % i20 == 0) {
                                i13 = i17;
                            }
                            if (i13 != i17) {
                                setdividerpadding = setdividerpadding2;
                            } else {
                                int i4112 = f52031g;
                                int i4113 = ((i4112 ^ 69) | (i4112 & 69)) << i17;
                                int i4114 = -((i4112 & (-70)) | ((~i4112) & 69));
                                i14 = (i4113 & i4114) + (i4114 | i4113);
                                f52030f = i14 % 128;
                                if (i14 % i20 != 0) {
                                    setdividerpadding = setdividerpadding2;
                                    if (((Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar) ? 1 : 0) ^ i17) != i17) {
                                        int i4115 = f52030f;
                                        int i4116 = ((i4115 ^ 116) + ((i4115 & 116) << i17)) - i17;
                                        f52031g = i4116 % 128;
                                        int i4117 = i4116 % i20;
                                        i10 = iIntValue;
                                    } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                        int i511110 = f52031g;
                                        int i511111 = i511110 & 109;
                                        int i511112 = (i511110 | 109) & (~i511111);
                                        int i511113 = i511111 << i17;
                                        int i511114 = ((i511112 | i511113) << i17) - (i511112 ^ i511113);
                                        f52030f = i511114 % 128;
                                        int i511115 = i511114 % i20;
                                        int iIdentityHashCode5 = System.identityHashCode(setdividerpadding);
                                        int i511116 = (iIntValue * 85) + 85;
                                        int i511117 = ~iIntValue;
                                        int i511118 = i511117 & (i511117 | iIntValue);
                                        int i511119 = i23 & i511118;
                                        int i611110 = (~i511119) & (i23 | i511118);
                                        int i611111 = ~((i611110 ^ i511119) | (i511119 & i611110));
                                        int i611112 = ~iIdentityHashCode5;
                                        int i611113 = i23 & i611112;
                                        int i611114 = ~(i611113 | ((~i611113) & (i23 | i611112)));
                                        int i611115 = ((~i611111) & i611114) | ((~i611114) & i611111);
                                        int i611116 = i611111 & i611114;
                                        int i611117 = (i611116 & i611115) | (i611115 ^ i611116);
                                        int i611118 = (~i611112) & i511117;
                                        int i611119 = ~i511117;
                                        int i711110 = i511117 & i611112;
                                        int i711111 = i611118 | (i611112 & i611119) | i711110;
                                        int i711112 = ~i711111;
                                        int i711113 = i711112 & (i711111 | i711112);
                                        int i711114 = ((~i611117) & i711113) | ((~i711113) & i611117);
                                        int i711115 = i711113 & i611117;
                                        int i711116 = (i711114 & i711115) | (i711114 ^ i711115);
                                        int i711117 = iIntValue & 1;
                                        int i711118 = ~((iIntValue ^ 1) | i711117 | iIdentityHashCode5);
                                        int i711119 = i711116 & i711118;
                                        int i811110 = (i711116 | i711118) & (~i711119);
                                        int i811111 = -(-(((i811110 & i711119) | (i811110 ^ i711119)) * (-84)));
                                        int i811112 = ((~i811111) & i511116) | ((~i511116) & i811111);
                                        int i811113 = (i511116 & i811111) << 1;
                                        int i811114 = ((i811112 | i811113) << 1) - (i811113 ^ i811112);
                                        int i811115 = (iIdentityHashCode5 & i611119) | i711110;
                                        int i811116 = i511117 & iIdentityHashCode5;
                                        int i811117 = ~((i811115 & i811116) | (i811115 ^ i811116));
                                        int i811118 = ((~i811117) & 1) | (i811117 & (-2));
                                        int i811119 = i811117 & 1;
                                        int i911110 = (i811119 & i811118) | (i811118 ^ i811119);
                                        int i911111 = (iIdentityHashCode5 | i611112) & i611112;
                                        int i911112 = i911111 & iIntValue;
                                        int i911113 = ~((i911111 & i511117) | ((~i911111) & iIntValue) | i911112);
                                        int i911114 = i911110 & i911113;
                                        int i911115 = (i911110 | i911113) & (~i911114);
                                        int i911116 = -(-(((i911115 & i911114) | (i911115 ^ i911114)) * (-84)));
                                        int i911117 = i811114 & i911116;
                                        int i911118 = -(-((i911116 ^ i811114) | i911117));
                                        int i911119 = (i911117 & i911118) + (i911118 | i911117);
                                        int i1011110 = i911111 ^ iIntValue;
                                        int i1011111 = ~((i1011110 & i911112) | (i1011110 ^ i911112));
                                        int i1011112 = ~((iIntValue & (-2)) | (i511117 & 1) | i711117);
                                        int i1011113 = ((~i1011112) & i1011111) | ((~i1011111) & i1011112);
                                        int i1011114 = i1011111 & i1011112;
                                        int i1011115 = ((i1011114 & i1011113) | (i1011113 ^ i1011114)) * 84;
                                        int i1011116 = i911119 & i1011115;
                                        int i1011117 = ((i911119 ^ i1011115) | i1011116) << 1;
                                        int i1011118 = -((i1011115 | i911119) & (~i1011116));
                                        i10 = ((i1011117 | i1011118) << 1) - (i1011118 ^ i1011117);
                                        int i1011119 = f52030f;
                                        int i1113 = (i1011119 & 105) + (i1011119 | 105);
                                        f52031g = i1113 % 128;
                                        int i1114 = i1113 % 2;
                                    }
                                } else {
                                    setdividerpadding = setdividerpadding2;
                                    i15 = -(iIntValue ^ (-1));
                                    if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[(i23 ^ i15) + ((i15 & i23) << i17)].setY, abwVar)) {
                                        int i4118 = f52030f;
                                        int i4119 = ((i4118 ^ 116) + ((i4118 & 116) << i17)) - i17;
                                        f52031g = i4119 % 128;
                                        int i41110 = i4119 % i20;
                                        i10 = iIntValue;
                                    } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                        int i5111110 = f52031g;
                                        int i5111111 = i5111110 & 109;
                                        int i5111112 = (i5111110 | 109) & (~i5111111);
                                        int i5111113 = i5111111 << i17;
                                        int i5111114 = ((i5111112 | i5111113) << i17) - (i5111112 ^ i5111113);
                                        f52030f = i5111114 % 128;
                                        int i5111115 = i5111114 % i20;
                                        int iIdentityHashCode6 = System.identityHashCode(setdividerpadding);
                                        int i5111116 = (iIntValue * 85) + 85;
                                        int i5111117 = ~iIntValue;
                                        int i5111118 = i5111117 & (i5111117 | iIntValue);
                                        int i5111119 = i23 & i5111118;
                                        int i6111110 = (~i5111119) & (i23 | i5111118);
                                        int i6111111 = ~((i6111110 ^ i5111119) | (i5111119 & i6111110));
                                        int i6111112 = ~iIdentityHashCode6;
                                        int i6111113 = i23 & i6111112;
                                        int i6111114 = ~(i6111113 | ((~i6111113) & (i23 | i6111112)));
                                        int i6111115 = ((~i6111111) & i6111114) | ((~i6111114) & i6111111);
                                        int i6111116 = i6111111 & i6111114;
                                        int i6111117 = (i6111116 & i6111115) | (i6111115 ^ i6111116);
                                        int i6111118 = (~i6111112) & i5111117;
                                        int i6111119 = ~i5111117;
                                        int i7111110 = i5111117 & i6111112;
                                        int i7111111 = i6111118 | (i6111112 & i6111119) | i7111110;
                                        int i7111112 = ~i7111111;
                                        int i7111113 = i7111112 & (i7111111 | i7111112);
                                        int i7111114 = ((~i6111117) & i7111113) | ((~i7111113) & i6111117);
                                        int i7111115 = i7111113 & i6111117;
                                        int i7111116 = (i7111114 & i7111115) | (i7111114 ^ i7111115);
                                        int i7111117 = iIntValue & 1;
                                        int i7111118 = ~((iIntValue ^ 1) | i7111117 | iIdentityHashCode6);
                                        int i7111119 = i7111116 & i7111118;
                                        int i8111110 = (i7111116 | i7111118) & (~i7111119);
                                        int i8111111 = -(-(((i8111110 & i7111119) | (i8111110 ^ i7111119)) * (-84)));
                                        int i8111112 = ((~i8111111) & i5111116) | ((~i5111116) & i8111111);
                                        int i8111113 = (i5111116 & i8111111) << 1;
                                        int i8111114 = ((i8111112 | i8111113) << 1) - (i8111113 ^ i8111112);
                                        int i8111115 = (iIdentityHashCode6 & i6111119) | i7111110;
                                        int i8111116 = i5111117 & iIdentityHashCode6;
                                        int i8111117 = ~((i8111115 & i8111116) | (i8111115 ^ i8111116));
                                        int i8111118 = ((~i8111117) & 1) | (i8111117 & (-2));
                                        int i8111119 = i8111117 & 1;
                                        int i9111110 = (i8111119 & i8111118) | (i8111118 ^ i8111119);
                                        int i9111111 = (iIdentityHashCode6 | i6111112) & i6111112;
                                        int i9111112 = i9111111 & iIntValue;
                                        int i9111113 = ~((i9111111 & i5111117) | ((~i9111111) & iIntValue) | i9111112);
                                        int i9111114 = i9111110 & i9111113;
                                        int i9111115 = (i9111110 | i9111113) & (~i9111114);
                                        int i9111116 = -(-(((i9111115 & i9111114) | (i9111115 ^ i9111114)) * (-84)));
                                        int i9111117 = i8111114 & i9111116;
                                        int i9111118 = -(-((i9111116 ^ i8111114) | i9111117));
                                        int i9111119 = (i9111117 & i9111118) + (i9111118 | i9111117);
                                        int i10111110 = i9111111 ^ iIntValue;
                                        int i10111111 = ~((i10111110 & i9111112) | (i10111110 ^ i9111112));
                                        int i10111112 = ~((iIntValue & (-2)) | (i5111117 & 1) | i7111117);
                                        int i10111113 = ((~i10111112) & i10111111) | ((~i10111111) & i10111112);
                                        int i10111114 = i10111111 & i10111112;
                                        int i10111115 = ((i10111114 & i10111113) | (i10111113 ^ i10111114)) * 84;
                                        int i10111116 = i9111119 & i10111115;
                                        int i10111117 = ((i9111119 ^ i10111115) | i10111116) << 1;
                                        int i10111118 = -((i10111115 | i9111119) & (~i10111116));
                                        i10 = ((i10111117 | i10111118) << 1) - (i10111118 ^ i10111117);
                                        int i10111119 = f52030f;
                                        int i1115 = (i10111119 & 105) + (i10111119 | 105);
                                        f52031g = i1115 % 128;
                                        int i1116 = i1115 % 2;
                                    }
                                }
                            }
                            i10 = -1;
                        } else {
                            int i1117 = f52031g;
                            int i1118 = i1117 & 29;
                            int i1119 = -(-(i1117 | 29));
                            int i1120 = ((i1118 | i1119) << 1) - (i1119 ^ i1118);
                            f52030f = i1120 % 128;
                            int i1121 = i1120 % i20;
                        }
                        i13 = i16;
                        if (i13 != i17) {
                            setdividerpadding = setdividerpadding2;
                        } else {
                            int i41111 = f52031g;
                            int i41112 = ((i41111 ^ 69) | (i41111 & 69)) << i17;
                            int i41113 = -((i41111 & (-70)) | ((~i41111) & 69));
                            i14 = (i41112 & i41113) + (i41113 | i41112);
                            f52030f = i14 % 128;
                            if (i14 % i20 != 0) {
                                setdividerpadding = setdividerpadding2;
                                if (((Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar) ? 1 : 0) ^ i17) != i17) {
                                    int i41114 = f52030f;
                                    int i41115 = ((i41114 ^ 116) + ((i41114 & 116) << i17)) - i17;
                                    f52031g = i41115 % 128;
                                    int i41116 = i41115 % i20;
                                    i10 = iIntValue;
                                } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                    int i51111110 = f52031g;
                                    int i51111111 = i51111110 & 109;
                                    int i51111112 = (i51111110 | 109) & (~i51111111);
                                    int i51111113 = i51111111 << i17;
                                    int i51111114 = ((i51111112 | i51111113) << i17) - (i51111112 ^ i51111113);
                                    f52030f = i51111114 % 128;
                                    int i51111115 = i51111114 % i20;
                                    int iIdentityHashCode7 = System.identityHashCode(setdividerpadding);
                                    int i51111116 = (iIntValue * 85) + 85;
                                    int i51111117 = ~iIntValue;
                                    int i51111118 = i51111117 & (i51111117 | iIntValue);
                                    int i51111119 = i23 & i51111118;
                                    int i61111110 = (~i51111119) & (i23 | i51111118);
                                    int i61111111 = ~((i61111110 ^ i51111119) | (i51111119 & i61111110));
                                    int i61111112 = ~iIdentityHashCode7;
                                    int i61111113 = i23 & i61111112;
                                    int i61111114 = ~(i61111113 | ((~i61111113) & (i23 | i61111112)));
                                    int i61111115 = ((~i61111111) & i61111114) | ((~i61111114) & i61111111);
                                    int i61111116 = i61111111 & i61111114;
                                    int i61111117 = (i61111116 & i61111115) | (i61111115 ^ i61111116);
                                    int i61111118 = (~i61111112) & i51111117;
                                    int i61111119 = ~i51111117;
                                    int i71111110 = i51111117 & i61111112;
                                    int i71111111 = i61111118 | (i61111112 & i61111119) | i71111110;
                                    int i71111112 = ~i71111111;
                                    int i71111113 = i71111112 & (i71111111 | i71111112);
                                    int i71111114 = ((~i61111117) & i71111113) | ((~i71111113) & i61111117);
                                    int i71111115 = i71111113 & i61111117;
                                    int i71111116 = (i71111114 & i71111115) | (i71111114 ^ i71111115);
                                    int i71111117 = iIntValue & 1;
                                    int i71111118 = ~((iIntValue ^ 1) | i71111117 | iIdentityHashCode7);
                                    int i71111119 = i71111116 & i71111118;
                                    int i81111110 = (i71111116 | i71111118) & (~i71111119);
                                    int i81111111 = -(-(((i81111110 & i71111119) | (i81111110 ^ i71111119)) * (-84)));
                                    int i81111112 = ((~i81111111) & i51111116) | ((~i51111116) & i81111111);
                                    int i81111113 = (i51111116 & i81111111) << 1;
                                    int i81111114 = ((i81111112 | i81111113) << 1) - (i81111113 ^ i81111112);
                                    int i81111115 = (iIdentityHashCode7 & i61111119) | i71111110;
                                    int i81111116 = i51111117 & iIdentityHashCode7;
                                    int i81111117 = ~((i81111115 & i81111116) | (i81111115 ^ i81111116));
                                    int i81111118 = ((~i81111117) & 1) | (i81111117 & (-2));
                                    int i81111119 = i81111117 & 1;
                                    int i91111110 = (i81111119 & i81111118) | (i81111118 ^ i81111119);
                                    int i91111111 = (iIdentityHashCode7 | i61111112) & i61111112;
                                    int i91111112 = i91111111 & iIntValue;
                                    int i91111113 = ~((i91111111 & i51111117) | ((~i91111111) & iIntValue) | i91111112);
                                    int i91111114 = i91111110 & i91111113;
                                    int i91111115 = (i91111110 | i91111113) & (~i91111114);
                                    int i91111116 = -(-(((i91111115 & i91111114) | (i91111115 ^ i91111114)) * (-84)));
                                    int i91111117 = i81111114 & i91111116;
                                    int i91111118 = -(-((i91111116 ^ i81111114) | i91111117));
                                    int i91111119 = (i91111117 & i91111118) + (i91111118 | i91111117);
                                    int i101111110 = i91111111 ^ iIntValue;
                                    int i101111111 = ~((i101111110 & i91111112) | (i101111110 ^ i91111112));
                                    int i101111112 = ~((iIntValue & (-2)) | (i51111117 & 1) | i71111117);
                                    int i101111113 = ((~i101111112) & i101111111) | ((~i101111111) & i101111112);
                                    int i101111114 = i101111111 & i101111112;
                                    int i101111115 = ((i101111114 & i101111113) | (i101111113 ^ i101111114)) * 84;
                                    int i101111116 = i91111119 & i101111115;
                                    int i101111117 = ((i91111119 ^ i101111115) | i101111116) << 1;
                                    int i101111118 = -((i101111115 | i91111119) & (~i101111116));
                                    i10 = ((i101111117 | i101111118) << 1) - (i101111118 ^ i101111117);
                                    int i101111119 = f52030f;
                                    int i11110 = (i101111119 & 105) + (i101111119 | 105);
                                    f52031g = i11110 % 128;
                                    int i11111 = i11110 % 2;
                                }
                            } else {
                                setdividerpadding = setdividerpadding2;
                                i15 = -(iIntValue ^ (-1));
                                if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[i16], -1294994487, 1294994488, (int) System.currentTimeMillis()))[(i23 ^ i15) + ((i15 & i23) << i17)].setY, abwVar)) {
                                    int i41117 = f52030f;
                                    int i41118 = ((i41117 ^ 116) + ((i41117 & 116) << i17)) - i17;
                                    f52031g = i41118 % 128;
                                    int i41119 = i41118 % i20;
                                    i10 = iIntValue;
                                } else if (Intrinsics.areEqual(((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis()))[iIntValue].setY, abwVar)) {
                                    int i511111110 = f52031g;
                                    int i511111111 = i511111110 & 109;
                                    int i511111112 = (i511111110 | 109) & (~i511111111);
                                    int i511111113 = i511111111 << i17;
                                    int i511111114 = ((i511111112 | i511111113) << i17) - (i511111112 ^ i511111113);
                                    f52030f = i511111114 % 128;
                                    int i511111115 = i511111114 % i20;
                                    int iIdentityHashCode8 = System.identityHashCode(setdividerpadding);
                                    int i511111116 = (iIntValue * 85) + 85;
                                    int i511111117 = ~iIntValue;
                                    int i511111118 = i511111117 & (i511111117 | iIntValue);
                                    int i511111119 = i23 & i511111118;
                                    int i611111110 = (~i511111119) & (i23 | i511111118);
                                    int i611111111 = ~((i611111110 ^ i511111119) | (i511111119 & i611111110));
                                    int i611111112 = ~iIdentityHashCode8;
                                    int i611111113 = i23 & i611111112;
                                    int i611111114 = ~(i611111113 | ((~i611111113) & (i23 | i611111112)));
                                    int i611111115 = ((~i611111111) & i611111114) | ((~i611111114) & i611111111);
                                    int i611111116 = i611111111 & i611111114;
                                    int i611111117 = (i611111116 & i611111115) | (i611111115 ^ i611111116);
                                    int i611111118 = (~i611111112) & i511111117;
                                    int i611111119 = ~i511111117;
                                    int i711111110 = i511111117 & i611111112;
                                    int i711111111 = i611111118 | (i611111112 & i611111119) | i711111110;
                                    int i711111112 = ~i711111111;
                                    int i711111113 = i711111112 & (i711111111 | i711111112);
                                    int i711111114 = ((~i611111117) & i711111113) | ((~i711111113) & i611111117);
                                    int i711111115 = i711111113 & i611111117;
                                    int i711111116 = (i711111114 & i711111115) | (i711111114 ^ i711111115);
                                    int i711111117 = iIntValue & 1;
                                    int i711111118 = ~((iIntValue ^ 1) | i711111117 | iIdentityHashCode8);
                                    int i711111119 = i711111116 & i711111118;
                                    int i811111110 = (i711111116 | i711111118) & (~i711111119);
                                    int i811111111 = -(-(((i811111110 & i711111119) | (i811111110 ^ i711111119)) * (-84)));
                                    int i811111112 = ((~i811111111) & i511111116) | ((~i511111116) & i811111111);
                                    int i811111113 = (i511111116 & i811111111) << 1;
                                    int i811111114 = ((i811111112 | i811111113) << 1) - (i811111113 ^ i811111112);
                                    int i811111115 = (iIdentityHashCode8 & i611111119) | i711111110;
                                    int i811111116 = i511111117 & iIdentityHashCode8;
                                    int i811111117 = ~((i811111115 & i811111116) | (i811111115 ^ i811111116));
                                    int i811111118 = ((~i811111117) & 1) | (i811111117 & (-2));
                                    int i811111119 = i811111117 & 1;
                                    int i911111110 = (i811111119 & i811111118) | (i811111118 ^ i811111119);
                                    int i911111111 = (iIdentityHashCode8 | i611111112) & i611111112;
                                    int i911111112 = i911111111 & iIntValue;
                                    int i911111113 = ~((i911111111 & i511111117) | ((~i911111111) & iIntValue) | i911111112);
                                    int i911111114 = i911111110 & i911111113;
                                    int i911111115 = (i911111110 | i911111113) & (~i911111114);
                                    int i911111116 = -(-(((i911111115 & i911111114) | (i911111115 ^ i911111114)) * (-84)));
                                    int i911111117 = i811111114 & i911111116;
                                    int i911111118 = -(-((i911111116 ^ i811111114) | i911111117));
                                    int i911111119 = (i911111117 & i911111118) + (i911111118 | i911111117);
                                    int i1011111110 = i911111111 ^ iIntValue;
                                    int i1011111111 = ~((i1011111110 & i911111112) | (i1011111110 ^ i911111112));
                                    int i1011111112 = ~((iIntValue & (-2)) | (i511111117 & 1) | i711111117);
                                    int i1011111113 = ((~i1011111112) & i1011111111) | ((~i1011111111) & i1011111112);
                                    int i1011111114 = i1011111111 & i1011111112;
                                    int i1011111115 = ((i1011111114 & i1011111113) | (i1011111113 ^ i1011111114)) * 84;
                                    int i1011111116 = i911111119 & i1011111115;
                                    int i1011111117 = ((i911111119 ^ i1011111115) | i1011111116) << 1;
                                    int i1011111118 = -((i1011111115 | i911111119) & (~i1011111116));
                                    i10 = ((i1011111117 | i1011111118) << 1) - (i1011111118 ^ i1011111117);
                                    int i1011111119 = f52030f;
                                    int i11112 = (i1011111119 & 105) + (i1011111119 | 105);
                                    f52031g = i11112 % 128;
                                    int i11113 = i11112 % 2;
                                }
                            }
                        }
                        i10 = -1;
                    }
                } else {
                    setdividerpadding = setdividerpadding2;
                    i10 = -1;
                    iIntValue = -1;
                }
                if (i10 == -1) {
                    int i122 = f52031g;
                    int i123 = (-2) - (((i122 ^ 12) + ((i122 & 12) << 1)) ^ (-1));
                    f52030f = i123 % 128;
                    int i124 = i123 % 2;
                    setdividerpadding2 = setdividerpadding;
                    int i125 = setdividerpadding2.f52036e;
                    int iIdentityHashCode9 = System.identityHashCode(setdividerpadding2);
                    int i126 = i125 * (-215);
                    int i127 = 217 & i126;
                    int i128 = -(-((i126 ^ 217) | i127));
                    int i129 = (i127 & i128) + (i128 | i127);
                    int i130 = ~iIdentityHashCode9;
                    int i131 = i130 & 1;
                    int i132 = (iIdentityHashCode9 & (-2)) | i131;
                    int i133 = iIdentityHashCode9 & 1;
                    int i134 = (i133 & i132) | (i132 ^ i133);
                    int i135 = ~i134;
                    int i136 = ((i134 | i135) & i135) * 216;
                    int i137 = (((~i136) & i129) | ((~i129) & i136)) + ((i136 & i129) << 1);
                    int i138 = ~i125;
                    int i139 = (i138 & 1) | (i138 ^ 1);
                    int i140 = i139 & i130;
                    int i141 = (((i139 | i130) & (~i140)) | i140) * (-216);
                    int i142 = i137 & i141;
                    int i143 = -(-((i141 ^ i137) | i142));
                    int i144 = (i142 & i143) + (i143 | i142);
                    int i145 = i130 ^ 1;
                    int i146 = ~((i145 ^ i131) | (i145 & i131));
                    int i147 = i125 ^ i146;
                    int i148 = i125 & i146;
                    int i149 = ((i148 & i147) | (i147 ^ i148)) * 216;
                    int i150 = (i144 & i149) + (i149 | i144);
                    int length = setdividerpadding2.setCompoundDrawableTintBlendMode.length;
                    int i151 = f52030f + 43;
                    f52031g = i151 % 128;
                    int i152 = i151 % 2;
                    while (true) {
                        if (i150 < length) {
                            int i153 = f52030f;
                            int i154 = (i153 & (-90)) | ((~i153) & 89);
                            int i155 = -(-((i153 & 89) << 1));
                            int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
                            f52031g = i156 % 128;
                            int i157 = i156 % 2;
                            int i158 = i150 + 1;
                            aab aabVar2 = setdividerpadding2.setCompoundDrawableTintBlendMode[i150];
                            Intrinsics.checkNotNull(aabVar2);
                            if (Intrinsics.areEqual(aabVar2.setCompoundDrawableTintBlendMode, navBarTitleString)) {
                                int i159 = f52031g;
                                int i160 = ((i159 | 82) << 1) - (i159 ^ 82);
                                int i161 = (i160 ^ (-1)) + (i160 << 1);
                                f52030f = i161 % 128;
                                int i162 = i161 % 2;
                                aab aabVar3 = setdividerpadding2.setCompoundDrawableTintBlendMode[i150];
                                Intrinsics.checkNotNull(aabVar3);
                                if (!(!Intrinsics.areEqual(aabVar3.setY, abwVar))) {
                                    int i163 = f52031g;
                                    int i164 = ((i163 & (-76)) | ((~i163) & 75)) + ((i163 & 75) << 1);
                                    f52030f = i164 % 128;
                                    int i165 = i164 % 2;
                                    int i166 = -setdividerpadding2.f52036e;
                                    int i167 = i150 ^ i166;
                                    int i168 = (((i166 & i150) | i167) << 1) - i167;
                                    aaf aafVar2 = aaf.INSTANCE;
                                    int length2 = ((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis())).length;
                                    int iIdentityHashCode10 = System.identityHashCode(setdividerpadding2);
                                    int i169 = length2 * (-949);
                                    int i170 = -(-(i168 * (-949)));
                                    int i171 = i169 & i170;
                                    int i172 = (((i169 ^ i170) | i171) << 1) - ((i169 | i170) & (~i171));
                                    int i173 = ~i168;
                                    int i174 = ~iIdentityHashCode10;
                                    int i175 = ~((i173 ^ i174) | (i173 & i174));
                                    int i176 = ~length2;
                                    int i177 = i176 ^ iIdentityHashCode10;
                                    int i178 = i176 & iIdentityHashCode10;
                                    int i179 = (i177 ^ i178) | (i177 & i178);
                                    int i180 = ~i179;
                                    int i181 = i180 & (i179 | i180);
                                    int i182 = i175 & i181;
                                    int i183 = (i175 | i181) & (~i182);
                                    int i184 = -(-(((i183 & i182) | (i183 ^ i182)) * ReturnCode.ERR_REPOSITORY));
                                    int i185 = ((~i184) & i172) | ((~i172) & i184);
                                    int i186 = -(-((i172 & i184) << 1));
                                    int i187 = ((i185 | i186) << 1) - (i186 ^ i185);
                                    int i188 = (i174 ^ length2) | (i174 & length2);
                                    int i189 = ~i188;
                                    int i190 = (i188 | i189) & i189;
                                    int i191 = (i168 & i174) | (iIdentityHashCode10 & i173);
                                    int i192 = i168 & iIdentityHashCode10;
                                    int i193 = ~((i191 & i192) | (i191 ^ i192));
                                    int i194 = i187 - (~(((i190 & i193) | (i190 ^ i193)) * (-950)));
                                    int i195 = (i194 ^ (-1)) + (i194 << 1);
                                    int i196 = i174 & (i174 | iIdentityHashCode10);
                                    int i197 = (i173 & i196) | ((~i196) & i168);
                                    int i198 = i168 & i196;
                                    int i199 = ~((i198 & i197) | (i197 ^ i198));
                                    int i200 = length2 & iIdentityHashCode10;
                                    int i201 = (length2 | iIdentityHashCode10) & (~i200);
                                    int i202 = (i201 & i200) | (i201 ^ i200);
                                    int i203 = ~i202;
                                    int i204 = (i202 | i203) & i203;
                                    int i205 = i199 & i204;
                                    int i206 = (i199 | i204) & (~i205);
                                    int i207 = -(-(((i206 & i205) | (i206 ^ i205)) * 950));
                                    int i208 = i195 & i207;
                                    i10 = (((i207 | i195) & (~i208)) - (~(-(-(i208 << 1))))) - 1;
                                    int i209 = f52030f;
                                    int i210 = (i209 ^ 5) + ((i209 & 5) << 1);
                                    f52031g = i210 % 128;
                                    int i211 = i210 % 2;
                                    break;
                                }
                                if (iIntValue == -1) {
                                    int i212 = f52031g;
                                    int i213 = i212 & 77;
                                    int i214 = -(-((i212 ^ 77) | i213));
                                    int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                                    f52030f = i215 % 128;
                                    int i216 = i215 % 2;
                                    int i217 = -setdividerpadding2.f52036e;
                                    int iIdentityHashCode11 = System.identityHashCode(setdividerpadding2);
                                    int i218 = i217 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                                    int i219 = -(-(i150 * (-520)));
                                    int i220 = i218 & i219;
                                    int i221 = ((i218 ^ i219) | i220) << 1;
                                    int i222 = -((i218 | i219) & (~i220));
                                    int i223 = (i221 & i222) + (i222 | i221);
                                    int i224 = ~iIdentityHashCode11;
                                    int i225 = (i224 | iIdentityHashCode11) & i224;
                                    int i226 = ~i150;
                                    int i227 = ~(((~i225) & i150) | (i225 & i226) | (i225 & i150));
                                    int i228 = i217 & i227;
                                    int i229 = (i227 | i217) & (~i228);
                                    int i230 = -(-(((i229 & i228) | (i229 ^ i228)) * (-1042)));
                                    int i231 = (i223 & i230) + (i230 | i223);
                                    int i232 = -(-((i150 | iIdentityHashCode11) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                                    int i233 = ((((i231 ^ i232) | (i231 & i232)) << 1) - (~(-((i232 & (~i231)) | ((~i232) & i231))))) - 1;
                                    int i234 = ~i217;
                                    int i235 = (i234 | i217) & i234;
                                    int i236 = i235 & i226;
                                    int i237 = (~i236) & (i235 | i226);
                                    int i238 = ~((i237 & i236) | (i237 ^ i236));
                                    int i239 = (i234 & iIdentityHashCode11) | (i234 ^ iIdentityHashCode11);
                                    int i240 = ~i239;
                                    int i241 = (i239 | i240) & i240;
                                    int i242 = ((~i241) & i238) | ((~i238) & i241);
                                    int i243 = i241 & i238;
                                    int i244 = (i243 & i242) | (i242 ^ i243);
                                    int i245 = i224 & i217;
                                    int i246 = (i217 | i224) & (~i245);
                                    int i247 = (i245 & i246) | (i246 ^ i245);
                                    int i248 = i247 & i150;
                                    int i249 = ((i247 | i150) & (~i248)) | i248;
                                    int i250 = ~i249;
                                    int i251 = (i249 | i250) & i250;
                                    int i252 = -(-(((i244 & i251) | (i244 ^ i251)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                                    int i253 = ((i233 ^ i252) | (i233 & i252)) << 1;
                                    int i254 = -((i252 & (~i233)) | ((~i252) & i233));
                                    int i255 = (i253 ^ i254) + ((i254 & i253) << 1);
                                    aaf aafVar3 = aaf.INSTANCE;
                                    int length3 = ((aab[]) aaf.setY(new Object[0], -1294994487, 1294994488, (int) System.currentTimeMillis())).length;
                                    int iIdentityHashCode12 = System.identityHashCode(setdividerpadding2);
                                    int i256 = length3 * 319;
                                    int i257 = -(-(i255 * (-317)));
                                    int i258 = i256 & i257;
                                    int i259 = (((i256 | i257) & (~i258)) - (~(i258 << 1))) - 1;
                                    int i260 = ~i255;
                                    int i261 = ~length3;
                                    int i262 = i261 & (i261 | length3);
                                    int i263 = ~iIdentityHashCode12;
                                    int i264 = ~((i262 & iIdentityHashCode12) | (i262 & i263) | ((~i262) & iIdentityHashCode12));
                                    int i265 = ((i264 & i260) | (i260 ^ i264)) * (-318);
                                    int i266 = i259 ^ i265;
                                    int i267 = -(-((i259 & i265) << 1));
                                    int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
                                    int i269 = (i260 | i255) & i260;
                                    int i270 = i269 ^ iIdentityHashCode12;
                                    int i271 = i269 & iIdentityHashCode12;
                                    int i272 = ~((i271 & i270) | (i270 ^ i271));
                                    int i273 = (i263 ^ length3) | (i263 & length3);
                                    int i274 = i273 & i255;
                                    int i275 = ~(((i273 | i255) & (~i274)) | i274);
                                    int i276 = i272 & i275;
                                    int i277 = -(~((((i272 | i275) & (~i276)) | i276) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                    int i278 = (-2) - (((i268 ^ i277) + ((i277 & i268) << 1)) ^ (-1));
                                    int i279 = ((~i263) & i260) | ((~i260) & i263);
                                    int i280 = i260 & i263;
                                    int i281 = (i280 & i279) | (i279 ^ i280);
                                    int i282 = i281 & length3;
                                    int i283 = (i281 | length3) & (~i282);
                                    int i284 = ~((i283 & i282) | (i283 ^ i282));
                                    int i285 = (length3 & i255) | (length3 ^ i255);
                                    int i286 = i285 & iIdentityHashCode12;
                                    int i287 = (i285 | iIdentityHashCode12) & (~i286);
                                    int i288 = ~((i287 & i286) | (i287 ^ i286));
                                    int i289 = ((~i288) & i284) | ((~i284) & i288);
                                    int i290 = i288 & i284;
                                    int i291 = ((i290 & i289) | (i289 ^ i290)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                    int i292 = i278 & i291;
                                    int i293 = -(-(i291 | i278));
                                    iIntValue = (i292 & i293) + (i293 | i292);
                                    int i294 = f52031g + 5;
                                    f52030f = i294 % 128;
                                    int i295 = i294 % 2;
                                }
                            }
                            i150 = i158;
                            i10 = i10;
                            length = length;
                        }
                    }
                    if (i10 != -1) {
                        int i296 = f52031g;
                        int i297 = i296 & 3;
                        int i298 = (i296 ^ 3) | i297;
                        int i299 = ((i297 | i298) << 1) - (i298 ^ i297);
                        f52030f = i299 % 128;
                        int i300 = i299 % 2;
                        setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i10), 127, 128}, -1280719878, 1280719885, i10);
                        int i301 = f52030f;
                        int i302 = (i301 ^ 51) + ((i301 & 51) << 1);
                        f52031g = i302 % 128;
                        int i303 = i302 % 2;
                    } else if (iIntValue == -1) {
                        int i304 = f52030f + 79;
                        f52031g = i304 % 128;
                        int i305 = i304 % 2;
                        setDividerPadding(new Object[]{setdividerpadding2, navBarTitleString}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                        setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                        setDividerPadding(new Object[]{setdividerpadding2, aabVar}, 579617615, -579617609, System.identityHashCode(setdividerpadding2));
                        int i306 = f52031g;
                        int i307 = ((i306 | 21) << 1) - (i306 ^ 21);
                        f52030f = i307 % 128;
                        int i308 = i307 % 2;
                    } else {
                        if (((Boolean) abw.setX(new Object[]{navBarTitleString, aab.setY}, -262670654, 262670657, System.identityHashCode(navBarTitleString))).booleanValue()) {
                            int i309 = f52030f + 87;
                            f52031g = i309 % 128;
                            int i310 = i309 % 2;
                            if (!(!Intrinsics.areEqual(aab.setLayoutAnimation, navBarTitleString))) {
                                System.identityHashCode(setdividerpadding2);
                                System.identityHashCode(setdividerpadding2);
                                setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(iIntValue), 15, 0}, -1280719878, 1280719885, iIntValue);
                                setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                                int i311 = f52030f;
                                int i312 = i311 & 5;
                                int i313 = ((i311 ^ 5) | i312) << 1;
                                int i314 = -((i311 | 5) & (~i312));
                                int i315 = (i313 ^ i314) + ((i314 & i313) << 1);
                                f52031g = i315 % 128;
                                int i316 = i315 % 2;
                            }
                            i16 = i11;
                            i34 = i41;
                            size = size;
                            i17 = 1;
                            i20 = 2;
                            i22 = 83;
                            i23 = -2;
                            i21 = 8;
                        }
                        c10 = 4;
                        i11 = 0;
                        c11 = 3;
                        b10 = -1280719878;
                        setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(iIntValue), 63, 64}, -1280719878, 1280719885, iIntValue);
                        setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                        setDividerPadding(new Object[]{setdividerpadding2, aabVar}, 579617615, -579617609, System.identityHashCode(setdividerpadding2));
                        int i317 = f52031g + 111;
                        f52030f = i317 % 128;
                        int i318 = i317 % 2;
                        i16 = i11;
                        i34 = i41;
                        size = size;
                        i17 = 1;
                        i20 = 2;
                        i22 = 83;
                        i23 = -2;
                        i21 = 8;
                    }
                    c10 = 4;
                    i11 = 0;
                    c11 = 3;
                    b10 = -1280719878;
                    i16 = i11;
                    i34 = i41;
                    size = size;
                    i17 = 1;
                    i20 = 2;
                    i22 = 83;
                    i23 = -2;
                    i21 = 8;
                } else {
                    setdividerpadding2 = setdividerpadding;
                }
                if (i10 != -1) {
                    int i2910 = f52031g;
                    int i2911 = i2910 & 3;
                    int i2912 = (i2910 ^ 3) | i2911;
                    int i2913 = ((i2911 | i2912) << 1) - (i2912 ^ i2911);
                    f52030f = i2913 % 128;
                    int i3010 = i2913 % 2;
                    setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i10), 127, 128}, -1280719878, 1280719885, i10);
                    int i3011 = f52030f;
                    int i3012 = (i3011 ^ 51) + ((i3011 & 51) << 1);
                    f52031g = i3012 % 128;
                    int i3013 = i3012 % 2;
                } else if (iIntValue == -1) {
                    int i3014 = f52030f + 79;
                    f52031g = i3014 % 128;
                    int i3015 = i3014 % 2;
                    setDividerPadding(new Object[]{setdividerpadding2, navBarTitleString}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                    setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                    setDividerPadding(new Object[]{setdividerpadding2, aabVar}, 579617615, -579617609, System.identityHashCode(setdividerpadding2));
                    int i3016 = f52031g;
                    int i3017 = ((i3016 | 21) << 1) - (i3016 ^ 21);
                    f52030f = i3017 % 128;
                    int i3018 = i3017 % 2;
                } else {
                    if (((Boolean) abw.setX(new Object[]{navBarTitleString, aab.setY}, -262670654, 262670657, System.identityHashCode(navBarTitleString))).booleanValue()) {
                        int i3019 = f52030f + 87;
                        f52031g = i3019 % 128;
                        int i319 = i3019 % 2;
                        if (!(!Intrinsics.areEqual(aab.setLayoutAnimation, navBarTitleString))) {
                            System.identityHashCode(setdividerpadding2);
                            System.identityHashCode(setdividerpadding2);
                            setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(iIntValue), 15, 0}, -1280719878, 1280719885, iIntValue);
                            setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                            int i3110 = f52030f;
                            int i3111 = i3110 & 5;
                            int i3112 = ((i3110 ^ 5) | i3111) << 1;
                            int i3113 = -((i3110 | 5) & (~i3111));
                            int i3114 = (i3112 ^ i3113) + ((i3113 & i3112) << 1);
                            f52031g = i3114 % 128;
                            int i3115 = i3114 % 2;
                        }
                        i16 = i11;
                        i34 = i41;
                        size = size;
                        i17 = 1;
                        i20 = 2;
                        i22 = 83;
                        i23 = -2;
                        i21 = 8;
                    }
                    c10 = 4;
                    i11 = 0;
                    c11 = 3;
                    b10 = -1280719878;
                    setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(iIntValue), 63, 64}, -1280719878, 1280719885, iIntValue);
                    setDividerPadding(new Object[]{setdividerpadding2, abwVar}, -491565622, 491565624, System.identityHashCode(setdividerpadding2));
                    setDividerPadding(new Object[]{setdividerpadding2, aabVar}, 579617615, -579617609, System.identityHashCode(setdividerpadding2));
                    int i3116 = f52031g + 111;
                    f52030f = i3116 % 128;
                    int i3117 = i3116 % 2;
                    i16 = i11;
                    i34 = i41;
                    size = size;
                    i17 = 1;
                    i20 = 2;
                    i22 = 83;
                    i23 = -2;
                    i21 = 8;
                }
                c10 = 4;
                i11 = 0;
                c11 = 3;
                b10 = -1280719878;
                i16 = i11;
                i34 = i41;
                size = size;
                i17 = 1;
                i20 = 2;
                i22 = 83;
                i23 = -2;
                i21 = 8;
            }
            int i320 = f52031g + 94;
            int i321 = (i320 ^ (-1)) + (i320 << 1);
            f52030f = i321 % 128;
            int i322 = i321 % 2;
        }

        public static /* synthetic */ Integer b(Object[] objArr) {
            int i10;
            int i11 = 0;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i12 = 1;
            int iIntValue = ((Number) objArr[1]).intValue();
            int i13 = f52031g;
            int i14 = (i13 & (-52)) | ((~i13) & 51);
            int i15 = -(-((i13 & 51) << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f52030f = i16 % 128;
            int i17 = i16 % 2;
            if (iIntValue > 0) {
                int i18 = ((i13 | 119) << 1) - (i13 ^ 119);
                int i19 = i18 % 128;
                f52030f = i19;
                int i20 = i18 % 2;
                int length = setdividerpadding.setCompoundDrawableTintBlendMode.length;
                int i21 = length ^ (-1);
                int i22 = ((length | i21) << 1) - i21;
                int i23 = (i19 ^ 41) + ((i19 & 41) << 1);
                f52031g = i23 % 128;
                int i24 = i23 % 2;
                int i25 = iIntValue;
                while (true) {
                    i10 = setdividerpadding.f52036e;
                    if (i22 < i10) {
                        break;
                    }
                    int i26 = f52030f;
                    int i27 = i26 & 125;
                    int i28 = (i26 ^ 125) | i27;
                    int i29 = (i27 ^ i28) + ((i28 & i27) << i12);
                    f52031g = i29 % 128;
                    if (i29 % 2 == 0) {
                        throw null;
                    }
                    if (i25 <= 0) {
                        break;
                    }
                    aab aabVar = setdividerpadding.setCompoundDrawableTintBlendMode[i22];
                    Intrinsics.checkNotNull(aabVar);
                    i25 -= aabVar.setDividerPadding;
                    int i30 = setdividerpadding.setOnFocusChangeListener;
                    aab aabVar2 = setdividerpadding.setCompoundDrawableTintBlendMode[i22];
                    Intrinsics.checkNotNull(aabVar2);
                    int i31 = -aabVar2.setDividerPadding;
                    int i32 = i31 * (-375);
                    int i33 = -(-(i30 * (-375)));
                    int i34 = ((~i33) & i32) | ((~i32) & i33);
                    int i35 = (i32 & i33) << i12;
                    int i36 = ((i34 | i35) << i12) - (i35 ^ i34);
                    int i37 = ~i31;
                    int i38 = ~i30;
                    int i39 = ~((i37 ^ i38) | (i37 & i38));
                    int i40 = (~i39) & iIntValue;
                    int i41 = ~iIntValue;
                    int i42 = i40 | (i39 & i41);
                    int i43 = i39 & iIntValue;
                    int i44 = (i43 & i42) | (i42 ^ i43);
                    int i45 = i31 & i30;
                    int i46 = ~((i31 ^ i30) | i45);
                    int i47 = ((~i44) & i46) | ((~i46) & i44);
                    int i48 = i44 & i46;
                    int i49 = (i36 - (~(-(~(-(-(((i47 & i48) | (i47 ^ i48)) * 376))))))) - 2;
                    int i50 = (i41 | iIntValue) & i41;
                    int i51 = (i50 & i37) | ((~i50) & i31);
                    int i52 = i50 & i31;
                    int i53 = (i51 & i52) | (i51 ^ i52);
                    int i54 = ~i53;
                    int i55 = (i53 | i54) & i54;
                    int i56 = (i31 & i38) | (i30 & i37);
                    int i57 = -(-((i55 | (~((i56 & i45) | (i56 ^ i45)))) * (-376)));
                    int i58 = ((~i57) & i49) | ((~i49) & i57);
                    int i59 = (i57 & i49) << 1;
                    int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                    int i61 = (i37 | i31) & i37;
                    int i62 = i61 ^ iIntValue;
                    int i63 = i61 & iIntValue;
                    int i64 = ~((i63 & i62) | (i62 ^ i63));
                    int i65 = ((~i64) & i30) | (i64 & i38);
                    int i66 = i30 & i64;
                    setdividerpadding.setOnFocusChangeListener = (i60 - (~(-(-(((i66 & i65) | (i65 ^ i66)) * 376))))) - 1;
                    int i67 = setdividerpadding.setY;
                    int i68 = (-882) - (~(i67 * 881));
                    int i69 = ~i67;
                    int i70 = ~((i69 | i67) & i69);
                    int i71 = i70 & i41;
                    int i72 = ((i70 | i41) & (~i71)) | i71;
                    int i73 = (i69 & i41) | ((~i69) & iIntValue);
                    int i74 = i69 & iIntValue;
                    int i75 = ~((i74 & i73) | (i73 ^ i74));
                    int i76 = -(-(((i75 & i72) | (i72 ^ i75)) * (-880)));
                    int i77 = (i68 & i76) + (i68 | i76);
                    int i78 = ~i50;
                    int i79 = i67 ^ i78;
                    int i80 = i78 & i67;
                    int i81 = (i80 & i79) | (i79 ^ i80);
                    int i82 = ~((i41 ^ iIntValue) | (i41 & iIntValue));
                    int i83 = i81 ^ i82;
                    int i84 = i81 & i82;
                    int i85 = ((i84 & i83) | (i83 ^ i84)) * (-880);
                    int i86 = i77 & i85;
                    int i87 = i86 + ((i85 ^ i77) | i86);
                    int i88 = -(-(i82 * 880));
                    int i89 = i87 ^ i88;
                    setdividerpadding.setY = ((((i88 & i87) | i89) << 1) - (~(-i89))) - 1;
                    int i90 = i11 * Opcodes.INSTANCEOF;
                    int i91 = 193 & i90;
                    int i92 = (i90 | Opcodes.INSTANCEOF) & (~i91);
                    int i93 = i91 << 1;
                    int i94 = (i92 & i93) + (i92 | i93);
                    int i95 = ~(((-2) ^ i11) | ((-2) & i11));
                    int i96 = i41 & i95;
                    int i97 = (i95 | i41) & (~i96);
                    int i98 = (i94 - (~(((i97 & i96) | (i97 ^ i96)) * (-192)))) - 1;
                    int i99 = ~i11;
                    int i100 = ((~i99) & (-2)) | (i99 & 1);
                    int i101 = (-2) & i99;
                    int i102 = ~((i100 & i101) | (i100 ^ i101));
                    int i103 = (i99 | i11) & i99;
                    int i104 = ~((i103 & i41) | (i103 ^ i41));
                    int i105 = -(-(((i102 & i104) | (i102 ^ i104)) * (-384)));
                    int i106 = ((i98 ^ i105) - (~((i105 & i98) << 1))) - 1;
                    int i107 = ((~i101) & ((-2) | i99)) | i101;
                    int i108 = (i107 & i41) | ((~i107) & iIntValue);
                    int i109 = i107 & iIntValue;
                    int i110 = (i109 & i108) | (i108 ^ i109);
                    int i111 = ~i110;
                    int i112 = (i110 | i111) & i111;
                    int i113 = i99 ^ i41;
                    int i114 = i99 & i41;
                    int i115 = (i114 & i113) | (i113 ^ i114);
                    int i116 = (i115 & (-2)) | ((~i115) & 1);
                    int i117 = i115 & 1;
                    int i118 = (i117 & i116) | (i116 ^ i117);
                    int i119 = ~i118;
                    int i120 = (i118 | i119) & i119;
                    int i121 = ((~i120) & i112) | ((~i112) & i120);
                    int i122 = i120 & i112;
                    int i123 = (i122 & i121) | (i121 ^ i122);
                    int i124 = i11 & 1;
                    int i125 = (i11 | 1) & (~i124);
                    int i126 = (i125 & i124) | (i125 ^ i124);
                    int i127 = ~((i126 & iIntValue) | (i126 & i41) | ((~i126) & iIntValue));
                    int i128 = i123 & i127;
                    int i129 = (i127 | i123) & (~i128);
                    int i130 = ((i129 & i128) | (i129 ^ i128)) * 192;
                    int i131 = i106 & i130;
                    int i132 = (i130 ^ i106) | i131;
                    i11 = (i132 | i131) + (i131 & i132);
                    int i133 = -(i22 ^ (-1));
                    int i134 = f52030f;
                    int i135 = i134 ^ 95;
                    int i136 = (((i134 & 95) | i135) << 1) - i135;
                    f52031g = i136 % 128;
                    int i137 = i136 % 2;
                    i22 = ((i133 & (-2)) << 1) + ((-2) ^ i133);
                    i12 = 1;
                }
                aab[] aabVarArr = setdividerpadding.setCompoundDrawableTintBlendMode;
                int i138 = -(-(i10 * (-1187)));
                int i139 = 595 & i138;
                int i140 = ((i138 | 595) & (~i139)) + (i139 << 1);
                int i141 = (-2) ^ i10;
                int i142 = ~i10;
                int i143 = (-2) & i10;
                int i144 = ~((i141 ^ i143) | (i141 & i143));
                int i145 = ~iIntValue;
                int i146 = (i145 | iIntValue) & i145;
                int i147 = i146 & i10;
                int i148 = (~i147) & (i146 | i10);
                int i149 = (i147 & i148) | (i148 ^ i147);
                int i150 = ~i149;
                int i151 = (i149 | i150) & i150;
                int i152 = i144 & i151;
                int i153 = (i144 | i151) & (~i152);
                int i154 = -(-(((i153 & i152) | (i153 ^ i152)) * (-1188)));
                int i155 = (i140 ^ i154) + ((i140 & i154) << 1);
                int i156 = (i10 & 1) | ((-2) & i142);
                int i157 = ~((i156 & i143) | (i156 ^ i143));
                int i158 = i142 & iIntValue;
                int i159 = (~i158) & (i142 | iIntValue);
                int i160 = ~((i159 & i158) | (i159 ^ i158));
                int i161 = (i157 & i160) | ((~i160) & i157) | ((~i157) & i160);
                int i162 = i145 & 1;
                int i163 = (~i162) & (i145 | 1);
                int i164 = ~((i163 & i162) | (i163 ^ i162));
                int i165 = i161 & i164;
                int i166 = (((i161 | i164) & (~i165)) | i165) * 594;
                int i167 = ((((~i166) & i155) | ((~i155) & i166)) - (~((i166 & i155) << 1))) - 1;
                int i168 = (i142 | i10) & i142;
                int i169 = ~((i168 ^ i145) | (i168 & i145));
                int i170 = i168 & 1;
                int i171 = ~(((i168 | 1) & (~i170)) | i170);
                int i172 = ((~i171) & i169) | ((~i169) & i171);
                int i173 = i171 & i169;
                int i174 = (i173 & i172) | (i172 ^ i173);
                int i175 = (i145 ^ 1) | i162;
                int i176 = ~i175;
                int i177 = (i175 | i176) & i176;
                int i178 = -(-(((i174 & i177) | (i174 ^ i177)) * 594));
                int i179 = i167 & i178;
                int i180 = (((i167 ^ i178) | i179) << 1) - ((i178 | i167) & (~i179));
                int i181 = -(-(i10 * 628));
                int i182 = 628 & i181;
                int i183 = (((i181 | 628) & (~i182)) - (~(-(-(i182 << 1))))) - 1;
                int i184 = i10 & i145;
                int i185 = i184 | i158;
                int i186 = i10 & iIntValue;
                int i187 = (i185 & i186) | (i185 ^ i186);
                int i188 = ((i187 & (-2)) | (i187 ^ (-2))) * (-627);
                int i189 = i183 | i188;
                int i190 = (i189 << 1) - ((~(i183 & i188)) & i189);
                int i191 = (i142 ^ iIntValue) | i158;
                int i192 = ~i191;
                int i193 = (i191 | i192) & i192;
                int i194 = i193 ^ 1;
                int i195 = i193 & 1;
                int i196 = ((i195 & i194) | (i194 ^ i195)) * (-627);
                int i197 = i190 & i196;
                int i198 = ((i196 | i190) & (~i197)) + (i197 << 1);
                int i199 = i145 & i142;
                int i200 = ~i145;
                int i201 = i199 | (i10 & i200);
                int i202 = (i201 & i184) | (i201 ^ i184);
                int i203 = ~i202;
                int i204 = (i202 | i203) & i203;
                int i205 = (iIntValue ^ 1) | (iIntValue & 1);
                int i206 = ~i205;
                int i207 = (i205 | i206) & i206;
                int i208 = i204 ^ i207;
                int i209 = i204 & i207;
                int i210 = (i198 - (~(-(-(((i209 & i208) | (i208 ^ i209)) * 627))))) - 1;
                System.arraycopy(aabVarArr, i180, aabVarArr, (((i210 | i11) << 1) - (~(-(i210 ^ i11)))) - 1, setdividerpadding.setY);
                aab[] aabVarArr2 = setdividerpadding.setCompoundDrawableTintBlendMode;
                int i211 = setdividerpadding.f52036e;
                int i212 = -(-(i211 * 471));
                int i213 = (((~i212) & 471) | (i212 & (-472))) + ((i212 & 471) << 1);
                int i214 = i211 & 1;
                int i215 = (~i214) & (i211 | 1);
                int i216 = ~i211;
                int i217 = (i215 | i214) * (-470);
                int i218 = ((i213 ^ i217) - (~((i213 & i217) << 1))) - 1;
                int i219 = (-2) & i216;
                int i220 = (~i219) & ((-2) | i216);
                int i221 = (i220 & i219) | (i220 ^ i219);
                int i222 = ~i221;
                int i223 = (i221 | i222) & i222;
                int i224 = i216 ^ iIntValue;
                int i225 = i216 & iIntValue;
                int i226 = (i224 & i225) | (i224 ^ i225);
                int i227 = ~i226;
                int i228 = (i226 | i227) & i227;
                int i229 = i223 & i228;
                int i230 = (i223 | i228) & (~i229);
                int i231 = (i230 & i229) | (i230 ^ i229);
                int i232 = i146 & 1;
                int i233 = (i146 | 1) & (~i232);
                int i234 = ~((i232 & i233) | (i233 ^ i232) | i211);
                int i235 = i231 & i234;
                int i236 = (i231 | i234) & (~i235);
                int i237 = ((i236 & i235) | (i236 ^ i235)) * (-470);
                int i238 = (((i218 ^ i237) | (i218 & i237)) << 1) - ((i237 & (~i218)) | ((~i237) & i218));
                int i239 = i216 & 1;
                int i240 = i239 | ((i216 | 1) & (~i239));
                int i241 = ~((iIntValue & i240) | (i240 ^ iIntValue));
                int i242 = ((-2) & i145) | (i200 & 1);
                int i243 = (i242 & i162) | (i242 ^ i162);
                int i244 = i243 & i211;
                int i245 = (i243 | i211) & (~i244);
                int i246 = ~((i245 & i244) | (i245 ^ i244));
                int i247 = i241 ^ i246;
                int i248 = i241 & i246;
                int i249 = -(-(((i248 & i247) | (i247 ^ i248)) * 470));
                int i250 = i238 & i249;
                int i251 = ((((i238 ^ i249) | i250) << 1) - (~(-((i249 | i238) & (~i250))))) - 1;
                int i252 = i214 + ((i211 ^ 1) | i214);
                int i253 = (i252 | i11) << 1;
                int i254 = ~i11;
                int i255 = -(((~i252) & i11) | (i252 & i254));
                Arrays.fill(aabVarArr2, i251, (i253 & i255) + (i253 | i255), (Object) null);
                int i256 = setdividerpadding.f52036e - i254;
                setdividerpadding.f52036e = (i256 ^ (-1)) + (i256 << 1);
                int i257 = f52030f;
                int i258 = (i257 & 71) + (i257 | 71);
                f52031g = i258 % 128;
                int i259 = i258 % 2;
            }
            int i260 = f52030f + 115;
            f52031g = i260 % 128;
            int i261 = i260 % 2;
            return Integer.valueOf(i11);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            Object obj;
            int i13;
            int i14;
            int i15 = ~i10;
            int i16 = ~i12;
            int i17 = ~(i15 | i16);
            int i18 = ~i11;
            int i19 = i15 | i18;
            switch ((((~(i10 | i18 | i12)) | (~(i11 | i15 | i12)) | (~(i19 | i16))) * 867) + (((~i19) | (~(i15 | i12)) | (~(i18 | i12))) * (-1734)) + ((i17 | (~(i18 | i16))) * (-867)) + (i11 * 868) + (i10 * 868)) {
                case 1:
                    return b(objArr);
                case 2:
                    setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                    abw abwVar = (abw) objArr[1];
                    int i20 = f52030f;
                    int i21 = i20 & 121;
                    int i22 = -(-((i20 ^ 121) | i21));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    f52031g = i23 % 128;
                    int i24 = i23 % 2;
                    Intrinsics.checkNotNullParameter(abwVar, "");
                    boolean z10 = !setdividerpadding.f52032a;
                    abx abxVar = setdividerpadding.f52033b;
                    if (!z10) {
                        int i25 = f52031g;
                        int i26 = i25 ^ 25;
                        int i27 = (((i25 & 25) | i26) << 1) - i26;
                        f52030f = i27 % 128;
                        int i28 = i27 % 2;
                        aal aalVar = aal.INSTANCE;
                        if (((Integer) aal.setOnFocusChangeListener(new Object[]{abwVar}, -833573679, 833573680, (int) System.currentTimeMillis())).intValue() < ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue()) {
                            abx abxVar2 = new abx();
                            aal.setOnFocusChangeListener(new Object[]{abwVar, abxVar2}, -1266562958, 1266562958, (int) System.currentTimeMillis());
                            abw abwVar2 = (abw) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -2117584587, 2117584601, System.identityHashCode(abxVar2));
                            int iIntValue = ((Integer) abw.setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue();
                            setDividerPadding(new Object[]{setdividerpadding, Integer.valueOf(iIntValue), 127, 128}, -1280719878, 1280719885, iIntValue);
                            abxVar.setY(abwVar2);
                            int i29 = f52031g;
                            int i30 = (i29 & (-40)) | ((~i29) & 39);
                            int i31 = (i29 & 39) << 1;
                            int i32 = (i30 & i31) + (i31 | i30);
                            f52030f = i32 % 128;
                            if (i32 % 2 != 0) {
                                throw null;
                            }
                            obj = null;
                        } else {
                            obj = null;
                            i13 = 1;
                        }
                        return obj;
                    }
                    obj = null;
                    i13 = 1;
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = abwVar;
                    int iIntValue2 = ((Integer) abw.setX(objArr2, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = setdividerpadding;
                    objArr3[i13] = Integer.valueOf(iIntValue2);
                    objArr3[2] = 127;
                    objArr3[3] = 0;
                    setDividerPadding(objArr3, -1280719878, 1280719885, iIntValue2);
                    abxVar.setY(abwVar);
                    int i33 = f52031g + 39;
                    f52030f = i33 % 128;
                    int i34 = i33 % 2;
                    return obj;
                case 3:
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    int iIntValue3 = ((Number) objArr[1]).intValue();
                    int i35 = (-2) - ((f52030f + 120) ^ (-1));
                    f52031g = i35 % 128;
                    int i36 = i35 % 2;
                    setdividerpadding2.setX = iIntValue3;
                    int iMin = Math.min(iIntValue3, 16384);
                    int i37 = setdividerpadding2.setOnDragListener;
                    if (i37 == iMin) {
                        int i38 = f52030f;
                        int i39 = i38 & 13;
                        i14 = i39 + ((i38 ^ 13) | i39);
                    } else {
                        if (iMin < i37) {
                            int i40 = f52030f;
                            int i41 = (i40 & 19) + (i40 | 19);
                            f52031g = i41 % 128;
                            if (i41 % 2 == 0) {
                                setdividerpadding2.f52034c = Math.min(setdividerpadding2.f52034c, iMin);
                                throw null;
                            }
                            setdividerpadding2.f52034c = Math.min(setdividerpadding2.f52034c, iMin);
                        }
                        setdividerpadding2.f52035d = true;
                        setdividerpadding2.setOnDragListener = iMin;
                        setDividerPadding(new Object[]{setdividerpadding2}, -888475807, 888475811, System.identityHashCode(setdividerpadding2));
                        int i42 = f52030f;
                        int i43 = i42 & 83;
                        i14 = ((((i42 ^ 83) | i43) << 1) - (~(-((i42 | 83) & (~i43))))) - 1;
                    }
                    f52031g = i14 % 128;
                    int i44 = i14 % 2;
                    return null;
                case 4:
                    setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                    int i45 = f52030f;
                    int i46 = (((i45 | 102) << 1) - (i45 ^ 102)) - 1;
                    f52031g = i46 % 128;
                    int i47 = i46 % 2;
                    int i48 = setdividerpadding3.setOnDragListener;
                    int i49 = setdividerpadding3.setOnFocusChangeListener;
                    if (i48 < i49) {
                        int i50 = i45 & 43;
                        int i51 = (((~i50) & (i45 | 43)) - (~(-(-(i50 << 1))))) - 1;
                        f52031g = i51 % 128;
                        if (i51 % 2 == 0) {
                            throw null;
                        }
                        if (i48 == 0) {
                            int i52 = -(-((i45 ^ 43) | i50));
                            int i53 = ((i50 | i52) << 1) - (i52 ^ i50);
                            f52031g = i53 % 128;
                            if (i53 % 2 == 0) {
                                setDividerPadding(new Object[]{setdividerpadding3}, 189437841, -189437841, System.identityHashCode(setdividerpadding3));
                                throw null;
                            }
                            setDividerPadding(new Object[]{setdividerpadding3}, 189437841, -189437841, System.identityHashCode(setdividerpadding3));
                            int i54 = f52030f;
                            int i55 = i54 & 119;
                            int i56 = (i54 | 119) & (~i55);
                            int i57 = -(-(i55 << 1));
                            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                            f52031g = i58 % 128;
                            int i59 = i58 % 2;
                        } else {
                            int i60 = -i48;
                            int iIdentityHashCode = System.identityHashCode(setdividerpadding3);
                            int i61 = i60 * 236;
                            int i62 = -(-(i49 * 471));
                            int i63 = ((~i62) & i61) | ((~i61) & i62);
                            int i64 = -(-((i61 & i62) << 1));
                            int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                            int i66 = ~i60;
                            int i67 = ~iIdentityHashCode;
                            int i68 = i66 & i67;
                            int i69 = (i67 | i66) & (~i68);
                            int i70 = ~((i69 & i68) | (i69 ^ i68));
                            int i71 = i49 & i70;
                            int i72 = (i65 - (~(-(~(-(-((((i70 | i49) & (~i71)) | i71) * (-235)))))))) - 2;
                            int i73 = ((~i66) & iIdentityHashCode) | i68;
                            int i74 = i66 & iIdentityHashCode;
                            int i75 = ~((i73 & i74) | (i73 ^ i74));
                            int i76 = i49 & i75;
                            int i77 = (i75 | i49) & (~i76);
                            int i78 = -(-(((i77 & i76) | (i77 ^ i76)) * (-470)));
                            int i79 = i72 & i78;
                            int i80 = ((i72 ^ i78) | i79) << 1;
                            int i81 = -((i78 | i72) & (~i79));
                            int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                            int i83 = ~i49;
                            int i84 = (i60 & i83) | (i83 ^ i60);
                            int i85 = ~i84;
                            int i86 = (i84 | i85) & i85;
                            int i87 = i66 ^ i49;
                            int i88 = i66 & i49;
                            int i89 = (i88 & i87) | (i87 ^ i88);
                            int i90 = i89 ^ iIdentityHashCode;
                            int i91 = iIdentityHashCode & i89;
                            int i92 = ~((i91 & i90) | (i90 ^ i91));
                            int i93 = -(~(((i86 & i92) | (i86 ^ i92)) * 235));
                            int i94 = (((i82 | i93) << 1) - (i93 ^ i82)) - 1;
                            ((Integer) setDividerPadding(new Object[]{setdividerpadding3, Integer.valueOf(i94)}, -430486438, 430486439, i94)).intValue();
                            System.identityHashCode(setdividerpadding3);
                            System.identityHashCode(setdividerpadding3);
                            int i95 = f52030f + 14;
                            int i96 = (i95 ^ (-1)) + (i95 << 1);
                            f52031g = i96 % 128;
                            int i97 = i96 % 2;
                        }
                    } else {
                        int i98 = f52030f + 14;
                        int i99 = (i98 ^ (-1)) + (i98 << 1);
                        f52031g = i99 % 128;
                        int i910 = i99 % 2;
                    }
                    return null;
                case 5:
                    a(objArr);
                    return null;
                case 6:
                    setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
                    aab aabVar = (aab) objArr[1];
                    int i100 = f52030f;
                    int i101 = i100 & 19;
                    int i102 = ((i100 ^ 19) | i101) << 1;
                    int i103 = -((i100 | 19) & (~i101));
                    int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                    int i105 = i104 % 128;
                    f52031g = i105;
                    int i106 = i104 % 2;
                    int i107 = aabVar.setDividerPadding;
                    if (i107 > setdividerpadding4.setOnDragListener) {
                        int i108 = i105 ^ 95;
                        int i109 = -(-((i105 & 95) << 1));
                        int i110 = (i108 & i109) + (i108 | i109);
                        f52030f = i110 % 128;
                        if (i110 % 2 != 0) {
                            setDividerPadding(new Object[]{setdividerpadding4}, 189437841, -189437841, System.identityHashCode(setdividerpadding4));
                            int i111 = 66 / 0;
                        } else {
                            setDividerPadding(new Object[]{setdividerpadding4}, 189437841, -189437841, System.identityHashCode(setdividerpadding4));
                        }
                        int i112 = f52030f + 105;
                        f52031g = i112 % 128;
                        int i113 = i112 % 2;
                    } else {
                        int i114 = setdividerpadding4.setOnFocusChangeListener;
                        int iIdentityHashCode2 = System.identityHashCode(setdividerpadding4);
                        int i115 = i107 * (-1529);
                        int i116 = -(-(i114 * (-764)));
                        int i117 = i115 & i116;
                        int i118 = (i115 ^ i116) | i117;
                        int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                        int i120 = ~i107;
                        int i121 = ~i114;
                        int i122 = (i121 | i114) & i121;
                        int i123 = i120 ^ i122;
                        int i124 = i120 & i122;
                        int i125 = (i123 ^ i124) | (i123 & i124);
                        int i126 = ~iIdentityHashCode2;
                        int i127 = (i125 ^ i126) | (i125 & i126);
                        int i128 = ~i127;
                        int i129 = i128 & (i127 | i128);
                        int i130 = ~i120;
                        int i131 = i120 & i121;
                        int i132 = i131 | (i114 & i130);
                        int i133 = i114 & i120;
                        int i134 = (i132 ^ i133) | (i132 & i133);
                        int i135 = i134 ^ iIdentityHashCode2;
                        int i136 = i134 & iIdentityHashCode2;
                        int i137 = (i135 ^ i136) | (i135 & i136);
                        int i138 = ~i137;
                        int i139 = i138 & (i137 | i138);
                        int i140 = (i129 & i139) | (i129 ^ i139);
                        int i141 = (i122 ^ i107) | (i122 & i107);
                        int i142 = -(-((i140 | (~((i141 & iIdentityHashCode2) | (i141 ^ iIdentityHashCode2)))) * 765));
                        int i143 = i119 & i142;
                        int i144 = (i142 | i119) & (~i143);
                        int i145 = -(-(i143 << 1));
                        int i146 = (i144 & i145) + (i144 | i145);
                        int i147 = ((~i121) & i120) | (i121 & i130);
                        int i148 = ~((i147 & i131) | (i147 ^ i131));
                        int i149 = i120 & i126;
                        int i150 = (~i149) & (i120 | i126);
                        int i151 = ~((i149 & i150) | (i150 ^ i149));
                        int i152 = i148 ^ i151;
                        int i153 = i148 & i151;
                        int i154 = -(-(((i153 & i152) | (i152 ^ i153)) * 1530));
                        int i155 = i146 & i154;
                        int i156 = (i155 - (~((i154 ^ i146) | i155))) - 1;
                        int i157 = i120 & iIdentityHashCode2;
                        int i158 = (~i157) & (iIdentityHashCode2 | i120);
                        int i159 = ~((i157 & i158) | (i158 ^ i157));
                        int i160 = i121 & i126;
                        int i161 = (~i160) & (i126 | i121);
                        int i162 = (i160 & i161) | (i161 ^ i160);
                        int i163 = (i162 & i120) | ((~i162) & i107);
                        int i164 = i162 & i107;
                        int i165 = ~((i164 & i163) | (i163 ^ i164));
                        int i166 = ((i159 & i165) | (i159 ^ i165)) * 765;
                        int i167 = i156 ^ i166;
                        int i168 = ((((i166 & i156) | i167) << 1) - (~(-i167))) - 1;
                        int i169 = -setdividerpadding4.setOnDragListener;
                        int iIdentityHashCode3 = System.identityHashCode(setdividerpadding4);
                        int i170 = (i168 * 407) + (i169 * (-405));
                        int i171 = ~i168;
                        int i172 = ~iIdentityHashCode3;
                        int i173 = i171 & i172;
                        int i174 = ~(((~i171) & iIdentityHashCode3) | i173 | (i171 & iIdentityHashCode3));
                        int i175 = ~i169;
                        int i176 = i172 & i175;
                        int i177 = i176 | ((~i172) & i169);
                        int i178 = i172 & i169;
                        int i179 = (i177 ^ i178) | (i177 & i178);
                        int i180 = i179 & i168;
                        int i181 = (~i180) & (i179 | i168);
                        int i182 = ~((i181 & i180) | (i181 ^ i180));
                        int i183 = i174 & i182;
                        int i184 = (i182 | i174) & (~i183);
                        int i185 = ((i184 & i183) | (i184 ^ i183)) * (-406);
                        int i186 = ((~i185) & i170) | ((~i170) & i185);
                        int i187 = (i185 & i170) << 1;
                        int i188 = (i186 & i187) + (i187 | i186);
                        int i189 = i171 ^ i172;
                        int i190 = (i189 & i173) | (i189 ^ i173);
                        int i191 = i190 ^ i169;
                        int i192 = i169 & i190;
                        int i193 = (~((i192 & i191) | (i191 ^ i192))) * (-406);
                        int i194 = ((i188 | i193) << 1) - (i193 ^ i188);
                        int i195 = ~(i176 | ((~i175) & iIdentityHashCode3) | (iIdentityHashCode3 & i175));
                        int i196 = (i168 & i172) | (i172 ^ i168);
                        int i197 = ~i196;
                        int i198 = (i196 | i197) & i197;
                        int i199 = -(-(((i198 & i195) | (i195 ^ i198)) * 406));
                        int i200 = i194 & i199;
                        int i201 = -(-(i199 | i194));
                        int i202 = (i200 & i201) + (i201 | i200);
                        ((Integer) setDividerPadding(new Object[]{setdividerpadding4, Integer.valueOf(i202)}, -430486438, 430486439, i202)).intValue();
                        int i203 = setdividerpadding4.setY;
                        int i204 = (((i203 ^ 1) | (i203 & 1)) << 1) - (((~i203) & 1) | (i203 & (-2)));
                        aab[] aabVarArr = setdividerpadding4.setCompoundDrawableTintBlendMode;
                        if (i204 > aabVarArr.length) {
                            int i205 = f52030f;
                            int i206 = i205 & 89;
                            int i207 = i206 + ((i205 ^ 89) | i206);
                            f52031g = i207 % 128;
                            if (i207 % 2 == 0) {
                                aab[] aabVarArr2 = new aab[aabVarArr.length];
                                System.arraycopy(aabVarArr, 1, aabVarArr2, aabVarArr.length, aabVarArr.length);
                                setdividerpadding4.f52036e = setdividerpadding4.setCompoundDrawableTintBlendMode.length % 1;
                                setdividerpadding4.setCompoundDrawableTintBlendMode = aabVarArr2;
                            } else {
                                aab[] aabVarArr3 = new aab[aabVarArr.length << 1];
                                System.arraycopy(aabVarArr, 0, aabVarArr3, aabVarArr.length, aabVarArr.length);
                                int length = setdividerpadding4.setCompoundDrawableTintBlendMode.length;
                                int i208 = ~length;
                                int i209 = length << 1;
                                setdividerpadding4.f52036e = (i208 ^ i209) + ((i209 & i208) << 1);
                                setdividerpadding4.setCompoundDrawableTintBlendMode = aabVarArr3;
                            }
                            int i210 = f52031g + 111;
                            f52030f = i210 % 128;
                            int i211 = i210 % 2;
                        }
                        int i212 = setdividerpadding4.f52036e;
                        int iIdentityHashCode4 = System.identityHashCode(setdividerpadding4);
                        int i213 = (i212 * (-751)) + 751;
                        int i214 = ~i212;
                        int i215 = ~i214;
                        int i216 = ~iIdentityHashCode4;
                        int i217 = (((i215 | i214) & i215) | ((i216 | iIdentityHashCode4) & i216)) * ReturnCode.ERR_CONN_IO;
                        int i218 = (i213 ^ i217) + ((i213 & i217) << 1);
                        int i219 = (i212 & i216) | (iIdentityHashCode4 & i214);
                        int i220 = iIdentityHashCode4 & i212;
                        int i221 = (i220 & i219) | (i219 ^ i220);
                        int i222 = ~i221;
                        int i223 = -(-(((i221 | i222) & i222) * (-1504)));
                        int i224 = (((i218 | i223) << 1) - (~(-((i223 & (~i218)) | ((~i223) & i218))))) - 1;
                        int i225 = (i215 ^ i214) | (i215 & i214);
                        int i226 = ~i225;
                        int i227 = (i225 | i226) & i226;
                        int i228 = i214 & i227;
                        setdividerpadding4.f52036e = (i224 - (~((((i227 | i214) & (~i228)) | i228) * 752))) - 1;
                        setdividerpadding4.setCompoundDrawableTintBlendMode[i212] = aabVar;
                        int i229 = setdividerpadding4.setY;
                        int i230 = ((i229 ^ 1) | (i229 & 1)) << 1;
                        int i231 = -(((~i229) & 1) | (i229 & (-2)));
                        setdividerpadding4.setY = (i230 & i231) + (i231 | i230);
                        int i232 = setdividerpadding4.setOnFocusChangeListener;
                        int iIdentityHashCode5 = System.identityHashCode(setdividerpadding4);
                        int i233 = i107 * (-947);
                        int i234 = -(-(i232 * 949));
                        int i235 = (i233 ^ i234) + ((i233 & i234) << 1);
                        int i236 = ~i232;
                        int i237 = ~i236;
                        int i238 = i236 ^ iIdentityHashCode5;
                        int i239 = ~iIdentityHashCode5;
                        int i240 = i236 & iIdentityHashCode5;
                        int i241 = ~((i238 & i240) | (i238 ^ i240));
                        int i242 = ((~i241) & i120) | (i241 & i130);
                        int i243 = i241 & i120;
                        int i244 = (i235 - (~(((i243 & i242) | (i242 ^ i243)) * (-948)))) - 1;
                        int i245 = (i237 & i120) | (i236 & i130);
                        int i246 = i120 & i236;
                        int i247 = (i245 & i246) | (i245 ^ i246);
                        int i248 = (iIdentityHashCode5 | i239) & i239;
                        int i249 = i247 ^ i248;
                        int i250 = i248 & i247;
                        int i251 = -(-((~((i250 & i249) | (i249 ^ i250))) * (-948)));
                        int i252 = (i244 & i251) + (i251 | i244);
                        int i253 = ((i236 & i107) | (i107 ^ i236)) * 948;
                        int i254 = i252 & i253;
                        setdividerpadding4.setOnFocusChangeListener = (i254 - (~(-(-((i253 ^ i252) | i254))))) - 1;
                        int i255 = f52030f;
                        int i256 = (i255 & 3) + (i255 | 3);
                        f52031g = i256 % 128;
                        if (i256 % 2 == 0) {
                            throw null;
                        }
                    }
                    return null;
                case 7:
                    setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[0];
                    int iIntValue4 = ((Number) objArr[1]).intValue();
                    int iIntValue5 = ((Number) objArr[2]).intValue();
                    int iIntValue6 = ((Number) objArr[3]).intValue();
                    int i257 = f52031g;
                    int i258 = ((i257 | 47) << 1) - (i257 ^ 47);
                    f52030f = i258 % 128;
                    int i259 = i258 % 2;
                    if (iIntValue4 < iIntValue5) {
                        int i260 = (((i257 & (-28)) | ((~i257) & 27)) - (~((i257 & 27) << 1))) - 1;
                        f52030f = i260 % 128;
                        int i261 = i260 % 2;
                        int i262 = (iIntValue4 & iIntValue6) | (iIntValue6 ^ iIntValue4);
                        int i263 = f52031g + 3;
                        f52030f = i263 % 128;
                        if (i263 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                    int i264 = (iIntValue6 & iIntValue5) | (iIntValue6 ^ iIntValue5);
                    int i265 = -iIntValue5;
                    int i266 = ((~i265) & iIntValue4) | ((~iIntValue4) & i265);
                    int i267 = (iIntValue4 & i265) << 1;
                    int i268 = (i266 & i267) + (i267 | i266);
                    int i269 = f52031g;
                    int i270 = i269 & 1;
                    int i271 = (i269 | 1) & (~i270);
                    int i272 = -(-(i270 << 1));
                    int i273 = (i271 & i272) + (i271 | i272);
                    f52030f = i273 % 128;
                    while (true) {
                        int i274 = i273 % 2;
                        abx abxVar3 = setdividerpadding5.f52033b;
                        if (i268 < 128) {
                            int i275 = f52030f;
                            int i276 = ((i275 ^ 107) | (i275 & 107)) << 1;
                            int i277 = -(((~i275) & 107) | (i275 & (-108)));
                            int i278 = ((i276 | i277) << 1) - (i277 ^ i276);
                            f52031g = i278 % 128;
                            if (i278 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i279 = f52031g + 1;
                        f52030f = i279 % 128;
                        int i280 = i279 % 2;
                        int i281 = i268 & 127;
                        int i282 = i281 | ((~i281) & 128);
                        i268 >>>= 7;
                        int i283 = f52030f;
                        int i284 = ((i283 ^ 113) | (i283 & 113)) << 1;
                        int i285 = -(((~i283) & 113) | (i283 & (-114)));
                        i273 = (i284 ^ i285) + ((i285 & i284) << 1);
                        f52031g = i273 % 128;
                    }
                    break;
                default:
                    setDividerPadding setdividerpadding6 = (setDividerPadding) objArr[0];
                    int i286 = f52031g;
                    int i287 = i286 ^ 69;
                    int i288 = ((i286 & 69) | i287) << 1;
                    int i289 = -i287;
                    int i290 = (i288 & i289) + (i288 | i289);
                    f52030f = i290 % 128;
                    int i291 = i290 % 2;
                    ArraysKt___ArraysJvmKt.fill$default(setdividerpadding6.setCompoundDrawableTintBlendMode, (Object) null, 0, 0, 6, (Object) null);
                    int length2 = setdividerpadding6.setCompoundDrawableTintBlendMode.length;
                    int iIdentityHashCode6 = System.identityHashCode(setdividerpadding6);
                    int i292 = 750 - (~(-(-(length2 * (-751)))));
                    int i293 = ~length2;
                    int i294 = ~i293;
                    int i295 = i294 & (i294 | i293);
                    int i296 = ~iIdentityHashCode6;
                    int i297 = ((~i296) & i295) | ((~i295) & i296);
                    int i298 = i295 & i296;
                    int i299 = ((i298 & i297) | (i297 ^ i298)) * ReturnCode.ERR_CONN_IO;
                    int i300 = i292 & i299;
                    int i301 = ((i292 | i299) & (~i300)) + (i300 << 1);
                    int i302 = -(~(-(-((~(iIdentityHashCode6 | length2)) * (-1504)))));
                    int i303 = ((i301 ^ i302) + ((i302 & i301) << 1)) - 1;
                    int i304 = (length2 | i293) & i293;
                    int i305 = ~i304;
                    int i306 = ~((i305 ^ i304) | (i305 & i304));
                    int i307 = (i305 & i306) | ((~i306) & i304);
                    int i308 = i304 & i306;
                    int i309 = ((i308 & i307) | (i307 ^ i308)) * 752;
                    int i310 = i303 ^ i309;
                    int i311 = -(-((i309 & i303) << 1));
                    setdividerpadding6.f52036e = ((i310 | i311) << 1) - (i311 ^ i310);
                    setdividerpadding6.setY = 0;
                    setdividerpadding6.setOnFocusChangeListener = 0;
                    int i312 = f52030f;
                    int i313 = i312 & 101;
                    int i314 = ((i312 ^ 101) | i313) << 1;
                    int i315 = -((i312 | 101) & (~i313));
                    int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                    f52031g = i316 % 128;
                    if (i316 % 2 != 0) {
                        return null;
                    }
                    throw null;
            }
        }

        public final void setOnFocusChangeListener(@NotNull List<aab> p4) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setDividerPadding(new Object[]{this, p4}, -2027309938, 2027309943, System.identityHashCode(this));
        }

        public final void setDividerPadding(int p4) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setDividerPadding(new Object[]{this, Integer.valueOf(p4)}, -1027427569, 1027427572, p4);
        }
    }
}
