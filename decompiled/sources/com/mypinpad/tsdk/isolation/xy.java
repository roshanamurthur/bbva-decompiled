package com.mypinpad.tsdk.isolation;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/xy;", "", "", "p0", "p1", "Ljava/nio/charset/Charset;", "p2", "setX", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class xy {

    @NotNull
    public static final xy INSTANCE = new xy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61962a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61963b;

    static {
        int i10 = f61962a + 63;
        f61963b = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Charset charset = (Charset) objArr[2];
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(charset, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(str2);
        String string = sb2.toString();
        abw.Companion companion = abw.INSTANCE;
        String strStringPlus = Intrinsics.stringPlus("Basic ", ((abw) abw.Companion.setOnFocusChangeListener(new Object[]{string, charset}, -1333891698, 1333891705, (int) System.currentTimeMillis())).setX());
        int i13 = f61963b;
        int i14 = i13 & 31;
        int i15 = ((((i13 ^ 31) | i14) << 1) - (~(-((i13 | 31) & (~i14))))) - 1;
        f61962a = i15 % 128;
        int i16 = i15 % 2;
        return strStringPlus;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String setX(@NotNull String p4, @NotNull String p10, @NotNull Charset p11) {
        return (String) setDividerPadding(new Object[]{p4, p10, p11}, -841362252, 841362252, (int) System.currentTimeMillis());
    }
}
