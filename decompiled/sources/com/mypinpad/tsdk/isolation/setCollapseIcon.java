package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.esotericsoftware.asm.Opcodes;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface setCollapseIcon extends Closeable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setCollapseIcon$setY;", "", "setX", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
    public static final class setY {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long getNavBarTitleString;
        public static final setY setCompoundDrawableTintBlendMode;
        private static final /* synthetic */ setY[] setDividerPadding;
        private static int setNavigationOnClickListener;
        private static int setOnDragListener;
        public static final setY setOnFocusChangeListener;
        public static final setY setX;
        public static final setY setY;

        static {
            setY[] setyArr;
            b();
            $10 = 0;
            $11 = 1;
            setOnDragListener = 0;
            setNavigationOnClickListener = 1;
            c();
            Object[] objArr = new Object[1];
            a("푂\uf38a퐃\udb36瓣⢡涐\ue6d7맠목", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
            setY sety = new setY(((String) objArr[0]).intern(), 0);
            setX = sety;
            Object[] objArr2 = new Object[1];
            a("櫰妟檣ኲ죉花ꐆ嫵ݕႬ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            setY sety2 = new setY(((String) objArr2[0]).intern(), 1);
            setCompoundDrawableTintBlendMode = sety2;
            Object[] objArr3 = new Object[1];
            a("䇁离䆂睤㙗ꊌ쇗ꑧⱿ", TextUtils.indexOf("", "", 0) + 1, objArr3);
            setY sety3 = new setY(((String) objArr3[0]).intern(), 2);
            setOnFocusChangeListener = sety3;
            Object[] objArr4 = new Object[1];
            a("ળ汍૰쒎옙띷父含朚╦", -ExpandableListView.getPackedPositionChild(0L), objArr4);
            setY sety4 = new setY(((String) objArr4[0]).intern(), 3);
            setY = sety4;
            int i10 = setOnDragListener;
            int i11 = i10 + 7;
            setNavigationOnClickListener = i11 % 128;
            if (i11 % 2 == 0) {
                setyArr = new setY[4];
                setyArr[0] = sety;
                setyArr[1] = sety2;
                setyArr[5] = sety3;
                setyArr[2] = sety4;
            } else {
                setyArr = new setY[]{sety, sety2, sety3, sety4};
            }
            int i12 = i10 + 99;
            int i13 = i12 % 128;
            setNavigationOnClickListener = i13;
            int i14 = i12 % 2;
            setDividerPadding = setyArr;
            int i15 = i13 + 27;
            setOnDragListener = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 18 / 0;
            }
        }

        public setY() {
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x010f A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:9:0x0048, B:13:0x009f, B:15:0x00ae, B:25:0x0130, B:18:0x00c3, B:22:0x010a, B:24:0x010f, B:28:0x013b, B:12:0x006f), top: B:37:0x0048 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x013b A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #0 {all -> 0x0139, blocks: (B:9:0x0048, B:13:0x009f, B:15:0x00ae, B:25:0x0130, B:18:0x00c3, B:22:0x010a, B:24:0x010f, B:28:0x013b, B:12:0x006f), top: B:37:0x0048 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0142 -> B:30:0x0151). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(java.lang.String r20, int r21, java.lang.Object[] r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setCollapseIcon.setY.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void b() {
            $$a = new byte[]{59, 125, 28, -9};
            $$b = Opcodes.ATHROW;
        }

        public static void c() {
            getNavBarTitleString = -5366633506932787292L;
        }

        public static setY valueOf(String str) {
            int i10 = setNavigationOnClickListener + 19;
            setOnDragListener = i10 % 128;
            int i11 = i10 % 2;
            setY sety = (setY) Enum.valueOf(setY.class, str);
            int i12 = setOnDragListener + 5;
            setNavigationOnClickListener = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 0;
            }
            return sety;
        }

        public static setY[] values() {
            int i10 = setOnDragListener + 107;
            setNavigationOnClickListener = i10 % 128;
            if (i10 % 2 != 0) {
                return (setY[]) setDividerPadding.clone();
            }
            throw null;
        }
    }

    @NotNull
    setY setDividerPadding();

    boolean setY(float f6, float f10);
}
