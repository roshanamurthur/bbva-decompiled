package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\"¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001c"}, d2 = {"Lcom/mypinpad/tsdk/i/yf;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/yq;", "a", "Lcom/mypinpad/tsdk/i/yq;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/yq;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/xt;", "b", "Lcom/mypinpad/tsdk/i/xt;", "setY", "()Lcom/mypinpad/tsdk/i/xt;", "setOnFocusChangeListener", "", "Ljava/security/cert/Certificate;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lkotlin/Lazy;", "setX", "p1", "p2", "Lkotlin/Function0;", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/yq;Lcom/mypinpad/tsdk/i/xt;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V"}, k = 1, mv = {1, 6, 0})
public final class yf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62049e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f62050f = 1;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xt setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Certificate> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy setX;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "setX", "()Ljava/util/List;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f62055q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f62056r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<List<Certificate>> f62057p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f62057p0 = function0;
        }

        public static /* synthetic */ List a(Object[] objArr, int i10, int i11) {
            List<Certificate> listA;
            int i12 = ~i11;
            int i13 = (i12 * (-629)) + (i11 * (-628)) + (i10 * 630);
            int i14 = ~i10;
            if (((i14 | i11) * 629) + ((~(i12 | i14)) * (-629)) + i13 != 1) {
                a aVar = (a) objArr[0];
                int i15 = f62056r0;
                int i16 = i15 & 91;
                int i17 = (i15 ^ 91) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f62055q0 = i18 % 128;
                try {
                    if (i18 % 2 != 0) {
                        listA = aVar.f62057p0.invoke();
                        int i19 = 67 / 0;
                    } else {
                        listA = aVar.f62057p0.invoke();
                    }
                } catch (SSLPeerUnverifiedException unused) {
                    listA = CollectionsKt__CollectionsKt.emptyList();
                }
                int i20 = f62056r0 + 99;
                f62055q0 = i20 % 128;
                int i21 = i20 % 2;
            } else {
                a aVar2 = (a) objArr[0];
                int i22 = f62055q0;
                int i23 = i22 & 9;
                int i24 = ((((i22 ^ 9) | i23) << 1) - (~(-((i22 | 9) & (~i23))))) - 1;
                f62056r0 = i24 % 128;
                int i25 = i24 % 2;
                System.identityHashCode(aVar2);
                listA = a(new Object[]{aVar2}, 1526215530, -1526215530);
                int i26 = f62056r0 + 13;
                f62055q0 = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
            }
            return listA;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ List<? extends Certificate> invoke() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return a(objArr, 1544101254, -1544101253);
        }
    }

    static {
        int i10 = f62049e;
        int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 94) << 1) - (i10 ^ 94)));
        f62050f = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yf(@NotNull yq yqVar, @NotNull xt xtVar, @NotNull List<? extends Certificate> list, @NotNull Function0<? extends List<? extends Certificate>> function0) {
        Intrinsics.checkNotNullParameter(yqVar, "");
        Intrinsics.checkNotNullParameter(xtVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.setDividerPadding = yqVar;
        this.setOnFocusChangeListener = xtVar;
        this.setCompoundDrawableTintBlendMode = list;
        this.setX = LazyKt__LazyJVMKt.lazy(new a(function0));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0405  */
    /* JADX WARN: Code duplicated, block: B:48:0x041d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0440  */
    /* JADX WARN: Code duplicated, block: B:51:0x0444  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String string;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~i12;
        int i18 = i17 | i10;
        switch (((~i18) * 886) + ((i10 | (~(i11 | i17))) * (-1772)) + ((i16 | (~(i18 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773)) {
            case 1:
                Certificate certificate = (Certificate) objArr[0];
                int i19 = f62050f;
                int i20 = (((i19 | 44) << 1) - (i19 ^ 44)) - 1;
                f62049e = i20 % 128;
                if (i20 % 2 != 0) {
                    boolean z10 = certificate instanceof X509Certificate;
                    throw null;
                }
                if (!(certificate instanceof X509Certificate)) {
                    String type = certificate.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "");
                    int i21 = f62050f;
                    int i22 = (i21 & 123) + (i21 | 123);
                    f62049e = i22 % 128;
                    if (i22 % 2 == 0) {
                        return type;
                    }
                    throw null;
                }
                int i23 = i19 & 69;
                int i24 = (i19 ^ 69) | i23;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                f62049e = i25 % 128;
                if (i25 % 2 != 0) {
                    string = ((X509Certificate) certificate).getSubjectDN().toString();
                    int i26 = 80 / 0;
                } else {
                    string = ((X509Certificate) certificate).getSubjectDN().toString();
                }
                int i27 = f62049e;
                int i28 = ((i27 | 49) << 1) - (i27 ^ 49);
                f62050f = i28 % 128;
                int i29 = i28 % 2;
                return string;
            case 2:
                yf yfVar = (yf) objArr[0];
                Object obj = objArr[1];
                int i30 = f62050f;
                int i31 = i30 & 95;
                int i32 = -(-(i30 | 95));
                int i33 = (i31 & i32) + (i31 | i32);
                f62049e = i33 % 128;
                if (i33 % 2 != 0) {
                    boolean z11 = obj instanceof yf;
                    throw null;
                }
                if (obj instanceof yf) {
                    yf yfVar2 = (yf) obj;
                    if (yfVar2.setDividerPadding == yfVar.setDividerPadding) {
                        int i34 = (i30 & 125) + (125 | i30);
                        f62049e = i34 % 128;
                        int i35 = i34 % 2;
                        xt xtVar = yfVar.setOnFocusChangeListener;
                        if (i35 != 0) {
                            int i36 = 40 / 0;
                            if (Intrinsics.areEqual(yfVar2.setOnFocusChangeListener, xtVar)) {
                                if (Intrinsics.areEqual((List) setX(new Object[]{yfVar2}, 937432037, -937432031, System.identityHashCode(yfVar2)), (List) setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar)))) {
                                    int i37 = f62050f;
                                    int i38 = ((i37 | 121) << 1) - (i37 ^ 121);
                                    f62049e = i38 % 128;
                                    int i39 = i38 % 2;
                                    if (Intrinsics.areEqual(yfVar2.setCompoundDrawableTintBlendMode, yfVar.setCompoundDrawableTintBlendMode)) {
                                        int i40 = f62050f;
                                        int i41 = i40 & 123;
                                        int i42 = -(-((i40 ^ 123) | i41));
                                        int i43 = (i41 & i42) + (i42 | i41);
                                        int i44 = i43 % 128;
                                        f62049e = i44;
                                        int i45 = i43 % 2;
                                        int i46 = i44 & 59;
                                        int i47 = i44 | 59;
                                        i13 = (i46 ^ i47) + ((i47 & i46) << 1);
                                        f62050f = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            return Boolean.TRUE;
                                        }
                                        throw null;
                                    }
                                }
                            }
                        } else if (!(!Intrinsics.areEqual(yfVar2.setOnFocusChangeListener, xtVar))) {
                            if (Intrinsics.areEqual((List) setX(new Object[]{yfVar2}, 937432037, -937432031, System.identityHashCode(yfVar2)), (List) setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar)))) {
                                int i310 = f62050f;
                                int i311 = ((i310 | 121) << 1) - (i310 ^ 121);
                                f62049e = i311 % 128;
                                int i312 = i311 % 2;
                                if (Intrinsics.areEqual(yfVar2.setCompoundDrawableTintBlendMode, yfVar.setCompoundDrawableTintBlendMode)) {
                                    int i48 = f62050f;
                                    int i49 = i48 & 123;
                                    int i410 = -(-((i48 ^ 123) | i49));
                                    int i411 = (i49 & i410) + (i410 | i49);
                                    int i412 = i411 % 128;
                                    f62049e = i412;
                                    int i413 = i411 % 2;
                                    int i414 = i412 & 59;
                                    int i415 = i412 | 59;
                                    i13 = (i414 ^ i415) + ((i415 & i414) << 1);
                                    f62050f = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        return Boolean.TRUE;
                                    }
                                    throw null;
                                }
                            }
                        }
                    }
                }
                int i50 = f62050f;
                int i51 = (((i50 | 108) << 1) - (i50 ^ 108)) - 1;
                f62049e = i51 % 128;
                int i52 = i51 % 2;
                return Boolean.FALSE;
            case 3:
                yf yfVar3 = (yf) objArr[0];
                int i53 = f62049e;
                int i54 = i53 & 19;
                int i55 = (((i53 | 19) & (~i54)) - (~(i54 << 1))) - 1;
                f62050f = i55 % 128;
                int i56 = i55 % 2;
                int i57 = -(-yfVar3.setDividerPadding.hashCode());
                int i58 = i57 & 527;
                int i59 = (i57 | 527) & (~i58);
                int i60 = i58 << 1;
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                int i62 = i61 * 31;
                int iHashCode = yfVar3.setOnFocusChangeListener.hashCode();
                int iIdentityHashCode = System.identityHashCode(yfVar3);
                int i63 = iHashCode * 1773;
                int i64 = i61 * (-27435);
                int i65 = i63 ^ i64;
                int i66 = ((i64 & i63) | i65) << 1;
                int i67 = -i65;
                int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
                int i69 = (~iHashCode) & ((~iHashCode) | iHashCode);
                int i70 = ~i62;
                int i71 = ~i62;
                int i72 = i70 & (i71 | i62);
                int i73 = i69 & i72;
                int i74 = (i69 | i72) & (~i73);
                int i75 = (i74 & i73) | (i74 ^ i73);
                int i76 = (i75 | (~i75)) & (~i75);
                int i77 = i71 ^ iIdentityHashCode;
                int i78 = ~iIdentityHashCode;
                int i79 = i71 & iIdentityHashCode;
                int i80 = ~((i77 & i79) | (i77 ^ i79));
                int i81 = (i76 & i80) | ((~i80) & i76) | ((~i76) & i80);
                int i82 = ~iIdentityHashCode;
                int i83 = i82 | iHashCode;
                int i84 = i83 & i62;
                int i85 = (i83 | i62) & (~i84);
                int i86 = ~((i85 & i84) | (i85 ^ i84));
                int i87 = i81 & i86;
                int i88 = (i81 | i86) & (~i87);
                int i89 = ((i88 & i87) | (i88 ^ i87)) * 886;
                int i90 = i68 | i89;
                int i91 = (i90 << 1) - ((~(i89 & i68)) & i90);
                int i92 = (i62 & i82) | (i82 & i71) | ((~i82) & i62);
                int i93 = (i92 | (~i92)) & (~i92);
                int i94 = iHashCode & i93;
                int i95 = (((i93 | iHashCode) & (~i94)) | i94) * (-1772);
                int i96 = i91 & i95;
                int i97 = -(-((i95 ^ i91) | i96));
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                int i99 = i78 ^ iHashCode;
                int i100 = iHashCode & i78;
                int i101 = (~((i99 & i100) | (i99 ^ i100))) * 886;
                int i102 = ((i98 & i101) + (i101 | i98)) * 31;
                int i103 = -(-((List) setX(new Object[]{yfVar3}, 937432037, -937432031, System.identityHashCode(yfVar3))).hashCode());
                int i104 = ((~i103) & i102) | ((~i102) & i103);
                int i105 = -(-((i103 & i102) << 1));
                int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                int i107 = i106 * 31;
                int iHashCode2 = yfVar3.setCompoundDrawableTintBlendMode.hashCode();
                int iIdentityHashCode2 = System.identityHashCode(yfVar3);
                int i108 = iHashCode2 * (-375);
                int i109 = -(-(i106 * (-11625)));
                int i110 = (i108 ^ i109) + ((i109 & i108) << 1);
                int i111 = ~iHashCode2;
                int i112 = ~i107;
                int i113 = (i112 & i111) | (i111 ^ i112);
                int i114 = (i113 | (~i113)) & (~i113);
                int i115 = (~i114) & iIdentityHashCode2;
                int i116 = ~iIdentityHashCode2;
                int i117 = (i114 & iIdentityHashCode2) | i115 | (i114 & i116);
                int i118 = iHashCode2 & i107;
                int i119 = (~i118) & (iHashCode2 | i107);
                int i120 = ~i107;
                int i121 = ~((i119 & i118) | (i119 ^ i118));
                int i122 = i117 & i121;
                int i123 = (i117 | i121) & (~i122);
                int i124 = (((i123 & i122) | (i123 ^ i122)) * 376) + i110;
                int i125 = i116 & iHashCode2;
                int i126 = (i116 | iHashCode2) & (~i125);
                int i127 = ~iHashCode2;
                int i128 = ~((i125 & i126) | (i126 ^ i125));
                int i129 = i118 | (iHashCode2 & i120) | (i107 & i127);
                int i130 = (i129 | (~i129)) & (~i129);
                int i131 = i128 & i130;
                int i132 = -(-((((i128 | i130) & (~i131)) | i131) * (-376)));
                int i133 = i124 & i132;
                int i134 = i124 | i132;
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                int i136 = i111 & (iHashCode2 | i127);
                int i137 = i136 & iIdentityHashCode2;
                int i138 = (iIdentityHashCode2 | i136) & (~i137);
                int i139 = (i138 & i137) | (i138 ^ i137);
                int i140 = (i139 | (~i139)) & (~i139);
                int i141 = i107 & i140;
                int i142 = (i140 | i107) & (~i141);
                int i143 = -(-(((i142 & i141) | (i142 ^ i141)) * 376));
                int i144 = i135 | i143;
                int i145 = ((i144 << 1) - (~(-((~(i143 & i135)) & i144)))) - 1;
                int i146 = f62050f;
                int i147 = (i146 & 69) + (i146 | 69);
                f62049e = i147 % 128;
                int i148 = i147 % 2;
                return Integer.valueOf(i145);
            case 4:
                yf yfVar4 = (yf) objArr[0];
                int i149 = f62049e;
                int i150 = i149 | 75;
                int i151 = (i150 << 1) - ((~(i149 & 75)) & i150);
                int i152 = i151 % 128;
                f62050f = i152;
                int i153 = i151 % 2;
                xt xtVar2 = yfVar4.setOnFocusChangeListener;
                int i154 = ((i152 ^ 22) + ((i152 & 22) << 1)) - 1;
                f62049e = i154 % 128;
                int i155 = i154 % 2;
                return xtVar2;
            case 5:
                yf yfVar5 = (yf) objArr[0];
                int i156 = f62049e;
                int i157 = i156 & 49;
                int i158 = -(-((i156 ^ 49) | i157));
                int i159 = (i157 & i158) + (i157 | i158);
                f62050f = i159 % 128;
                int i160 = i159 % 2;
                yq yqVar = yfVar5.setDividerPadding;
                if (i160 == 0) {
                    throw null;
                }
                int i161 = ((i156 & (-100)) | ((~i156) & 99)) + ((i156 & 99) << 1);
                f62050f = i161 % 128;
                int i162 = i161 % 2;
                return yqVar;
            case 6:
                yf yfVar6 = (yf) objArr[0];
                int i163 = f62049e;
                int i164 = i163 & 113;
                int i165 = -(-((i163 ^ 113) | i164));
                int i166 = (i164 & i165) + (i165 | i164);
                f62050f = i166 % 128;
                int i167 = i166 % 2;
                List list = (List) yfVar6.setX.getValue();
                if (i167 == 0) {
                    int i168 = 79 / 0;
                }
                int i169 = f62050f;
                int i170 = (i169 ^ 21) + ((i169 & 21) << 1);
                f62049e = i170 % 128;
                int i171 = i170 % 2;
                return list;
            case 7:
                yf yfVar7 = (yf) objArr[0];
                int i172 = f62050f;
                int i173 = (i172 ^ 101) + ((i172 & 101) << 1);
                int i174 = i173 % 128;
                f62049e = i174;
                int i175 = i173 % 2;
                List<Certificate> list2 = yfVar7.setCompoundDrawableTintBlendMode;
                int i176 = i174 & 31;
                int i177 = i176 + ((i174 ^ 31) | i176);
                f62050f = i177 % 128;
                int i178 = i177 % 2;
                return list2;
            default:
                yf yfVar8 = (yf) objArr[0];
                List list3 = (List) setX(new Object[]{yfVar8}, 937432037, -937432031, System.identityHashCode(yfVar8));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                int i179 = f62050f;
                int i180 = ((i179 ^ 123) | (i179 & 123)) << 1;
                int i181 = -(((~i179) & 123) | (i179 & (-124)));
                int i182 = ((i180 | i181) << 1) - (i181 ^ i180);
                f62049e = i182 % 128;
                while (true) {
                    int i183 = i182 % 2;
                    if (!it.hasNext()) {
                        String string2 = arrayList.toString();
                        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
                        sb2.append(yfVar8.setDividerPadding);
                        sb2.append(" cipherSuite=");
                        sb2.append(yfVar8.setOnFocusChangeListener);
                        sb2.append(" peerCertificates=");
                        sb2.append(string2);
                        sb2.append(" localCertificates=");
                        List<Certificate> list4 = yfVar8.setCompoundDrawableTintBlendMode;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator<T> it2 = list4.iterator();
                        int i184 = f62049e + 77;
                        f62050f = i184 % 128;
                        int i185 = i184 % 2;
                        while (it2.hasNext()) {
                            int i186 = f62049e;
                            int i187 = ((i186 | 3) << 1) - (i186 ^ 3);
                            f62050f = i187 % 128;
                            if (i187 % 2 == 0) {
                                arrayList2.add((String) setX(new Object[]{(Certificate) it2.next()}, -215525139, 215525140, (int) System.currentTimeMillis()));
                                int i188 = 7 / 0;
                            } else {
                                arrayList2.add((String) setX(new Object[]{(Certificate) it2.next()}, -215525139, 215525140, (int) System.currentTimeMillis()));
                            }
                            int i189 = f62050f;
                            int i190 = (((i189 | 77) << 1) - (~(-(((~i189) & 77) | (i189 & (-78)))))) - 1;
                            f62049e = i190 % 128;
                            int i191 = i190 % 2;
                        }
                        sb2.append(arrayList2);
                        sb2.append(AbstractJsonLexerKt.END_OBJ);
                        String string3 = sb2.toString();
                        int i192 = f62049e;
                        int i193 = (-2) - (((i192 ^ 6) + ((i192 & 6) << 1)) ^ (-1));
                        f62050f = i193 % 128;
                        int i194 = i193 % 2;
                        return string3;
                    }
                    int i195 = f62049e;
                    int i196 = (i195 | 9) << 1;
                    int i197 = -(i195 ^ 9);
                    int i198 = (i196 & i197) + (i197 | i196);
                    f62050f = i198 % 128;
                    int i199 = i198 % 2;
                    arrayList.add((String) setX(new Object[]{(Certificate) it.next()}, -215525139, 215525140, (int) System.currentTimeMillis()));
                    int i200 = f62049e;
                    i182 = (((i200 | 68) << 1) - (i200 ^ 68)) - 1;
                    f62050f = i182 % 128;
                }
                break;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1405865072, -1405865070, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1807168180, 1807168183, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final yq setCompoundDrawableTintBlendMode() {
        return (yq) setX(new Object[]{this}, -458988630, 458988635, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final List<Certificate> setOnFocusChangeListener() {
        return (List) setX(new Object[]{this}, -1159273099, 1159273106, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final xt setY() {
        return (xt) setX(new Object[]{this}, -718834590, 718834594, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 172367942, -172367942, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yf$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/yf$setCompoundDrawableTintBlendMode;", "", "Ljavax/net/ssl/SSLSession;", "Lcom/mypinpad/tsdk/i/yf;", "setY", "(Ljavax/net/ssl/SSLSession;)Lcom/mypinpad/tsdk/i/yf;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62058a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62059b = 1;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yf$setCompoundDrawableTintBlendMode$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "setCompoundDrawableTintBlendMode", "()Ljava/util/List;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends Lambda implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f62060q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f62061r0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f62062p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends Certificate> list) {
                super(0);
                this.f62062p0 = list;
            }

            public static /* synthetic */ List a(Object[] objArr, int i10, int i11, int i12) {
                List<Certificate> listA;
                int i13 = ~i11;
                int i14 = (~i12) | i13;
                int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
                int i16 = ~i10;
                if (((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15 != 1) {
                    a aVar = (a) objArr[0];
                    int i17 = f62060q0;
                    int i18 = i17 & 93;
                    int i19 = (i17 | 93) & (~i18);
                    int i20 = i18 << 1;
                    int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                    int i22 = i21 % 128;
                    f62061r0 = i22;
                    int i23 = i21 % 2;
                    listA = aVar.f62062p0;
                    int i24 = (i22 & 61) + (i22 | 61);
                    f62060q0 = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 45 / 0;
                    }
                } else {
                    a aVar2 = (a) objArr[0];
                    int i26 = f62060q0;
                    int i27 = i26 & 45;
                    int i28 = -(-((i26 ^ 45) | i27));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    f62061r0 = i29 % 128;
                    int i30 = i29 % 2;
                    listA = a(new Object[]{aVar2}, -1319710519, 1319710519, System.identityHashCode(aVar2));
                    int i31 = f62061r0 + 95;
                    f62060q0 = i31 % 128;
                    if (i31 % 2 != 0) {
                        int i32 = 62 / 0;
                    }
                }
                return listA;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ List<? extends Certificate> invoke() {
                return a(new Object[]{this}, -519530825, 519530826, System.identityHashCode(this));
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
            List listEmptyList;
            boolean zAreEqual;
            List listEmptyList2;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
            int i16 = i11 | (~(i13 | (~i12)));
            int i17 = ~(i10 | i12);
            if ((i17 * 880) + ((i16 | i17) * (-880)) + i15 == 1) {
                Certificate[] certificateArr = (Certificate[]) objArr[0];
                int i18 = f62059b;
                int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                f62058a = i19 % 128;
                int i20 = i19 % 2;
                if (certificateArr != null) {
                    int i21 = (i18 ^ 113) + ((i18 & 113) << 1);
                    f62058a = i21 % 128;
                    int i22 = i21 % 2;
                    listEmptyList = (List) yt.setY(new Object[]{Arrays.copyOf(certificateArr, certificateArr.length)}, -91536887, 91536895, (int) System.currentTimeMillis());
                    int i23 = f62058a;
                    int i24 = ((i23 | 117) << 1) - (i23 ^ 117);
                    f62059b = i24 % 128;
                    if (i24 % 2 == 0) {
                        throw null;
                    }
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    int i25 = f62059b + 31;
                    f62058a = i25 % 128;
                    int i26 = i25 % 2;
                }
                return listEmptyList;
            }
            SSLSession sSLSession = (SSLSession) objArr[0];
            int i27 = f62058a + 121;
            f62059b = i27 % 128;
            int i28 = i27 % 2;
            Intrinsics.checkNotNullParameter(sSLSession, "");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                int i29 = f62058a;
                int i30 = (i29 ^ 105) + ((i29 & 105) << 1);
                int i31 = i30 % 128;
                f62059b = i31;
                zAreEqual = i30 % 2 != 0;
                int i32 = i31 + 75;
                f62058a = i32 % 128;
                int i33 = i32 % 2;
            } else {
                zAreEqual = Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                int i34 = f62059b;
                int i35 = (i34 & 71) + (i34 | 71);
                f62058a = i35 % 128;
                int i36 = i35 % 2;
            }
            if (zAreEqual) {
                throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
            }
            xt y7 = xt.INSTANCE.setY(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual(ExpectedUserActionOnPoiTypes.NONE, protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            yq.Companion companion = yq.INSTANCE;
            yq yqVar = (yq) yq.Companion.setDividerPadding(new Object[]{protocol}, -2136027086, 2136027086, (int) System.currentTimeMillis());
            try {
                listEmptyList2 = (List) setY(new Object[]{sSLSession.getPeerCertificates()}, -1264434489, 1264434490, (int) System.currentTimeMillis());
                int i37 = f62058a;
                int i38 = i37 & 109;
                int i39 = (((i37 | 109) & (~i38)) - (~(i38 << 1))) - 1;
                f62059b = i39 % 128;
                int i40 = i39 % 2;
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            yf yfVar = new yf(yqVar, y7, (List) setY(new Object[]{sSLSession.getLocalCertificates()}, -1264434489, 1264434490, (int) System.currentTimeMillis()), new a(listEmptyList2));
            int i41 = f62059b;
            int i42 = (((i41 | 58) << 1) - (i41 ^ 58)) - 1;
            f62058a = i42 % 128;
            if (i42 % 2 == 0) {
                return yfVar;
            }
            throw null;
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static yf setY(@NotNull SSLSession sSLSession) throws IOException {
            return (yf) setY(new Object[]{sSLSession}, -1237640709, 1237640709, (int) System.currentTimeMillis());
        }
    }

    @JvmName(name = "setX")
    @NotNull
    public final List<Certificate> setX() {
        return (List) setX(new Object[]{this}, 937432037, -937432031, System.identityHashCode(this));
    }
}
