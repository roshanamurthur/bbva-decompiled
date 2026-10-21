package com.mypinpad.tsdk.isolation;

import bk.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkSecurityNetworkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkSecurityNetworkService.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityNetworkServiceKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n483#2,7:472\n442#2:479\n392#2:480\n1238#3,4:481\n*S KotlinDebug\n*F\n+ 1 SdkSecurityNetworkService.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityNetworkServiceKt\n*L\n448#1:472,7\n449#1:479\n449#1:480\n449#1:481,4\n*E\n"})
public final class qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f57880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f57882c = null;

    static {
        b();
        f57881b = 1;
        f57880a = -5556722179716162500L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 110 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.qj.f57882c
            if (r2 != 0) goto L1b
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1b:
            r3 = r1
        L1c:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L37:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qj.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public static void b() {
        f57882c = new byte[]{116, 87, -51, 89};
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArrEncodeToByteArray;
        pw pwVar = (pw) objArr[0];
        String dividerPadding = pwVar.setDividerPadding();
        if (dividerPadding == null || (bArrEncodeToByteArray = l.encodeToByteArray(dividerPadding)) == null) {
            bArrEncodeToByteArray = new byte[0];
        }
        return new getPinPadPortrait(pwVar.setCompoundDrawableTintBlendMode(), new Metadata(bArrEncodeToByteArray), pwVar.setY());
    }

    @NotNull
    public static final pu setDividerPadding(@NotNull String str, @NotNull String[] strArr, @NotNull String str2, @NotNull String[] strArr2, @NotNull um.setX setx, long j10, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function2<? super pw, ? super Integer, ? extends JSONObject> function2, @NotNull Function2 function3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(setx, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        return new pu(str, strArr, new qc(new qu(str2, strArr2, j10, function2, function3), new st(str4, str3, str5), setx, null, 8, null), j10, null, 16, null);
    }

    public static final /* synthetic */ getPinPadPortrait setY(pw pwVar) {
        return (getPinPadPortrait) setCompoundDrawableTintBlendMode(new Object[]{pwVar}, 1347611380, -1347611380, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final Map<String, List<String>> setY(@NotNull ye yeVar) {
        Intrinsics.checkNotNullParameter(yeVar, "");
        TreeMap treeMap = new TreeMap(l.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            String str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i10)}, 611642845, -611642844, i10);
            List arrayList = (List) treeMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(str, arrayList);
            }
            arrayList.add((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i10)}, -1668064352, 1668064356, i10));
        }
        return treeMap;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @org.jetbrains.annotations.NotNull
    public static final com.mypinpad.tsdk.isolation.pw setCompoundDrawableTintBlendMode(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    @NotNull
    public static final setInterpolator setY(@NotNull yk ykVar, @NotNull TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
        byte[] onFocusChangeListener;
        Intrinsics.checkNotNullParameter(ykVar, "");
        Intrinsics.checkNotNullParameter(transactionNotAuthorisedReason, "");
        String string = ((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar))).toString();
        Map<String, List<String>> y7 = setY((ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : y7.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), (String) CollectionsKt___CollectionsKt.first((List) entry2.getValue()));
        }
        yo yoVar = (yo) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -2084954302, 2084954305, System.identityHashCode(ykVar));
        if (yoVar == null || (onFocusChangeListener = qe.setOnFocusChangeListener(yoVar)) == null) {
            onFocusChangeListener = new byte[0];
        }
        return new setInterpolator(linkedHashMap2, string, new Metadata(onFocusChangeListener), (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar)), transactionNotAuthorisedReason);
    }
}
