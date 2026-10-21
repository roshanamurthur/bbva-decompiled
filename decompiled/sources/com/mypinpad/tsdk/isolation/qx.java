package com.mypinpad.tsdk.isolation;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nOAuthToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OAuthToken.kt\ncom/mypinpad/tsdk/internal/remote/oauth/OAuthToken\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 DebugFunctions.kt\ncom/mypinpad/common/buildconstants/DebugFunctionsKt\n*L\n1#1,209:1\n7#2,8:210\n12#2,3:218\n7#2,8:221\n7#2,8:229\n7#2,8:237\n7#2,8:245\n7#2,8:253\n7#2,8:261\n7#2,8:269\n14#3:277\n*S KotlinDebug\n*F\n+ 1 OAuthToken.kt\ncom/mypinpad/tsdk/internal/remote/oauth/OAuthToken\n*L\n47#1:210,8\n55#1:218,3\n62#1:221,8\n68#1:229,8\n75#1:237,8\n83#1:245,8\n89#1:253,8\n96#1:261,8\n104#1:269,8\n36#1:277\n*E\n"})
public final class qx implements getDynamicButtonIconTextSpacingDp {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final long f58022u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f58023w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f58024x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f58025y0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f58026p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f58027q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f58028r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final um.setX f58029s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final String f58030t0;

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58032b;
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[um.setX.values().length];
            try {
                iArr[um.setX.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i10 = 1 + 37;
                f58031a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[um.setX.setX.ordinal()] = 2;
                int i12 = f58031a + 118;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                f58032b = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setDividerPadding = iArr;
            int i15 = f58032b;
            int i16 = i15 & 97;
            int i17 = (i16 - (~(-(-((i15 ^ 97) | i16))))) - 1;
            f58031a = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    static {
        b();
        f58024x0 = 1;
        v0 = 0;
        f58023w0 = 1;
        f58022u0 = -1233294464442164346L;
    }

    public qx(@NotNull String str, @NotNull String str2, long j10, @NotNull um.setX setx) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(setx, "");
        this.f58026p0 = str;
        this.f58027q0 = str2;
        this.f58028r0 = j10;
        this.f58029s0 = setx;
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 3) {
            TerminalException terminalException = new TerminalException(10047, setX(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        try {
            qt dividerPadding = qv.setDividerPadding(new JSONObject(new String(vc.setX((String) listSplit$default.get(1)), Charsets.UTF_8)));
            if (((String) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 633516041, -633516040, System.identityHashCode(dividerPadding))) == null) {
                TerminalException terminalException2 = new TerminalException(10041, setX(), null);
                mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException2;
            }
            if (!vc.setY((String) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 633516041, -633516040, System.identityHashCode(dividerPadding)))) {
                TerminalException terminalException3 = new TerminalException(10042, setX(), null);
                mt.setX(new Object[]{terminalException3}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException3;
            }
            this.f58030t0 = (String) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 633516041, -633516040, System.identityHashCode(dividerPadding));
            if (((List) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 893873829, -893873827, System.identityHashCode(dividerPadding))).isEmpty()) {
                TerminalException terminalException4 = new TerminalException(10045, setX(), null);
                mt.setX(new Object[]{terminalException4}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException4;
            }
            int i10 = setY.setDividerPadding[setx.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vc.setY((String) ((List) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 893873829, -893873827, System.identityHashCode(dividerPadding))).get(0))) {
                    return;
                } else {
                    TerminalException terminalException5 = new TerminalException(10046, setX(), null);
                    mt.setX(new Object[]{terminalException5}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException5;
                }
            }
            if (((List) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 615385835, -615385835, System.identityHashCode(dividerPadding))).isEmpty()) {
                TerminalException terminalException6 = new TerminalException(10043, setX(), null);
                mt.setX(new Object[]{terminalException6}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException6;
            }
            if (!vc.setY((String) ((List) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 615385835, -615385835, System.identityHashCode(dividerPadding))).get(0))) {
                TerminalException terminalException7 = new TerminalException(10044, setX(), null);
                mt.setX(new Object[]{terminalException7}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException7;
            }
            List list = (List) qt.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 893873829, -893873827, System.identityHashCode(dividerPadding));
            Object[] objArr = new Object[1];
            a("誎諝윫\uf036⍐䶩ṽ", 1 - KeyEvent.normalizeMetaState(0), objArr);
            if (list.contains(((String) objArr[0]).intern())) {
                return;
            }
            TerminalException terminalException8 = new TerminalException(10046, setX(), null);
            mt.setX(new Object[]{terminalException8}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException8;
        } catch (Exception e5) {
            TerminalException terminalException9 = new TerminalException(10047, setX(), e5);
            mt.setX(new Object[]{terminalException9}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x010e A[Catch: all -> 0x013a, TryCatch #0 {all -> 0x013a, blocks: (B:8:0x0041, B:12:0x009a, B:14:0x00a9, B:24:0x0130, B:17:0x00bf, B:21:0x0106, B:23:0x010e, B:27:0x013c, B:11:0x0066), top: B:38:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x013c A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #0 {all -> 0x013a, blocks: (B:8:0x0041, B:12:0x009a, B:14:0x00a9, B:24:0x0130, B:17:0x00bf, B:21:0x0106, B:23:0x010e, B:27:0x013c, B:11:0x0066), top: B:38:0x0041 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0142 -> B:29:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qx.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f58025y0 = new byte[]{109, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25, -2};
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        qx qxVar = (qx) objArr[0];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qxVar.getClass().getSimpleName());
        Object[] objArr2 = new Object[1];
        a("펮펆博搭漹ƥ摖쉳\u0ee3", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        String string = sb2.toString();
        int i13 = v0 + 31;
        f58023w0 = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    @NotNull
    public final um.setX setCompoundDrawableTintBlendMode() {
        int i10 = f58023w0;
        int i11 = i10 + 105;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 39;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f58029s0;
    }

    @NotNull
    public final String setDividerPadding() {
        int i10 = f58023w0;
        int i11 = i10 + 3;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 29;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f58027q0;
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        int i10 = f58023w0 + 113;
        v0 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f58026p0;
        }
        throw null;
    }

    public final long setY() {
        int i10 = f58023w0 + 5;
        int i11 = i10 % 128;
        v0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 61;
        f58023w0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f58028r0;
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -379811050, 379811050, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() {
        String strTake;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f58028r0);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.f58029s0.ordinal());
        sb2.append(AbstractJsonLexerKt.COMMA);
        String str = this.f58030t0;
        if (str != null) {
            int i10 = v0 + 119;
            f58023w0 = i10 % 128;
            strTake = StringsKt___StringsKt.take(str, i10 % 2 == 0 ? 5 : 4);
        } else {
            int i11 = f58023w0 + 73;
            v0 = i11 % 128;
            int i12 = i11 % 2;
            strTake = null;
        }
        sb2.append(strTake);
        return sb2.toString();
    }
}
