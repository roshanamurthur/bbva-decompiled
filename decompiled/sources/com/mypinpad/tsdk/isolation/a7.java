package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/a7;", "", "setCompoundDrawableTintBlendMode", "setY", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
final class a7 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final a7 setCompoundDrawableTintBlendMode;
    public static final a7 setDividerPadding;
    private static int setLayoutAnimation;
    private static int setOnDragListener;
    private static long setOnFocusChangeListener;
    private static final /* synthetic */ a7[] setX;
    public static final a7 setY;

    static {
        b();
        $10 = 0;
        $11 = 1;
        setOnDragListener = 0;
        setLayoutAnimation = 1;
        c();
        Object[] objArr = new Object[1];
        a("邾都龀쵅\ud87e䉪ﵡ⨢踶빎\uec18\udfb0굲", Color.argb(0, 0, 0, 0) + 1, objArr);
        a7 a7Var = new a7(((String) objArr[0]).intern(), 0);
        setCompoundDrawableTintBlendMode = a7Var;
        Object[] objArr2 = new Object[1];
        a("션섞罕峡㢥폊ē홌\udfd9应", (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr2);
        a7 a7Var2 = new a7(((String) objArr2[0]).intern(), 1);
        setY = a7Var2;
        Object[] objArr3 = new Object[1];
        a("阊陉ﻦ艩뤖\u0d45⮂ﳒ袋\udf2fꌯीꯆ", -MotionEvent.axisFromString(""), objArr3);
        a7 a7Var3 = new a7(((String) objArr3[0]).intern(), 2);
        setDividerPadding = a7Var3;
        int i10 = setLayoutAnimation + 9;
        int i11 = i10 % 128;
        setOnDragListener = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 123;
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        setX = new a7[]{a7Var, a7Var2, a7Var3};
        int i15 = i11 + 25;
        setLayoutAnimation = i15 % 128;
        int i16 = i15 % 2;
    }

    public a7() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0108 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:6:0x0045, B:10:0x00a0, B:12:0x00af, B:22:0x0129, B:15:0x00c3, B:19:0x0101, B:21:0x0108, B:25:0x0134, B:9:0x006a), top: B:34:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0134 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #0 {all -> 0x0132, blocks: (B:6:0x0045, B:10:0x00a0, B:12:0x00af, B:22:0x0129, B:15:0x00c3, B:19:0x0101, B:21:0x0108, B:25:0x0134, B:9:0x006a), top: B:34:0x0045 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x013a -> B:27:0x0145). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r20, int r21, java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.a7.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        $$a = new byte[]{85, -69, 57, -93};
        $$b = 196;
    }

    public static void c() {
        setOnFocusChangeListener = -2328735156920226962L;
    }

    public static a7 valueOf(String str) {
        int i10 = setOnDragListener + 47;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        a7 a7Var = (a7) Enum.valueOf(a7.class, str);
        int i12 = setOnDragListener + 75;
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 != 0) {
            return a7Var;
        }
        throw null;
    }

    public static a7[] values() {
        int i10 = setOnDragListener + 87;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 != 0) {
            return (a7[]) setX.clone();
        }
        throw null;
    }
}
