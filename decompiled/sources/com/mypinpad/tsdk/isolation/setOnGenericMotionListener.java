package com.mypinpad.tsdk.isolation;

import bk.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ0\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0010J*\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007J\"\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u0010J\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\bJ\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/utils/EmvTagUtils;", "", "()V", "ALL_TAGS", "", "", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/EmvTagMeta;", "currentKernelId", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "getCurrentKernelId", "()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "setCurrentKernelId", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;)V", "buildUnknownTag", "label", "compareTemplate", "", "tagLabel", "parentTemplate", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/DataTemplate;", "kernelId", "doesTagIncludesPermission", "tagProvider", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/TagProvider;", "permission", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;", "allowNone", "getTagByLabel", "createIfAbsent", "getTagByLabelAndKernelId", "getTagKey", "isKnownTag", "common"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setOnGenericMotionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static Terminal f60222a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, TransactionFailed> f60223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60224c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60225d = 1;

    @NotNull
    public static final setOnGenericMotionListener setCompoundDrawableTintBlendMode = new setOnGenericMotionListener();

    static {
        Terminal terminal = Terminal.OTHER;
        f60222a = terminal;
        Terminal terminal2 = Terminal.KERNEL_2;
        setLayoutTransition setlayouttransition = setLayoutTransition.INSTANCE;
        List<Pair> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(terminal2, (List) setLayoutTransition.setY(new Object[0], -1043948860, 1043948865, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_3, (List) setLayoutTransition.setY(new Object[0], -600800083, 600800090, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_4, (List) setLayoutTransition.setY(new Object[0], -1463527548, 1463527549, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_6, (List) setLayoutTransition.setY(new Object[0], -1880810160, 1880810166, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_13, (List) setLayoutTransition.setY(new Object[0], 1758620373, -1758620373, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_INTERAC, (List) setLayoutTransition.setY(new Object[0], -1691765310, 1691765314, (int) System.currentTimeMillis())), TuplesKt.to(Terminal.KERNEL_EFTPOS, (List) setLayoutTransition.setY(new Object[0], 1875920686, -1875920683, (int) System.currentTimeMillis())), TuplesKt.to(terminal, (List) setLayoutTransition.setY(new Object[0], -61630070, 61630072, (int) System.currentTimeMillis()))});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        int i10 = f60225d;
        int i11 = i10 & 51;
        int i12 = (i10 | 51) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f60224c = i14 % 128;
        int i15 = i14 % 2;
        for (Pair pair : listListOf) {
            Iterable<TransactionFailed> iterable = (Iterable) pair.getSecond();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            int i16 = f60225d + 7;
            f60224c = i16 % 128;
            int i17 = i16 % 2;
            for (TransactionFailed transactionFailed : iterable) {
                int i18 = f60225d;
                int i19 = i18 & 63;
                int i20 = -(-((i18 ^ 63) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f60224c = i21 % 128;
                int i22 = i21 % 2;
                arrayList2.add(TuplesKt.to((String) setCompoundDrawableTintBlendMode(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (Terminal) pair.getFirst()}, -811784199, 811784208, (int) System.currentTimeMillis()), transactionFailed));
                int i23 = f60225d;
                int i24 = (i23 ^ 121) + ((i23 & 121) << 1);
                f60224c = i24 % 128;
                int i25 = i24 % 2;
            }
            arrayList.add(arrayList2);
            int i26 = f60224c;
            int i27 = ((-1) << 1) - ((-1) ^ ((i26 ^ 74) + ((i26 & 74) << 1)));
            f60225d = i27 % 128;
            int i28 = i27 % 2;
        }
        f60223b = q.toMap(CollectionsKt__IterablesKt.flatten(arrayList));
        int i29 = f60224c;
        int i30 = ((-1) << 1) - (((i29 ^ 44) + ((i29 & 44) << 1)) ^ (-1));
        f60225d = i30 % 128;
        int i31 = i30 % 2;
    }

    public static /* synthetic */ TransactionFailed a(Object[] objArr) {
        String str = (String) objArr[1];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = (547491080 & i10) | (i10 ^ 547491080);
        int i12 = ((-84967575) & i11) | ((~i11) & 84967574);
        int i13 = i11 & 84967574;
        int i14 = -(-(((i13 & i12) | (i12 ^ i13)) * 1444));
        int i15 = 1528001983 & i14;
        int i16 = (i14 ^ 1528001983) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = (i10 & 2028093257) | ((-2028093258) & iCurrentTimeMillis);
        int i19 = 2028093257 & iCurrentTimeMillis;
        int i20 = ~((i18 & i19) | (i18 ^ i19));
        int i21 = 84967574 & i20;
        int i22 = ((i20 | 84967574) & (~i21)) | i21;
        int i23 = ~((iCurrentTimeMillis & (-1565569752)) | ((-1565569752) ^ iCurrentTimeMillis));
        int i24 = -(-(((i23 & i22) | (i22 ^ i23)) * (-1444)));
        int i25 = i17 & i24;
        int i26 = (i25 - (~(-(-((i24 ^ i17) | i25))))) - 1;
        int i27 = ((1368615533 & i26) | ((~i26) & (-1368615534))) + ((i26 & (-1368615534)) << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i28 = 1275068851 | iCurrentTimeMillis2;
        int i29 = (i28 & (-555919369)) | ((~i28) & 555919368);
        int i30 = i28 & 555919368;
        int i31 = -(-(((i30 & i29) | (i29 ^ i30)) * 376));
        int i32 = 901883898 & i31;
        int i33 = -(-(i31 | 901883898));
        int i34 = (i32 & i33) + (i33 | i32);
        int i35 = ~iCurrentTimeMillis2;
        int i36 = ~((i35 & 1314477555) | (i35 ^ 1314477555));
        int i37 = ((-555919369) & i36) | ((~i36) & 555919368);
        int i38 = i36 & 555919368;
        int i39 = (i34 - (~(((i38 & i37) | (i37 ^ i38)) * (-376)))) - 1;
        int i40 = (-1314477556) & iCurrentTimeMillis2;
        int i41 = (iCurrentTimeMillis2 | (-1314477556)) & (~i40);
        int i42 = (i41 & i40) | (i41 ^ i40);
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        int i45 = (-595328073) & i44;
        int i46 = (i44 | (-595328073)) & (~i45);
        int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * 376));
        int i48 = i39 ^ i47;
        int i49 = (i47 & i39) << 1;
        TransactionFailed transactionFailed = (TransactionFailed) (i27 > (i48 & i49) + (i49 | i48) ? setCompoundDrawableTintBlendMode(new Object[]{str, Boolean.FALSE}, -398106515, 398106525, (int) System.currentTimeMillis()) : setCompoundDrawableTintBlendMode(new Object[]{str, Boolean.TRUE}, -398106515, 398106525, (int) System.currentTimeMillis()));
        int i50 = f60225d;
        int i51 = ((i50 ^ 79) | (i50 & 79)) << 1;
        int i52 = -(((~i50) & 79) | (i50 & (-80)));
        int i53 = (i51 & i52) + (i52 | i51);
        f60224c = i53 % 128;
        if (i53 % 2 == 0) {
            return transactionFailed;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0148 A[PHI: r3
      0x0148: PHI (r3v104 java.util.List) = (r3v103 java.util.List), (r3v112 java.util.List) binds: [B:23:0x0146, B:20:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0165  */
    /* JADX WARN: Code duplicated, block: B:27:0x017a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0194  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0212  */
    /* JADX WARN: Code duplicated, block: B:43:0x0217  */
    /* JADX WARN: Code duplicated, block: B:68:0x036d  */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x072b, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0731, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0733, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setOnGenericMotionListener.f60225d;
        r1 = (r0 | 45) << 1;
        r0 = -(((~r0) & 45) | (r0 & (-46)));
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.setOnGenericMotionListener.f60224c = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0749, code lost:
    
        if ((r2 % 2) != 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x074e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x074f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setOnGenericMotionListener.f60223b.get((java.lang.String) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0, r1}, -811784199, 811784208, (int) java.lang.System.currentTimeMillis()));
        r1 = com.mypinpad.tsdk.isolation.setOnGenericMotionListener.f60224c;
        r2 = ((r1 | 35) << 1) - (r1 ^ 35);
        com.mypinpad.tsdk.isolation.setOnGenericMotionListener.f60225d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x077b, code lost:
    
        if ((r2 % 2) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0780, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setOnGenericMotionListener.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean setDividerPadding(@NotNull String str, @NotNull TerminalCreationFailure terminalCreationFailure, @NotNull Terminal terminal) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, str, terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(this))).booleanValue();
    }

    @Deprecated(message = "This method relies on currentKernelId, do not use it if possible", replaceWith = @ReplaceWith(expression = "compareTemplate(tagLabel = tagLabel, parentTemplate = parentTemplate, kernelId = kernelId)", imports = {}))
    public final boolean setX(@NotNull String str, @NotNull TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, str, terminalCreationFailure}, 746705890, -746705890, System.identityHashCode(this))).booleanValue();
    }

    public static /* synthetic */ TransactionFailed setOnFocusChangeListener(setOnGenericMotionListener setongenericmotionlistener, String str) {
        return (TransactionFailed) setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, str}, -1501590138, 1501590142, (int) System.currentTimeMillis());
    }

    @Nullable
    public static TransactionFailed setX(@Nullable String str, @NotNull Terminal terminal) {
        return (TransactionFailed) setCompoundDrawableTintBlendMode(new Object[]{str, terminal}, 1668702711, -1668702709, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ TransactionFailed setY(setOnGenericMotionListener setongenericmotionlistener, String str, Terminal terminal) {
        return (TransactionFailed) setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, str, terminal}, 1427362050, -1427362043, (int) System.currentTimeMillis());
    }

    public static boolean setY(@Nullable String str, @NotNull Terminal terminal) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{str, terminal}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue();
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull PinPadType pinPadType, @NotNull String str, @NotNull setTextSize settextsize, @NotNull Terminal terminal, boolean z10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, pinPadType, str, settextsize, terminal, Boolean.valueOf(z10)}, 1300757109, -1300757095, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setCurrentKernelId")
    public static void setCompoundDrawableTintBlendMode(@NotNull Terminal terminal) {
        setCompoundDrawableTintBlendMode(new Object[]{terminal}, -157457190, 157457205, (int) System.currentTimeMillis());
    }

    @JvmName(name = "getCurrentKernelId")
    @NotNull
    public static Terminal setCompoundDrawableTintBlendMode() {
        return (Terminal) setCompoundDrawableTintBlendMode(new Object[0], -397700939, 397700950, (int) System.currentTimeMillis());
    }
}
