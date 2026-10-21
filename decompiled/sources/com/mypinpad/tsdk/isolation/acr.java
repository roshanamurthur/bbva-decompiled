package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140'\u0012\u0006\u0010\u0018\u001a\u00020,¢\u0006\u0004\b1\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0011¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0006\u0010\u001bJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0011¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010#\u001a\u00020\u001d2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0005H\u0017¢\u0006\u0004\b&\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\u00020,8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Lcom/mypinpad/tsdk/i/acr;", "Lcom/mypinpad/tsdk/i/abw;", "", "writeReplace", "()Ljava/lang/Object;", "", "setX", "()Ljava/lang/String;", "setLayoutAnimation", "getNavBarTitleString", "()Lcom/mypinpad/tsdk/i/abw;", "p0", "setDividerPadding", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/abw;", "", "", "setY", "(I)B", "UiMessageCallbackKtWhenMappings", "()I", "", "setZ", "()[B", "Lcom/mypinpad/tsdk/i/abx;", "p1", "p2", "", "(Lcom/mypinpad/tsdk/i/abx;I)V", "p3", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/abw;I)Z", "setOnFocusChangeListener", "(I[BII)Z", "setAlwaysDrawnWithCacheEnabled", "equals", "(Ljava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "toString", "", "u0", "[[B", "setTextAlignment", "()[[B", "", "v0", "[I", "setIncludeFontPadding", "()[I", "<init>", "([[B[I)V"}, k = 1, mv = {1, 5, 1})
public final class acr extends abw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52419w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52420x0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient byte[][] setDividerPadding;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final transient int[] setY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(abw.setOnFocusChangeListener.setDividerPadding());
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.setDividerPadding = bArr;
        this.setY = iArr;
    }

    public static /* synthetic */ String c(Object[] objArr) throws NoSuchAlgorithmException {
        String string;
        acr acrVar = (acr) objArr[0];
        int i10 = f52420x0 + 123;
        f52419w0 = i10 % 128;
        if (i10 % 2 != 0) {
            string = ((abw) setY(new Object[]{acrVar}, 70051370, -70051370, System.identityHashCode(acrVar))).toString();
            int i11 = 1 / 0;
        } else {
            string = ((abw) setY(new Object[]{acrVar}, 70051370, -70051370, System.identityHashCode(acrVar))).toString();
        }
        int i12 = f52419w0;
        int i13 = ((i12 | 49) << 1) - (((~i12) & 49) | (i12 & (-50)));
        f52420x0 = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    public static /* synthetic */ void d(Object[] objArr) throws NoSuchAlgorithmException {
        Object y7;
        int i10;
        int i11;
        int i12 = 0;
        acr acrVar = (acr) objArr[0];
        int i13 = 1;
        abx abxVar = (abx) objArr[1];
        int i14 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int i15 = f52419w0;
        int i16 = (i15 & 61) + (i15 | 61);
        f52420x0 = i16 % 128;
        if (i16 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abxVar, "");
            y7 = adb.setY(new Object[]{acrVar, 1}, 1111134270, -1111134270, 1);
        } else {
            Intrinsics.checkNotNullParameter(abxVar, "");
            y7 = adb.setY(new Object[]{acrVar, 0}, 1111134270, -1111134270, 0);
        }
        int iIntValue2 = ((Integer) y7).intValue();
        int i17 = 0;
        while (i17 < iIntValue) {
            int i18 = f52419w0;
            int i19 = (i18 & (-118)) | ((~i18) & 117);
            int i20 = -(-((i18 & 117) << i13));
            int i21 = ((i19 | i20) << i13) - (i20 ^ i19);
            int i22 = i21 % 128;
            f52420x0 = i22;
            int i23 = i21 % i14;
            if (iIntValue2 == 0) {
                int i24 = (i22 & 5) + (i22 | 5);
                int i25 = i24 % 128;
                f52419w0 = i25;
                int i26 = i24 % i14;
                int i27 = i25 & 113;
                int i28 = ((((i25 ^ 113) | i27) << i13) - (~(-((i25 | 113) & (~i27))))) - i13;
                f52420x0 = i28 % 128;
                int i29 = i28 % i14;
                i10 = i12;
            } else {
                Object[] objArr2 = new Object[i13];
                objArr2[i12] = acrVar;
                int[] iArr = (int[]) setY(objArr2, 1797316966, -1797316954, System.identityHashCode(acrVar));
                int i30 = -(-(iIntValue2 * (-628)));
                int i31 = (-630) & i30;
                int i32 = (((((-630) ^ i30) | i31) << i13) - (~(-((i30 | (-630)) & (~i31))))) - i13;
                int i33 = ~iIntValue2;
                int i34 = -(-(i33 * (-629)));
                int i35 = ((i32 | i34) << i13) - (i34 ^ i32);
                int i36 = i33 & (i33 | iIntValue2);
                int i37 = ~i36;
                int i38 = -(-(((i36 | i37) & i37) * (-629)));
                int i39 = (i35 & i38) + (i38 | i35);
                int i40 = -(-(iIntValue2 * 629));
                int i41 = i39 & i40;
                int i42 = -(-(i40 | i39));
                i10 = iArr[(i41 & i42) + (i42 | i41)];
            }
            Object[] objArr3 = new Object[i13];
            objArr3[i12] = acrVar;
            int i43 = ((int[]) setY(objArr3, 1797316966, -1797316954, System.identityHashCode(acrVar)))[iIntValue2];
            int i44 = -i10;
            int i45 = i44 * 934;
            int i46 = -(~(-(-(i43 * (-932)))));
            int i47 = (((i45 | i46) << i13) - (i45 ^ i46)) - 1;
            int i48 = ~i43;
            int i49 = ~i44;
            int i50 = ~iIntValue;
            int i51 = i49 & i50;
            int i52 = (~i51) & (i49 | i50);
            int i53 = (i52 ^ i51) | (i51 & i52);
            int i54 = ~i53;
            int i55 = (i53 | i54) & i54;
            int i56 = -(-(((i55 & i48) | (i48 ^ i55)) * (-933)));
            int i57 = (i47 | i56) << i13;
            int i58 = -(i56 ^ i47);
            int i59 = (i57 & i58) + (i58 | i57);
            int i60 = ~((i48 ^ i50) | (i48 & i50));
            int i61 = i48 ^ i44;
            int i62 = i48 & i44;
            int i63 = ~(i61 | i62);
            int i64 = i60 ^ i63;
            int i65 = i60 & i63;
            int i66 = ((i64 & i65) | (i64 ^ i65)) * 933;
            int i67 = i59 & i66;
            int i68 = (((i67 - (~(-(-((i66 ^ i59) | i67))))) - i13) - (~((~(((i43 & i49) | i62) | (i43 & i44))) * 933))) - i13;
            Object[] objArr4 = new Object[i13];
            objArr4[i12] = acrVar;
            int[] iArr2 = (int[]) setY(objArr4, 1797316966, -1797316954, System.identityHashCode(acrVar));
            Object[] objArr5 = new Object[i13];
            objArr5[i12] = acrVar;
            int length = ((byte[][]) setY(objArr5, 202881993, -202881986, System.identityHashCode(acrVar))).length;
            int i69 = -(-iIntValue2);
            int i70 = length & i69;
            int i71 = (length | i69) & (~i70);
            int i72 = -(-(i70 << i13));
            int i73 = iArr2[((i71 | i72) << i13) - (i72 ^ i71)];
            int i74 = i68 * (-183);
            int i75 = i10 * (-183);
            int i76 = i74 & i75;
            int i77 = (i74 ^ i75) | i76;
            int i78 = ((i76 | i77) << i13) - (i77 ^ i76);
            int i79 = ~i68;
            int i80 = (i79 | i68) & i79;
            int i81 = (i50 | iIntValue) & i50;
            abx abxVar2 = abxVar;
            int i82 = ((~i81) & i80) | ((~i80) & i81) | (i80 & i81);
            int i83 = ~i10;
            int i84 = iIntValue2;
            int i85 = ((~i82) & i10) | (i82 & i83);
            int i86 = i82 & i10;
            int i87 = ~((i86 & i85) | (i85 ^ i86));
            int i88 = i83 & i50;
            int i89 = (~i88) & (i83 | i50);
            int i90 = (i89 ^ i88) | (i88 & i89);
            acr acrVar2 = acrVar;
            int i91 = ((~i90) & i68) | (i90 & i79);
            int i92 = i90 & i68;
            int i93 = ~((i91 & i92) | (i91 ^ i92));
            int i94 = ((~i93) & i87) | ((~i87) & i93);
            int i95 = i93 & i87;
            int i96 = (((i95 & i94) | (i94 ^ i95)) * (-184)) + i78;
            int i97 = (i79 ^ i83) | (i79 & i83);
            int i98 = ~i97;
            int i99 = (i97 | i98) & i98;
            int i100 = i79 ^ i50;
            int i101 = i79 & i50;
            int i102 = i99 | (~((i100 & i101) | (i100 ^ i101)));
            int i103 = (i83 | i10) & i83;
            int i104 = i103 ^ i50;
            int i105 = i103 & i50;
            int i106 = ~((i105 & i104) | (i104 ^ i105));
            int i107 = -(-(((i102 & i106) | ((~i106) & i102) | ((~i102) & i106)) * 184));
            int i108 = (i96 & i107) + (i96 | i107);
            int i109 = (i68 & i83) | (i10 & i79);
            int i110 = i68 & i10;
            int i111 = -(-(((i109 & i110) | (i109 ^ i110)) * 184));
            int iMin = Math.min(iIntValue, ((i108 | i111) << 1) - (i111 ^ i108));
            int i112 = -i17;
            int i113 = iMin & i112;
            int i114 = (i113 - (~((iMin ^ i112) | i113))) - 1;
            int i115 = i44 * (-103);
            int i116 = -(-(i17 * (-103)));
            int i117 = (((i115 ^ i116) | (i115 & i116)) << 1) - (((~i115) & i116) | ((~i116) & i115));
            int i118 = ~i17;
            int i119 = i49 ^ i118;
            int i120 = i49 & i118;
            int i121 = ~((i119 & i120) | (i119 ^ i120));
            int i122 = (i118 | i17) & i118;
            int i123 = (i122 & i50) | ((~i122) & iIntValue);
            int i124 = i122 & iIntValue;
            int i125 = (i124 & i123) | (i123 ^ i124);
            int i126 = ~i125;
            int i127 = (i125 | i126) & i126;
            int i128 = ((~i127) & i121) | ((~i121) & i127);
            int i129 = i121 & i127;
            int i130 = ((i129 & i128) | (i128 ^ i129)) * 104;
            int i131 = i117 & i130;
            int i132 = i130 | i117;
            int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
            int i134 = i50 | i44;
            int i135 = (i118 & i134) | ((~i134) & i17);
            int i136 = i134 & i17;
            int i137 = -(-((~((i135 & i136) | (i135 ^ i136))) * (-104)));
            int i138 = (((i133 | i137) << 1) - (~(-((i137 & (~i133)) | ((~i137) & i133))))) - 1;
            int i139 = -(-(((i44 & i50) | (iIntValue & i49) | (i44 & iIntValue)) * 104));
            int i140 = ((((~i139) & i138) | ((~i138) & i139)) - (~(-(-((i139 & i138) << 1))))) - 1;
            int i141 = ~i140;
            int i142 = i73 & i141;
            int i143 = (i141 | i73) & (~i142);
            int i144 = (((i73 * (-159)) + (i140 * (-159))) - (~(-(~(-(-(((i143 & i142) | (i143 ^ i142)) * 160))))))) - 2;
            int i145 = (i50 ^ i140) | (i50 & i140);
            int i146 = ~i145;
            int i147 = (i145 | i146) & i146;
            int i148 = i140 & i73;
            int i149 = (~i148) & (i140 | i73);
            int i150 = ~i73;
            int i151 = (i148 & i149) | (i149 ^ i148);
            int i152 = ~i151;
            int i153 = (i151 | i152) & i152;
            int i154 = i147 & i153;
            int i155 = (i147 | i153) & (~i154);
            int i156 = -(-(((i155 & i154) | (i155 ^ i154)) * (-160)));
            int i157 = i144 & i156;
            int i158 = -(-((i156 ^ i144) | i157));
            int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
            int i160 = (i73 | i150) & i150;
            int i161 = i160 & i81;
            int i162 = ~(((i160 | i81) & (~i161)) | i161);
            int i163 = i140 & i162;
            int i164 = (i162 | i140) & (~i163);
            int i165 = -(~(((i164 & i163) | (i164 ^ i163)) * 160));
            int i166 = ((i159 & i165) + (i165 | i159)) - 1;
            byte[] bArr = ((byte[][]) setY(new Object[]{acrVar2}, 202881993, -202881986, System.identityHashCode(acrVar2)))[i84];
            int i167 = ((i114 * 303) - (~(i166 * (-301)))) - 1;
            int i168 = ~i114;
            int i169 = (i168 | i114) & i168;
            int i170 = ((~i50) & i169) | ((~i169) & i50);
            int i171 = i169 & i50;
            int i172 = (i171 & i170) | (i170 ^ i171);
            int i173 = i172 ^ i166;
            int i174 = i172 & i166;
            int i175 = ~((i174 & i173) | (i173 ^ i174));
            int i176 = i114 & i166;
            int i177 = i176 | ((~i176) & (i114 | i166));
            int i178 = (i177 & i50) | ((~i177) & iIntValue);
            int i179 = i177 & iIntValue;
            int i180 = (i179 & i178) | (i178 ^ i179);
            int i181 = ~i180;
            int i182 = (i180 | i181) & i181;
            int i183 = i175 ^ i182;
            int i184 = i175 & i182;
            int i185 = -(-(((i184 & i183) | (i183 ^ i184)) * (-302)));
            int i186 = i167 & i185;
            int i187 = ((i167 ^ i185) | i186) << 1;
            int i188 = -((i167 | i185) & (~i186));
            int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
            int i190 = i168 ^ i166;
            int i191 = i168 & i166;
            int i192 = (i190 & i191) | (i190 ^ i191);
            int i193 = -(-((~((i192 & iIntValue) | (i192 ^ iIntValue))) * (-604)));
            int i194 = (((~i193) & i189) | ((~i189) & i193)) + ((i193 & i189) << 1);
            int i195 = ~i166;
            int i196 = i195 ^ i114;
            int i197 = i195 & i114;
            int i198 = ~((i197 & i196) | (i196 ^ i197));
            int i199 = i166 & iIntValue;
            int i200 = (~i199) & (i166 | iIntValue);
            int i201 = ~((i199 & i200) | (i200 ^ i199));
            int i202 = i198 ^ i201;
            int i203 = i198 & i201;
            int i204 = -(-(((i203 & i202) | (i202 ^ i203)) * 302));
            acj acjVar = new acj(bArr, i166, (((~i204) & i194) | ((~i194) & i204)) + ((i204 & i194) << 1), true);
            abxVar = abxVar2;
            acj acjVar2 = abxVar.setDividerPadding;
            if (acjVar2 == null) {
                int i205 = f52419w0;
                int i206 = (i205 ^ 3) + ((i205 & 3) << 1);
                f52420x0 = i206 % 128;
                if (i206 % 2 == 0) {
                    acjVar.setOnDragListener = acjVar;
                    acjVar.setDividerPadding = acjVar;
                    abxVar.setDividerPadding = acjVar;
                    throw null;
                }
                acjVar.setOnDragListener = acjVar;
                acjVar.setDividerPadding = acjVar;
                abxVar.setDividerPadding = acjVar;
                i11 = (i205 ^ 13) + ((i205 & 13) << 1);
                f52420x0 = i11 % 128;
            } else {
                Intrinsics.checkNotNull(acjVar2);
                acj acjVar3 = acjVar2.setOnDragListener;
                Intrinsics.checkNotNull(acjVar3);
                int i207 = f52419w0;
                i11 = (i207 ^ 107) + ((i207 & 107) << 1);
                f52420x0 = i11 % 128;
            }
            int i208 = i11 % 2;
            int i209 = i17 & i114;
            i17 = i209 + ((i17 ^ i114) | i209);
            int i210 = -(~(i84 * (-396)));
            int i211 = (-2) & i50;
            int i212 = (~i211) & ((-2) | i50);
            int i213 = ~((i211 & i212) | (i212 ^ i211));
            int i214 = ~i84;
            int i215 = ((-2) & i214) | (i84 & 1);
            int i216 = (-2) & i84;
            int i217 = ~((i215 & i216) | (i215 ^ i216));
            int i218 = ((~i217) & i213) | ((~i213) & i217);
            int i219 = i213 & i217;
            int i220 = (i219 & i218) | (i218 ^ i219);
            int i221 = i50 ^ i84;
            int i222 = i50 & i84;
            int i223 = ~((i221 & i222) | (i221 ^ i222));
            int i224 = i220 ^ i223;
            int i225 = i220 & i223;
            int i226 = (-2) ^ i84;
            int i227 = ((~(i226 | i216)) * (-397)) + ((((-2) - (((398 ^ i210) + ((i210 & 398) << 1)) ^ (-1))) - (~(-(-(((i225 & i224) | (i224 ^ i225)) * (-397)))))) - 1);
            int i228 = ~((i226 ^ i216) | (i226 & i216));
            int i229 = ((~i228) & iIntValue) | (i50 & i228);
            int i230 = i228 & iIntValue;
            int i231 = (i230 & i229) | (i229 ^ i230);
            int i232 = ~((i214 ^ 1) | (i214 & 1));
            int i233 = i231 ^ i232;
            int i234 = i231 & i232;
            int i235 = ((i234 & i233) | (i233 ^ i234)) * 397;
            int i236 = i227 & i235;
            int i237 = (i235 | i227) & (~i236);
            int i238 = -(-(i236 << 1));
            iIntValue2 = ((i237 | i238) << 1) - (i237 ^ i238);
            int i239 = f52419w0 + 59;
            f52420x0 = i239 % 128;
            int i240 = i239 % 2;
            acrVar = acrVar2;
            i12 = 0;
            i13 = 1;
            i14 = 2;
        }
        Object[] objArr6 = new Object[i13];
        objArr6[0] = abxVar;
        abxVar.setX(((Long) abx.setOnFocusChangeListener(objArr6, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() + ((long) iIntValue));
        int i241 = f52419w0;
        int i242 = i241 ^ 83;
        int i243 = -(-((i241 & 83) << 1));
        int i244 = ((i242 | i243) << 1) - (i243 ^ i242);
        f52420x0 = i244 % 128;
        int i245 = i244 % 2;
    }

    public static /* synthetic */ abw e(Object[] objArr) {
        acr acrVar = (acr) objArr[0];
        int i10 = (-2) - ((f52419w0 + 120) ^ (-1));
        f52420x0 = i10 % 128;
        if (i10 % 2 == 0) {
            ((abw) setY(new Object[]{acrVar}, 70051370, -70051370, System.identityHashCode(acrVar))).getNavBarTitleString();
            throw null;
        }
        abw navBarTitleString = ((abw) setY(new Object[]{acrVar}, 70051370, -70051370, System.identityHashCode(acrVar))).getNavBarTitleString();
        int i11 = f52419w0;
        int i12 = i11 ^ 93;
        int i13 = (i11 & 93) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f52420x0 = i14 % 128;
        if (i14 % 2 != 0) {
            return navBarTitleString;
        }
        throw null;
    }

    public static /* synthetic */ String f(Object[] objArr) throws NoSuchAlgorithmException {
        acr acrVar = (acr) objArr[0];
        int i10 = f52420x0;
        int i11 = i10 & 49;
        int i12 = (i10 | 49) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f52419w0 = i14 % 128;
        Object[] objArr2 = new Object[1];
        if (i14 % 2 == 0) {
            objArr2[0] = acrVar;
            return ((abw) setY(objArr2, 70051370, -70051370, System.identityHashCode(acrVar))).setLayoutAnimation();
        }
        objArr2[0] = acrVar;
        ((abw) setY(objArr2, 70051370, -70051370, System.identityHashCode(acrVar))).setLayoutAnimation();
        throw null;
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        acr acrVar = (acr) objArr[0];
        int i10 = f52419w0;
        int i11 = (i10 | 9) << 1;
        int i12 = -(i10 ^ 9);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f52420x0 = i14;
        int i15 = i13 % 2;
        int[] iArr = acrVar.setY;
        if (i15 == 0) {
            throw null;
        }
        int i16 = i14 & 83;
        int i17 = (i14 | 83) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f52419w0 = i19 % 128;
        if (i19 % 2 == 0) {
            return iArr;
        }
        throw null;
    }

    public static /* synthetic */ Boolean h(Object[] objArr) {
        int i10;
        int i11;
        acr acrVar = (acr) objArr[0];
        int i12 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        byte[] bArr = (byte[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i13 = f52419w0;
        int i14 = (i13 & (-80)) | ((~i13) & 79);
        int i15 = -(-((i13 & 79) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f52420x0 = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (iIntValue >= 0) {
            int i18 = f52419w0;
            int i19 = i18 & 121;
            int i20 = ((i18 | 121) & (~i19)) + (i19 << 1);
            f52420x0 = i20 % 128;
            int i21 = i20 % 2;
            int onLongClickListener = acrVar.setOnLongClickListener();
            int i22 = -iIntValue3;
            int i23 = onLongClickListener & i22;
            int i24 = (onLongClickListener ^ i22) | i23;
            if (iIntValue <= ((i23 | i24) << 1) - (i24 ^ i23)) {
                int i25 = f52420x0 + 37;
                f52419w0 = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
                if (iIntValue2 >= 0) {
                    int i26 = ~iIntValue;
                    int i27 = (i26 | iIntValue) & i26;
                    int length = bArr.length;
                    int i28 = i22 * 284;
                    int i29 = -(-(length * (-282)));
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    int i31 = ~i22;
                    int i32 = ~length;
                    int i33 = i31 & i32;
                    int i34 = ~i31;
                    int i35 = i33 | (length & i34) | (length & i31);
                    int i36 = ~i35;
                    int i37 = i36 & (i35 | i36);
                    int i38 = (i31 & i26) | (iIntValue & i34);
                    int i39 = i31 & iIntValue;
                    int i40 = ~((i38 ^ i39) | (i38 & i39));
                    int i41 = i37 & i40;
                    int i42 = (~i41) & (i37 | i40);
                    int i43 = ((i41 & i42) | (i42 ^ i41)) * (-283);
                    int i44 = (i30 & i43) + (i30 | i43);
                    int i45 = i32 ^ i22;
                    int i46 = i32 & i22;
                    int i47 = (~((i45 & i46) | (i45 ^ i46))) * 283;
                    int i48 = i44 & i47;
                    int i49 = -(-((i47 ^ i44) | i48));
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    int i51 = ((~i32) & i31) | (i32 & i34) | i33;
                    int i52 = i51 & iIntValue;
                    int i53 = (i51 | iIntValue) & (~i52);
                    int i54 = (i53 & i52) | (i53 ^ i52);
                    int i55 = ~i54;
                    int i56 = ((i54 | i55) & i55) * 283;
                    if (iIntValue2 <= ((i50 | i56) << 1) - ((i56 & (~i50)) | ((~i56) & i50))) {
                        int i57 = iIntValue & iIntValue3;
                        int i58 = i57 + ((iIntValue ^ iIntValue3) | i57);
                        int iIntValue4 = ((Integer) adb.setY(new Object[]{acrVar, Integer.valueOf(iIntValue)}, 1111134270, -1111134270, iIntValue)).intValue();
                        int i59 = f52419w0;
                        int i60 = (i59 | 11) << 1;
                        int i61 = -(i59 ^ 11);
                        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                        f52420x0 = i62 % 128;
                        int i63 = i62 % 2;
                        int i64 = iIntValue;
                        while (i64 < i58) {
                            int i65 = f52420x0;
                            int i66 = i65 & 11;
                            int i67 = -(-(i65 | 11));
                            int i68 = (i66 & i67) + (i67 | i66);
                            int i69 = i68 % 128;
                            f52419w0 = i69;
                            if (i68 % 2 != 0) {
                                throw null;
                            }
                            if (iIntValue4 == 0) {
                                int i70 = (i69 ^ 45) + ((i69 & 45) << i12);
                                f52420x0 = i70 % 128;
                                int i71 = i70 % 2;
                                i10 = i12;
                                i11 = 0;
                            } else {
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = acrVar;
                                int[] iArr = (int[]) setY(objArr2, 1797316966, -1797316954, System.identityHashCode(acrVar));
                                int i72 = iIntValue4 * (-209);
                                int i73 = 209 & i72;
                                int i74 = i73 + ((i72 ^ ErrorCodes.ERR_CRY_BAD_PROTO) | i73);
                                int i75 = ~iIntValue4;
                                int i76 = (~i75) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                                int i77 = i74 & i76;
                                int i78 = ((i74 ^ i76) | i77) << 1;
                                int i79 = -((~i77) & (i76 | i74));
                                int i80 = (i78 ^ i79) + ((i78 & i79) << i12);
                                int i81 = (i75 | iIntValue4) & i75;
                                int i82 = ~((i81 & i27) | (i81 ^ i27));
                                int i83 = ~iIntValue;
                                int i84 = -(~(-(-((((~i82) & i83) | ((~i83) & i82) | (i82 & i83)) * ErrorCodes.ERR_CRY_IO_PROPERTIES))));
                                int i85 = ((i80 | i84) << 1) - (i84 ^ i80);
                                int i86 = (i85 ^ (-1)) + (i85 << 1);
                                int i87 = ~((i26 & i75) | ((~i26) & iIntValue4) | (i26 & iIntValue4));
                                int i88 = ~i75;
                                int i89 = (i88 & i75) | (i88 ^ i75);
                                int i90 = (i89 & iIntValue) | (i89 & i26) | ((~i89) & iIntValue);
                                int i91 = ~i90;
                                int i92 = (i90 | i91) & i91;
                                int i93 = -(-(((i87 & i92) | (i87 ^ i92)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                                int i94 = ((~i93) & i86) | ((~i86) & i93);
                                int i95 = i86 & i93;
                                i10 = 1;
                                int i96 = -(-(i95 << 1));
                                i11 = iArr[((i94 | i96) << 1) - (i96 ^ i94)];
                                int i97 = f52420x0;
                                int i98 = ((i97 & 78) + (i97 | 78)) - 1;
                                f52419w0 = i98 % 128;
                                int i99 = i98 % 2;
                            }
                            Object[] objArr3 = new Object[i10];
                            objArr3[0] = acrVar;
                            int i100 = ((int[]) setY(objArr3, 1797316966, -1797316954, System.identityHashCode(acrVar)))[iIntValue4];
                            int i101 = -i11;
                            int i102 = i100 & i101;
                            int i103 = -(-((i100 ^ i101) | i102));
                            int i104 = (i102 & i103) + (i103 | i102);
                            int[] iArr2 = (int[]) setY(new Object[]{acrVar}, 1797316966, -1797316954, System.identityHashCode(acrVar));
                            int i105 = i27;
                            int length2 = ((byte[][]) setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar))).length;
                            int i106 = (-2) - (((iIntValue4 * (-830)) - (~(length2 * 832))) ^ (-1));
                            int i107 = ~length2;
                            int i108 = i107 & i26;
                            int i109 = iIntValue2;
                            int i110 = (~i108) & (i107 | i26);
                            int i111 = ~((i110 ^ i108) | (i110 & i108));
                            byte[] bArr2 = bArr;
                            int i112 = ~iIntValue4;
                            int i113 = (iIntValue4 & i107) | (length2 & i112);
                            int i114 = iIntValue4 & length2;
                            int i115 = (i113 ^ i114) | (i113 & i114);
                            acr acrVar2 = acrVar;
                            int i116 = (i115 & i26) | ((~i115) & iIntValue);
                            int i117 = i115 & iIntValue;
                            int i118 = ~((i116 ^ i117) | (i116 & i117));
                            int i119 = i111 ^ i118;
                            int i120 = i118 & i111;
                            int i121 = ((i120 & i119) | (i119 ^ i120)) * (-831);
                            int i122 = (i106 ^ i121) + ((i121 & i106) << 1);
                            int i123 = (i107 | length2) & i107;
                            int i124 = -(-((~((i123 & iIntValue4) | (i123 ^ iIntValue4) | iIntValue)) * (-1662)));
                            int i125 = (((~i124) & i122) | ((~i122) & i124)) + ((i124 & i122) << 1);
                            int i126 = i112 ^ i26;
                            int i127 = i112 & i26;
                            int i128 = (i126 & i127) | (i126 ^ i127);
                            int i129 = ~i128;
                            int i130 = (i128 | i129) & i129;
                            int i131 = iIntValue4 ^ iIntValue;
                            int i132 = iIntValue4 & iIntValue;
                            int i133 = ~((i131 & i132) | (i131 ^ i132));
                            int i134 = i130 ^ i133;
                            int i135 = i130 & i133;
                            int i136 = (i135 & i134) | (i134 ^ i135);
                            int i137 = (length2 ^ iIntValue) | (length2 & iIntValue);
                            int i138 = ~i137;
                            int i139 = (i137 | i138) & i138;
                            int i140 = i136 ^ i139;
                            int i141 = i136 & i139;
                            int i142 = -(-(((i141 & i140) | (i140 ^ i141)) * 831));
                            int i143 = iArr2[((i125 | i142) << 1) - (i142 ^ i125)];
                            int iMin = Math.min(i58, (i11 - (~(-(-i104)))) - 1);
                            int i144 = -i64;
                            int i145 = iMin & i144;
                            int i146 = -(-((iMin ^ i144) | i145));
                            int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
                            int i148 = (i64 - (~i101)) - 1;
                            int i149 = i148 * (-813);
                            int i150 = -(-(i143 * Constant.ERROR_CODE_408));
                            int i151 = (i149 & i150) + (i149 | i150);
                            int i152 = ~i143;
                            int i153 = i152 & i148;
                            int i154 = (~i153) & (i152 | i148);
                            int i155 = ~i148;
                            int i156 = i153 | i154;
                            int i157 = ~i156;
                            int i158 = (i156 | i157) & i157;
                            int i159 = i148 & iIntValue;
                            int i160 = (~i159) & (i148 | iIntValue);
                            int i161 = i160 | i159;
                            int i162 = ~i161;
                            int i163 = (i161 | i162) & i162;
                            int i164 = ((i158 & i163) | (i158 ^ i163)) * (-814);
                            int i165 = i151 ^ i164;
                            int i166 = (i164 & i151) << 1;
                            int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                            int i168 = i152 ^ i26;
                            int i169 = i152 & i26;
                            int i170 = ~((i169 & i168) | (i168 ^ i169));
                            int i171 = (i148 | i155) & i155;
                            int i172 = i171 & i143;
                            int i173 = (~i172) & (i171 | i143);
                            int i174 = (i172 & i173) | (i173 ^ i172);
                            int i175 = ~i174;
                            int i176 = (i174 | i175) & i175;
                            int i177 = i170 & i176;
                            int i178 = (i170 | i176) & (~i177);
                            int i179 = (i178 & i177) | (i178 ^ i177);
                            int i180 = ~((i160 ^ i159) | (i160 & i159));
                            int i181 = i179 & i180;
                            int i182 = (i179 | i180) & (~i181);
                            int i183 = -(-(((i182 & i181) | (i182 ^ i181)) * 407));
                            int i184 = i167 & i183;
                            int i185 = (i183 | i167) & (~i184);
                            int i186 = i184 << 1;
                            int i187 = ((i185 | i186) << 1) - (i185 ^ i186);
                            int i188 = i155 & i143;
                            int i189 = (~i188) & (i155 | i143);
                            int i190 = ~((i188 & i189) | (i189 ^ i188));
                            int i191 = ~((i171 & iIntValue) | (i171 ^ iIntValue));
                            int i192 = i190 & i191;
                            int i193 = (i191 | i190) & (~i192);
                            int i194 = (i193 & i192) | (i193 ^ i192);
                            int i195 = i143 & iIntValue;
                            int i196 = (i143 | iIntValue) & (~i195);
                            int i197 = ~((i196 & i195) | (i196 ^ i195));
                            int i198 = ((i197 & i194) | (i194 ^ i197)) * 407;
                            int i199 = (((~i198) & i187) | ((~i187) & i198)) + ((i198 & i187) << 1);
                            if (!((Boolean) acv.setOnFocusChangeListener(new Object[]{((byte[][]) setY(new Object[]{acrVar2}, 202881993, -202881986, System.identityHashCode(acrVar2)))[iIntValue4], Integer.valueOf(i199), bArr2, Integer.valueOf(i109), Integer.valueOf(i147)}, -55821670, 55821672, i199)).booleanValue()) {
                                int i200 = f52419w0 + 49;
                                int i201 = i200 % 128;
                                f52420x0 = i201;
                                int i202 = i200 % 2;
                                int i203 = (i201 ^ 27) + ((i201 & 27) << 1);
                                f52419w0 = i203 % 128;
                                if (i203 % 2 == 0) {
                                    return Boolean.FALSE;
                                }
                                int i204 = 45 / 0;
                                return Boolean.FALSE;
                            }
                            int i205 = i109 + i147;
                            int i206 = -(~(-(-i147)));
                            i64 = ((i64 & i206) + (i206 | i64)) - 1;
                            int i207 = iIntValue4 & 1;
                            int i208 = ((iIntValue4 ^ 1) | i207) << 1;
                            int i209 = -((iIntValue4 | 1) & (~i207));
                            iIntValue4 = (i209 | i208) + (i208 & i209);
                            int i210 = f52420x0;
                            int i211 = i210 & 73;
                            int i212 = (i210 | 73) & (~i211);
                            int i213 = -(-(i211 << 1));
                            int i214 = ((i212 | i213) << 1) - (i212 ^ i213);
                            f52419w0 = i214 % 128;
                            int i215 = i214 % 2;
                            iIntValue2 = i205;
                            i27 = i105;
                            bArr = bArr2;
                            acrVar = acrVar2;
                            i12 = 1;
                        }
                        int i216 = f52420x0;
                        int i217 = (i216 & 95) + (i216 | 95);
                        f52419w0 = i217 % 128;
                        int i218 = i217 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
        }
        int i219 = f52420x0;
        int i220 = i219 & 107;
        int i221 = (i219 ^ 107) | i220;
        int i222 = ((i220 | i221) << 1) - (i221 ^ i220);
        f52419w0 = i222 % 128;
        if (i222 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if ((!(r6 instanceof com.mypinpad.tsdk.isolation.abw)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r0 = ((r3 | 59) << 1) - (r3 ^ 59);
        com.mypinpad.tsdk.isolation.acr.f52420x0 = r0 % 128;
        r0 = r0 % 2;
        r6 = (com.mypinpad.tsdk.isolation.abw) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r6.setOnLongClickListener() != r1.setOnLongClickListener()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.acr.f52420x0;
        r5 = r0 & 53;
        r3 = ((r0 ^ 53) | r5) << 1;
        r0 = -((r0 | 53) & (~r5));
        r5 = ((r3 | r0) << 1) - (r0 ^ r3);
        com.mypinpad.tsdk.isolation.acr.f52419w0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if ((!r1.setCompoundDrawableTintBlendMode(r6, r1.setOnLongClickListener())) == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.acr.f52420x0 + 117;
        r0 = r6 % 128;
        com.mypinpad.tsdk.isolation.acr.f52419w0 = r0;
        r6 = r6 % 2;
        r6 = (r0 | 3) << 1;
        r0 = -(((~r0) & 3) | (r0 & (-4)));
        r1 = (r6 ^ r0) + ((r6 & r0) << 1);
        com.mypinpad.tsdk.isolation.acr.f52420x0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.acr.f52420x0;
        r1 = r6 & 69;
        r0 = (((r6 ^ 69) | r1) << 1) - ((r6 | 69) & (~r1));
        com.mypinpad.tsdk.isolation.acr.f52419w0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        r6 = r3 ^ 63;
        r0 = ((r3 & 63) | r6) << 1;
        r6 = -r6;
        r1 = (r0 ^ r6) + ((r6 & r0) << 1);
        com.mypinpad.tsdk.isolation.acr.f52420x0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r6 == r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 == r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r6 = r3 | 27;
        r0 = r6 << 1;
        r6 = -(r6 & (~(r3 & 27)));
        r1 = ((r0 | r6) << 1) - (r6 ^ r0);
        com.mypinpad.tsdk.isolation.acr.f52420x0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean i(java.lang.Object[] r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acr.i(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Integer j(Object[] objArr) throws NoSuchAlgorithmException {
        char c10 = 0;
        acr acrVar = (acr) objArr[0];
        int i10 = f52420x0;
        int i11 = i10 & 85;
        int i12 = -(-((i10 ^ 85) | i11));
        int i13 = 1;
        int i14 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52419w0 = i14 % 128;
        if (i14 % 2 != 0) {
            acrVar.setY();
            throw null;
        }
        int y7 = acrVar.setY();
        if (y7 != 0) {
            int i15 = f52420x0;
            int i16 = (((i15 | 23) << 1) - (~(-(((~i15) & 23) | (i15 & (-24)))))) - 1;
            int i17 = i16 % 128;
            f52419w0 = i17;
            int i18 = i16 % 2;
            int i19 = i17 & 15;
            int i20 = ((i17 ^ 15) | i19) << 1;
            int i21 = -((i17 | 15) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f52420x0 = i22 % 128;
            if (i22 % 2 != 0) {
                return Integer.valueOf(y7);
            }
            throw null;
        }
        int i23 = 202881993;
        int i24 = -202881986;
        int length = ((byte[][]) setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar))).length;
        int i25 = f52420x0 + 69;
        f52419w0 = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1;
        while (i27 < length) {
            int i30 = f52420x0;
            int i31 = ((i30 ^ 16) + ((i30 & 16) << i13)) - i13;
            f52419w0 = i31 % 128;
            int i32 = i31 % 2;
            Object[] objArr2 = new Object[i13];
            objArr2[c10] = acrVar;
            int i33 = ((int[]) setY(objArr2, 1797316966, -1797316954, System.identityHashCode(acrVar)))[((length | i27) << i13) - (length ^ i27)];
            Object[] objArr3 = new Object[i13];
            objArr3[c10] = acrVar;
            int i34 = ((int[]) setY(objArr3, 1797316966, -1797316954, System.identityHashCode(acrVar)))[i27];
            Object[] objArr4 = new Object[i13];
            objArr4[c10] = acrVar;
            byte[] bArr = ((byte[][]) setY(objArr4, i23, i24, System.identityHashCode(acrVar)))[i27];
            int i35 = -i28;
            int i36 = ((i34 | i35) << i13) - (i35 ^ i34);
            int iIdentityHashCode = System.identityHashCode(acrVar);
            int i37 = (i33 * (-167)) + (i36 * (-167));
            int i38 = ~i36;
            int i39 = ~i33;
            int i40 = i38 & i39;
            int i41 = (i38 ^ i39) | i40;
            int i42 = ~i41;
            int i43 = i42 & (i41 | i42);
            int i44 = ~iIdentityHashCode;
            int i45 = i44 & (i44 | iIdentityHashCode);
            int i46 = i39 & i45;
            int i47 = length;
            int i48 = (~i46) & (i39 | i45);
            int i49 = ~((i48 ^ i46) | (i48 & i46));
            int i50 = i43 & i49;
            int i51 = (i43 | i49) & (~i50);
            int i52 = -(-(((i51 & i50) | (i51 ^ i50)) * 168));
            int i53 = i37 & i52;
            int i54 = (i52 | i37) & (~i53);
            int i55 = i53 << 1;
            int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
            int i57 = (~i40) & (i38 | i39);
            int i58 = (i57 & i40) | (i57 ^ i40);
            int i59 = i58 & iIdentityHashCode;
            int i60 = (i58 | iIdentityHashCode) & (~i59);
            int i61 = (i60 & i59) | (i60 ^ i59);
            int i62 = ~i61;
            int i63 = -(-(((i61 | i62) & i62) * 168));
            int i64 = i56 & i63;
            int i65 = i64 + ((i63 ^ i56) | i64);
            int i66 = i38 & i45;
            int i67 = ~(i66 | ((~i66) & (i38 | i45)));
            int i68 = (i38 | i36) & i38;
            int i69 = ~((i68 & i33) | (i68 ^ i33));
            int i70 = i67 & i69;
            int i71 = ((i67 | i69) & (~i70)) | i70;
            int i72 = i39 & i36;
            int i73 = (i39 | i36) & (~i72);
            int i74 = (i73 & i72) | (i73 ^ i72);
            int i75 = i74 & iIdentityHashCode;
            int i76 = (i74 | iIdentityHashCode) & (~i75);
            int i77 = (i76 & i75) | (i76 ^ i75);
            int i78 = ~i77;
            int i79 = (((i77 | i78) & i78) | i71) * 168;
            int i80 = (i65 ^ i79) + ((i79 & i65) << 1);
            int i81 = f52419w0;
            int i82 = i81 & 53;
            int i83 = i82 + ((i81 ^ 53) | i82);
            f52420x0 = i83 % 128;
            int i84 = i83 % 2;
            while (i33 < i80) {
                int i85 = (-2) - ((f52419w0 + 8) ^ (-1));
                f52420x0 = i85 % 128;
                int i86 = i85 % 2;
                int i87 = i29 * 31;
                byte b10 = bArr[i33];
                int iIdentityHashCode2 = System.identityHashCode(acrVar);
                int i88 = b10 * (-661);
                int i89 = -(-(i29 * (-20491)));
                int i90 = i88 & i89;
                int i91 = (i90 - (~(-(-((i88 ^ i89) | i90))))) - 1;
                int i92 = ~iIdentityHashCode2;
                int i93 = i92 & (i92 | iIdentityHashCode2);
                int i94 = ~b10;
                int i95 = ~i87;
                int i96 = i94 & i95;
                int i97 = (~i96) & (i94 | i95);
                int i98 = ~((i96 & i97) | (i97 ^ i96));
                int i99 = ((~i98) & i93) | ((~i93) & i98);
                int i100 = i93 & i98;
                int i101 = -(-(((i100 & i99) | (i99 ^ i100)) * 1324));
                int i102 = ((i91 | i101) << 1) - (i101 ^ i91);
                int i103 = b10 & iIdentityHashCode2;
                int i104 = ~(i103 | ((~i103) & (b10 | iIdentityHashCode2)));
                int i105 = ~((iIdentityHashCode2 & i87) | (i87 ^ iIdentityHashCode2));
                int i106 = ((~i105) & i104) | ((~i104) & i105);
                int i107 = i105 & i104;
                int i108 = ((i107 & i106) | (i106 ^ i107)) * (-1324);
                int i109 = i102 & i108;
                int i110 = -(-((i108 ^ i102) | i109));
                int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                int i112 = i94 ^ i87;
                int i113 = i87 & i94;
                int i114 = ~((i113 & i112) | (i112 ^ i113));
                int i115 = i95 & b10;
                int i116 = ~(((b10 | i95) & (~i115)) | i115);
                int i117 = ((~i116) & i114) | ((~i114) & i116);
                int i118 = i114 & i116;
                int i119 = i111 - (~(-(-(((i118 & i117) | (i117 ^ i118)) * 662))));
                i29 = (i119 ^ (-1)) + (i119 << 1);
                int iIdentityHashCode3 = System.identityHashCode(acrVar);
                int i120 = -(-(i33 * (-987)));
                int i121 = ((~i120) & 989) | (i120 & (-990));
                int i122 = (i120 & 989) << 1;
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                int i124 = ~i33;
                int i125 = ~iIdentityHashCode3;
                int i126 = (i125 | iIdentityHashCode3) & i125;
                int i127 = i124 ^ i126;
                int i128 = i126 & i124;
                int i129 = (i128 & i127) | (i127 ^ i128);
                int i130 = i129 & 1;
                int i131 = (i129 | 1) & (~i130);
                int i132 = ~((i131 & i130) | (i131 ^ i130));
                int i133 = i33 ^ 1;
                int i134 = i33 & 1;
                int i135 = (i133 & i134) | (i133 ^ i134);
                int i136 = ~((i135 & iIdentityHashCode3) | (i135 & i125) | ((~i135) & iIdentityHashCode3));
                int i137 = ((i132 & i136) | (i132 ^ i136)) * 988;
                int i138 = i123 & i137;
                int i139 = i137 | i123;
                int i140 = (i138 & i139) + (i139 | i138);
                int i141 = ((i124 ^ 1) | (i124 & 1)) * (-988);
                int i142 = i140 & i141;
                int i143 = ((i141 | i140) & (~i142)) + (i142 << 1);
                int i144 = ~((-2) | i124);
                int i145 = (i124 | i33) & i124;
                int i146 = ~((iIdentityHashCode3 & i145) | (i145 & i125) | ((~i145) & iIdentityHashCode3));
                int i147 = i144 & i146;
                int i148 = (i144 | i146) & (~i147);
                int i149 = (i148 & i147) | (i148 ^ i147);
                int i150 = (i125 ^ 1) | (i125 & 1);
                int i151 = ~((i150 & i33) | (i124 & i150) | ((~i150) & i33));
                int i152 = i149 & i151;
                int i153 = (i149 | i151) & (~i152);
                i33 = (((i153 & i152) | (i153 ^ i152)) * 988) + i143;
                int i154 = f52419w0;
                int i155 = i154 & 21;
                int i156 = -(-(i154 | 21));
                int i157 = (i155 & i156) + (i156 | i155);
                f52420x0 = i157 % 128;
                int i158 = i157 % 2;
            }
            int iIdentityHashCode4 = System.identityHashCode(acrVar);
            int i159 = -(~(-(-(i27 * 561))));
            int i160 = (((-559) & i159) + (i159 | (-559))) - 1;
            int i161 = ~iIdentityHashCode4;
            int i162 = (i161 | iIdentityHashCode4) & i161;
            int i163 = (~((i162 & 1) | (i162 & (-2)) | ((~i162) & 1))) * (-560);
            int i164 = i160 ^ i163;
            int i165 = (i160 & i163) << 1;
            int i166 = (i164 ^ i165) + ((i165 & i164) << 1);
            int i167 = ~i27;
            int i168 = i167 & 1;
            int i169 = (~i168) & (i167 | 1);
            int i170 = iIdentityHashCode4 | (i168 & i169) | (i169 ^ i168);
            int i171 = ~i170;
            int i172 = ((i170 | i171) & i171) * (-560);
            int i173 = i166 & i172;
            int i174 = i172 | i166;
            int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
            int i176 = ((-2) & i167) | (i27 & 1);
            int i177 = (-2) & i27;
            int i178 = ~((i177 & i176) | (i176 ^ i177));
            int i179 = i161 & i27;
            int i180 = (~i179) & (i27 | i161);
            int i181 = -(~(-(-((i178 | (~((i179 & i180) | (i180 ^ i179)))) * 560))));
            int i182 = ((i175 | i181) << 1) - (i181 ^ i175);
            i27 = (i182 ^ (-1)) + (i182 << 1);
            int i183 = f52420x0;
            int i184 = i183 & 69;
            int i185 = (i183 ^ 69) | i184;
            int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
            f52419w0 = i186 % 128;
            int i187 = i186 % 2;
            length = i47;
            i28 = i34;
            c10 = 0;
            i13 = 1;
            i23 = 202881993;
            i24 = -202881986;
        }
        acrVar.setX(i29);
        int i188 = f52420x0;
        int i189 = i188 & 115;
        int i190 = ((i188 ^ 115) | i189) << 1;
        int i191 = -((i188 | 115) & (~i189));
        int i192 = (i190 ^ i191) + ((i191 & i190) << 1);
        f52419w0 = i192 % 128;
        if (i192 % 2 == 0) {
            return Integer.valueOf(i29);
        }
        throw null;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException {
        int length;
        byte[] bArr;
        int i13;
        int i14;
        Object objValueOf;
        int i15;
        int i16 = ~((~i10) | (~i11));
        int i17 = i10 | i11;
        String str = "";
        int i18 = 2;
        int i19 = 0;
        int i20 = 1;
        switch (((i17 | (~i12)) * 756) + (((~(i17 | i12)) | i16) * (-756)) + (i16 * 1512) + (i11 * (-755)) + (i10 * (-755))) {
            case 1:
                acr acrVar = (acr) objArr[0];
                int i21 = f52420x0;
                int i22 = 1;
                int i23 = (-2) - (((i21 ^ 70) + ((i21 & 70) << 1)) ^ (-1));
                f52419w0 = i23 % 128;
                if (i23 % 2 != 0) {
                    byte[] bArr2 = new byte[acrVar.setOnLongClickListener()];
                    length = ((byte[][]) setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar))).length;
                    bArr = bArr2;
                } else {
                    byte[] bArr3 = new byte[acrVar.setOnLongClickListener()];
                    length = ((byte[][]) setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar))).length;
                    i22 = 0;
                    bArr = bArr3;
                }
                int i24 = f52420x0;
                int i25 = i24 & 119;
                int i26 = ((i24 ^ 119) | i25) << 1;
                int i27 = -((119 | i24) & (~i25));
                int i28 = (i26 & i27) + (i27 | i26);
                f52419w0 = i28 % 128;
                int i29 = i28 % 2;
                int i30 = 0;
                int i31 = 0;
                while (i31 < length) {
                    int i32 = f52420x0;
                    int i33 = i32 & 101;
                    int i34 = ((i32 ^ 101) | i33) << 1;
                    int i35 = -((i32 | 101) & (~i33));
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    f52419w0 = i36 % 128;
                    int i37 = i36 % 2;
                    int[] iArr = (int[]) setY(new Object[]{acrVar}, 1797316966, -1797316954, System.identityHashCode(acrVar));
                    int iIdentityHashCode = System.identityHashCode(acrVar);
                    int i38 = i31 * (-665);
                    int i39 = -(~(-(-(length * 334))));
                    int i40 = (-2) - (((i38 & i39) + (i38 | i39)) ^ (-1));
                    int i41 = ~i31;
                    int i42 = ~i41;
                    int i43 = -(~(i41 * (-333)));
                    int i44 = ((i40 & i43) + (i40 | i43)) - 1;
                    int i45 = (i41 | i31) & i41;
                    int i46 = ~iIdentityHashCode;
                    int i47 = i45 & i46;
                    int i48 = ~((i45 ^ i46) | i47);
                    int i49 = length & iIdentityHashCode;
                    int i50 = i49 | ((~i49) & (length | iIdentityHashCode));
                    int i51 = ~i50;
                    int i52 = (i50 | i51) & i51;
                    int i53 = i48 & i52;
                    int i54 = (i52 | i48) & (~i53);
                    int i55 = ((i54 & i53) | (i54 ^ i53)) * 333;
                    int i56 = (i44 ^ i55) + ((i55 & i44) << 1);
                    int i57 = ((~i45) & iIdentityHashCode) | i47;
                    int i58 = iIdentityHashCode & i45;
                    int i59 = ~((i58 & i57) | (i57 ^ i58));
                    int i60 = ((~length) & i46) | ((~i46) & length);
                    int i61 = i46 & length;
                    int i62 = ~((i60 & i61) | (i60 ^ i61));
                    int i63 = i59 & i62;
                    int i64 = -(-((((i59 | i62) & (~i63)) | i63) * 333));
                    int i65 = i56 & i64;
                    int i66 = -(-((i64 ^ i56) | i65));
                    int i67 = iArr[(i65 ^ i66) + ((i66 & i65) << 1)];
                    int i68 = ((int[]) setY(new Object[]{acrVar}, 1797316966, -1797316954, System.identityHashCode(acrVar)))[i31];
                    byte[] bArr4 = ((byte[][]) setY(new Object[]{acrVar}, 202881993, -202881986, System.identityHashCode(acrVar)))[i31];
                    int i69 = -i22;
                    System.identityHashCode(acrVar);
                    int i70 = i69 * 1649;
                    int i71 = i68 * 825;
                    int i72 = (((i70 ^ i71) | (i70 & i71)) << 1) - (((~i71) & i70) | ((~i70) & i71));
                    int i73 = ~i68;
                    int i74 = ((i69 ^ i73) | (i69 & i73)) * (-824);
                    int i75 = i72 & i74;
                    int i76 = i75 + ((i72 ^ i74) | i75);
                    int i77 = i69 & i68;
                    int i78 = (~i77) & (i69 | i68);
                    int i79 = -(~(-(-(((i78 ^ i77) | (i77 & i78)) * (-1648)))));
                    int i80 = (i76 & i79) + (i79 | i76);
                    int i81 = (i80 ^ (-1)) + (i80 << 1);
                    int i82 = ~i69;
                    int i83 = i82 ^ i73;
                    int i84 = i82 & i73;
                    int i85 = -(-(((i84 & i83) | (i83 ^ i84)) * 824));
                    int i86 = ((~i85) & i81) | ((~i81) & i85);
                    int i87 = -(-((i85 & i81) << 1));
                    int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                    int iIdentityHashCode2 = System.identityHashCode(acrVar);
                    int i89 = i88 * 1773;
                    int i90 = i67 * (-885);
                    int i91 = (((~i89) & i90) | ((~i90) & i89)) + ((i89 & i90) << 1);
                    int i92 = ~i88;
                    int i93 = ~i67;
                    int i94 = i92 & i93;
                    int i95 = (~i94) & (i92 | i93);
                    int i96 = ~((i95 ^ i94) | (i95 & i94));
                    int i97 = ~iIdentityHashCode2;
                    int i98 = i93 & i97;
                    int i99 = i98 | ((~i93) & iIdentityHashCode2);
                    int i100 = iIdentityHashCode2 & i93;
                    int i101 = ~((i100 & i99) | (i99 ^ i100));
                    int i102 = i96 & i101;
                    int i103 = (i101 | i96) & (~i102);
                    int i104 = (i103 & i102) | (i103 ^ i102);
                    int i105 = i97 & i88;
                    int i106 = (~i105) & (i97 | i88);
                    int i107 = i106 | i105;
                    int i108 = i107 ^ i67;
                    int i109 = i107 & i67;
                    int i110 = ~((i108 ^ i109) | (i108 & i109));
                    int i111 = length;
                    int i112 = i104 & i110;
                    int i113 = (i91 - (~(-(~((i112 | ((i104 | i110) & (~i112))) * 886))))) - 2;
                    int i114 = i98 | ((~i97) & i67);
                    int i115 = i97 & i67;
                    int i116 = ~((i114 & i115) | (i114 ^ i115));
                    int i117 = ((~i116) & i88) | (i116 & i92);
                    int i118 = i116 & i88;
                    int i119 = -(-(((i118 & i117) | (i117 ^ i118)) * (-1772)));
                    int i120 = i113 & i119;
                    int i121 = (i119 ^ i113) | i120;
                    int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                    int i123 = -(~((~((i106 ^ i105) | (i106 & i105))) * 886));
                    ArraysKt___ArraysJvmKt.copyInto(bArr4, bArr, i30, i67, ((i122 & i123) + (i123 | i122)) - 1);
                    int i124 = -(-i88);
                    int i125 = (i30 | i124) << 1;
                    int i126 = -(((~i30) & i124) | ((~i124) & i30));
                    i30 = ((i126 & i125) << 1) + (i125 ^ i126);
                    int iIdentityHashCode3 = System.identityHashCode(acrVar);
                    int i127 = 70 - (~(i31 * (-69)));
                    int i128 = (-2) & i31;
                    int i129 = ~(((-2) ^ i31) | i128);
                    int i130 = ~((i31 ^ iIdentityHashCode3) | (i31 & iIdentityHashCode3));
                    int i131 = i129 ^ i130;
                    int i132 = i129 & i130;
                    int i133 = -(-(((i132 & i131) | (i131 ^ i132)) * (-140)));
                    int i134 = i127 & i133;
                    int i135 = -(-((i127 ^ i133) | i134));
                    int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
                    int i137 = i41 & 1;
                    int i138 = i137 | i128;
                    int i139 = i31 & 1;
                    int i140 = (i138 & i139) | (i138 ^ i139);
                    int i141 = i140 & iIdentityHashCode3;
                    int i142 = (i140 | iIdentityHashCode3) & (~i141);
                    int i143 = ~iIdentityHashCode3;
                    int i144 = (i136 - (~(-(-((~((i142 & i141) | (i142 ^ i141))) * 70))))) - 1;
                    int i145 = (i31 | (-2)) & (~i128);
                    int i146 = ~((i128 & i145) | (i145 ^ i128));
                    int i147 = (i41 & (-2)) | (i42 & 1);
                    int i148 = (i137 & i147) | (i147 ^ i137);
                    int i149 = ~i148;
                    int i150 = (i148 | i149) & i149;
                    int i151 = ((~i150) & i146) | ((~i146) & i150);
                    int i152 = i150 & i146;
                    int i153 = (i152 & i151) | (i151 ^ i152);
                    int i154 = (i143 & 1) | (iIdentityHashCode3 & (-2));
                    int i155 = iIdentityHashCode3 & 1;
                    int i156 = (i155 & i154) | (i154 ^ i155);
                    int i157 = ~i156;
                    int i158 = (i156 | i157) & i157;
                    int i159 = -(-(((i158 & i153) | ((~i158) & i153) | ((~i153) & i158)) * 70));
                    int i160 = i144 & i159;
                    i31 = (((i159 | i144) & (~i160)) - (~(i160 << 1))) - 1;
                    int i161 = f52419w0;
                    int i162 = (i161 | 1) << 1;
                    int i163 = -(((~i161) & 1) | (i161 & (-2)));
                    int i164 = (i162 & i163) + (i163 | i162);
                    f52420x0 = i164 % 128;
                    int i165 = i164 % 2;
                    i22 = i68;
                    length = i111;
                }
                int i166 = f52419w0;
                int i167 = (i166 & 5) + (i166 | 5);
                f52420x0 = i167 % 128;
                int i168 = i167 % 2;
                objValueOf = bArr;
                break;
            case 2:
                acr acrVar2 = (acr) objArr[0];
                int i169 = f52419w0;
                int i170 = i169 & 17;
                int i171 = (i170 - (~((i169 ^ 17) | i170))) - 1;
                f52420x0 = i171 % 128;
                int i172 = i171 % 2;
                byte[] z10 = acrVar2.setZ();
                int i173 = f52419w0;
                int i174 = (((i173 | 112) << 1) - (i173 ^ 112)) - 1;
                f52420x0 = i174 % 128;
                int i175 = i174 % 2;
                objValueOf = z10;
                break;
            case 3:
                return e(objArr);
            case 4:
                d(objArr);
                return null;
            case 5:
                acr acrVar3 = (acr) objArr[0];
                String str2 = (String) objArr[1];
                int i176 = f52419w0;
                int i177 = ((i176 & 109) - (~(i176 | 109))) - 1;
                f52420x0 = i177 % 128;
                int i178 = i177 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                int length2 = ((byte[][]) setY(new Object[]{acrVar3}, 202881993, -202881986, System.identityHashCode(acrVar3))).length;
                int i179 = f52419w0;
                int i180 = 1;
                int i181 = ((i179 ^ 58) + ((i179 & 58) << 1)) - 1;
                f52420x0 = i181 % 128;
                int i182 = i181 % 2;
                int i183 = 0;
                int i184 = 0;
                while (i183 < length2) {
                    System.identityHashCode(acrVar3);
                    System.identityHashCode(acrVar3);
                    Object[] objArr2 = new Object[i180];
                    objArr2[0] = acrVar3;
                    int[] iArr2 = (int[]) setY(objArr2, 1797316966, -1797316954, System.identityHashCode(acrVar3));
                    int i185 = -(~i183);
                    int i186 = (length2 ^ i185) + ((i185 & length2) << i180);
                    int i187 = iArr2[(i186 ^ (-1)) + (i186 << i180)];
                    Object[] objArr3 = new Object[i180];
                    objArr3[0] = acrVar3;
                    int i188 = ((int[]) setY(objArr3, 1797316966, -1797316954, System.identityHashCode(acrVar3)))[i183];
                    Object[] objArr4 = new Object[i180];
                    objArr4[0] = acrVar3;
                    byte[] bArr5 = ((byte[][]) setY(objArr4, 202881993, -202881986, System.identityHashCode(acrVar3)))[i183];
                    int i189 = -i184;
                    int iIdentityHashCode4 = System.identityHashCode(acrVar3);
                    int i190 = ((i189 * 371) - (~(-(-(i188 * 371))))) - 1;
                    int i191 = ~i188;
                    int i192 = ~iIdentityHashCode4;
                    int i193 = (i192 | iIdentityHashCode4) & i192;
                    int i194 = i191 & i193;
                    int i195 = (~i194) & (i191 | i193);
                    int i196 = ~((i195 ^ i194) | (i194 & i195));
                    int i197 = ~i189;
                    int i198 = length2;
                    int i199 = (i197 & i192) | ((~i197) & iIdentityHashCode4) | (i197 & iIdentityHashCode4);
                    acr acrVar4 = acrVar3;
                    int i200 = ~i199;
                    int i201 = (i199 | i200) & i200;
                    String str3 = str;
                    int i202 = ((~i201) & i196) | ((~i196) & i201);
                    int i203 = i201 & i196;
                    int i204 = -(-(((i203 & i202) | (i202 ^ i203)) * (-370)));
                    int i205 = ((i190 ^ i204) | (i190 & i204)) << 1;
                    int i206 = -((i204 & (~i190)) | ((~i204) & i190));
                    int i207 = ((i205 | i206) << 1) - (i206 ^ i205);
                    int i208 = i197 & i193;
                    int i209 = (~i208) & (i197 | i193);
                    int i210 = ~((i208 & i209) | (i209 ^ i208));
                    int i211 = (i191 | i188) & i191;
                    int i212 = (i211 & i192) | ((~i211) & iIdentityHashCode4);
                    int i213 = i211 & iIdentityHashCode4;
                    int i214 = ~((i213 & i212) | (i212 ^ i213));
                    int i215 = i210 ^ i214;
                    int i216 = i210 & i214;
                    int i217 = (i216 & i215) | (i215 ^ i216);
                    int i218 = (i189 ^ i188) | (i189 & i188);
                    int i219 = ~i218;
                    int i220 = (i218 | i219) & i219;
                    int i221 = i217 & i220;
                    int i222 = (i217 | i220) & (~i221);
                    int i223 = -(-(((i222 & i221) | (i222 ^ i221)) * (-370)));
                    int i224 = i207 ^ i223;
                    int i225 = -(-((i223 & i207) << 1));
                    int i226 = (i224 ^ i225) + ((i225 & i224) << 1);
                    int i227 = i189 | i188;
                    int i228 = ~i227;
                    int i229 = -(-(((i227 | i228) & i228) * 370));
                    int i230 = i226 | i229;
                    messageDigest.update(bArr5, i187, (i230 << 1) - ((~(i229 & i226)) & i230));
                    int i231 = i183 & 1;
                    int i232 = (i183 ^ 1) | i231;
                    i183 = (i231 & i232) + (i231 | i232);
                    int i233 = f52419w0;
                    int i234 = (((i233 | 124) << 1) - (i233 ^ 124)) - 1;
                    f52420x0 = i234 % 128;
                    int i235 = i234 % 2;
                    acrVar3 = acrVar4;
                    i184 = i188;
                    str = str3;
                    length2 = i198;
                    i180 = 1;
                }
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, str);
                abw abwVar = new abw(bArrDigest);
                int i236 = f52420x0;
                int i237 = (i236 & (-2)) | ((~i236) & 1);
                int i238 = -(-((i236 & 1) << 1));
                int i239 = ((i237 | i238) << 1) - (i238 ^ i237);
                f52419w0 = i239 % 128;
                int i240 = i239 % 2;
                return abwVar;
            case 6:
                return h(objArr);
            case 7:
                acr acrVar5 = (acr) objArr[0];
                int i241 = f52420x0;
                int i242 = i241 ^ 115;
                int i243 = -(-((i241 & 115) << 1));
                int i244 = (i242 & i243) + (i243 | i242);
                int i245 = i244 % 128;
                f52419w0 = i245;
                int i246 = i244 % 2;
                byte[][] bArr6 = acrVar5.setDividerPadding;
                int i247 = i245 + 21;
                f52420x0 = i247 % 128;
                int i248 = i247 % 2;
                objValueOf = bArr6;
                break;
            case 8:
                return j(objArr);
            case 9:
                return i(objArr);
            case 10:
                return c(objArr);
            case 11:
                acr acrVar6 = (acr) objArr[0];
                int i249 = f52420x0;
                int i250 = (((i249 | 54) << 1) - (i249 ^ 54)) - 1;
                f52419w0 = i250 % 128;
                int i251 = i250 % 2;
                int[] iArr3 = (int[]) setY(new Object[]{acrVar6}, 1797316966, -1797316954, System.identityHashCode(acrVar6));
                int length3 = ((byte[][]) setY(new Object[]{acrVar6}, 202881993, -202881986, System.identityHashCode(acrVar6))).length;
                System.identityHashCode(acrVar6);
                int i252 = -(-(length3 * (-628)));
                int i253 = ((((-630) | i252) << 1) - (~(-(i252 ^ (-630))))) - 1;
                int i254 = ~length3;
                int i255 = i254 & (i254 | length3);
                int i256 = (i253 - (~(i255 * (-629)))) - 1;
                int i257 = -(-((~i255) * (-629)));
                int i258 = (i256 ^ i257) + ((i257 & i256) << 1);
                int i259 = length3 * 629;
                int i260 = (i258 | i259) << 1;
                int i261 = -((i259 & (~i258)) | ((~i259) & i258));
                int i262 = iArr3[(i260 ^ i261) + ((i260 & i261) << 1)];
                int i263 = f52420x0;
                int i264 = (i263 & 27) + (i263 | 27);
                f52419w0 = i264 % 128;
                int i265 = i264 % 2;
                return Integer.valueOf(i262);
            case 12:
                return g(objArr);
            case 13:
                acr acrVar7 = (acr) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i266 = f52419w0;
                int i267 = ((i266 | 99) << 1) - (i266 ^ 99);
                f52420x0 = i267 % 128;
                int i268 = i267 % 2;
                int[] iArr4 = (int[]) setY(new Object[]{acrVar7}, 1797316966, -1797316954, System.identityHashCode(acrVar7));
                int length4 = ((byte[][]) setY(new Object[]{acrVar7}, 202881993, -202881986, System.identityHashCode(acrVar7))).length;
                int i269 = 495 - (~(-(~(length4 * (-496)))));
                int i270 = (i269 ^ (-1)) + (i269 << 1);
                int i271 = ~length4;
                int i272 = ~i271;
                int i273 = -(~(i272 * 497));
                int i274 = ((i270 & i273) + (i270 | i273)) - 1;
                int i275 = ~iIntValue;
                int i276 = i271 & i275;
                int i277 = (iIntValue & i272) | i276;
                int i278 = i271 & iIntValue;
                int i279 = ~((i277 & i278) | (i277 ^ i278));
                int i280 = i276 | (i271 ^ i275);
                int i281 = ~i280;
                int i282 = ~((i280 & i281) | (i281 ^ i280));
                int i283 = ((~i282) & i279) | ((~i279) & i282);
                int i284 = i282 & i279;
                int i285 = ((i284 & i283) | (i283 ^ i284)) * 497;
                int i286 = (i274 ^ i285) + ((i285 & i274) << 1);
                int i287 = ~i275;
                int i288 = ~length4;
                int i289 = (length4 | i288) & i288;
                int i290 = i287 & i289;
                int i291 = (i289 | i287) & (~i290);
                int i292 = (i291 & i290) | (i291 ^ i290);
                int i293 = (i271 & i272) | (i272 ^ i271);
                int i294 = (i293 & i275) | ((~i293) & iIntValue);
                int i295 = i293 & iIntValue;
                int i296 = ~((i295 & i294) | (i294 ^ i295));
                int i297 = ((i292 & i296) | (i292 ^ i296)) * 497;
                int i298 = ((~i297) & i286) | ((~i286) & i297);
                int i299 = -(-((i297 & i286) << 1));
                acv.setOnFocusChangeListener(new Object[]{Long.valueOf(iArr4[(i298 ^ i299) + ((i299 & i298) << 1)]), Long.valueOf(iIntValue), 1L}, 1264570852, -1264570848, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) adb.setY(new Object[]{acrVar7, Integer.valueOf(iIntValue)}, 1111134270, -1111134270, iIntValue)).intValue();
                if (iIntValue2 == 0) {
                    int i300 = f52419w0;
                    int i301 = ((i300 ^ 121) | (i300 & 121)) << 1;
                    int i302 = -(((~i300) & 121) | (i300 & (-122)));
                    int i303 = (i301 ^ i302) + ((i302 & i301) << 1);
                    int i304 = i303 % 128;
                    f52420x0 = i304;
                    int i305 = i303 % 2;
                    int i306 = ((i304 & 108) + (i304 | 108)) - 1;
                    f52419w0 = i306 % 128;
                    int i307 = i306 % 2;
                    i13 = 0;
                    i14 = 1;
                } else {
                    i13 = ((int[]) setY(new Object[]{acrVar7}, 1797316966, -1797316954, System.identityHashCode(acrVar7)))[(iIntValue2 ^ (-1)) + (iIntValue2 << 1)];
                    int i308 = f52419w0;
                    i14 = 1;
                    int i309 = ((i308 ^ 119) | (i308 & 119)) << 1;
                    int i310 = -((119 & (~i308)) | (i308 & (-120)));
                    int i311 = (i309 ^ i310) + ((i310 & i309) << 1);
                    f52420x0 = i311 % 128;
                    int i312 = i311 % 2;
                }
                Object[] objArr5 = new Object[i14];
                objArr5[0] = acrVar7;
                int[] iArr5 = (int[]) setY(objArr5, 1797316966, -1797316954, System.identityHashCode(acrVar7));
                Object[] objArr6 = new Object[i14];
                objArr6[0] = acrVar7;
                int i313 = iArr5[(iIntValue2 - (~(-(~((byte[][]) setY(objArr6, 202881993, -202881986, System.identityHashCode(acrVar7))).length)))) - 2];
                byte[] bArr7 = ((byte[][]) setY(new Object[]{acrVar7}, 202881993, -202881986, System.identityHashCode(acrVar7)))[iIntValue2];
                int i314 = -(~(-i13));
                int i315 = ((iIntValue & i314) + (i314 | iIntValue)) - 1;
                int i316 = i313 * 141;
                int i317 = -(~(-(-(i315 * (-139)))));
                int i318 = ((i316 & i317) + (i316 | i317)) - 1;
                int i319 = ~i313;
                int i320 = ~i315;
                int i321 = ~((i319 ^ i315) | (i319 & i315));
                int i322 = (i319 | i313) & i319;
                int i323 = i322 & iIntValue;
                int i324 = ~(i323 | ((~i323) & (i322 | iIntValue)));
                int i325 = (i318 - (~(((i321 & i324) | (((~i324) & i321) | ((~i321) & i324))) * (-280)))) - 1;
                int i326 = i319 & iIntValue;
                int i327 = (~i326) & (i319 | iIntValue);
                int i328 = ~((i326 & i327) | (i327 ^ i326));
                int i329 = (i320 | i315) & i320;
                int i330 = i329 ^ iIntValue;
                int i331 = i329 & iIntValue;
                int i332 = ~((i330 & i331) | (i330 ^ i331));
                int i333 = ((~i332) & i328) | ((~i328) & i332);
                int i334 = i328 & i332;
                int i335 = ((i334 & i333) | (i333 ^ i334)) * 140;
                int i336 = i325 ^ i335;
                int i337 = (i335 & i325) << 1;
                int i338 = (i336 & i337) + (i337 | i336);
                int i339 = i319 & i320;
                int i340 = (i319 | i320) & (~i339);
                int i341 = (i340 & i339) | (i340 ^ i339);
                int i342 = i341 & iIntValue;
                int i343 = (i341 | iIntValue) & (~i342);
                int i344 = ~((i343 & i342) | (i343 ^ i342));
                int i345 = ((iIntValue | i275) & i275) | i322;
                int i346 = i345 & i315;
                int i347 = ~(((i315 | i345) & (~i346)) | i346);
                int i348 = i344 & i347;
                int i349 = (i344 | i347) & (~i348);
                int i350 = (i349 & i348) | (i349 ^ i348);
                int i351 = (i329 ^ i275) | (i329 & i275);
                int i352 = ~((i313 & i351) | (i351 ^ i313));
                int i353 = i350 ^ i352;
                int i354 = i352 & i350;
                int i355 = -(-(((i354 & i353) | (i353 ^ i354)) * 140));
                byte b10 = bArr7[(i338 & i355) + (i355 | i338)];
                int i356 = f52420x0;
                int i357 = ((i356 | 49) << 1) - (i356 ^ 49);
                f52419w0 = i357 % 128;
                int i358 = i357 % 2;
                return Byte.valueOf(b10);
            case 14:
                acr acrVar8 = (acr) objArr[0];
                abw abwVar2 = (abw) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i359 = f52420x0 + 95;
                f52419w0 = i359 % 128;
                int i360 = i359 % 2;
                Intrinsics.checkNotNullParameter(abwVar2, "");
                int onLongClickListener = acrVar8.setOnLongClickListener();
                int i361 = -iIntValue3;
                int i362 = i361 * 495;
                int i363 = -(-(onLongClickListener * (-493)));
                int i364 = ((i362 | i363) << 1) - (i363 ^ i362);
                int i365 = ~onLongClickListener;
                int i366 = (~i365) & i361;
                int i367 = ~i361;
                int i368 = (i366 | (i365 & i367) | (i361 & i365)) * (-988);
                int i369 = (i364 & i368) + (i364 | i368);
                int i370 = onLongClickListener & i367;
                int i371 = ((~i370) & (onLongClickListener | i367)) | i370;
                int i372 = ~iIntValue3;
                int i373 = i371 & i372;
                int i374 = (~i373) & (i371 | i372);
                int i375 = -(-(((i374 & i373) | (i374 ^ i373)) * 494));
                int i376 = ((i369 ^ i375) | (i369 & i375)) << 1;
                int i377 = -((i375 & (~i369)) | ((~i375) & i369));
                int i378 = ((i376 | i377) << 1) - (i377 ^ i376);
                int i379 = (i367 | i361) & i367;
                int i380 = (i379 & i365) | (i379 ^ i365);
                int i381 = ~i380;
                int i382 = (i380 | i381) & i381;
                int i383 = (i372 | iIntValue3) & i372;
                int i384 = i383 & onLongClickListener;
                int i385 = (~i384) & (i383 | onLongClickListener);
                int i386 = ~((i384 & i385) | (i385 ^ i384));
                int i387 = ((~i386) & i382) | ((~i382) & i386);
                int i388 = i382 & i386;
                int i389 = (i388 & i387) | (i387 ^ i388);
                int i390 = i361 & onLongClickListener;
                int i391 = (onLongClickListener | i361) & (~i390);
                int i392 = (i391 & i390) | (i391 ^ i390);
                int i393 = ~i392;
                int i394 = (i392 | i393) & i393;
                int i395 = ((~i394) & i389) | ((~i389) & i394);
                int i396 = i389 & i394;
                int i397 = -(-(((i396 & i395) | (i395 ^ i396)) * 494));
                if ((i378 ^ i397) + ((i397 & i378) << 1) >= 0) {
                    int iIntValue4 = ((Integer) adb.setY(new Object[]{acrVar8, 0}, 1111134270, -1111134270, 0)).intValue();
                    int i398 = f52420x0 + 75;
                    f52419w0 = i398 % 128;
                    int i399 = i398 % 2;
                    int i400 = 0;
                    int i401 = 0;
                    while (i400 < iIntValue3) {
                        int i402 = f52420x0;
                        int i403 = (i402 ^ 69) + ((i402 & 69) << i20);
                        f52419w0 = i403 % 128;
                        int i404 = i403 % i18;
                        if (iIntValue4 == 0) {
                            int i405 = i402 & 31;
                            int i406 = (i402 | 31) & (~i405);
                            int i407 = i405 << i20;
                            int i408 = (i406 ^ i407) + ((i406 & i407) << i20);
                            f52419w0 = i408 % 128;
                            i15 = i408 % i18 != 0 ? i20 : i19;
                        } else {
                            Object[] objArr7 = new Object[i20];
                            objArr7[i19] = acrVar8;
                            int[] iArr6 = (int[]) setY(objArr7, 1797316966, -1797316954, System.identityHashCode(acrVar8));
                            int i409 = iIntValue4 * (-667);
                            int i410 = 1335 ^ i409;
                            int i411 = -(-((i409 & 1335) << i20));
                            int i412 = (i410 & i411) + (i411 | i410);
                            int i413 = ~iIntValue4;
                            int i414 = (i372 ^ iIntValue3) | (i372 & iIntValue3);
                            int i415 = ~i414;
                            int i416 = i413 & i415;
                            int i417 = ((((~i416) & (i413 | i415)) | i416) * (-668)) + i412;
                            int i418 = ~((i413 & i372) | ((~i413) & iIntValue3) | (i413 & iIntValue3));
                            int i419 = (i417 - (~((((-1) ^ i418) | i418) * 1336))) - i20;
                            int i420 = i413 & (i413 | iIntValue4);
                            int i421 = ((~i420) & i414) | (i420 & i415);
                            int i422 = i420 & i414;
                            int i423 = (i419 - (~(-(~(-(-(((i422 & i421) | (i421 ^ i422)) * 668))))))) - i20;
                            i15 = iArr6[(i423 ^ (-1)) + (i423 << 1)];
                            int i424 = f52419w0;
                            int i425 = i424 & 89;
                            int i426 = -(-(i424 | 89));
                            int i427 = (i425 ^ i426) + ((i426 & i425) << i20);
                            f52420x0 = i427 % 128;
                            int i428 = i427 % 2;
                        }
                        Object[] objArr8 = new Object[i20];
                        objArr8[0] = acrVar8;
                        int i429 = ((int[]) setY(objArr8, 1797316966, -1797316954, System.identityHashCode(acrVar8)))[iIntValue4];
                        int i430 = -i15;
                        int i431 = ((i430 * 165) - (~(-(~(i429 * (-163)))))) - i20;
                        int i432 = (i431 ^ (-1)) + (i431 << i20);
                        int i433 = i372 & i429;
                        int i434 = (~i433) & (i372 | i429);
                        int i435 = ~i429;
                        int i436 = ~(i433 | i434);
                        int i437 = i430 & i436;
                        int i438 = (i436 | i430) & (~i437);
                        int i439 = ((i438 & i437) | (i438 ^ i437)) * (-328);
                        int i440 = i432 & i439;
                        int i441 = i440 + ((i439 ^ i432) | i440);
                        int i442 = i430 & iIntValue3;
                        int i443 = (~i442) & (i430 | iIntValue3);
                        int i444 = (((i442 & i443) | (i443 ^ i442)) * 164) + i441;
                        int i445 = ~((~i430) | i435);
                        int i446 = (i435 | i429) & i435;
                        int i447 = i383;
                        int i448 = ((~i446) & iIntValue3) | (i446 & i372);
                        int i449 = i446 & iIntValue3;
                        int i450 = ~((i448 & i449) | (i448 ^ i449));
                        int i451 = (i450 & i445) | (i445 ^ i450);
                        int i452 = i372 ^ i430;
                        int i453 = i372 & i430;
                        int i454 = (i452 & i453) | (i452 ^ i453);
                        int i455 = (i454 & i435) | ((~i454) & i429);
                        int i456 = i429 & i454;
                        int i457 = ~((i456 & i455) | (i455 ^ i456));
                        int i458 = ((~i457) & i451) | ((~i451) & i457);
                        int i459 = i451 & i457;
                        int i460 = -(-(((i459 & i458) | (i458 ^ i459)) * 164));
                        int i461 = i444 & i460;
                        int i462 = (((i444 ^ i460) | i461) << 1) - ((i460 | i444) & (~i461));
                        int[] iArr7 = (int[]) setY(new Object[]{acrVar8}, 1797316966, -1797316954, System.identityHashCode(acrVar8));
                        int length5 = ((byte[][]) setY(new Object[]{acrVar8}, 202881993, -202881986, System.identityHashCode(acrVar8))).length;
                        int i463 = ~iIntValue4;
                        int i464 = -i463;
                        int i465 = iArr7[(-2) - (((length5 & i464) + (length5 | i464)) ^ (-1))];
                        int iMin = Math.min(iIntValue3, (i15 - (~(-(-i462)))) - 1);
                        int i466 = -i400;
                        int i467 = 609 - (~(-(-(i466 * 306))));
                        int i468 = iMin * 306;
                        int i469 = (i467 ^ i468) + ((i467 & i468) << 1);
                        int i470 = i466 ^ iMin;
                        int i471 = ~iMin;
                        int i472 = i466 & iMin;
                        int i473 = ~((i470 ^ i472) | (i470 & i472));
                        int i474 = i466 & i372;
                        int i475 = ((~i466) & iIntValue3) | i474;
                        int i476 = i466 & iIntValue3;
                        int i477 = (i475 ^ i476) | (i475 & i476);
                        int i478 = iIntValue3;
                        int i479 = ~i477;
                        int i480 = (i477 | i479) & i479;
                        abw abwVar3 = abwVar2;
                        int i481 = ((~i473) & i480) | ((~i480) & i473);
                        int i482 = i473 & i480;
                        int i483 = -(~(-(-(((i481 & i482) | (i481 ^ i482)) * 305))));
                        int i484 = ((i469 ^ i483) + ((i483 & i469) << 1)) - 1;
                        int i485 = (i471 | iMin) & i471;
                        int i486 = (i372 ^ i466) | i474;
                        int i487 = ~i486;
                        int i488 = (i486 | i487) & i487;
                        int i489 = ((~i488) & i485) | ((~i485) & i488);
                        int i490 = i485 & i488;
                        int i491 = ((i490 & i489) | (i489 ^ i490)) * 305;
                        int i492 = i484 & i491;
                        int i493 = ((i484 ^ i491) | i492) << 1;
                        int i494 = -((i491 | i484) & (~i492));
                        int i495 = (i493 ^ i494) + ((i494 & i493) << 1);
                        int i496 = (i400 & i430) + (i400 | i430);
                        int i497 = i465 & i496;
                        int i498 = ((i465 ^ i496) | i497) << 1;
                        int i499 = -((i496 | i465) & (~i497));
                        if (!abwVar3.setOnFocusChangeListener(i401, ((byte[][]) setY(new Object[]{acrVar8}, 202881993, -202881986, System.identityHashCode(acrVar8)))[iIntValue4], ((i498 | i499) << 1) - (i499 ^ i498), i495)) {
                            int i500 = f52420x0;
                            int i501 = i500 & 123;
                            int i502 = -(-((i500 ^ 123) | i501));
                            int i503 = (i501 ^ i502) + ((i502 & i501) << 1);
                            f52419w0 = i503 % 128;
                            int i504 = i503 % 2;
                            objValueOf = Boolean.FALSE;
                        } else {
                            int i505 = i401 ^ i495;
                            i401 = (((i401 & i495) | i505) << 1) - i505;
                            int i506 = i495 * (-559);
                            int i507 = -(-(i400 * 561));
                            int i508 = i506 & i507;
                            int i509 = (i506 ^ i507) | i508;
                            int i510 = (i508 ^ i509) + ((i509 & i508) << 1);
                            int i511 = i447 & i495;
                            int i512 = (~(i511 | ((~i511) & (i447 | i495)))) * (-560);
                            int i513 = ((~i512) & i510) | ((~i510) & i512);
                            int i514 = -(-((i512 & i510) << 1));
                            int i515 = (i513 & i514) + (i514 | i513);
                            int i516 = ~i400;
                            int i517 = i516 ^ i495;
                            int i518 = ~i495;
                            int i519 = i495 & i516;
                            int i520 = (i519 & i517) | (i517 ^ i519);
                            int i521 = i520 & i478;
                            int i522 = (i520 | i478) & (~i521);
                            int i523 = (i522 & i521) | (i522 ^ i521);
                            int i524 = ~i523;
                            int i525 = -(~(-(-(((i523 | i524) & i524) * (-560)))));
                            int i526 = (i515 & i525) + (i515 | i525);
                            int i527 = (i526 ^ (-1)) + (i526 << 1);
                            int i528 = (i516 & i518) | ((~i518) & i400);
                            int i529 = i518 & i400;
                            int i530 = ~((i528 & i529) | (i528 ^ i529));
                            int i531 = i372 & i400;
                            int i532 = ~(((i400 | i372) & (~i531)) | i531);
                            int i533 = ((~i532) & i530) | ((~i530) & i532);
                            int i534 = i530 & i532;
                            int i535 = ((i534 & i533) | (i533 ^ i534)) * 560;
                            i400 = (i527 & i535) + (i535 | i527);
                            int i536 = -(-(iIntValue4 * 471));
                            int i537 = ((471 | i536) << 1) - (i536 ^ 471);
                            int i538 = ((iIntValue4 ^ 1) | (iIntValue4 & 1)) * (-470);
                            int i539 = ((i537 ^ i538) | (i537 & i538)) << 1;
                            int i540 = -((i538 & (~i537)) | ((~i538) & i537));
                            int i541 = (i539 & i540) + (i540 | i539);
                            int i542 = (-2) ^ i463;
                            int i543 = (-2) & i463;
                            int i544 = ~((i542 ^ i543) | (i542 & i543));
                            int i545 = i463 & (i463 | iIntValue4);
                            int i546 = ~((i545 & i478) | (i545 ^ i478));
                            int i547 = ((~i546) & i544) | ((~i544) & i546);
                            int i548 = i544 & i546;
                            int i549 = (i548 & i547) | (i547 ^ i548);
                            int i550 = i372 & 1;
                            int i551 = (i372 & (-2)) | ((~i372) & 1) | i550;
                            int i552 = (i551 & i463) | ((~i551) & iIntValue4);
                            int i553 = i551 & iIntValue4;
                            int i554 = ~((i553 & i552) | (i552 ^ i553));
                            int i555 = ((~i554) & i549) | ((~i549) & i554);
                            int i556 = i549 & i554;
                            int i557 = -(-(((i556 & i555) | (i555 ^ i556)) * (-470)));
                            int i558 = i541 & i557;
                            int i559 = i558 + ((i557 ^ i541) | i558);
                            int i560 = (i463 ^ 1) | (i463 & 1);
                            int i561 = ~((i560 & i478) | (i560 ^ i478));
                            int i562 = i372 ^ 1;
                            int i563 = (i562 & i550) | (i562 ^ i550);
                            int i564 = i563 ^ iIntValue4;
                            int i565 = iIntValue4 & i563;
                            int i566 = ~((i565 & i564) | (i564 ^ i565));
                            int i567 = i561 & i566;
                            int i568 = (i561 | i566) & (~i567);
                            int i569 = -(-(((i568 & i567) | (i568 ^ i567)) * 470));
                            int i570 = i559 ^ i569;
                            int i571 = (i569 & i559) << 1;
                            iIntValue4 = ((i570 | i571) << 1) - (i571 ^ i570);
                            int i572 = f52419w0 + 5;
                            f52420x0 = i572 % 128;
                            int i573 = i572 % 2;
                            i383 = i447;
                            abwVar2 = abwVar3;
                            iIntValue3 = i478;
                            i18 = 2;
                            i19 = 0;
                            i20 = 1;
                        }
                        break;
                    }
                    int i574 = f52420x0;
                    int i575 = i574 & 45;
                    int i576 = (i574 ^ 45) | i575;
                    int i577 = (i575 ^ i576) + ((i576 & i575) << 1);
                    f52419w0 = i577 % 128;
                    int i578 = i577 % 2;
                    objValueOf = Boolean.TRUE;
                } else {
                    int i579 = f52419w0;
                    int i580 = ((i579 & 92) + (i579 | 92)) - 1;
                    f52420x0 = i580 % 128;
                    objValueOf = Boolean.valueOf(i580 % 2 == 0);
                }
                break;
            case 15:
                acr acrVar9 = (acr) objArr[0];
                int i581 = f52420x0;
                int i582 = i581 & 117;
                int i583 = (((i581 | 117) & (~i582)) - (~(i582 << 1))) - 1;
                f52419w0 = i583 % 128;
                int i584 = i583 % 2;
                String x4 = ((abw) setY(new Object[]{acrVar9}, 70051370, -70051370, System.identityHashCode(acrVar9))).setX();
                int i585 = f52419w0;
                int i586 = (i585 ^ 74) + ((i585 & 74) << 1);
                int i587 = (i586 ^ (-1)) + (i586 << 1);
                f52420x0 = i587 % 128;
                int i588 = i587 % 2;
                return x4;
            case 16:
                return f(objArr);
            default:
                abw abwVar4 = new abw(((acr) objArr[0]).setZ());
                int i589 = f52420x0;
                int i590 = ((i589 & (-50)) | ((~i589) & 49)) + ((i589 & 49) << 1);
                f52419w0 = i590 % 128;
                int i591 = i590 % 2;
                return abwVar4;
        }
        return objValueOf;
    }

    private final Object writeReplace() {
        int i10 = f52419w0 + 5;
        f52420x0 = i10 % 128;
        int i11 = i10 % 2;
        abw abwVar = (abw) setY(new Object[]{this}, 70051370, -70051370, System.identityHashCode(this));
        System.identityHashCode(this);
        System.identityHashCode(this);
        return abwVar;
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setY(new Object[]{this}, 286521789, -286521778, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setY(new Object[]{this, p4}, -284686138, 284686147, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final abw getNavBarTitleString() {
        return (abw) setY(new Object[]{this}, -1795069271, 1795069274, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -2002635691, 2002635699, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final byte[] setAlwaysDrawnWithCacheEnabled() {
        return (byte[]) setY(new Object[]{this}, -644966413, 644966415, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final boolean setCompoundDrawableTintBlendMode(@NotNull abw abwVar, int i10) {
        return ((Boolean) setY(new Object[]{this, abwVar, Integer.valueOf(i10)}, -1698861415, 1698861429, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final abw setDividerPadding(@NotNull String p4) {
        return (abw) setY(new Object[]{this, p4}, 2131055454, -2131055449, System.identityHashCode(this));
    }

    @JvmName(name = "setIncludeFontPadding")
    @NotNull
    public final int[] setIncludeFontPadding() {
        return (int[]) setY(new Object[]{this}, 1797316966, -1797316954, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final String setLayoutAnimation() {
        return (String) setY(new Object[]{this}, 248086480, -248086464, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final boolean setOnFocusChangeListener(int p4, @NotNull byte[] p10, int p11, int p12) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(p4), p10, Integer.valueOf(p11), Integer.valueOf(p12)}, 19904294, -19904288, p4)).booleanValue();
    }

    @JvmName(name = "setTextAlignment")
    @NotNull
    public final byte[][] setTextAlignment() {
        return (byte[][]) setY(new Object[]{this}, 202881993, -202881986, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final void setX(@NotNull abx abxVar, int i10) throws NoSuchAlgorithmException {
        setY(new Object[]{this, abxVar, Integer.valueOf(i10)}, 516752210, -516752206, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final byte[] setZ() {
        return (byte[]) setY(new Object[]{this}, -591824954, 591824955, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, 1837582531, -1837582521, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    @NotNull
    public final String setX() {
        return (String) setY(new Object[]{this}, -741241861, 741241876, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abw
    public final byte setY(int p4) {
        return ((Byte) setY(new Object[]{this, Integer.valueOf(p4)}, 1871804993, -1871804980, p4)).byteValue();
    }
}
