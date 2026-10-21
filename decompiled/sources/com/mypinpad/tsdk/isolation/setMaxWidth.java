package com.mypinpad.tsdk.isolation;

import bk.w;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J2\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0000J\u0016\u0010\u0006\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0000H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0005J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u0010J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#0%2\b\b\u0002\u0010$\u001a\u00020#J)\u0010,\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*¢\u0006\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "Ljava/util/ArrayList;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "Lkotlin/collections/ArrayList;", "element", "", "add", AnalyticsConstants.Key.ITEM, "allowDuplicate", "Lkotlin/Function1;", "checker", "", "tlvList", "", "addAll", "clone", "", "input", "withDuplications", "deserialize", "", "tagLabel", "get", "getNextGetDataTagFromList", "initialize", LogKeysKt.TAG, "isEmpty", "isNotEmpty", "isNotPresent", "isPresent", "junkify", RemoveCommand.ID, "tagName", "removeEmptyTlv", "serialize", "", "startDepth", "Lkotlin/Pair;", "toPrintString", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "kernelScope", "", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;", "requiredPermissions", "validate", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;[Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;)Z", "<init>", "()V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public class setMaxWidth extends ArrayList<getBeepOnFailure> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Set<String> f60101p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f60102q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f60103r0 = 1;

    @NotNull
    public static final setCompoundDrawableTintBlendMode setOnFocusChangeListener = new setCompoundDrawableTintBlendMode(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setMaxWidth$setCompoundDrawableTintBlendMode;", "", "", "", "setY", "Ljava/util/Set;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setCompoundDrawableTintBlendMode {
        public setCompoundDrawableTintBlendMode() {
        }

        public /* synthetic */ setCompoundDrawableTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1726235657, 1726235683, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -695013552, 695013664, (int) System.currentTimeMillis());
        String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -344668060, 344668222, (int) System.currentTimeMillis());
        String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1624957928, -1624957739, (int) System.currentTimeMillis());
        String str4 = (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -1600438733, 1600438977, (int) System.currentTimeMillis());
        String str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5));
        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 1992750097, -1992749874, (int) System.currentTimeMillis());
        String str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6));
        TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 912446865, -912446675, (int) System.currentTimeMillis());
        String str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7));
        TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -651183174, 651183327, (int) System.currentTimeMillis());
        String str8 = (String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8));
        TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], -1321940189, 1321940428, (int) System.currentTimeMillis());
        String str9 = (String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9));
        TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -248189693, 248189765, (int) System.currentTimeMillis());
        String str10 = (String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10));
        TransactionFailed indeterminateTintBlendMode = setAnimation.setIndeterminateTintBlendMode();
        f60101p0 = w.setOf((Object[]) new String[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (String) TransactionFailed.setX(new Object[]{indeterminateTintBlendMode}, 1914607362, -1914607356, System.identityHashCode(indeterminateTintBlendMode))});
        int i10 = f60102q0;
        int i11 = (i10 & 94) + (i10 | 94);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f60103r0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean a(Object[] objArr) throws Exception {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60103r0;
        int i11 = (i10 & (-86)) | ((~i10) & 85);
        int i12 = (i10 & 85) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f60102q0 = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setX(new Object[]{setmaxwidth, getbeeponfailure, Boolean.TRUE}, -333173787, 333173806, (int) System.currentTimeMillis());
        } else {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setX(new Object[]{setmaxwidth, getbeeponfailure, Boolean.FALSE}, -333173787, 333173806, (int) System.currentTimeMillis());
        }
        int i14 = f60103r0;
        int i15 = i14 & 105;
        int i16 = (i14 | 105) & (~i15);
        int i17 = i15 << 1;
        int i18 = (i16 & i17) + (i16 | i17);
        f60102q0 = i18 % 128;
        if (i18 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r10 = r10.iterator();
        r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0;
        r5 = r3 & 77;
        r3 = -(-((r3 ^ 77) | r5));
        r6 = ((r5 | r3) << 1) - (r3 ^ r5);
        com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if ((!r10.hasNext()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0;
        r0 = (((r10 | 56) << 1) - (r10 ^ 56)) - 1;
        com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0;
        r5 = r3 & 77;
        r3 = -(-((r3 ^ 77) | r5));
        r6 = ((r5 | r3) << 1) - (r3 ^ r5);
        com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        setX(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.getBeepOnFailure) r10.next(), java.lang.Boolean.TRUE}, -333173787, 333173806, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        setX(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.getBeepOnFailure) r10.next(), java.lang.Boolean.FALSE}, -333173787, 333173806, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0;
        r5 = (((r3 | 92) << 1) - (r3 ^ 92)) - 1;
        com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r10 = r3 | 27;
        r0 = (r10 << 1) - (r10 & (~(r3 & 27)));
        com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            com.mypinpad.tsdk.i.setMaxWidth r1 = (com.mypinpad.tsdk.isolation.setMaxWidth) r1
            r2 = 1
            r10 = r10[r2]
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            int r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0
            r4 = r3 & 23
            r5 = r3 ^ 23
            r5 = r5 | r4
            int r5 = -r5
            int r5 = -r5
            r6 = r4 ^ r5
            r4 = r4 & r5
            int r4 = r4 << r2
            int r6 = r6 + r4
            int r4 = r6 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r4
            r4 = 2
            int r6 = r6 % r4
            if (r6 != 0) goto L26
            r5 = 93
            int r5 = r5 / r0
            if (r10 != 0) goto L37
            goto L28
        L26:
            if (r10 != 0) goto L37
        L28:
            r10 = r3 | 27
            int r0 = r10 << 1
            r1 = r3 & 27
            int r1 = ~r1
            r10 = r10 & r1
            int r0 = r0 - r10
            int r10 = r0 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r10
            int r0 = r0 % r4
            return
        L37:
            java.util.Iterator r10 = r10.iterator()
            int r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0
            r5 = r3 & 77
            r3 = r3 ^ 77
            r3 = r3 | r5
            int r3 = -r3
            int r3 = -r3
            r6 = r5 | r3
            int r6 = r6 << r2
            r3 = r3 ^ r5
            int r6 = r6 - r3
            int r3 = r6 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r3
            int r6 = r6 % r4
        L4e:
            boolean r3 = r10.hasNext()
            r3 = r3 ^ r2
            if (r3 == 0) goto L64
            int r10 = com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0
            r0 = r10 | 56
            int r0 = r0 << r2
            r10 = r10 ^ 56
            int r0 = r0 - r10
            int r0 = r0 - r2
            int r10 = r0 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r10
            int r0 = r0 % r4
            return
        L64:
            int r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0
            r5 = r3 & 77
            r3 = r3 ^ 77
            r3 = r3 | r5
            int r3 = -r3
            int r3 = -r3
            r6 = r5 | r3
            int r6 = r6 << r2
            r3 = r3 ^ r5
            int r6 = r6 - r3
            int r3 = r6 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r3
            int r6 = r6 % r4
            r3 = 333173806(0x13dbd42e, float:5.5492598E-27)
            r5 = -333173787(0xffffffffec242be5, float:-7.938845E26)
            r7 = 3
            if (r6 != 0) goto L99
            java.lang.Object r6 = r10.next()
            com.mypinpad.tsdk.i.getBeepOnFailure r6 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r1
            r7[r2] = r6
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7[r4] = r6
            long r8 = java.lang.System.currentTimeMillis()
            int r6 = (int) r8
            setX(r7, r5, r3, r6)
            goto Lb1
        L99:
            java.lang.Object r6 = r10.next()
            com.mypinpad.tsdk.i.getBeepOnFailure r6 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r1
            r7[r2] = r6
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7[r4] = r6
            long r8 = java.lang.System.currentTimeMillis()
            int r6 = (int) r8
            setX(r7, r5, r3, r6)
        Lb1:
            int r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0
            r5 = r3 | 92
            int r5 = r5 << r2
            r3 = r3 ^ 92
            int r5 = r5 - r3
            int r5 = r5 + (-1)
            int r3 = r5 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r3
            int r5 = r5 % r4
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMaxWidth.b(java.lang.Object[]):void");
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setmaxwidth, 10));
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        int i10 = f60102q0;
        int i11 = ((i10 | 15) << 1) - (((~i10) & 15) | (i10 & (-16)));
        f60103r0 = i11 % 128;
        int i12 = i11 % 2;
        while (!(!it.hasNext())) {
            int i13 = f60102q0;
            int i14 = i13 & 95;
            int i15 = (i13 ^ 95) | i14;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f60103r0 = i16 % 128;
            if (i16 % 2 == 0) {
                getBeepOnFailure next = it.next();
                arrayList.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 243863605, -243863605, System.identityHashCode(next)));
                throw null;
            }
            getBeepOnFailure next2 = it.next();
            arrayList.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 243863605, -243863605, System.identityHashCode(next2)));
            int i17 = f60103r0 + 53;
            f60102q0 = i17 % 128;
            int i18 = i17 % 2;
        }
        byte[] bArr = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList}, -822524174, 822524177, (int) System.currentTimeMillis());
        int i19 = f60103r0;
        int i20 = (i19 & 103) + (i19 | 103);
        f60102q0 = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 10 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        Object obj = objArr[1];
        int i10 = f60102q0;
        int i11 = (i10 & (-80)) | ((~i10) & 79);
        int i12 = -(-((i10 & 79) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f60103r0 = i14;
        int i15 = i13 % 2;
        if (!(obj instanceof getBeepOnFailure)) {
            int i16 = i14 & 17;
            int i17 = i14 | 17;
            int i18 = (i16 & i17) + (i16 | i17);
            f60102q0 = i18 % 128;
            if (i18 % 2 == 0) {
                return -1;
            }
            throw null;
        }
        int iIntValue = ((Integer) setX(new Object[]{setmaxwidth, (getBeepOnFailure) obj}, 806897161, -806897135, System.identityHashCode(setmaxwidth))).intValue();
        int iIdentityHashCode = System.identityHashCode(setmaxwidth);
        int i19 = ~iIdentityHashCode;
        int i20 = (1845168884 & i19) | ((-1845168885) & iIdentityHashCode);
        int i21 = 1845168884 & iIdentityHashCode;
        int i22 = ~((i21 & i20) | (i20 ^ i21));
        int i23 = (i19 | iIdentityHashCode) & i19;
        int i24 = 1845035668 ^ i23;
        int i25 = i23 & 1845035668;
        int i26 = (i25 & i24) | (i24 ^ i25);
        int i27 = ~((i26 & (-1084950641)) | (i26 ^ (-1084950641)));
        int i28 = ((~i27) & i22) | ((~i22) & i27);
        int i29 = i22 & i27;
        int i30 = -(-(((i29 & i28) | (i28 ^ i29)) * 497));
        int i31 = (-646638085) & i30;
        int i32 = (i30 | (-646638085)) & (~i31);
        int i33 = i31 << 1;
        int i34 = (i32 & i33) + (i32 | i33);
        int i35 = (i19 & 1084950640) | (1084950640 ^ i19);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = (i37 & 760218244) | (i37 ^ 760218244);
        int i39 = (-133217) & iIdentityHashCode;
        int i40 = (iIdentityHashCode | (-133217)) & (~i39);
        int i41 = ~((i40 & i39) | (i40 ^ i39));
        int i42 = ((~i41) & i38) | ((~i38) & i41);
        int i43 = i41 & i38;
        int i44 = ((i43 & i42) | (i42 ^ i43)) * 497;
        int i45 = ((i34 ^ i44) | (i34 & i44)) << 1;
        int i46 = -((i44 & (~i34)) | ((~i44) & i34));
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        int iIdentityHashCode2 = System.identityHashCode(setmaxwidth);
        int i48 = ~((-706279997) | iIdentityHashCode2);
        int i49 = ((~i48) & (-1301600498)) | (1301600497 & i48);
        int i50 = i48 & (-1301600498);
        int i51 = -(-(((i50 & i49) | (i49 ^ i50)) * (-948)));
        int i52 = 284761321 & i51;
        int i53 = (i51 ^ 284761321) | i52;
        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
        int i55 = ~iIdentityHashCode2;
        int i56 = (iIdentityHashCode2 | i55) & i55;
        int i57 = -(~((~((i56 & (-135321649)) | ((-135321649) ^ i56))) * (-948)));
        int i58 = (-2) - (((i54 ^ i57) + ((i57 & i54) << 1)) ^ (-1));
        int i59 = i58 & (-102635556);
        int i60 = (i58 ^ (-102635556)) | i59;
        if (i47 <= ((i59 | i60) << 1) - (i60 ^ i59)) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) throws Exception {
        getBeepOnFailure next;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f60102q0;
        int i11 = i10 & 79;
        int i12 = (i11 - (~(-(-((i10 ^ 79) | i11))))) - 1;
        f60103r0 = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        if (zBooleanValue) {
            int i14 = f60102q0;
            int i15 = (((i14 & (-6)) | ((~i14) & 5)) - (~((i14 & 5) << 1))) - 1;
            f60103r0 = i15 % 128;
            int i16 = i15 % 2;
            super.add(getbeeponfailure);
            int i17 = f60103r0;
            int i18 = i17 ^ 107;
            int i19 = ((i17 & 107) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 & i20) + (i19 | i20);
            f60102q0 = i21 % 128;
            int i22 = i21 % 2;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        int i23 = f60103r0;
        int i24 = (i23 & 65) + (i23 | 65);
        f60102q0 = i24 % 128;
        int i25 = i24 % 2;
        while (it.hasNext()) {
            int i26 = f60102q0;
            int i27 = i26 & 97;
            int i28 = ((i26 | 97) & (~i27)) + (i27 << 1);
            f60103r0 = i28 % 128;
            if (i28 % 2 == 0) {
                next = it.next();
                getBeepOnFailure getbeeponfailure2 = next;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                int i29 = 69 / 0;
                if (Intrinsics.areEqual(str, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)))) {
                    arrayList.add(next);
                    int i30 = f60102q0;
                    int i31 = ((i30 | 103) << 1) - (i30 ^ 103);
                    f60103r0 = i31 % 128;
                    int i32 = i31 % 2;
                }
            } else {
                next = it.next();
                getBeepOnFailure getbeeponfailure3 = next;
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!(!Intrinsics.areEqual(str2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4))))) {
                    arrayList.add(next);
                    int i33 = f60102q0;
                    int i34 = ((i33 | 103) << 1) - (i33 ^ 103);
                    f60103r0 = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
        }
        if (arrayList.isEmpty()) {
            int i36 = f60103r0;
            int i37 = ((i36 | 83) << 1) - (i36 ^ 83);
            f60102q0 = i37 % 128;
            int i38 = i37 % 2;
            super.add(getbeeponfailure);
            int i39 = (-2) - ((f60103r0 + 76) ^ (-1));
            f60102q0 = i39 % 128;
            int i40 = i39 % 2;
            return;
        }
        int i41 = f60102q0;
        int i42 = ((i41 | 72) << 1) - (i41 ^ 72);
        int i43 = (i42 ^ (-1)) + (i42 << 1);
        int i44 = i43 % 128;
        f60103r0 = i44;
        int i45 = i43 % 2;
        int i46 = i44 & 65;
        int i47 = i46 + ((i44 ^ 65) | i46);
        f60102q0 = i47 % 128;
        if (i47 % 2 != 0) {
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) arrayList.get(0);
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure4));
        } else {
            getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) arrayList.get(0);
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure5));
        }
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        int i10 = f60102q0 + 76;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f60103r0 = i11 % 128;
        int i12 = i11 % 2;
        int size = super.size();
        if (i12 == 0) {
            int i13 = 9 / 0;
        }
        int i14 = f60103r0;
        int i15 = i14 & 67;
        int i16 = (i15 - (~((i14 ^ 67) | i15))) - 1;
        f60102q0 = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(size);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0124  */
    public static /* synthetic */ Boolean g(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60102q0;
        int i11 = ((i10 & (-8)) | ((~i10) & 7)) + ((i10 & 7) << 1);
        f60103r0 = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
        int i12 = f60102q0;
        int i13 = ((i12 & 73) - (~(-(-(i12 | 73))))) - 1;
        f60103r0 = i13 % 128;
        int i14 = i13 % 2;
        boolean z10 = false;
        for (getBeepOnFailure getbeeponfailure : setmaxwidth) {
            int i15 = f60102q0;
            int i16 = i15 & 59;
            int i17 = i16 + ((i15 ^ 59) | i16);
            f60103r0 = i17 % 128;
            int i18 = i17 % 2;
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), str)) {
                int i19 = f60103r0;
                int i20 = ((i19 | 66) << 1) - (i19 ^ 66);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                f60102q0 = i21 % 128;
                int i22 = i21 % 2;
                super.remove(getbeeponfailure);
                int i23 = f60103r0;
                int i24 = (i23 & (-6)) | ((~i23) & 5);
                int i25 = -(-((i23 & 5) << 1));
                int i26 = (i24 & i25) + (i25 | i24);
                f60102q0 = i26 % 128;
                int i27 = i26 % 2;
                z10 = true;
                break;
            }
            if (z10) {
                int i28 = f60103r0 + 67;
                f60102q0 = i28 % 128;
                int i29 = i28 % 2;
                z10 = true;
            } else {
                int i30 = f60102q0;
                int i31 = i30 & 121;
                int i32 = -(-((i30 ^ 121) | i31));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f60103r0 = i33 % 128;
                if (i33 % 2 == 0) {
                    ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, str}, 1551577786, -1551577784, System.identityHashCode(getbeeponfailure))).booleanValue();
                    throw null;
                }
                if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, str}, 1551577786, -1551577784, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                    int i210 = f60103r0 + 67;
                    f60102q0 = i210 % 128;
                    int i211 = i210 % 2;
                    z10 = true;
                } else {
                    int i34 = (-2) - ((f60103r0 + 18) ^ (-1));
                    f60102q0 = i34 % 128;
                    int i35 = i34 % 2;
                    z10 = false;
                }
            }
            int i36 = f60103r0;
            int i37 = i36 & 59;
            int i38 = ((i36 | 59) & (~i37)) + (i37 << 1);
            f60102q0 = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = f60103r0;
        int i41 = ((i40 ^ 113) | (i40 & 113)) << 1;
        int i42 = -(((~i40) & 113) | (i40 & (-114)));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        f60102q0 = i43 % 128;
        int i44 = i43 % 2;
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ Boolean h(Object[] objArr) {
        Iterator<getBeepOnFailure> it;
        getBeepOnFailure next;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60102q0;
        int i11 = (i10 & 91) + (i10 | 91);
        f60103r0 = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            it = setmaxwidth.iterator();
            int i12 = 57 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            it = setmaxwidth.iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                int i13 = f60102q0 + 107;
                f60103r0 = i13 % 128;
                int i14 = i13 % 2;
                next = null;
                break;
            }
            int i15 = f60103r0 + 59;
            f60102q0 = i15 % 128;
            if (i15 % 2 != 0) {
                getBeepOnFailure next2 = it.next();
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), str);
                throw null;
            }
            next = it.next();
            getBeepOnFailure getbeeponfailure = next;
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), str)) {
                int i16 = f60102q0;
                int i17 = i16 & 43;
                int i18 = i17 + ((i16 ^ 43) | i17);
                f60103r0 = i18 % 128;
                if (i18 % 2 != 0) {
                    break;
                }
                throw null;
            }
        }
        getBeepOnFailure getbeeponfailure2 = next;
        if (getbeeponfailure2 != null) {
            int i19 = f60102q0;
            int i20 = (i19 & 64) + (i19 | 64);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f60103r0 = i21 % 128;
            int i22 = i21 % 2;
            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
            if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() > 0) {
                int i23 = f60102q0;
                int i24 = i23 & 59;
                int i25 = (((i23 | 59) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
                int i26 = i25 % 128;
                f60103r0 = i26;
                int i27 = i25 % 2;
                int i28 = (-2) - (((i26 ^ 32) + ((i26 & 32) << 1)) ^ (-1));
                f60102q0 = i28 % 128;
                int i29 = i28 % 2;
                return Boolean.TRUE;
            }
        }
        int i30 = f60102q0 + 65;
        f60103r0 = i30 % 128;
        if (i30 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ void i(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        Iterable iterable = (Iterable) objArr[1];
        int i10 = f60102q0 + 87;
        f60103r0 = i10 % 128;
        int i11 = i10 % 2;
        setX(new Object[]{setmaxwidth, iterable}, 1060795376, -1060795356, System.identityHashCode(setmaxwidth));
        int i12 = f60103r0 + 117;
        f60102q0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ getBeepOnFailure j(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure next;
        setScrollContainer setscrollcontainer;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60103r0 + 103;
        f60102q0 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        int i12 = f60102q0;
        int i13 = i12 & 65;
        int i14 = (i13 - (~(-(-((i12 ^ 65) | i13))))) - 1;
        f60103r0 = i14 % 128;
        int i15 = i14 % 2;
        do {
            getbeeponfailure = null;
            if (!(!it.hasNext())) {
                int i16 = f60103r0;
                int i17 = (i16 ^ 101) + ((i16 & 101) << 1);
                f60102q0 = i17 % 128;
                if (i17 % 2 != 0) {
                    getBeepOnFailure next2 = it.next();
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                    Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), str);
                    throw null;
                }
                next = it.next();
                getBeepOnFailure getbeeponfailure2 = next;
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            } else {
                int i18 = f60103r0 + 113;
                f60102q0 = i18 % 128;
                int i19 = i18 % 2;
            }
            getBeepOnFailure getbeeponfailure3 = getbeeponfailure;
            int i20 = f60103r0;
            int i21 = i20 & 41;
            int i22 = (i20 | 41) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f60102q0 = i24 % 128;
            int i25 = i24 % 2;
            return getbeeponfailure3;
        } while (!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), str));
        int i26 = f60102q0;
        int i27 = ((i26 | 63) << 1) - (i26 ^ 63);
        f60103r0 = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
        getbeeponfailure = next;
        getBeepOnFailure getbeeponfailure4 = getbeeponfailure;
        int i28 = f60103r0;
        int i29 = i28 & 41;
        int i210 = (i28 | 41) & (~i29);
        int i211 = -(-(i29 << 1));
        int i212 = (i210 ^ i211) + ((i210 & i211) << 1);
        f60102q0 = i212 % 128;
        int i213 = i212 % 2;
        return getbeeponfailure4;
    }

    public static /* synthetic */ void k(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        int i10 = f60102q0;
        int i11 = (i10 ^ 123) + ((i10 & 123) << 1);
        f60103r0 = i11 % 128;
        if (i11 % 2 == 0) {
            setmaxwidth.clear();
            int i12 = 86 / 0;
        } else {
            setmaxwidth.clear();
        }
        int i13 = f60102q0;
        int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
        f60103r0 = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fe  */
    public static /* synthetic */ Boolean l(Object[] objArr) {
        getBeepOnFailure next;
        int i10;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        String str = (String) objArr[1];
        int i11 = f60102q0;
        int i12 = (((i11 | 50) << 1) - (i11 ^ 50)) - 1;
        f60103r0 = i12 % 128;
        getBeepOnFailure getbeeponfailure = null;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            setmaxwidth.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i13 = f60103r0 + 55;
                f60102q0 = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = f60103r0;
                int i16 = i15 & 95;
                int i17 = ((((i15 ^ 95) | i16) << 1) - (~(-((i15 | 95) & (~i16))))) - 1;
                f60102q0 = i17 % 128;
                if (i17 % 2 != 0) {
                    next = it.next();
                    getBeepOnFailure getbeeponfailure2 = next;
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                    int i18 = 45 / 0;
                    if (!(!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), str))) {
                        int i19 = f60102q0;
                        int i20 = (i19 & (-18)) | ((~i19) & 17);
                        int i21 = -(-((i19 & 17) << 1));
                        i10 = (i20 ^ i21) + ((i21 & i20) << 1);
                        f60103r0 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        getbeeponfailure = next;
                    }
                } else {
                    next = it.next();
                    getBeepOnFailure getbeeponfailure3 = next;
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                    if (!(!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), str))) {
                        int i110 = f60102q0;
                        int i22 = (i110 & (-18)) | ((~i110) & 17);
                        int i23 = -(-((i110 & 17) << 1));
                        i10 = (i22 ^ i23) + ((i23 & i22) << 1);
                        f60103r0 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        getbeeponfailure = next;
                    }
                }
            }
            if (getbeeponfailure == null) {
                int i24 = f60102q0 + 123;
                f60103r0 = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.FALSE;
            }
            int i26 = f60103r0;
            int i27 = i26 + 59;
            f60102q0 = i27 % 128;
            int i28 = i27 % 2;
            int i29 = (((i26 ^ 61) | (i26 & 61)) << 1) - (((~i26) & 61) | (i26 & (-62)));
            f60102q0 = i29 % 128;
            int i30 = i29 % 2;
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ Integer m(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        int i10 = f60103r0;
        int i11 = (i10 & 51) + (i10 | 51);
        f60102q0 = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setX(new Object[]{setmaxwidth}, -1854556581, 1854556584, System.identityHashCode(setmaxwidth))).intValue();
            throw null;
        }
        int iIntValue = ((Integer) setX(new Object[]{setmaxwidth}, -1854556581, 1854556584, System.identityHashCode(setmaxwidth))).intValue();
        int i12 = f60102q0 + 39;
        f60103r0 = i12 % 128;
        int i13 = i12 % 2;
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r8 = ((java.lang.Boolean) setX(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.getBeepOnFailure) r8}, -1439145507, 1439145528, java.lang.System.identityHashCode(r1))).booleanValue();
        r0 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0;
        r1 = r0 ^ 81;
        r0 = (((r0 & 81) | r1) << 1) - r1;
        com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r5 != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r8 = r3 | 109;
        r0 = (r8 << 1) - (r8 & (~(r3 & 109)));
        com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean n(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            com.mypinpad.tsdk.i.setMaxWidth r1 = (com.mypinpad.tsdk.isolation.setMaxWidth) r1
            r2 = 1
            r8 = r8[r2]
            int r3 = com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0
            r4 = r3 ^ 69
            r5 = r3 & 69
            r4 = r4 | r5
            int r4 = r4 << r2
            r5 = r3 & (-70)
            int r6 = ~r3
            r7 = 69
            r6 = r6 & r7
            r5 = r5 | r6
            int r5 = -r5
            r6 = r4 & r5
            r4 = r4 | r5
            int r6 = r6 + r4
            int r4 = r6 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r4
            r4 = 2
            int r6 = r6 % r4
            boolean r5 = r8 instanceof com.mypinpad.tsdk.isolation.getBeepOnFailure
            if (r6 == 0) goto L2c
            r6 = 33
            int r6 = r6 / r0
            if (r5 != 0) goto L3f
            goto L2e
        L2c:
            if (r5 == r2) goto L3f
        L2e:
            r8 = r3 | 109(0x6d, float:1.53E-43)
            int r0 = r8 << 1
            r1 = r3 & 109(0x6d, float:1.53E-43)
            int r1 = ~r1
            r8 = r8 & r1
            int r0 = r0 - r8
            int r8 = r0 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0 = r8
            int r0 = r0 % r4
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L3f:
            com.mypinpad.tsdk.i.getBeepOnFailure r8 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r8
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r0] = r1
            r3[r2] = r8
            int r8 = java.lang.System.identityHashCode(r1)
            r0 = -1439145507(0xffffffffaa3861dd, float:-1.6376436E-13)
            r1 = 1439145528(0x55c79e38, float:2.7435295E13)
            java.lang.Object r8 = setX(r3, r0, r1, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            int r0 = com.mypinpad.tsdk.isolation.setMaxWidth.f60102q0
            r1 = r0 ^ 81
            r0 = r0 & 81
            r0 = r0 | r1
            int r0 = r0 << r2
            int r0 = r0 - r1
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.setMaxWidth.f60103r0 = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L70
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L70:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMaxWidth.n(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ void o(Object[] objArr) {
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f60102q0;
        int i11 = (((i10 & (-70)) | ((~i10) & 69)) - (~(-(-((i10 & 69) << 1))))) - 1;
        f60103r0 = i11 % 128;
        int i12 = i11 % 2;
        setX(new Object[]{setmaxwidth, getbeeponfailure, Boolean.valueOf(zBooleanValue), null}, -1793134959, 1793134965, System.identityHashCode(setmaxwidth));
        int i13 = f60102q0;
        int i14 = i13 ^ 9;
        int i15 = (i13 & 9) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f60103r0 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void p(Object[] objArr) throws Exception {
        Iterator<getBeepOnFailure> it;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        int i10 = f60102q0;
        int i11 = (i10 ^ 109) + ((i10 & 109) << 1);
        f60103r0 = i11 % 128;
        if (i11 % 2 == 0) {
            it = setmaxwidth.iterator();
            int i12 = 54 / 0;
        } else {
            it = setmaxwidth.iterator();
        }
        while (it.hasNext()) {
            int i13 = f60103r0;
            int i14 = i13 & 9;
            int i15 = -(-((i13 ^ 9) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            f60102q0 = i16 % 128;
            int i17 = i16 % 2;
            getBeepOnFailure next = it.next();
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1006797251, -1006797224, System.identityHashCode(next));
            int i18 = f60102q0 + 25;
            f60103r0 = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = f60102q0;
        int i21 = (i20 ^ 23) + ((i20 & 23) << 1);
        f60103r0 = i21 % 128;
        int i22 = i21 % 2;
    }

    public static /* synthetic */ void q(Object[] objArr) {
        int iIntValue;
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        ((Boolean) objArr[2]).booleanValue();
        int i10 = f60103r0;
        int i11 = (i10 ^ 89) + ((i10 & 89) << 1);
        f60102q0 = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            iIntValue = 1;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            iIntValue = 0;
        }
        int i12 = f60102q0;
        int i13 = (i12 ^ 15) + ((i12 & 15) << 1);
        f60103r0 = i13 % 128;
        int i14 = i13 % 2;
        while (iIntValue < bArr.length) {
            int i15 = f60102q0 + 75;
            f60103r0 = i15 % 128;
            int i16 = i15 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            Pair pair = (Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, 1761745221, -1761745219, iIntValue);
            if (((Number) pair.getSecond()).intValue() <= 0) {
                break;
            }
            int iIdentityHashCode = System.identityHashCode(setmaxwidth);
            int i17 = (-2124135390) & iIdentityHashCode;
            int i18 = (~i17) & ((-2124135390) | iIdentityHashCode);
            int i19 = ~iIdentityHashCode;
            int i20 = (i17 & i18) | (i18 ^ i17);
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = 714156688 & i22;
            int i24 = (i22 | 714156688) & (~i23);
            int i25 = ((i24 & i23) | (i24 ^ i23)) * 576;
            int i26 = 69019855 & i25;
            int i27 = (i25 | 69019855) & (~i26);
            int i28 = i26 << 1;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            int i30 = (iIdentityHashCode | i19) & i19;
            int i31 = ((~i30) & (-2124135390)) | (2124135389 & i30);
            int i32 = i30 & (-2124135390);
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = ((-714157747) & i33) | ((~i33) & 714157746);
            int i35 = i33 & 714157746;
            int i36 = (i35 & i34) | (i34 ^ i35);
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = ((i38 & 1058) | (1058 ^ i38)) * 576;
            int i40 = i29 & i39;
            int i41 = ((i29 ^ i39) | i40) << 1;
            int i42 = -((i39 | i29) & (~i40));
            int i43 = (i41 & i42) + (i42 | i41);
            int i44 = (i43 & (-962608128)) + ((-962608128) | i43);
            int iIdentityHashCode2 = System.identityHashCode(setmaxwidth);
            int i45 = ~iIdentityHashCode2;
            int i46 = ~i45;
            int i47 = ((-177956747) & i45) | ((-177956747) ^ i45);
            int i48 = ~i47;
            int i49 = (i47 | i48) & i48;
            int i50 = i49 ^ 1573506;
            int i51 = i49 & 1573506;
            int i52 = (i46 & 1602714921) | ((-1602714922) & i45);
            int i53 = i45 & 1602714921;
            int i54 = (i53 & i52) | (i52 ^ i53);
            int i55 = ~i54;
            int i56 = (((i54 | i55) & i55) | (i51 & i50) | (i50 ^ i51)) * (-397);
            int i57 = ((((-1207608032) ^ i56) | ((-1207608032) & i56)) << 1) - ((i56 & 1207608031) | ((-1207608032) & (~i56)));
            int i58 = ((i57 | (-624681881)) << 1) - ((-624681881) ^ i57);
            int i59 = (i58 ^ (-1)) + (i58 << 1);
            int i60 = iIdentityHashCode2 & 1573506;
            int i61 = (iIdentityHashCode2 | 1573506) & (~i60);
            int i62 = (i61 & i60) | (i61 ^ i60);
            int i63 = i62 & 1426331681;
            int i64 = (i62 | 1426331681) & (~i63);
            int i65 = -(~(-(-(((i64 & i63) | (i64 ^ i63)) * 397))));
            if (i44 > (((i59 | i65) << 1) - (i65 ^ i59)) - 1) {
                setX(new Object[]{setmaxwidth, (getBeepOnFailure) pair.getFirst(), Boolean.FALSE}, -333173787, 333173806, (int) System.currentTimeMillis());
            } else {
                setX(new Object[]{setmaxwidth, (getBeepOnFailure) pair.getFirst(), Boolean.FALSE}, -333173787, 333173806, (int) System.currentTimeMillis());
            }
            iIntValue = ((Number) pair.getSecond()).intValue();
            int i66 = f60102q0 + 13;
            f60103r0 = i66 % 128;
            int i67 = i66 % 2;
        }
        int i68 = f60103r0 + 77;
        f60102q0 = i68 % 128;
        if (i68 % 2 != 0) {
            int i69 = 8 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:0: B:21:0x012b->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0117  */
    /* JADX WARN: Code duplicated, block: B:24:0x014c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0199  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        getBeepOnFailure getbeeponfailureValueOf;
        Iterator<getBeepOnFailure> it;
        getBeepOnFailure next;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~i11;
        int i18 = i14 | i17;
        switch ((((~(i10 | i17 | i12)) | (~(i11 | i14 | i12)) | (~(i18 | i15))) * 867) + (((~i18) | (~(i14 | i12)) | (~(i17 | i12))) * (-1734)) + ((i16 | (~(i17 | i15))) * (-867)) + (i11 * 868) + (i10 * 868)) {
            case 1:
                setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i19 = f60103r0;
                int i20 = i19 & 31;
                int i21 = ((((i19 ^ 31) | i20) << 1) - (~(-((i19 | 31) & (~i20))))) - 1;
                f60102q0 = i21 % 128;
                Object[] objArr2 = new Object[3];
                if (i21 % 2 != 0) {
                    objArr2[0] = setmaxwidth;
                    objArr2[1] = bArr;
                    objArr2[2] = Boolean.TRUE;
                    setX(objArr2, 202273480, -202273464, System.identityHashCode(setmaxwidth));
                    return null;
                }
                objArr2[0] = setmaxwidth;
                objArr2[1] = bArr;
                objArr2[2] = Boolean.FALSE;
                setX(objArr2, 202273480, -202273464, System.identityHashCode(setmaxwidth));
                return null;
            case 2:
                setMaxWidth setmaxwidth2 = (setMaxWidth) objArr[0];
                setMaxWidth setmaxwidth3 = (setMaxWidth) objArr[1];
                int i22 = (-2) - ((f60102q0 + 88) ^ (-1));
                f60103r0 = i22 % 128;
                int i23 = i22 % 2;
                setX(new Object[]{setmaxwidth2, setmaxwidth3}, 1060795376, -1060795356, System.identityHashCode(setmaxwidth2));
                int i24 = f60102q0;
                int i25 = i24 & 111;
                int i26 = -(-((i24 ^ 111) | i25));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f60103r0 = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 3:
                return f(objArr);
            case 4:
                p(objArr);
                return null;
            case 5:
                return l(objArr);
            case 6:
                e(objArr);
                return null;
            case 7:
                return j(objArr);
            case 8:
                k(objArr);
                return null;
            case 9:
                setMaxWidth setmaxwidth4 = (setMaxWidth) objArr[0];
                ArrayList arrayList = new ArrayList();
                int size = setmaxwidth4.size();
                if (size > 0) {
                    int i29 = 0;
                    while (true) {
                        int i30 = ((i29 & 92) + (i29 | 92)) - 1;
                        int i31 = (i30 & 89) | ((~i30) & (-90));
                        int i32 = (i30 & (-90)) << 1;
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        Object obj = setmaxwidth4.get(i29);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) obj;
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() == 0) {
                            int i34 = f60102q0 + 107;
                            f60103r0 = i34 % 128;
                            int i35 = i34 % 2;
                            arrayList.add(getbeeponfailure);
                            int i36 = f60102q0;
                            i13 = (i36 ^ 111) + ((i36 & 111) << 1);
                            f60103r0 = i13 % 128;
                        } else {
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1679134524, -1679134515, System.identityHashCode(getbeeponfailure));
                            int i37 = f60103r0 + 98;
                            i13 = (i37 ^ (-1)) + (i37 << 1);
                            f60102q0 = i13 % 128;
                        }
                        int i38 = i13 % 2;
                        if (i33 < size) {
                            i29 = i33;
                        }
                    }
                }
                setmaxwidth4.removeAll(arrayList);
                int i39 = f60103r0 + 87;
                f60102q0 = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 10:
                return c(objArr);
            case 11:
                return m(objArr);
            case 12:
                i(objArr);
                return null;
            case 13:
                return d(objArr);
            case 14:
                setMaxWidth setmaxwidth5 = (setMaxWidth) objArr[0];
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setmaxwidth5, 10));
                Iterator<getBeepOnFailure> it2 = setmaxwidth5.iterator();
                int i41 = f60103r0;
                int i42 = i41 & 91;
                int i43 = i42 + ((i41 ^ 91) | i42);
                f60102q0 = i43 % 128;
                while (true) {
                    int i44 = i43 % 2;
                    if (!it2.hasNext()) {
                        setMaxWidth setmaxwidth6 = (setMaxWidth) getStatusBarColor.setOnFocusChangeListener(new Object[]{arrayList2}, 790006071, -790006071, (int) System.currentTimeMillis());
                        int i45 = f60102q0;
                        int i46 = i45 & 11;
                        int i47 = -(-((i45 ^ 11) | i46));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        f60103r0 = i48 % 128;
                        int i49 = i48 % 2;
                        return setmaxwidth6;
                    }
                    int i50 = f60103r0;
                    int i51 = i50 & 11;
                    int i52 = i51 + ((i50 ^ 11) | i51);
                    f60102q0 = i52 % 128;
                    int i53 = i52 % 2;
                    arrayList2.add(it2.next().setNavigationOnClickListener());
                    int i54 = f60102q0;
                    int i55 = i54 & 39;
                    i43 = i55 + ((i54 ^ 39) | i55);
                    f60103r0 = i43 % 128;
                }
                break;
            case 15:
                return a(objArr);
            case 16:
                q(objArr);
                return null;
            case 17:
                return n(objArr);
            case 18:
                return h(objArr);
            case 19:
                o(objArr);
                return null;
            case 20:
                b(objArr);
                return null;
            case 21:
                setMaxWidth setmaxwidth7 = (setMaxWidth) objArr[0];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[1];
                int i56 = f60102q0 + 115;
                f60103r0 = i56 % 128;
                if (i56 % 2 != 0) {
                    return Boolean.valueOf(super.contains(getbeeponfailure2));
                }
                super.contains(getbeeponfailure2);
                throw null;
            case 22:
                setMaxWidth setmaxwidth8 = (setMaxWidth) objArr[0];
                Object obj2 = objArr[1];
                int i57 = f60102q0;
                int i58 = (i57 & 15) + (i57 | 15);
                int i59 = i58 % 128;
                f60103r0 = i59;
                int i60 = i58 % 2;
                if (!(!(obj2 instanceof getBeepOnFailure))) {
                    boolean zBooleanValue = ((Boolean) setX(new Object[]{setmaxwidth8, (getBeepOnFailure) obj2}, -443573570, 443573597, System.identityHashCode(setmaxwidth8))).booleanValue();
                    int i61 = f60102q0;
                    int i62 = (i61 & (-112)) | ((~i61) & 111);
                    int i63 = (i61 & 111) << 1;
                    int i64 = (i62 & i63) + (i63 | i62);
                    f60103r0 = i64 % 128;
                    int i65 = i64 % 2;
                    getbeeponfailureValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i66 = (i59 & (-8)) | ((~i59) & 7);
                    int i67 = (i59 & 7) << 1;
                    int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                    int i69 = i68 % 128;
                    f60102q0 = i69;
                    int i70 = i68 % 2;
                    int i71 = i69 & 33;
                    int i72 = (((i69 ^ 33) | i71) << 1) - ((i69 | 33) & (~i71));
                    f60103r0 = i72 % 128;
                    if (i72 % 2 == 0) {
                        throw null;
                    }
                    getbeeponfailureValueOf = Boolean.FALSE;
                }
                break;
            case 23:
                setMaxWidth setmaxwidth9 = (setMaxWidth) objArr[0];
                String str = (String) objArr[1];
                int i73 = f60102q0;
                int i74 = (i73 ^ 99) + ((i73 & 99) << 1);
                f60103r0 = i74 % 128;
                if (i74 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((Boolean) setX(new Object[]{setmaxwidth9, str}, 420631327, -420631322, System.identityHashCode(setmaxwidth9))).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                if (!((Boolean) setX(new Object[]{setmaxwidth9, str}, 420631327, -420631322, System.identityHashCode(setmaxwidth9))).booleanValue()) {
                    int i75 = f60102q0;
                    int i76 = (((i75 & (-88)) | ((~i75) & 87)) - (~((i75 & 87) << 1))) - 1;
                    f60103r0 = i76 % 128;
                    int i77 = i76 % 2;
                    getbeeponfailureValueOf = Boolean.TRUE;
                } else {
                    int i78 = f60103r0;
                    int i79 = (i78 ^ 85) + ((i78 & 85) << 1);
                    f60102q0 = i79 % 128;
                    int i80 = i79 % 2;
                    getbeeponfailureValueOf = Boolean.FALSE;
                }
                break;
                break;
            case 24:
                return g(objArr);
            case 25:
                setMaxWidth setmaxwidth10 = (setMaxWidth) objArr[0];
                int i81 = f60102q0;
                int i82 = ((i81 | 126) << 1) - (i81 ^ 126);
                int i83 = (i82 ^ (-1)) + (i82 << 1);
                f60103r0 = i83 % 128;
                int i84 = i83 % 2;
                Iterator<getBeepOnFailure> it3 = setmaxwidth10.iterator();
                int i85 = f60102q0;
                int i86 = (((i85 | 60) << 1) - (i85 ^ 60)) - 1;
                f60103r0 = i86 % 128;
                int i87 = i86 % 2;
                int i88 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        int i89 = f60103r0 + 93;
                        f60102q0 = i89 % 128;
                        int i90 = i89 % 2;
                        i88 = -1;
                    } else {
                        int i91 = f60103r0;
                        int i92 = ((i91 ^ 25) | (i91 & 25)) << 1;
                        int i93 = -(((~i91) & 25) | (i91 & (-26)));
                        int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                        f60102q0 = i94 % 128;
                        int i95 = i94 % 2;
                        getBeepOnFailure next2 = it3.next();
                        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                        if (f60101p0.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                            int i96 = f60102q0;
                            int i97 = (i96 & 81) + (i96 | 81);
                            int i98 = i97 % 128;
                            f60103r0 = i98;
                            if (i97 % 2 == 0) {
                                int i99 = 58 / 0;
                            }
                            int i100 = i98 & 13;
                            int i101 = -(-(i98 | 13));
                            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                            f60102q0 = i102 % 128;
                            int i103 = i102 % 2;
                        } else {
                            i88 = (i88 | 1) + (i88 & 1);
                            int i104 = f60102q0;
                            int i105 = (i104 & 79) + (i104 | 79);
                            f60103r0 = i105 % 128;
                            int i106 = i105 % 2;
                        }
                    }
                }
                if (i88 == -1) {
                    int i107 = f60102q0;
                    int i108 = i107 & 5;
                    int i109 = -(-((i107 ^ 5) | i108));
                    int i110 = (i108 & i109) + (i109 | i108);
                    f60103r0 = i110 % 128;
                    if (i110 % 2 != 0) {
                        return null;
                    }
                    int i111 = 46 / 0;
                    return null;
                }
                int i112 = f60103r0;
                int i113 = i112 & 93;
                int i114 = -(-((i112 ^ 93) | i113));
                int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                f60102q0 = i115 % 128;
                if (i115 % 2 == 0) {
                    getbeeponfailureValueOf = setmaxwidth10.remove(i88);
                } else {
                    getbeeponfailureValueOf = setmaxwidth10.remove(i88);
                    int i116 = 66 / 0;
                }
                break;
                break;
            case 26:
                setMaxWidth setmaxwidth11 = (setMaxWidth) objArr[0];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[1];
                int i117 = f60103r0;
                int i118 = i117 ^ 15;
                int i119 = (i117 & 15) << 1;
                int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                f60102q0 = i120 % 128;
                int i121 = i120 % 2;
                int iLastIndexOf = super.lastIndexOf(getbeeponfailure3);
                int i122 = f60103r0;
                int i123 = (i122 ^ 19) + ((i122 & 19) << 1);
                f60102q0 = i123 % 128;
                if (i123 % 2 == 0) {
                    return Integer.valueOf(iLastIndexOf);
                }
                throw null;
            case 27:
                setMaxWidth setmaxwidth12 = (setMaxWidth) objArr[0];
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[1];
                int i124 = f60103r0;
                int i125 = i124 ^ 59;
                int i126 = ((((i124 & 59) | i125) << 1) - (~(-i125))) - 1;
                f60102q0 = i126 % 128;
                int i127 = i126 % 2;
                Intrinsics.checkNotNullParameter(getbeeponfailure4, "");
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 865402441, -865402437, System.identityHashCode(getbeeponfailure4));
                boolean zBooleanValue2 = ((Boolean) setX(new Object[]{setmaxwidth12, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth12))).booleanValue();
                int i128 = f60103r0;
                int i129 = i128 & 97;
                int i130 = ((i128 ^ 97) | i129) << 1;
                int i131 = -((i128 | 97) & (~i129));
                int i132 = (i130 & i131) + (i131 | i130);
                f60102q0 = i132 % 128;
                if (i132 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue2);
                }
                throw null;
            case 28:
                setMaxWidth setmaxwidth13 = (setMaxWidth) objArr[0];
                Terminal terminal = (Terminal) objArr[1];
                setTextSize[] settextsizeArr = (setTextSize[]) objArr[2];
                int i133 = f60102q0;
                int i134 = i133 & 115;
                int i135 = i134 + ((i133 ^ 115) | i134);
                f60103r0 = i135 % 128;
                int i136 = i135 % 2;
                Intrinsics.checkNotNullParameter(terminal, "");
                Intrinsics.checkNotNullParameter(settextsizeArr, "");
                if (!(setmaxwidth13 instanceof Collection)) {
                    it = setmaxwidth13.iterator();
                    int i137 = f60103r0;
                    int i138 = (((i137 | 67) << 1) - (~(-(i137 ^ 67)))) - 1;
                    f60102q0 = i138 % 128;
                    int i139 = i138 % 2;
                    while (!(!it.hasNext())) {
                        int i140 = f60102q0;
                        int i141 = i140 & 3;
                        int i142 = (i140 | 3) & (~i141);
                        int i143 = i141 << 1;
                        int i144 = (i142 ^ i143) + ((i142 & i143) << 1);
                        f60103r0 = i144 % 128;
                        int i145 = i144 % 2;
                        next = it.next();
                        if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next, terminal, (setTextSize[]) Arrays.copyOf(settextsizeArr, settextsizeArr.length)}, 1850304748, -1850304736, System.identityHashCode(next))).booleanValue()) {
                            int i146 = f60103r0;
                            int i147 = (i146 ^ 11) + ((i146 & 11) << 1);
                            f60102q0 = i147 % 128;
                            getbeeponfailureValueOf = Boolean.valueOf(i147 % 2 != 0);
                            break;
                        }
                    }
                    int i148 = f60103r0;
                    int i149 = (i148 & (-82)) | ((~i148) & 81);
                    int i150 = -(-((i148 & 81) << 1));
                    int i151 = (i149 & i150) + (i150 | i149);
                    f60102q0 = i151 % 128;
                    int i152 = i151 % 2;
                    getbeeponfailureValueOf = Boolean.TRUE;
                } else {
                    int i153 = f60103r0;
                    int i154 = (-2) - (((i153 & 116) + (i153 | 116)) ^ (-1));
                    f60102q0 = i154 % 128;
                    int i155 = i154 % 2;
                    if (!setmaxwidth13.isEmpty()) {
                        it = setmaxwidth13.iterator();
                        int i1310 = f60103r0;
                        int i1311 = (((i1310 | 67) << 1) - (~(-(i1310 ^ 67)))) - 1;
                        f60102q0 = i1311 % 128;
                        int i1312 = i1311 % 2;
                        while (!(!it.hasNext())) {
                            int i1410 = f60102q0;
                            int i1411 = i1410 & 3;
                            int i1412 = (i1410 | 3) & (~i1411);
                            int i1413 = i1411 << 1;
                            int i1414 = (i1412 ^ i1413) + ((i1412 & i1413) << 1);
                            f60103r0 = i1414 % 128;
                            int i1415 = i1414 % 2;
                            next = it.next();
                            if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next, terminal, (setTextSize[]) Arrays.copyOf(settextsizeArr, settextsizeArr.length)}, 1850304748, -1850304736, System.identityHashCode(next))).booleanValue()) {
                                int i1416 = f60103r0;
                                int i1417 = (i1416 ^ 11) + ((i1416 & 11) << 1);
                                f60102q0 = i1417 % 128;
                                getbeeponfailureValueOf = Boolean.valueOf(i1417 % 2 != 0);
                                break;
                            }
                        }
                        int i1418 = f60103r0;
                        int i1419 = (i1418 & (-82)) | ((~i1418) & 81);
                        int i156 = -(-((i1418 & 81) << 1));
                        int i157 = (i1419 & i156) + (i156 | i1419);
                        f60102q0 = i157 % 128;
                        int i158 = i157 % 2;
                        getbeeponfailureValueOf = Boolean.TRUE;
                    } else {
                        int i14110 = f60103r0;
                        int i14111 = (i14110 & (-82)) | ((~i14110) & 81);
                        int i159 = -(-((i14110 & 81) << 1));
                        int i1510 = (i14111 & i159) + (i159 | i14111);
                        f60102q0 = i1510 % 128;
                        int i1511 = i1510 % 2;
                        getbeeponfailureValueOf = Boolean.TRUE;
                    }
                }
                break;
            case 29:
                setMaxWidth setmaxwidth14 = (setMaxWidth) objArr[0];
                Object obj3 = objArr[1];
                int i160 = f60103r0;
                int i161 = ((i160 ^ 48) + ((i160 & 48) << 1)) - 1;
                f60102q0 = i161 % 128;
                int i162 = i161 % 2;
                if (obj3 instanceof getBeepOnFailure) {
                    int iIntValue = ((Integer) setX(new Object[]{setmaxwidth14, (getBeepOnFailure) obj3}, -2049955820, 2049955820, System.identityHashCode(setmaxwidth14))).intValue();
                    int i163 = f60103r0;
                    int i164 = i163 ^ 111;
                    int i165 = (((i163 & 111) | i164) << 1) - i164;
                    f60102q0 = i165 % 128;
                    int i166 = i165 % 2;
                    getbeeponfailureValueOf = Integer.valueOf(iIntValue);
                } else {
                    int i167 = i160 | 69;
                    int i168 = i167 << 1;
                    int i169 = -(i167 & (~(i160 & 69)));
                    int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                    int i171 = i170 % 128;
                    f60102q0 = i171;
                    if (i170 % 2 != 0) {
                        throw null;
                    }
                    int i172 = i171 & 77;
                    int i173 = (i171 ^ 77) | i172;
                    int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
                    f60103r0 = i174 % 128;
                    int i175 = i174 % 2;
                    getbeeponfailureValueOf = -1;
                }
                break;
            default:
                setMaxWidth setmaxwidth15 = (setMaxWidth) objArr[0];
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) objArr[1];
                int i176 = f60102q0;
                int i177 = i176 & 59;
                int i178 = i177 + ((i176 ^ 59) | i177);
                f60103r0 = i178 % 128;
                int i179 = i178 % 2;
                int iIndexOf = super.indexOf(getbeeponfailure5);
                int i180 = f60103r0;
                int i181 = (i180 ^ 57) + ((i180 & 57) << 1);
                f60102q0 = i181 % 128;
                if (i181 % 2 == 0) {
                    return Integer.valueOf(iIndexOf);
                }
                throw null;
        }
        return getbeeponfailureValueOf;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* synthetic */ boolean add(Object obj) {
        int i10 = f60102q0;
        int i11 = i10 & 1;
        int i12 = (i10 | 1) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f60103r0 = i14 % 128;
        int i15 = i14 % 2;
        boolean zBooleanValue = ((Boolean) setX(new Object[]{this, (getBeepOnFailure) obj}, -1552965335, 1552965350, System.identityHashCode(this))).booleanValue();
        int i16 = f60102q0;
        int i17 = ((i16 ^ 76) + ((i16 & 76) << 1)) - 1;
        f60103r0 = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 0 / 0;
        }
        return zBooleanValue;
    }

    @Override // java.util.ArrayList
    public /* synthetic */ Object clone() {
        int i10 = f60103r0 + 51;
        f60102q0 = i10 % 128;
        int i11 = i10 % 2;
        setMaxWidth setmaxwidth = (setMaxWidth) setX(new Object[]{this}, 1678006096, -1678006082, System.identityHashCode(this));
        int i12 = f60102q0;
        int i13 = i12 & 77;
        int i14 = (i12 ^ 77) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        f60103r0 = i15 % 128;
        int i16 = i15 % 2;
        return setmaxwidth;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -599709088, 599709105, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ((Integer) setX(new Object[]{this, obj}, 1877434457, -1877434428, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ((Integer) setX(new Object[]{this, obj}, -938953195, 938953208, System.identityHashCode(this))).intValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -787237743, 787237765, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull String str) {
        return ((Boolean) setX(new Object[]{this, str}, 2135130751, -2135130733, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding() throws Exception {
        setX(new Object[]{this}, -1326128514, 1326128523, System.identityHashCode(this));
    }

    @NotNull
    public final setMaxWidth setOnLongClickListener() {
        return (setMaxWidth) setX(new Object[]{this}, 1678006096, -1678006082, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull String str) {
        return ((Boolean) setX(new Object[]{this, str}, 1248486622, -1248486599, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((Integer) setX(new Object[]{this}, -1865982018, 1865982029, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, -2074592285, 2074592295, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding(@Nullable String str) {
        return (getBeepOnFailure) setX(new Object[]{this, str}, -480651882, 480651889, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable Iterable<? extends getBeepOnFailure> iterable) throws Exception {
        setX(new Object[]{this, iterable}, 1060795376, -1060795356, System.identityHashCode(this));
    }

    public final void setY() throws Exception {
        setX(new Object[]{this}, 1900601062, -1900601058, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull Terminal terminal, @NotNull setTextSize... settextsizeArr) {
        return ((Boolean) setX(new Object[]{this, terminal, settextsizeArr}, 114360989, -114360961, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding(@Nullable Iterable<? extends getBeepOnFailure> iterable) throws Exception {
        setX(new Object[]{this, iterable}, -855777080, 855777092, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() throws Exception {
        setX(new Object[]{this}, 1256703722, -1256703714, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull getBeepOnFailure getbeeponfailure) {
        return ((Boolean) setX(new Object[]{this, getbeeponfailure}, -1552965335, 1552965350, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnFocusChangeListener(@NotNull String str) {
        return ((Boolean) setX(new Object[]{this, str}, 1949712751, -1949712727, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setX(@NotNull String str) {
        return ((Boolean) setX(new Object[]{this, str}, 420631327, -420631322, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final getBeepOnFailure setX() {
        return (getBeepOnFailure) setX(new Object[]{this}, -852037600, 852037625, System.identityHashCode(this));
    }

    public final void setX(@Nullable setMaxWidth setmaxwidth) throws Exception {
        setX(new Object[]{this, setmaxwidth}, 1087552335, -1087552333, System.identityHashCode(this));
    }
}
