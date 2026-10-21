package com.mypinpad.tsdk.isolation;

import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.fasterxml.jackson.core.JsonPointer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0003\u000f\b\u001eJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\f\u0010\u001c"}, d2 = {"Lcom/mypinpad/tsdk/i/xn;", "", "", "p0", "", "Ljava/security/cert/Certificate;", "p1", "", "setX", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "setY", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/mypinpad/tsdk/i/abo;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/abo;)Lcom/mypinpad/tsdk/i/xn;", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "Lcom/mypinpad/tsdk/i/xn$setOnFocusChangeListener;", "Ljava/util/Set;", "a", "Lcom/mypinpad/tsdk/i/abo;", "()Lcom/mypinpad/tsdk/i/abo;", "setDividerPadding", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class xn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61863b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61864c = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final xn setY;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final abo setDividerPadding;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public Set<setOnFocusChangeListener> setX;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "setCompoundDrawableTintBlendMode", "()Ljava/util/List;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61866s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61867t0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<Certificate> f61869q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f61870r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Certificate> list, String str) {
            super(0);
            this.f61869q0 = list;
            this.f61870r0 = str;
        }

        public static /* synthetic */ List a(Object[] objArr, int i10, int i11, int i12) throws SSLPeerUnverifiedException {
            List listA;
            Object obj;
            List<Certificate> dividerPadding;
            int i13 = ~i10;
            if (((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380)) != 1) {
                a aVar = (a) objArr[0];
                int i14 = f61866s0;
                int i15 = i14 & 69;
                int i16 = i15 + ((i14 ^ 69) | i15);
                f61867t0 = i16 % 128;
                if (i16 % 2 == 0) {
                    xn xnVar = xn.this;
                    throw null;
                }
                xn xnVar2 = xn.this;
                abo aboVar = (abo) xn.setDividerPadding(new Object[]{xnVar2}, 2007120285, -2007120282, System.identityHashCode(xnVar2));
                List<Certificate> list = aVar.f61869q0;
                if (aboVar == null) {
                    int i17 = f61867t0;
                    int i18 = (i17 & 121) + (i17 | 121);
                    f61866s0 = i18 % 128;
                    if (i18 % 2 != 0) {
                        throw null;
                    }
                    int i19 = ((i17 ^ 23) | (i17 & 23)) << 1;
                    int i20 = -(((~i17) & 23) | (i17 & (-24)));
                    int i21 = (i19 & i20) + (i20 | i19);
                    f61866s0 = i21 % 128;
                    int i22 = i21 % 2;
                    dividerPadding = null;
                } else {
                    dividerPadding = aboVar.setDividerPadding(list, aVar.f61870r0);
                    int i23 = f61867t0;
                    int i24 = (i23 & (-58)) | ((~i23) & 57);
                    int i25 = (i23 & 57) << 1;
                    int i26 = (i24 & i25) + (i25 | i24);
                    f61866s0 = i26 % 128;
                    int i27 = i26 % 2;
                }
                if (dividerPadding == null) {
                    int i28 = f61866s0;
                    int i29 = i28 & 71;
                    int i30 = i28 | 71;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    int i32 = i31 % 128;
                    f61867t0 = i32;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                    int i33 = i32 + 87;
                    f61866s0 = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    list = dividerPadding;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                int i35 = f61867t0;
                int i36 = (i35 & (-44)) | ((~i35) & 43);
                int i37 = -(-((i35 & 43) << 1));
                int i38 = (i36 & i37) + (i37 | i36);
                f61866s0 = i38 % 128;
                int i39 = i38 % 2;
                while (it.hasNext()) {
                    int i40 = f61866s0;
                    int i41 = (i40 & (-72)) | ((~i40) & 71);
                    int i42 = -(-((i40 & 71) << 1));
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    f61867t0 = i43 % 128;
                    int i44 = i43 % 2;
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                    int i45 = f61867t0;
                    int i46 = ((i45 & 52) + (i45 | 52)) - 1;
                    f61866s0 = i46 % 128;
                    int i47 = i46 % 2;
                }
                int i48 = f61867t0;
                int i49 = i48 & 97;
                int i50 = (i48 | 97) & (~i49);
                int i51 = i49 << 1;
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                f61866s0 = i52 % 128;
                obj = arrayList;
                if (i52 % 2 != 0) {
                    int i53 = 33 / 0;
                    obj = arrayList;
                }
            } else {
                a aVar2 = (a) objArr[0];
                int i54 = f61866s0 + 97;
                f61867t0 = i54 % 128;
                if (i54 % 2 == 0) {
                    a(new Object[]{aVar2}, 1175288018, -1175288018, System.identityHashCode(aVar2));
                    throw null;
                }
                listA = a(new Object[]{aVar2}, 1175288018, -1175288018, System.identityHashCode(aVar2));
                int i55 = f61867t0;
                int i56 = (i55 ^ 33) + ((i55 & 33) << 1);
                f61866s0 = i56 % 128;
                if (i56 % 2 != 0) {
                    obj = listA;
                    throw null;
                }
            }
            obj = listA;
            return (List) obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ List<? extends X509Certificate> invoke() {
            return a(new Object[]{this}, 986180954, -986180953, System.identityHashCode(this));
        }
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f61872d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f61873e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f61874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f61875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final abw f61876c;

        public setOnFocusChangeListener(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if ((!l.startsWith$default(str, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) str, ProxyConfig.MATCH_ALL_SCHEMES, 1, false, 4, (Object) null) != -1) && ((!l.startsWith$default(str, "**.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) str, ProxyConfig.MATCH_ALL_SCHEMES, 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.indexOf$default((CharSequence) str, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected pattern: ", str).toString());
            }
            String str3 = (String) yu.setCompoundDrawableTintBlendMode(new Object[]{str}, 768394866, -768394863, (int) System.currentTimeMillis());
            if (str3 == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pattern: ", str));
            }
            this.f61874a = str3;
            if (l.startsWith$default(str2, "sha1/", false, 2, null)) {
                this.f61875b = "sha1";
                abw.Companion companion = abw.INSTANCE;
                String strSubstring = str2.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                abw abwVar = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{strSubstring}, 1346172271, -1346172270, (int) System.currentTimeMillis());
                if (abwVar == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pin hash: ", str2));
                }
                this.f61876c = abwVar;
                return;
            }
            if (!l.startsWith$default(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("pins must start with 'sha256/' or 'sha1/': ", str2));
            }
            this.f61875b = "sha256";
            abw.Companion companion2 = abw.INSTANCE;
            String strSubstring2 = str2.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            abw abwVar2 = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{strSubstring2}, 1346172271, -1346172270, (int) System.currentTimeMillis());
            if (abwVar2 == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pin hash: ", str2));
            }
            this.f61876c = abwVar2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0083  */
        /* JADX WARN: Code duplicated, block: B:20:0x0091  */
        /* JADX WARN: Code duplicated, block: B:22:0x014f  */
        /* JADX WARN: Code duplicated, block: B:24:0x015f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0171  */
        /* JADX WARN: Code duplicated, block: B:29:0x017c  */
        /* JADX WARN: Code duplicated, block: B:33:0x0191  */
        /* JADX WARN: Code duplicated, block: B:34:0x0195  */
        /* JADX WARN: Code duplicated, block: B:39:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:45:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:46:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:48:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:50:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:59:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:60:0x02f9  */
        /* JADX WARN: Code duplicated, block: B:65:0x031a  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            boolean z10;
            String str;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            boolean z11;
            boolean zAreEqual;
            int i29;
            int i30 = ~i11;
            int i31 = i10 | i12;
            int i32 = ((i30 | i31) * 668) + ((i10 | (~(i30 | i12))) * 1336) + (((~i31) | i30) * (-668)) + (i11 * (-667)) + (i10 * (-1335));
            if (i32 == 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i33 = f61873e;
                int i34 = (((i33 | 42) << 1) - (i33 ^ 42)) - 1;
                int i35 = i34 % 128;
                f61872d = i35;
                int i36 = i34 % 2;
                abw abwVar = setonfocuschangelistener.f61876c;
                int i37 = (i35 & 15) + (i35 | 15);
                f61873e = i37 % 128;
                if (i37 % 2 == 0) {
                    int i38 = 22 / 0;
                }
                return abwVar;
            }
            if (i32 == 2) {
                setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                int i39 = f61873e;
                int i40 = i39 & 109;
                int i41 = (i39 | 109) & (~i40);
                int i42 = i40 << 1;
                int i43 = (i41 & i42) + (i41 | i42);
                f61872d = i43 % 128;
                int i44 = i43 % 2;
                int iHashCode = setonfocuschangelistener2.f61874a.hashCode() * 31;
                int iHashCode2 = setonfocuschangelistener2.f61875b.hashCode();
                int i45 = (iHashCode & iHashCode2) + (iHashCode | iHashCode2);
                int i46 = i45 * 31;
                int iHashCode3 = setonfocuschangelistener2.f61876c.hashCode();
                int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener2);
                int i47 = iHashCode3 * 141;
                int i48 = i45 * (-4309);
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                int i50 = ~iHashCode3;
                int i51 = ~((i50 ^ i46) | (i50 & i46));
                int i52 = ~iHashCode3;
                int i53 = i52 & iIdentityHashCode;
                int i54 = (~i53) & (i52 | iIdentityHashCode);
                int i55 = ~iIdentityHashCode;
                int i56 = ~((i54 & i53) | (i54 ^ i53));
                int i57 = i51 ^ i56;
                int i58 = i51 & i56;
                int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * (-280)));
                int i60 = ((i49 | i59) << 1) - ((i59 & (~i49)) | ((~i59) & i49));
                int i61 = (i52 & i55) | ((~i52) & iIdentityHashCode);
                int i62 = ~((i61 & i53) | (i61 ^ i53));
                int i63 = ~i46;
                int i64 = (i63 & i55) | ((~i63) & iIdentityHashCode) | (i63 & iIdentityHashCode);
                int i65 = (i64 | (~i64)) & (~i64);
                int i66 = ((i62 & i65) | (i62 ^ i65)) * 140;
                int i67 = (i60 ^ i66) + ((i66 & i60) << 1);
                int i68 = (i50 | iHashCode3) & i52;
                int i69 = ~i46;
                int i70 = i68 ^ i69;
                int i71 = i68 & i69;
                int i72 = (i70 & i71) | (i70 ^ i71);
                int i73 = ~((i72 & iIdentityHashCode) | (i72 ^ iIdentityHashCode));
                int i74 = ~iIdentityHashCode;
                int i75 = i68 & i74;
                int i76 = (i74 | i68) & (~i75);
                int i77 = (i76 & i75) | (i76 ^ i75);
                int i78 = (i77 & i69) | ((~i77) & i46);
                int i79 = i77 & i46;
                int i80 = ~((i79 & i78) | (i78 ^ i79));
                int i81 = i73 & i80;
                int i82 = (i80 | i73) & (~i81);
                int i83 = (i82 & i81) | (i82 ^ i81);
                int i84 = (i46 | i69) & i63;
                int i85 = ((~i55) & i84) | ((~i84) & i55);
                int i86 = i84 & i55;
                int i87 = (i86 & i85) | (i85 ^ i86);
                int i88 = i87 & iHashCode3;
                int i89 = (i87 | iHashCode3) & (~i88);
                int i90 = (i89 & i88) | (i89 ^ i88);
                int i91 = (i90 | (~i90)) & (~i90);
                int i92 = ((~i91) & i83) | ((~i83) & i91);
                int i93 = i83 & i91;
                int i94 = -(~(-(-(((i93 & i92) | (i92 ^ i93)) * 140))));
                int i95 = ((i67 & i94) + (i94 | i67)) - 1;
                int i96 = f61872d;
                int i97 = i96 & 109;
                int i98 = (i96 | 109) & (~i97);
                int i99 = -(-(i97 << 1));
                int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                f61873e = i100 % 128;
                int i101 = i100 % 2;
                return Integer.valueOf(i95);
            }
            if (i32 == 3) {
                setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                Object obj = objArr[1];
                int i102 = f61873e;
                int i103 = ((i102 & (-82)) | ((~i102) & 81)) + ((i102 & 81) << 1);
                int i104 = i103 % 128;
                f61872d = i104;
                int i105 = i103 % 2;
                if (setonfocuschangelistener3 != obj) {
                    if (obj instanceof setOnFocusChangeListener) {
                        setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) obj;
                        if (!Intrinsics.areEqual(setonfocuschangelistener3.f61874a, setonfocuschangelistener4.f61874a)) {
                            int i106 = f61873e;
                            int i107 = ((i106 & 97) - (~(i106 | 97))) - 1;
                            int i108 = i107 % 128;
                            f61872d = i108;
                            int i109 = i107 % 2;
                            int i110 = i108 & 121;
                            int i111 = -(-((i108 ^ 121) | i110));
                            int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                            f61873e = i112 % 128;
                            int i113 = i112 % 2;
                        } else if (!Intrinsics.areEqual(setonfocuschangelistener3.f61875b, setonfocuschangelistener4.f61875b)) {
                            int i114 = f61872d;
                            int i115 = ((i114 | 47) << 1) - (i114 ^ 47);
                            f61873e = i115 % 128;
                            int i116 = i115 % 2;
                            int i117 = ((i114 ^ 20) + ((i114 & 20) << 1)) - 1;
                            f61873e = i117 % 128;
                            int i118 = i117 % 2;
                        } else if (Intrinsics.areEqual(setonfocuschangelistener3.f61876c, setonfocuschangelistener4.f61876c)) {
                            int i119 = f61873e;
                            int i120 = i119 & 79;
                            int i121 = (i119 ^ 79) | i120;
                            int i122 = (i120 & i121) + (i121 | i120);
                            f61872d = i122 % 128;
                            if (i122 % 2 != 0) {
                                int i123 = 9 / 0;
                            }
                        } else {
                            int i124 = f61872d;
                            int i125 = i124 + 37;
                            f61873e = i125 % 128;
                            int i126 = i125 % 2;
                            int i127 = ((i124 | 53) << 1) - (i124 ^ 53);
                            f61873e = i127 % 128;
                            if (i127 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else {
                        int i128 = i102 & 15;
                        int i129 = (i128 - (~((i102 ^ 15) | i128))) - 1;
                        int i130 = i129 % 128;
                        f61872d = i130;
                        int i131 = i129 % 2;
                        int i132 = i130 + 3;
                        f61873e = i132 % 128;
                        if (i132 % 2 == 0) {
                            int i133 = 15 / 0;
                        }
                    }
                    return Boolean.FALSE;
                }
                int i134 = (i104 & 21) + (i104 | 21);
                f61873e = i134 % 128;
                int i135 = i134 % 2;
                int i136 = i104 & 45;
                int i137 = (i104 ^ 45) | i136;
                int i138 = (i136 ^ i137) + ((i136 & i137) << 1);
                f61873e = i138 % 128;
                int i139 = i138 % 2;
                return Boolean.TRUE;
            }
            if (i32 == 4) {
                setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(setonfocuschangelistener5.f61875b);
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append(setonfocuschangelistener5.f61876c.setX());
                String string = sb2.toString();
                int i140 = f61872d;
                int i141 = i140 & 115;
                int i142 = ((i140 | 115) & (~i141)) + (i141 << 1);
                f61873e = i142 % 128;
                if (i142 % 2 != 0) {
                    return string;
                }
                throw null;
            }
            if (i32 != 5) {
                setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                int i143 = f61872d;
                int i144 = ((i143 | 19) << 1) - (i143 ^ 19);
                int i145 = i144 % 128;
                f61873e = i145;
                int i146 = i144 % 2;
                String str2 = setonfocuschangelistener6.f61875b;
                int i147 = ((i145 ^ 41) | (i145 & 41)) << 1;
                int i148 = -(((~i145) & 41) | (i145 & (-42)));
                int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
                f61872d = i149 % 128;
                int i150 = i149 % 2;
                return str2;
            }
            setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
            String str3 = (String) objArr[1];
            int i151 = f61872d;
            int i152 = (i151 & 109) + (i151 | 109);
            f61873e = i152 % 128;
            if (i152 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str3, "");
                if (l.startsWith$default(setonfocuschangelistener7.f61874a, "**.", false, 5, null)) {
                    int i153 = f61873e;
                    int i154 = ((i153 ^ 60) + ((i153 & 60) << 1)) - 1;
                    f61872d = i154 % 128;
                    int i155 = i154 % 2;
                    int length = setonfocuschangelistener7.f61874a.length();
                    int i156 = length & (-3);
                    int i157 = -(-((length ^ (-3)) | i156));
                    i13 = (i156 & i157) + (i157 | i156);
                    int length2 = str3.length();
                    int i158 = -i13;
                    int i159 = length2 ^ i158;
                    int i160 = ((length2 & i158) | i159) << 1;
                    int i161 = -i159;
                    i14 = (i160 & i161) + (i160 | i161);
                    int length3 = str3.length();
                    int iIdentityHashCode2 = System.identityHashCode(setonfocuschangelistener7);
                    int i162 = i158 * (-949);
                    int i163 = -(-(length3 * (-949)));
                    int i164 = (i162 & i163) + (i162 | i163);
                    int i165 = ~length3;
                    int i166 = ~iIdentityHashCode2;
                    int i167 = (i165 ^ i166) | (i165 & i166);
                    int i168 = ~i167;
                    int i169 = i168 & (i167 | i168);
                    int i170 = ~i158;
                    int i171 = i170 & (i170 | i158);
                    int i172 = ~((i171 ^ iIdentityHashCode2) | (i171 & iIdentityHashCode2));
                    int i173 = i169 & i172;
                    int i174 = (i172 | i169) & (~i173);
                    int i175 = -(~(((i174 & i173) | (i174 ^ i173)) * ReturnCode.ERR_REPOSITORY));
                    int i176 = ((i164 ^ i175) + ((i175 & i164) << 1)) - 1;
                    int i177 = (i166 & i170) | ((~i166) & i158);
                    int i178 = i166 & i158;
                    int i179 = ~((i177 & i178) | (i177 ^ i178));
                    int i180 = length3 & i166;
                    int i181 = (i165 & iIdentityHashCode2) | i180;
                    int i182 = length3 & iIdentityHashCode2;
                    int i183 = ~((i181 & i182) | (i181 ^ i182));
                    int i184 = i179 & i183;
                    int i185 = (i179 | i183) & (~i184);
                    int i186 = ((i185 & i184) | (i185 ^ i184)) * (-950);
                    int i187 = i176 & i186;
                    int i188 = (i176 ^ i186) | i187;
                    i15 = ((i187 | i188) << 1) - (i188 ^ i187);
                    int i189 = (length3 ^ i166) | i180;
                    int i190 = ~i189;
                    int i191 = (i189 | i190) & i190;
                    int i192 = ~((i158 ^ iIdentityHashCode2) | (i158 & iIdentityHashCode2));
                    i16 = i191 ^ i192;
                    i17 = i191 & i192;
                    if (!(!l.regionMatches$default(str3, (i15 - (~(((i17 & i16) | (i16 ^ i17)) * 950))) - 1, setonfocuschangelistener7.f61874a, 3, i13, false, 16, (Object) null))) {
                        int i193 = f61873e;
                        int i194 = ((i193 & 76) + (i193 | 76)) - 1;
                        i19 = i194 % 128;
                        f61872d = i19;
                        int i195 = i194 % 2;
                        if (i14 != 0) {
                            i21 = (-2) - ((((i19 | 34) << 1) - (i19 ^ 34)) ^ (-1));
                            f61873e = i21 % 128;
                            if (i21 % 2 == 0) {
                            }
                        }
                        i20 = f61872d + 31;
                        f61873e = i20 % 128;
                        if (i20 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                    int i196 = f61873e;
                    i18 = ((i196 & 98) + (i196 | 98)) - 1;
                    f61872d = i18 % 128;
                    if (i18 % 2 != 0) {
                        throw null;
                    }
                } else {
                    z10 = !l.startsWith$default(setonfocuschangelistener7.f61874a, "*.", false, 2, null);
                    str = setonfocuschangelistener7.f61874a;
                    if (z10) {
                        zAreEqual = Intrinsics.areEqual(str3, str);
                        int i197 = f61873e;
                        int i198 = i197 ^ 9;
                        i29 = (((i197 & 9) | i198) << 1) - i198;
                        f61872d = i29 % 128;
                        if (i29 % 2 == 0) {
                            return Boolean.valueOf(zAreEqual);
                        }
                        throw null;
                    }
                    int i199 = f61872d + 73;
                    f61873e = i199 % 128;
                    int i200 = i199 % 2;
                    int length4 = str.length();
                    int iIdentityHashCode3 = System.identityHashCode(setonfocuschangelistener7);
                    int i201 = -(-(length4 * 339));
                    int i202 = (337 & i201) + (i201 | 337);
                    int i203 = ~iIdentityHashCode3;
                    int i204 = ~i203;
                    int i205 = (i204 | i203) & i204;
                    int i206 = ~length4;
                    int i207 = ~i206;
                    int i208 = (i207 & i206) | (i207 ^ i206);
                    int i209 = ~i208;
                    int i210 = (i208 | i209) & i209;
                    int i211 = i205 ^ i210;
                    int i212 = i205 & i210;
                    int i213 = (i203 & iIdentityHashCode3) | (i203 ^ iIdentityHashCode3);
                    int i214 = ~i213;
                    int i215 = -(-((((i213 | i214) & i214) | (i212 & i211) | (i211 ^ i212)) * (-338)));
                    int i216 = i202 & i215;
                    int i217 = (i206 * 338) + i216 + ((i215 ^ i202) | i216);
                    int i218 = (-1) ^ iIdentityHashCode3;
                    int i219 = (iIdentityHashCode3 & i218) | (i218 ^ iIdentityHashCode3);
                    int i220 = ~i219;
                    int i221 = (i219 | i220) & i220;
                    int i222 = i204 ^ i221;
                    int i223 = i221 & i204;
                    int i224 = ((i223 & i222) | (i222 ^ i223)) * 338;
                    int i225 = i217 | i224;
                    int i226 = i225 << 1;
                    int i227 = -((~(i217 & i224)) & i225);
                    i22 = (i226 & i227) + (i227 | i226);
                    int length5 = str3.length();
                    int i228 = -i22;
                    int i229 = ((length5 | i228) << 1) - (length5 ^ i228);
                    int length6 = str3.length();
                    int iIdentityHashCode4 = System.identityHashCode(setonfocuschangelistener7);
                    int i230 = (length6 * (-565)) + (i228 * 567);
                    int i231 = ~i228;
                    int i232 = ~length6;
                    int i233 = ~((i231 ^ length6) | (i231 & length6));
                    int i234 = i231 ^ iIdentityHashCode4;
                    int i235 = i231 & iIdentityHashCode4;
                    int i236 = ~((i234 ^ i235) | (i234 & i235));
                    int i237 = i233 & i236;
                    int i238 = (~i237) & (i233 | i236);
                    int i239 = ((i238 & i237) | (i238 ^ i237)) * (-566);
                    int i240 = i230 & i239;
                    int i241 = ((i230 ^ i239) | i240) << 1;
                    int i242 = -((i239 | i230) & (~i240));
                    int i243 = (i241 ^ i242) + ((i242 & i241) << 1);
                    int i244 = i232 & i228;
                    int i245 = (~i244) & (i228 | i232);
                    int i246 = (~((i244 & i245) | (i245 ^ i244))) * 566;
                    int i247 = i243 & i246;
                    i23 = ((i246 | i243) & (~i247)) + (i247 << 1);
                    int i248 = (i232 | length6) & i232;
                    int i249 = (i248 & i231) | (i231 ^ i248);
                    int i250 = i249 ^ iIdentityHashCode4;
                    int i251 = i249 & iIdentityHashCode4;
                    i24 = (~((i251 & i250) | (i250 ^ i251))) * 566;
                    i25 = i23 ^ i24;
                    if (l.regionMatches$default(str3, (((i23 & i24) | i25) << 1) - i25, setonfocuschangelistener7.f61874a, 1, i22, false, 16, (Object) null)) {
                        i27 = f61873e + 41;
                        f61872d = i27 % 128;
                        if (i27 % 2 != 0 ? StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', i229 - 1, false, 4, (Object) null) == -1 : StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, 's', 0, true, 3, (Object) null) == -1) {
                            int i252 = f61872d;
                            int i253 = i252 & 55;
                            i28 = (((i252 | 55) & (~i253)) - (~(i253 << 1))) - 1;
                            int i254 = i28 % 128;
                            f61873e = i254;
                            if (i28 % 2 == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            int i255 = i254 + 85;
                            f61872d = i255 % 128;
                            int i256 = i255 % 2;
                            return Boolean.valueOf(z11);
                        }
                    }
                    int i257 = f61872d;
                    i26 = (i257 ^ 89) + ((i257 & 89) << 1);
                    f61873e = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(str3, "");
                if (l.startsWith$default(setonfocuschangelistener7.f61874a, "**.", false, 2, null)) {
                    int i1510 = f61873e;
                    int i1511 = ((i1510 ^ 60) + ((i1510 & 60) << 1)) - 1;
                    f61872d = i1511 % 128;
                    int i1512 = i1511 % 2;
                    int length7 = setonfocuschangelistener7.f61874a.length();
                    int i1513 = length7 & (-3);
                    int i1514 = -(-((length7 ^ (-3)) | i1513));
                    i13 = (i1513 & i1514) + (i1514 | i1513);
                    int length8 = str3.length();
                    int i1515 = -i13;
                    int i1516 = length8 ^ i1515;
                    int i1610 = ((length8 & i1515) | i1516) << 1;
                    int i1611 = -i1516;
                    i14 = (i1610 & i1611) + (i1610 | i1611);
                    int length9 = str3.length();
                    int iIdentityHashCode5 = System.identityHashCode(setonfocuschangelistener7);
                    int i1612 = i1515 * (-949);
                    int i1613 = -(-(length9 * (-949)));
                    int i1614 = (i1612 & i1613) + (i1612 | i1613);
                    int i1615 = ~length9;
                    int i1616 = ~iIdentityHashCode5;
                    int i1617 = (i1615 ^ i1616) | (i1615 & i1616);
                    int i1618 = ~i1617;
                    int i1619 = i1618 & (i1617 | i1618);
                    int i1710 = ~i1515;
                    int i1711 = i1710 & (i1710 | i1515);
                    int i1712 = ~((i1711 ^ iIdentityHashCode5) | (i1711 & iIdentityHashCode5));
                    int i1713 = i1619 & i1712;
                    int i1714 = (i1712 | i1619) & (~i1713);
                    int i1715 = -(~(((i1714 & i1713) | (i1714 ^ i1713)) * ReturnCode.ERR_REPOSITORY));
                    int i1716 = ((i1614 ^ i1715) + ((i1715 & i1614) << 1)) - 1;
                    int i1717 = (i1616 & i1710) | ((~i1616) & i1515);
                    int i1718 = i1616 & i1515;
                    int i1719 = ~((i1717 & i1718) | (i1717 ^ i1718));
                    int i1810 = length9 & i1616;
                    int i1811 = (i1615 & iIdentityHashCode5) | i1810;
                    int i1812 = length9 & iIdentityHashCode5;
                    int i1813 = ~((i1811 & i1812) | (i1811 ^ i1812));
                    int i1814 = i1719 & i1813;
                    int i1815 = (i1719 | i1813) & (~i1814);
                    int i1816 = ((i1815 & i1814) | (i1815 ^ i1814)) * (-950);
                    int i1817 = i1716 & i1816;
                    int i1818 = (i1716 ^ i1816) | i1817;
                    i15 = ((i1817 | i1818) << 1) - (i1818 ^ i1817);
                    int i1819 = (length9 ^ i1616) | i1810;
                    int i1910 = ~i1819;
                    int i1911 = (i1819 | i1910) & i1910;
                    int i1912 = ~((i1515 ^ iIdentityHashCode5) | (i1515 & iIdentityHashCode5));
                    i16 = i1911 ^ i1912;
                    i17 = i1911 & i1912;
                    if (!(!l.regionMatches$default(str3, (i15 - (~(((i17 & i16) | (i16 ^ i17)) * 950))) - 1, setonfocuschangelistener7.f61874a, 3, i13, false, 16, (Object) null))) {
                        int i1913 = f61873e;
                        int i1914 = ((i1913 & 76) + (i1913 | 76)) - 1;
                        i19 = i1914 % 128;
                        f61872d = i19;
                        int i1915 = i1914 % 2;
                        if (i14 != 0) {
                            i21 = (-2) - ((((i19 | 34) << 1) - (i19 ^ 34)) ^ (-1));
                            f61873e = i21 % 128;
                            if (i21 % 2 == 0) {
                            }
                        }
                        i20 = f61872d + 31;
                        f61873e = i20 % 128;
                        if (i20 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                    int i1916 = f61873e;
                    i18 = ((i1916 & 98) + (i1916 | 98)) - 1;
                    f61872d = i18 % 128;
                    if (i18 % 2 != 0) {
                        throw null;
                    }
                } else {
                    z10 = !l.startsWith$default(setonfocuschangelistener7.f61874a, "*.", false, 2, null);
                    str = setonfocuschangelistener7.f61874a;
                    if (z10) {
                        zAreEqual = Intrinsics.areEqual(str3, str);
                        int i1917 = f61873e;
                        int i1918 = i1917 ^ 9;
                        i29 = (((i1917 & 9) | i1918) << 1) - i1918;
                        f61872d = i29 % 128;
                        if (i29 % 2 == 0) {
                            return Boolean.valueOf(zAreEqual);
                        }
                        throw null;
                    }
                    int i1919 = f61872d + 73;
                    f61873e = i1919 % 128;
                    int i2010 = i1919 % 2;
                    int length10 = str.length();
                    int iIdentityHashCode6 = System.identityHashCode(setonfocuschangelistener7);
                    int i2011 = -(-(length10 * 339));
                    int i2012 = (337 & i2011) + (i2011 | 337);
                    int i2013 = ~iIdentityHashCode6;
                    int i2014 = ~i2013;
                    int i2015 = (i2014 | i2013) & i2014;
                    int i2016 = ~length10;
                    int i2017 = ~i2016;
                    int i2018 = (i2017 & i2016) | (i2017 ^ i2016);
                    int i2019 = ~i2018;
                    int i2110 = (i2018 | i2019) & i2019;
                    int i2111 = i2015 ^ i2110;
                    int i2112 = i2015 & i2110;
                    int i2113 = (i2013 & iIdentityHashCode6) | (i2013 ^ iIdentityHashCode6);
                    int i2114 = ~i2113;
                    int i2115 = -(-((((i2113 | i2114) & i2114) | (i2112 & i2111) | (i2111 ^ i2112)) * (-338)));
                    int i2116 = i2012 & i2115;
                    int i2117 = (i2016 * 338) + i2116 + ((i2115 ^ i2012) | i2116);
                    int i2118 = (-1) ^ iIdentityHashCode6;
                    int i2119 = (iIdentityHashCode6 & i2118) | (i2118 ^ iIdentityHashCode6);
                    int i2210 = ~i2119;
                    int i2211 = (i2119 | i2210) & i2210;
                    int i2212 = i2014 ^ i2211;
                    int i2213 = i2211 & i2014;
                    int i2214 = ((i2213 & i2212) | (i2212 ^ i2213)) * 338;
                    int i2215 = i2117 | i2214;
                    int i2216 = i2215 << 1;
                    int i2217 = -((~(i2117 & i2214)) & i2215);
                    i22 = (i2216 & i2217) + (i2217 | i2216);
                    int length11 = str3.length();
                    int i2218 = -i22;
                    int i2219 = ((length11 | i2218) << 1) - (length11 ^ i2218);
                    int length12 = str3.length();
                    int iIdentityHashCode7 = System.identityHashCode(setonfocuschangelistener7);
                    int i2310 = (length12 * (-565)) + (i2218 * 567);
                    int i2311 = ~i2218;
                    int i2312 = ~length12;
                    int i2313 = ~((i2311 ^ length12) | (i2311 & length12));
                    int i2314 = i2311 ^ iIdentityHashCode7;
                    int i2315 = i2311 & iIdentityHashCode7;
                    int i2316 = ~((i2314 ^ i2315) | (i2314 & i2315));
                    int i2317 = i2313 & i2316;
                    int i2318 = (~i2317) & (i2313 | i2316);
                    int i2319 = ((i2318 & i2317) | (i2318 ^ i2317)) * (-566);
                    int i2410 = i2310 & i2319;
                    int i2411 = ((i2310 ^ i2319) | i2410) << 1;
                    int i2412 = -((i2319 | i2310) & (~i2410));
                    int i2413 = (i2411 ^ i2412) + ((i2412 & i2411) << 1);
                    int i2414 = i2312 & i2218;
                    int i2415 = (~i2414) & (i2218 | i2312);
                    int i2416 = (~((i2414 & i2415) | (i2415 ^ i2414))) * 566;
                    int i2417 = i2413 & i2416;
                    i23 = ((i2416 | i2413) & (~i2417)) + (i2417 << 1);
                    int i2418 = (i2312 | length12) & i2312;
                    int i2419 = (i2418 & i2311) | (i2311 ^ i2418);
                    int i258 = i2419 ^ iIdentityHashCode7;
                    int i259 = i2419 & iIdentityHashCode7;
                    i24 = (~((i259 & i258) | (i258 ^ i259))) * 566;
                    i25 = i23 ^ i24;
                    if (l.regionMatches$default(str3, (((i23 & i24) | i25) << 1) - i25, setonfocuschangelistener7.f61874a, 1, i22, false, 16, (Object) null)) {
                        i27 = f61873e + 41;
                        f61872d = i27 % 128;
                        if (i27 % 2 != 0) {
                            int i2510 = f61872d;
                            int i2511 = i2510 & 55;
                            i28 = (((i2510 | 55) & (~i2511)) - (~(i2511 << 1))) - 1;
                            int i2512 = i28 % 128;
                            f61873e = i2512;
                            if (i28 % 2 == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            int i2513 = i2512 + 85;
                            f61872d = i2513 % 128;
                            int i2514 = i2513 % 2;
                            return Boolean.valueOf(z11);
                        }
                        int i2515 = f61872d;
                        int i2516 = i2515 & 55;
                        i28 = (((i2515 | 55) & (~i2516)) - (~(i2516 << 1))) - 1;
                        int i2517 = i28 % 128;
                        f61873e = i2517;
                        if (i28 % 2 == 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i2518 = i2517 + 85;
                        f61872d = i2518 % 128;
                        int i2519 = i2518 % 2;
                        return Boolean.valueOf(z11);
                    }
                    int i2520 = f61872d;
                    i26 = (i2520 ^ 89) + ((i2520 & 89) << 1);
                    f61873e = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return Boolean.FALSE;
        }

        public final boolean equals(@Nullable Object obj) {
            return ((Boolean) setX(new Object[]{this, obj}, 581094852, -581094849, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) setX(new Object[]{this}, 810129070, -810129068, System.identityHashCode(this))).intValue();
        }

        public final boolean setDividerPadding(@NotNull String str) {
            return ((Boolean) setX(new Object[]{this, str}, -110600466, 110600471, System.identityHashCode(this))).booleanValue();
        }

        @NotNull
        public final abw setOnFocusChangeListener() {
            return (abw) setX(new Object[]{this}, 1361647551, -1361647550, System.identityHashCode(this));
        }

        @NotNull
        public final String setY() {
            return (String) setX(new Object[]{this}, -1501571853, 1501571853, System.identityHashCode(this));
        }

        @NotNull
        public final String toString() {
            return (String) setX(new Object[]{this}, 1080258670, -1080258666, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xn$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0013\u0010\n\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/xn$setX;", "", "Ljava/security/cert/Certificate;", "p0", "", "setDividerPadding", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "Lcom/mypinpad/tsdk/i/abw;", "(Ljava/security/cert/X509Certificate;)Lcom/mypinpad/tsdk/i/abw;", "setX", "Lcom/mypinpad/tsdk/i/xn;", "setY", "Lcom/mypinpad/tsdk/i/xn;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61877a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61878b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
        
            if ((r7 instanceof java.security.cert.X509Certificate) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        
            r7 = kotlin.jvm.internal.Intrinsics.stringPlus("sha256/", ((com.mypinpad.tsdk.isolation.abw) setCompoundDrawableTintBlendMode(new java.lang.Object[]{(java.security.cert.X509Certificate) r7}, 1573314484, -1573314482, (int) java.lang.System.currentTimeMillis())).setX());
            r8 = com.mypinpad.tsdk.isolation.xn.Companion.f61877a;
            r9 = (r8 & 27) + (r8 | 27);
            com.mypinpad.tsdk.isolation.xn.Companion.f61878b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
        
            if ((r9 % 2) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
        
            r8 = 53 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
        
            throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
        
            if ((r7 instanceof java.security.cert.X509Certificate) != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r7, int r8, int r9, int r10) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.xn.Companion.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @JvmStatic
        @NotNull
        public static String setDividerPadding(@NotNull Certificate p4) {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{p4}, -541422531, 541422531, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static abw setX(@NotNull X509Certificate x509Certificate) {
            return (abw) setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1573314484, -1573314482, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static abw setDividerPadding(@NotNull X509Certificate x509Certificate) {
            return (abw) setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1605533793, -1605533792, (int) System.currentTimeMillis());
        }
    }

    static {
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        setY = (xn) setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode}, -1707088433, 1707088433, System.identityHashCode(setcompounddrawabletintblendmode));
        int i10 = f61863b;
        int i11 = ((i10 ^ 43) - (~((i10 & 43) << 1))) - 1;
        f61864c = i11 % 128;
        int i12 = i11 % 2;
    }

    public xn(@NotNull Set<setOnFocusChangeListener> set, @Nullable abo aboVar) {
        Intrinsics.checkNotNullParameter(set, "");
        this.setX = set;
        this.setDividerPadding = aboVar;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f1 A[PHI: r0
      0x01f1: PHI (r0v71 java.util.List) = (r0v65 java.util.List), (r0v89 java.util.List) binds: [B:49:0x01d5, B:46:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0213  */
    /* JADX WARN: Code duplicated, block: B:60:0x0244  */
    /* JADX WARN: Code duplicated, block: B:62:0x027a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0287  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x02df  */
    /* JADX WARN: Code duplicated, block: B:76:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0393 A[LOOP:4: B:87:0x0385->B:89:0x0393, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0406  */
    /* JADX WARN: Code duplicated, block: B:95:0x0415 A[LOOP:5: B:91:0x03ff->B:95:0x0415, LOOP_END] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws SSLPeerUnverifiedException {
        int i13;
        int iHashCode;
        List<setOnFocusChangeListener> list;
        int i14;
        StringBuilder sb2;
        Iterator it;
        int i15;
        Iterator it2;
        int i16;
        abw abwVar;
        abw abwVar2;
        String str;
        int i17;
        int i18;
        Object obj;
        Object next;
        setOnFocusChangeListener setonfocuschangelistener;
        Object obj2;
        int i19;
        int i20 = (i11 * 825) + (i10 * 1649);
        int i21 = ~i11;
        char c10 = 0;
        abw abwVar3 = null;
        switch ((((~i10) | i21) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i21) * (-824)) + i20) {
            case 1:
                xn xnVar = (xn) objArr[0];
                String str2 = (String) objArr[1];
                List list2 = (List) objArr[2];
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(list2, "");
                setDividerPadding(new Object[]{xnVar, str2, xnVar.new a(list2, str2)}, -293371689, 293371694, System.identityHashCode(xnVar));
                int i22 = f61863b;
                int i23 = ((i22 | 106) << 1) - (i22 ^ 106);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                f61864c = i24 % 128;
                if (i24 % 2 == 0) {
                    throw null;
                }
                return null;
            case 2:
                xn xnVar2 = (xn) objArr[0];
                abo aboVar = (abo) objArr[1];
                int i25 = f61864c;
                int i26 = i25 & 111;
                int i27 = i26 + ((i25 ^ 111) | i26);
                f61863b = i27 % 128;
                if (i27 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(aboVar, "");
                    Intrinsics.areEqual(xnVar2.setDividerPadding, aboVar);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(aboVar, "");
                if (!Intrinsics.areEqual(xnVar2.setDividerPadding, aboVar)) {
                    xn xnVar3 = new xn(xnVar2.setX, aboVar);
                    int i28 = f61863b;
                    int i29 = i28 ^ 97;
                    int i30 = (i28 & 97) << 1;
                    int i31 = (i29 & i30) + (i30 | i29);
                    f61864c = i31 % 128;
                    int i32 = i31 % 2;
                    obj = xnVar3;
                    return obj;
                }
                int i33 = f61864c;
                int i34 = i33 & 11;
                int i35 = (i33 | 11) & (~i34);
                int i36 = i34 << 1;
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                f61863b = i37 % 128;
                int i38 = i37 % 2;
                obj2 = xnVar2;
                return obj2;
            case 3:
                xn xnVar4 = (xn) objArr[0];
                int i39 = f61863b;
                int i40 = i39 & 11;
                int i41 = -(-((i39 ^ 11) | i40));
                int i42 = (i40 & i41) + (i41 | i40);
                int i43 = i42 % 128;
                f61864c = i43;
                if (i42 % 2 == 0) {
                    abo aboVar2 = xnVar4.setDividerPadding;
                    throw null;
                }
                abo aboVar3 = xnVar4.setDividerPadding;
                int i44 = (i43 & (-94)) | ((~i43) & 93);
                int i45 = (i43 & 93) << 1;
                int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                f61863b = i46 % 128;
                int i47 = i46 % 2;
                return aboVar3;
            case 4:
                xn xnVar5 = (xn) objArr[0];
                int i48 = f61864c;
                int i49 = (-2) - ((((i48 | 16) << 1) - (i48 ^ 16)) ^ (-1));
                f61863b = i49 % 128;
                int i50 = i49 % 2;
                int iHashCode2 = xnVar5.setX.hashCode();
                int iIdentityHashCode = System.identityHashCode(xnVar5);
                int i51 = iHashCode2 * (-559);
                int i52 = i51 & 851037;
                int i53 = (i52 - (~((i51 ^ 851037) | i52))) - 1;
                int i54 = ~iIdentityHashCode;
                int i55 = i54 & iHashCode2;
                int i56 = (~i55) & (i54 | iHashCode2);
                int i57 = ~iHashCode2;
                int i58 = (~((i55 & i56) | (i56 ^ i55))) * (-560);
                int i59 = ((i53 ^ i58) - (~(-(-((i58 & i53) << 1))))) - 1;
                int i60 = ((-1518) & i57) | (iHashCode2 & 1517);
                int i61 = (-1518) & iHashCode2;
                int i62 = (i61 & i60) | (i60 ^ i61);
                int i63 = (i62 & i54) | ((~i62) & iIdentityHashCode);
                int i64 = iIdentityHashCode & i62;
                int i65 = -(-((~((i64 & i63) | (i63 ^ i64))) * (-560)));
                int i66 = (i59 ^ i65) + ((i65 & i59) << 1);
                int i67 = (iHashCode2 | i57) & i57;
                int i68 = ~((i67 & 1517) | (i67 ^ 1517));
                int i69 = (i54 & (-1518)) | ((~i54) & 1517);
                int i70 = i54 & 1517;
                int i71 = ~((i69 & i70) | (i69 ^ i70));
                int i72 = i68 ^ i71;
                int i73 = i68 & i71;
                int i74 = (i66 - (~(-(~(((i73 & i72) | (i72 ^ i73)) * 560))))) - 1;
                int i75 = ((i74 ^ (-1)) + (i74 << 1)) * 41;
                abo aboVar4 = xnVar5.setDividerPadding;
                if (aboVar4 != null) {
                    int i76 = f61864c;
                    int i77 = (i76 | 45) << 1;
                    int i78 = -(((~i76) & 45) | (i76 & (-46)));
                    int i79 = (i77 & i78) + (i78 | i77);
                    f61863b = i79 % 128;
                    if (i79 % 2 != 0) {
                        iHashCode = aboVar4.hashCode();
                        int i80 = 50 / 0;
                    } else {
                        iHashCode = aboVar4.hashCode();
                    }
                    i13 = iHashCode;
                } else {
                    int i81 = f61863b;
                    int i82 = ((i81 & (-60)) | ((~i81) & 59)) + ((i81 & 59) << 1);
                    f61864c = i82 % 128;
                    int i83 = i82 % 2;
                    i13 = 0;
                }
                int i84 = (i75 - (~(-(-i13)))) - 1;
                int i85 = f61864c;
                int i86 = (((i85 ^ 115) | (i85 & 115)) << 1) - (((~i85) & 115) | (i85 & (-116)));
                f61863b = i86 % 128;
                int i87 = i86 % 2;
                return Integer.valueOf(i84);
            case 5:
                xn xnVar6 = (xn) objArr[0];
                String str3 = (String) objArr[1];
                Function0 function0 = (Function0) objArr[2];
                int i88 = f61863b + 35;
                f61864c = i88 % 128;
                if (i88 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    list = (List) setDividerPadding(new Object[]{xnVar6, str3}, 2102347220, -2102347214, System.identityHashCode(xnVar6));
                    int i89 = 34 / 0;
                    if (list.isEmpty()) {
                        int i90 = f61863b;
                        int i91 = (i90 & (-24)) | ((~i90) & 23);
                        int i92 = (i90 & 23) << 1;
                        i14 = ((i91 | i92) << 1) - (i92 ^ i91);
                        f61864c = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        List<X509Certificate> list3 = (List) function0.invoke();
                        int i93 = f61864c;
                        int i94 = i93 & 69;
                        int i95 = (i93 | 69) & (~i94);
                        int i96 = i94 << 1;
                        int i97 = (i95 & i96) + (i95 | i96);
                        f61863b = i97 % 128;
                        int i98 = i97 % 2;
                        for (X509Certificate x509Certificate : list3) {
                            int i99 = f61864c;
                            int i100 = i99 ^ 7;
                            int i101 = (((i99 & 7) | i100) << 1) - i100;
                            f61863b = i101 % 128;
                            int i102 = i101 % 2;
                            int i103 = f61864c;
                            int i104 = ((i103 | 38) << 1) - (i103 ^ 38);
                            int i105 = (i104 ^ (-1)) + (i104 << 1);
                            f61863b = i105 % 128;
                            int i106 = i105 % 2;
                            abwVar = abwVar3;
                            abwVar2 = abwVar;
                            for (setOnFocusChangeListener setonfocuschangelistener2 : list) {
                                int i107 = f61864c;
                                int i108 = i107 ^ 65;
                                int i109 = (i107 & 65) << 1;
                                int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                                f61863b = i110 % 128;
                                int i111 = i110 % 2;
                                Object[] objArr2 = new Object[1];
                                objArr2[c10] = setonfocuschangelistener2;
                                str = (String) setOnFocusChangeListener.setX(objArr2, -1501571853, 1501571853, System.identityHashCode(setonfocuschangelistener2));
                                if (Intrinsics.areEqual(str, "sha256")) {
                                    i18 = f61864c + 53;
                                    f61863b = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        throw null;
                                    }
                                    if (abwVar == null) {
                                        abw abwVar4 = (abw) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1573314484, -1573314482, (int) System.currentTimeMillis());
                                        int i112 = f61864c;
                                        int i113 = ((i112 & 10) + (i112 | 10)) - 1;
                                        f61863b = i113 % 128;
                                        int i114 = i113 % 2;
                                        abwVar = abwVar4;
                                    }
                                    if (Intrinsics.areEqual((abw) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, 1361647551, -1361647550, System.identityHashCode(setonfocuschangelistener2)), abwVar)) {
                                        int i115 = f61863b;
                                        int i116 = i115 & 51;
                                        int i117 = i116 + ((i115 ^ 51) | i116);
                                        f61864c = i117 % 128;
                                        int i118 = i117 % 2;
                                    } else {
                                        c10 = 0;
                                        abwVar3 = null;
                                    }
                                } else {
                                    if (Intrinsics.areEqual(str, "sha1")) {
                                        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", (String) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, -1501571853, 1501571853, System.identityHashCode(setonfocuschangelistener2))));
                                    }
                                    int i119 = f61863b;
                                    int i120 = i119 & 69;
                                    int i121 = -(-(i119 | 69));
                                    i17 = (i120 ^ i121) + ((i121 & i120) << 1);
                                    f61864c = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        throw null;
                                    }
                                    if (abwVar2 == null) {
                                        abw abwVar5 = (abw) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1605533793, -1605533792, (int) System.currentTimeMillis());
                                        int i122 = f61863b;
                                        int i123 = i122 & 19;
                                        int i124 = (i123 - (~((i122 ^ 19) | i123))) - 1;
                                        f61864c = i124 % 128;
                                        int i125 = i124 % 2;
                                        abwVar2 = abwVar5;
                                    }
                                    if (Intrinsics.areEqual((abw) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, 1361647551, -1361647550, System.identityHashCode(setonfocuschangelistener2)), abwVar2)) {
                                        int i126 = f61863b;
                                        int i127 = i126 & 79;
                                        int i128 = i126 | 79;
                                        int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                                        f61864c = i129 % 128;
                                        int i130 = i129 % 2;
                                    } else {
                                        c10 = 0;
                                        abwVar3 = null;
                                    }
                                }
                            }
                        }
                        sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                        it = list3.iterator();
                        int i131 = f61863b;
                        i15 = (((i131 ^ 89) | (i131 & 89)) << 1) - (~(-(((~i131) & 89) | (i131 & (-90)))));
                        while (true) {
                            int i132 = i15 - 1;
                            f61864c = i132 % 128;
                            int i133 = i132 % 2;
                            if (it.hasNext()) {
                                sb2.append("\n  Pinned certificates for ");
                                sb2.append(str3);
                                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                it2 = list.iterator();
                                int i134 = f61863b;
                                int i135 = (i134 ^ 109) + ((i134 & 109) << 1);
                                f61864c = i135 % 128;
                                int i136 = i135 % 2;
                                while (!(!it2.hasNext())) {
                                    int i137 = f61864c;
                                    int i138 = i137 & 21;
                                    i16 = i138 + ((i137 ^ 21) | i138);
                                    f61863b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) it2.next();
                                        sb2.append("\n    ");
                                        sb2.append(setonfocuschangelistener3);
                                        throw null;
                                    }
                                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) it2.next();
                                    sb2.append("\n    ");
                                    sb2.append(setonfocuschangelistener4);
                                    int i139 = f61863b;
                                    int i140 = ((i139 | 100) << 1) - (i139 ^ 100);
                                    int i141 = (i140 ^ (-1)) + (i140 << 1);
                                    f61864c = i141 % 128;
                                    int i142 = i141 % 2;
                                }
                                String string = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                throw new SSLPeerUnverifiedException(string);
                            }
                            int i143 = f61864c;
                            int i144 = i143 | 5;
                            int i145 = i144 << 1;
                            int i146 = -((~(i143 & 5)) & i144);
                            int i147 = (i145 & i146) + (i146 | i145);
                            f61863b = i147 % 128;
                            int i148 = i147 % 2;
                            X509Certificate x509Certificate2 = (X509Certificate) it.next();
                            sb2.append("\n    ");
                            sb2.append((String) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate2}, -541422531, 541422531, (int) System.currentTimeMillis()));
                            sb2.append(": ");
                            sb2.append(x509Certificate2.getSubjectDN().getName());
                            int i149 = f61863b;
                            i15 = (i149 & 66) + (i149 | 66);
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    list = (List) setDividerPadding(new Object[]{xnVar6, str3}, 2102347220, -2102347214, System.identityHashCode(xnVar6));
                    if (list.isEmpty()) {
                        int i910 = f61863b;
                        int i911 = (i910 & (-24)) | ((~i910) & 23);
                        int i912 = (i910 & 23) << 1;
                        i14 = ((i911 | i912) << 1) - (i912 ^ i911);
                        f61864c = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        List<X509Certificate> list4 = (List) function0.invoke();
                        int i913 = f61864c;
                        int i914 = i913 & 69;
                        int i915 = (i913 | 69) & (~i914);
                        int i916 = i914 << 1;
                        int i917 = (i915 & i916) + (i915 | i916);
                        f61863b = i917 % 128;
                        int i918 = i917 % 2;
                        while (r8.hasNext()) {
                            int i919 = f61864c;
                            int i1010 = i919 ^ 7;
                            int i1011 = (((i919 & 7) | i1010) << 1) - i1010;
                            f61863b = i1011 % 128;
                            int i1012 = i1011 % 2;
                            int i1013 = f61864c;
                            int i1014 = ((i1013 | 38) << 1) - (i1013 ^ 38);
                            int i1015 = (i1014 ^ (-1)) + (i1014 << 1);
                            f61863b = i1015 % 128;
                            int i1016 = i1015 % 2;
                            abwVar = abwVar3;
                            abwVar2 = abwVar;
                            while (r10.hasNext()) {
                                int i1017 = f61864c;
                                int i1018 = i1017 ^ 65;
                                int i1019 = (i1017 & 65) << 1;
                                int i1110 = ((i1018 | i1019) << 1) - (i1019 ^ i1018);
                                f61863b = i1110 % 128;
                                int i1111 = i1110 % 2;
                                Object[] objArr3 = new Object[1];
                                objArr3[c10] = setonfocuschangelistener2;
                                str = (String) setOnFocusChangeListener.setX(objArr3, -1501571853, 1501571853, System.identityHashCode(setonfocuschangelistener2));
                                if (Intrinsics.areEqual(str, "sha256")) {
                                    i18 = f61864c + 53;
                                    f61863b = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        throw null;
                                    }
                                    if (abwVar == null) {
                                        abw abwVar6 = (abw) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1573314484, -1573314482, (int) System.currentTimeMillis());
                                        int i1112 = f61864c;
                                        int i1113 = ((i1112 & 10) + (i1112 | 10)) - 1;
                                        f61863b = i1113 % 128;
                                        int i1114 = i1113 % 2;
                                        abwVar = abwVar6;
                                    }
                                    if (Intrinsics.areEqual((abw) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, 1361647551, -1361647550, System.identityHashCode(setonfocuschangelistener2)), abwVar)) {
                                        int i1115 = f61863b;
                                        int i1116 = i1115 & 51;
                                        int i1117 = i1116 + ((i1115 ^ 51) | i1116);
                                        f61864c = i1117 % 128;
                                        int i1118 = i1117 % 2;
                                    } else {
                                        c10 = 0;
                                        abwVar3 = null;
                                    }
                                } else {
                                    if (Intrinsics.areEqual(str, "sha1")) {
                                        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", (String) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, -1501571853, 1501571853, System.identityHashCode(setonfocuschangelistener2))));
                                    }
                                    int i1119 = f61863b;
                                    int i1210 = i1119 & 69;
                                    int i1211 = -(-(i1119 | 69));
                                    i17 = (i1210 ^ i1211) + ((i1211 & i1210) << 1);
                                    f61864c = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        throw null;
                                    }
                                    if (abwVar2 == null) {
                                        abw abwVar7 = (abw) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, 1605533793, -1605533792, (int) System.currentTimeMillis());
                                        int i1212 = f61863b;
                                        int i1213 = i1212 & 19;
                                        int i1214 = (i1213 - (~((i1212 ^ 19) | i1213))) - 1;
                                        f61864c = i1214 % 128;
                                        int i1215 = i1214 % 2;
                                        abwVar2 = abwVar7;
                                    }
                                    if (Intrinsics.areEqual((abw) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, 1361647551, -1361647550, System.identityHashCode(setonfocuschangelistener2)), abwVar2)) {
                                        int i1216 = f61863b;
                                        int i1217 = i1216 & 79;
                                        int i1218 = i1216 | 79;
                                        int i1219 = (i1217 ^ i1218) + ((i1218 & i1217) << 1);
                                        f61864c = i1219 % 128;
                                        int i1310 = i1219 % 2;
                                    } else {
                                        c10 = 0;
                                        abwVar3 = null;
                                    }
                                }
                            }
                        }
                        sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                        it = list4.iterator();
                        int i1311 = f61863b;
                        i15 = (((i1311 ^ 89) | (i1311 & 89)) << 1) - (~(-(((~i1311) & 89) | (i1311 & (-90)))));
                        while (true) {
                            int i1312 = i15 - 1;
                            f61864c = i1312 % 128;
                            int i1313 = i1312 % 2;
                            if (it.hasNext()) {
                                sb2.append("\n  Pinned certificates for ");
                                sb2.append(str3);
                                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                it2 = list.iterator();
                                int i1314 = f61863b;
                                int i1315 = (i1314 ^ 109) + ((i1314 & 109) << 1);
                                f61864c = i1315 % 128;
                                int i1316 = i1315 % 2;
                                while (!(!it2.hasNext())) {
                                    int i1317 = f61864c;
                                    int i1318 = i1317 & 21;
                                    i16 = i1318 + ((i1317 ^ 21) | i1318);
                                    f61863b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) it2.next();
                                        sb2.append("\n    ");
                                        sb2.append(setonfocuschangelistener5);
                                        throw null;
                                    }
                                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) it2.next();
                                    sb2.append("\n    ");
                                    sb2.append(setonfocuschangelistener6);
                                    int i1319 = f61863b;
                                    int i1410 = ((i1319 | 100) << 1) - (i1319 ^ 100);
                                    int i1411 = (i1410 ^ (-1)) + (i1410 << 1);
                                    f61864c = i1411 % 128;
                                    int i1412 = i1411 % 2;
                                }
                                String string2 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                throw new SSLPeerUnverifiedException(string2);
                            }
                            int i1413 = f61864c;
                            int i1414 = i1413 | 5;
                            int i1415 = i1414 << 1;
                            int i1416 = -((~(i1413 & 5)) & i1414);
                            int i1417 = (i1415 & i1416) + (i1416 | i1415);
                            f61863b = i1417 % 128;
                            int i1418 = i1417 % 2;
                            X509Certificate x509Certificate3 = (X509Certificate) it.next();
                            sb2.append("\n    ");
                            sb2.append((String) Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate3}, -541422531, 541422531, (int) System.currentTimeMillis()));
                            sb2.append(": ");
                            sb2.append(x509Certificate3.getSubjectDN().getName());
                            int i1419 = f61863b;
                            i15 = (i1419 & 66) + (i1419 | 66);
                        }
                    }
                }
                return null;
            case 6:
                xn xnVar7 = (xn) objArr[0];
                String str4 = (String) objArr[1];
                int i150 = f61863b;
                int i151 = (((i150 ^ 71) | (i150 & 71)) << 1) - (((~i150) & 71) | (i150 & (-72)));
                f61864c = i151 % 128;
                int i152 = i151 % 2;
                Intrinsics.checkNotNullParameter(str4, "");
                Set<setOnFocusChangeListener> set = xnVar7.setX;
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                Iterator<T> it3 = set.iterator();
                int i153 = f61863b;
                int i154 = ((i153 & 72) + (i153 | 72)) - 1;
                f61864c = i154 % 128;
                List arrayList = listEmptyList;
                while (true) {
                    int i155 = i154 % 2;
                    do {
                        if (!it3.hasNext()) {
                            int i156 = f61864c;
                            int i157 = i156 & 103;
                            int i158 = i157 + ((i156 ^ 103) | i157);
                            f61863b = i158 % 128;
                            int i159 = i158 % 2;
                            obj = arrayList;
                            return obj;
                        }
                        int i160 = f61864c;
                        int i161 = ((((i160 ^ 11) | (i160 & 11)) << 1) - (~(-(((~i160) & 11) | (i160 & (-12)))))) - 1;
                        f61863b = i161 % 128;
                        if (i161 % 2 != 0) {
                            setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) it3.next();
                            ((Boolean) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener7, str4}, -110600466, 110600471, System.identityHashCode(setonfocuschangelistener7))).booleanValue();
                            throw null;
                        }
                        next = it3.next();
                        setonfocuschangelistener = (setOnFocusChangeListener) next;
                    } while (!((Boolean) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener, str4}, -110600466, 110600471, System.identityHashCode(setonfocuschangelistener))).booleanValue());
                    int i162 = f61863b;
                    int i163 = i162 ^ 63;
                    int i164 = ((i162 & 63) | i163) << 1;
                    int i165 = -i163;
                    int i166 = (i164 ^ i165) + ((i164 & i165) << 1);
                    f61864c = i166 % 128;
                    if (i166 % 2 == 0) {
                        arrayList.isEmpty();
                        throw null;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList();
                        int i167 = f61864c;
                        int i168 = i167 ^ 45;
                        int i169 = (((i167 & 45) | i168) << 1) - i168;
                        f61863b = i169 % 128;
                        int i170 = i169 % 2;
                    }
                    TypeIntrinsics.asMutableList(arrayList).add(next);
                    int i171 = f61864c;
                    i154 = (i171 & 17) + (i171 | 17);
                    f61863b = i154 % 128;
                    arrayList = arrayList;
                }
                break;
            default:
                xn xnVar8 = (xn) objArr[0];
                Object obj3 = objArr[1];
                System.identityHashCode(xnVar8);
                System.identityHashCode(xnVar8);
                if (!(obj3 instanceof xn)) {
                    int i172 = f61864c;
                    int i173 = i172 & 39;
                    i19 = (((i172 | 39) & (~i173)) - (~(i173 << 1))) - 1;
                    f61863b = i19 % 128;
                    if (i19 % 2 == 0) {
                        throw null;
                    }
                    obj2 = Boolean.FALSE;
                } else {
                    int i174 = f61863b + 41;
                    f61864c = i174 % 128;
                    if (i174 % 2 == 0) {
                        Intrinsics.areEqual(((xn) obj3).setX, xnVar8.setX);
                        throw null;
                    }
                    xn xnVar9 = (xn) obj3;
                    if (Intrinsics.areEqual(xnVar9.setX, xnVar8.setX) && Intrinsics.areEqual(xnVar9.setDividerPadding, xnVar8.setDividerPadding)) {
                        int i175 = f61864c;
                        int i176 = (i175 & (-30)) | ((~i175) & 29);
                        int i177 = -(-((i175 & 29) << 1));
                        int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                        f61863b = i178 % 128;
                        int i179 = i178 % 2;
                        obj2 = Boolean.TRUE;
                    } else {
                        int i1710 = f61864c;
                        int i1711 = i1710 & 39;
                        i19 = (((i1710 | 39) & (~i1711)) - (~(i1711 << 1))) - 1;
                        f61863b = i19 % 128;
                        if (i19 % 2 == 0) {
                            throw null;
                        }
                        obj2 = Boolean.FALSE;
                    }
                }
                return obj2;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4}, -869867283, 869867283, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1301826289, 1301826293, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final xn setCompoundDrawableTintBlendMode(@NotNull abo p4) {
        return (xn) setDividerPadding(new Object[]{this, p4}, -1541172891, 1541172893, System.identityHashCode(this));
    }

    public final void setX(@NotNull String p4, @NotNull List<? extends Certificate> p10) throws SSLPeerUnverifiedException {
        setDividerPadding(new Object[]{this, p4, p10}, 1032966311, -1032966310, System.identityHashCode(this));
    }

    public final void setY(@NotNull String p4, @NotNull Function0<? extends List<? extends X509Certificate>> p10) throws SSLPeerUnverifiedException {
        setDividerPadding(new Object[]{this, p4, p10}, -293371689, 293371694, System.identityHashCode(this));
    }

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f61871a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return new xn(CollectionsKt___CollectionsKt.toSet(((setCompoundDrawableTintBlendMode) objArr[0]).f61871a), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final xn setX() {
            return (xn) setX(new Object[]{this}, -1707088433, 1707088433, System.identityHashCode(this));
        }
    }

    @JvmName(name = "setY")
    @Nullable
    public final abo setY() {
        return (abo) setDividerPadding(new Object[]{this}, 2007120285, -2007120282, System.identityHashCode(this));
    }

    public /* synthetic */ xn(Set set, abo aboVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : aboVar);
    }
}
