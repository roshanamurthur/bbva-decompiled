package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/kr;", "", "Lcom/mypinpad/tsdk/i/ka;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/kw;", "p3", "Lcom/mypinpad/tsdk/i/kb;", "p4", "Lcom/mypinpad/tsdk/i/fk;", "setY", "(Lcom/mypinpad/tsdk/i/ka;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/kw;Lcom/mypinpad/tsdk/i/kb;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class kr {

    @NotNull
    public static final kr INSTANCE = new kr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56826b = 1;

    static {
        int i10 = f56826b + 49;
        f56825a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0163  */
    /* JADX WARN: Code duplicated, block: B:38:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x0176  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        List<av> navigationOnClickListener;
        List<av> list;
        boolean z10;
        int i13;
        fk fkVar;
        int i14;
        int i15;
        ka kaVar = (ka) objArr[0];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
        getValue getvalue = (getValue) objArr[2];
        kw kwVar = (kw) objArr[3];
        kb kbVar = (kb) objArr[4];
        int i16 = f56825a;
        int i17 = (((i16 | 24) << 1) - (i16 ^ 24)) - 1;
        f56826b = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        ah ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar}, 1437547358, -1437547304, System.identityHashCode(kaVar));
        if (ahVar != null) {
            an anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
            if (anVar == null) {
                int i19 = f56826b;
                int i20 = i19 & 37;
                int i21 = (i19 ^ 37) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f56825a = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
            } else {
                navigationOnClickListener = anVar.setNavigationOnClickListener();
                int i23 = f56825a;
                int i24 = ((i23 & 89) - (~(-(-(i23 | 89))))) - 1;
                f56826b = i24 % 128;
                int i25 = i24 % 2;
            }
            list = navigationOnClickListener;
            if (list != null) {
                int i26 = f56825a;
                int i27 = i26 & 85;
                int i28 = (i26 | 85) & (~i27);
                int i29 = -(-(i27 << 1));
                i15 = ((i28 | i29) << 1) - (i28 ^ i29);
                f56826b = i15 % 128;
                if (i15 % 2 != 0) {
                    list.isEmpty();
                    throw null;
                }
                if (list.isEmpty()) {
                    int i30 = f56825a;
                    int i31 = i30 & 109;
                    int i32 = i30 | 109;
                    int i33 = (i31 & i32) + (i32 | i31);
                    f56826b = i33 % 128;
                    int i34 = i33 % 2;
                    z10 = true;
                } else {
                    int i35 = f56825a;
                    int i36 = i35 & 125;
                    int i37 = -(-(i35 | 125));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    f56826b = i38 % 128;
                    int i39 = i38 % 2;
                    z10 = false;
                }
            } else {
                int i310 = f56825a;
                int i311 = i310 & 109;
                int i312 = i310 | 109;
                int i313 = (i311 & i312) + (i312 | i311);
                f56826b = i313 % 128;
                int i314 = i313 % 2;
                z10 = true;
            }
            if (!(!z10)) {
                av avVarRemove = navigationOnClickListener.remove(0);
                setText settext = new setText(((Byte) av.setY(new Object[]{avVarRemove}, -888174800, 888174800, System.identityHashCode(avVarRemove))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove}, 1262930435, -1262930433, System.identityHashCode(avVarRemove))).byteValue());
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, avVarRemove}, -1576428727, 1576428728, System.identityHashCode(kaVar));
                getvalue.setOnFocusChangeListener(settext);
                fk fkVar2 = fk.setOnDragListener;
                int i40 = f56826b;
                int i41 = i40 & 99;
                int i42 = (i40 | 99) & (~i41);
                int i43 = -(-(i41 << 1));
                int i44 = (i42 & i43) + (i42 | i43);
                f56825a = i44 % 128;
                int i45 = i44 % 2;
                return fkVar2;
            }
            int i46 = f56825a;
            i13 = ((i46 & 86) + (i46 | 86)) - 1;
            f56826b = i13 % 128;
            if (i13 % 2 != 0) {
                ((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue();
                throw null;
            }
            if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue()) {
                kb.setX(new Object[]{kbVar}, -998431871, 998431874, System.identityHashCode(kbVar));
                int i47 = f56826b;
                int i48 = ((i47 & (-30)) | ((~i47) & 29)) + ((i47 & 29) << 1);
                f56825a = i48 % 128;
                int i49 = i48 % 2;
            }
            fkVar = fk.UiMessageCallbackKtWhenMappings;
            int i50 = f56826b;
            int i51 = i50 & 123;
            int i52 = (i50 ^ 123) | i51;
            i14 = (i51 ^ i52) + ((i52 & i51) << 1);
            f56825a = i14 % 128;
            if (i14 % 2 == 0) {
                return fkVar;
            }
            throw null;
        }
        int i53 = f56826b;
        int i54 = ((i53 ^ 74) + ((i53 & 74) << 1)) - 1;
        int i55 = i54 % 128;
        f56825a = i55;
        if (i54 % 2 != 0) {
            throw null;
        }
        int i56 = i55 & 63;
        int i57 = (((i55 ^ 63) | i56) << 1) - ((i55 | 63) & (~i56));
        f56826b = i57 % 128;
        int i58 = i57 % 2;
        navigationOnClickListener = null;
        list = navigationOnClickListener;
        if (list != null) {
            int i210 = f56825a;
            int i211 = i210 & 85;
            int i212 = (i210 | 85) & (~i211);
            int i213 = -(-(i211 << 1));
            i15 = ((i212 | i213) << 1) - (i212 ^ i213);
            f56826b = i15 % 128;
            if (i15 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (list.isEmpty()) {
                int i315 = f56825a;
                int i316 = i315 & 109;
                int i317 = i315 | 109;
                int i318 = (i316 & i317) + (i317 | i316);
                f56826b = i318 % 128;
                int i319 = i318 % 2;
                z10 = true;
            } else {
                int i320 = f56825a;
                int i321 = i320 & 125;
                int i322 = -(-(i320 | 125));
                int i323 = ((i321 | i322) << 1) - (i322 ^ i321);
                f56826b = i323 % 128;
                int i324 = i323 % 2;
                z10 = false;
            }
        } else {
            int i3110 = f56825a;
            int i3111 = i3110 & 109;
            int i3112 = i3110 | 109;
            int i3113 = (i3111 & i3112) + (i3112 | i3111);
            f56826b = i3113 % 128;
            int i3114 = i3113 % 2;
            z10 = true;
        }
        if (!(!z10)) {
            av avVarRemove2 = navigationOnClickListener.remove(0);
            setText settext2 = new setText(((Byte) av.setY(new Object[]{avVarRemove2}, -888174800, 888174800, System.identityHashCode(avVarRemove2))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove2}, 1262930435, -1262930433, System.identityHashCode(avVarRemove2))).byteValue());
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, avVarRemove2}, -1576428727, 1576428728, System.identityHashCode(kaVar));
            getvalue.setOnFocusChangeListener(settext2);
            fk fkVar3 = fk.setOnDragListener;
            int i410 = f56826b;
            int i411 = i410 & 99;
            int i412 = (i410 | 99) & (~i411);
            int i413 = -(-(i411 << 1));
            int i414 = (i412 & i413) + (i412 | i413);
            f56825a = i414 % 128;
            int i415 = i414 % 2;
            return fkVar3;
        }
        int i416 = f56825a;
        i13 = ((i416 & 86) + (i416 | 86)) - 1;
        f56826b = i13 % 128;
        if (i13 % 2 != 0) {
            ((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue();
            throw null;
        }
        if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -411478475, 411478481, System.identityHashCode(kaVar))).booleanValue()) {
            kb.setX(new Object[]{kbVar}, -998431871, 998431874, System.identityHashCode(kbVar));
            int i417 = f56826b;
            int i418 = ((i417 & (-30)) | ((~i417) & 29)) + ((i417 & 29) << 1);
            f56825a = i418 % 128;
            int i419 = i418 % 2;
        }
        fkVar = fk.UiMessageCallbackKtWhenMappings;
        int i59 = f56826b;
        int i510 = i59 & 123;
        int i511 = (i59 ^ 123) | i510;
        i14 = (i510 ^ i511) + ((i511 & i510) << 1);
        f56825a = i14 % 128;
        if (i14 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    @NotNull
    public static fk setY(@NotNull ka p4, @NotNull setTextKeepState p10, @NotNull getValue p11, @NotNull kw p12, @NotNull kb p13) {
        return (fk) setX(new Object[]{p4, p10, p11, p12, p13}, -837179530, 837179530, (int) System.currentTimeMillis());
    }
}
