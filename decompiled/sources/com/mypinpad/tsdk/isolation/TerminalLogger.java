package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalLogger;", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "p0", "p1", "<init>", "([Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final class TerminalLogger implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getDetailsFieldTextSizeSp[] f51838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51839b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<getDetailsFieldTextSizeSp, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f51840p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f51841q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f51842r0 = 1;

        static {
            int i10 = f51842r0;
            int i11 = ((((i10 ^ 87) | (i10 & 87)) << 1) - (~(-(((~i10) & 87) | (i10 & (-88)))))) - 1;
            f51841q0 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 39 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
            CharSequence charSequenceA;
            int i13 = ~i11;
            int i14 = (~i12) | i13;
            int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
            int i16 = ~i10;
            if (((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15 != 1) {
                getDetailsFieldTextSizeSp getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) objArr[1];
                int i17 = f51842r0;
                int i18 = i17 ^ 9;
                int i19 = (((i17 & 9) | i18) << 1) - i18;
                int i20 = i19 % 128;
                f51841q0 = i20;
                int i21 = i19 % 2;
                charSequenceA = AbstractJsonLexerKt.NULL;
                if (getdetailsfieldtextsizesp == null) {
                    int i22 = (-2) - ((i20 + 104) ^ (-1));
                    int i23 = i22 % 128;
                    f51842r0 = i23;
                    int i24 = i22 % 2;
                    int i25 = (i23 & 19) + (i23 | 19);
                    f51841q0 = i25 % 128;
                    if (i25 % 2 != 0) {
                        throw null;
                    }
                } else {
                    String compoundDrawableTintBlendMode = getdetailsfieldtextsizesp.setCompoundDrawableTintBlendMode();
                    if (compoundDrawableTintBlendMode == null) {
                        int i26 = f51842r0;
                        int i27 = i26 & 23;
                        int i28 = (i26 | 23) & (~i27);
                        int i29 = i27 << 1;
                        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                        int i31 = i30 % 128;
                        f51841q0 = i31;
                        if (i30 % 2 != 0) {
                            throw null;
                        }
                        int i32 = (i31 & 71) + (i31 | 71);
                        f51842r0 = i32 % 128;
                        int i33 = i32 % 2;
                    } else {
                        int i34 = f51842r0;
                        int i35 = (((i34 | 114) << 1) - (i34 ^ 114)) - 1;
                        f51841q0 = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = 50 / 0;
                        }
                        charSequenceA = compoundDrawableTintBlendMode;
                    }
                }
            } else {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i37 = f51841q0;
                int i38 = (((i37 | 70) << 1) - (i37 ^ 70)) - 1;
                f51842r0 = i38 % 128;
                getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) obj;
                if (i38 % 2 == 0) {
                    a(new Object[]{aVar, getdetailsfieldtextsizesp2}, 1937286519, -1937286519, System.identityHashCode(aVar));
                    throw null;
                }
                charSequenceA = a(new Object[]{aVar, getdetailsfieldtextsizesp2}, 1937286519, -1937286519, System.identityHashCode(aVar));
                int i39 = f51841q0;
                int i40 = i39 | 115;
                int i41 = (i40 << 1) - ((~(i39 & 115)) & i40);
                f51842r0 = i41 % 128;
                int i42 = i41 % 2;
            }
            return charSequenceA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(getDetailsFieldTextSizeSp getdetailsfieldtextsizesp) {
            return a(new Object[]{this, getdetailsfieldtextsizesp}, 554288886, -554288885, System.identityHashCode(this));
        }
    }

    public TerminalLogger(@NotNull getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getdetailsfieldtextsizespArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f51838a = getdetailsfieldtextsizespArr;
        this.f51839b = str;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        TerminalLogger terminalLogger = (TerminalLogger) objArr[0];
        return ArraysKt___ArraysKt.joinToString$default(terminalLogger.f51838a, terminalLogger.f51839b, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f51840p0, 30, (Object) null);
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1352067446, 1352067446, System.identityHashCode(this));
    }

    public /* synthetic */ TerminalLogger(getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(getdetailsfieldtextsizespArr, (i10 & 2) != 0 ? "," : str);
    }
}
