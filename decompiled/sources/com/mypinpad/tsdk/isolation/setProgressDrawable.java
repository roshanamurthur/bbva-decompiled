package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u000f\u0007B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/setProgressDrawable;", "", "Lkotlin/UShort;", "p0", "p1", "", "Lcom/mypinpad/tsdk/i/setProgressDrawable$setY;", "setDividerPadding", "()[Lcom/mypinpad/tsdk/i/setProgressDrawable$setY;", "Landroid/net/ConnectivityManager;", "Lcom/mypinpad/tsdk/i/setColorFilter;", "Lcom/mypinpad/tsdk/i/setOnGroupCollapseListener;", "p2", "<init>", "(Landroid/net/ConnectivityManager;Lcom/mypinpad/tsdk/i/setColorFilter;Lcom/mypinpad/tsdk/i/setOnGroupCollapseListener;)V", "setY"}, k = 1, mv = {1, 5, 1})
public final class setProgressDrawable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char[] f60369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f60371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f60372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f60374h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f60375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setOnGroupCollapseListener f60376b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/setProgressDrawable$setY;", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "", "setX", "()Ljava/lang/String;", "setY", "Ljava/lang/String;", "setDividerPadding", "", "q0", "[B", "setCompoundDrawableTintBlendMode", "()[B", "p0", "Lkotlin/UShort;", "p1", "p2", "<init>", "(Ljava/lang/String;S[BLkotlin/jvm/internal/DefaultConstructorMarker;)V"}, k = 1, mv = {1, 5, 1})
    public static final class setY implements getDynamicButtonIconTextSpacingDp {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final short f60377p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final byte[] setCompoundDrawableTintBlendMode;

        /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
        @NotNull
        public String setDividerPadding;

        public setY(String str, short s4, byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
            this.setDividerPadding = str;
            this.f60377p0 = s4;
            this.setCompoundDrawableTintBlendMode = bArr;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = i10 | i11;
            int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
            int i15 = ~i10;
            int i16 = ~((~i11) | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = ~(i12 | i13);
            int i20 = (((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14;
            if (i20 == 1) {
                setY sety = (setY) objArr[0];
                short s4 = sety.f60377p0;
                System.identityHashCode(sety);
                System.identityHashCode(sety);
                return Short.valueOf(s4);
            }
            if (i20 != 2) {
                return ((setY) objArr[0]).setCompoundDrawableTintBlendMode;
            }
            setY sety2 = (setY) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sety2.setDividerPadding);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append((Object) UShort.m5624toStringimpl(((Short) setY(new Object[]{sety2}, 2071293343, -2071293342, System.identityHashCode(sety2))).shortValue()));
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append((String) setSingleLine.setX(new Object[]{ArraysKt___ArraysKt.take(sety2.setCompoundDrawableTintBlendMode, 5)}, -651071146, 651071150, (int) System.currentTimeMillis()));
            return sb2.toString();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public final byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setY(new Object[]{this}, -976322524, 976322524, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
        @NotNull
        public final String setX() {
            return (String) setY(new Object[]{this}, 1449528089, -1449528087, System.identityHashCode(this));
        }
    }

    static {
        c();
        f60373g = 1;
        d();
        INSTANCE = new Companion(null);
    }

    public setProgressDrawable(@NotNull ConnectivityManager connectivityManager, @NotNull setColorFilter setcolorfilter, @NotNull setOnGroupCollapseListener setongroupcollapselistener) {
        Intrinsics.checkNotNullParameter(connectivityManager, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(setongroupcollapselistener, "");
        this.f60375a = connectivityManager;
        this.f60376b = setongroupcollapselistener;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f60373g + 7;
        int i12 = i11 % 128;
        char c10 = 2;
        int i13 = i11 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f60369c;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)) + 63, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1596);
                        byte b10 = (byte) (f60374h[c10] - 1);
                        byte b11 = (byte) (b10 - 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, b11, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    c10 = 2;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f60370d)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10744), 44 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 566);
            byte b12 = (byte) 1;
            byte b13 = (byte) (b12 - 1);
            Object[] objArr5 = new Object[1];
            b(b13, b13, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f60372f) {
            if (!f60371e) {
                throw null;
            }
            throw null;
        }
        int i15 = f60373g + 49;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i18 = setz.setDividerPadding;
            int i19 = setz.setOnFocusChangeListener;
            if (i18 >= i19) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i18] = (char) (cArr[bytes[(i19 - 1) - i18] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 52 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2880 - View.MeasureSpec.getMode(0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 122 - r9
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.setProgressDrawable.f60374h
            r2 = 0
            if (r1 != 0) goto L18
            r9 = r8
            r3 = r9
            r4 = r2
            r8 = r7
            goto L2e
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r1[r7]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L2e:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setProgressDrawable.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f60374h = new byte[]{67, 9, 3, 91};
    }

    public static void d() {
        f60371e = true;
        f60372f = true;
        f60370d = 1794962263;
        f60369c = new char[]{62109, 62134, 62142, 62115, 62138, 62139, 62327, 62123, 62116, 62140, 62143, 62136, 62120, 62121, 62097, 62104, 62112, 62117, 62273, 62122, 62137, 62306, 62126, 62119, 62309, 62102, 62099, 62091, 62101};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @NotNull
    public final setY[] setDividerPadding() throws Throwable {
        LinkProperties linkProperties;
        List<LinkAddress> linkAddresses;
        ?? arrayList;
        Object objM5535constructorimpl;
        String str;
        if (Intrinsics.compare(27042, 27043) > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) UShort.m5624toStringimpl((short) 27042));
            sb2.append('.');
            sb2.append((Object) UShort.m5624toStringimpl((short) 27043));
            throw new IllegalArgumentException(sb2.toString());
        }
        ConnectivityManager connectivityManager = this.f60375a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null || (linkAddresses = linkProperties.getLinkAddresses()) == null) {
            arrayList = 0;
        } else {
            List<LinkAddress> list = linkAddresses;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LinkAddress) it.next()).getAddress());
            }
        }
        if (arrayList == 0) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        int i10 = 0;
        int i11 = 1;
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(InetAddress.getByAddress(new byte[]{127, 0, 0, 1}), InetAddress.getLoopbackAddress());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(InetAddress.getLocalHost());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            listMutableListOf.add((InetAddress) objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            Object[] objArr = new Object[1];
            a(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0087\u008f\u008d\u008d\u0085\u008e\u0086\u0086\u0082\u0087\u0088\u008d\u0089\u008b\u0087\u0084\u0082\u008c\u0089\u0084\u0087\u0085\u008b\u0088\u0087\u0088\u0085\u008a\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr[0]).intern(), thM5538exceptionOrNullimpl.getMessage())}, 44246425, -44246418, (int) System.currentTimeMillis());
        }
        List<InetAddress> listDistinct = CollectionsKt___CollectionsKt.distinct(CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) listMutableListOf));
        ArrayList arrayList2 = new ArrayList();
        Object[] objArr2 = new Object[1];
        a(127 - ExpandableListView.getPackedPositionType(0L), "\u0087\u008d\u0085\u008d\u008d\u0085\u008e\u0086\u0086\u0082\u0087\u008a\u0092\u0083\u0091\u008c\u0085\u008b\u0090", objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0093", objArr3);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(strIntern, CollectionsKt___CollectionsKt.joinToString$default(listDistinct, ((String) objArr3[0]).intern(), null, null, 0, null, null, 62, null))}, -1422891482, 1422891482, (int) System.currentTimeMillis());
        for (InetAddress inetAddress : listDistinct) {
            if (UnsignedKt.uintCompare(27042, 27043) <= 0) {
                int i12 = 27042;
                while (true) {
                    int i13 = i12 + 1;
                    byte[] dividerPadding = this.f60376b.setDividerPadding(inetAddress, i12);
                    if (((dividerPadding.length == 0 ? i11 : i10) ^ i11) != 0) {
                        byte[] address = inetAddress.getAddress();
                        if (address == null) {
                            str = "";
                        } else {
                            Object[] objArr4 = new Object[i11];
                            objArr4[i10] = address;
                            str = (String) setSingleLine.setX(objArr4, -693778564, 693778567, (int) System.currentTimeMillis());
                        }
                        arrayList2.add(new setY(str, UShort.m5620constructorimpl((short) i12), dividerPadding, null));
                    }
                    if (i12 == 27043) {
                        break;
                    }
                    i12 = i13;
                    i10 = 0;
                    i11 = 1;
                }
                i10 = 0;
                i11 = 1;
            }
        }
        Object[] array = arrayList2.toArray(new setY[i10]);
        if (array != null) {
            return (setY[]) array;
        }
        Object[] objArr5 = new Object[1];
        a(127 - (KeyEvent.getMaxKeyCode() >> 16), "\u009d\u009c\u009b\u0097\u0082\u008e\u008e\u009a\u0099\u0092\u0083\u0084\u0088\u0089\u0091\u0087\u0085\u0098\u0097\u0088\u0087\u0084\u0084\u0094\u0092\u0096\u0092\u0089\u0092\u0087\u0089\u0088\u0087\u0088\u008d\u0082\u008c\u0087\u0085\u0095\u0087\u0088\u0089\u0092\u0092\u0082\u008c\u0087\u0084\u0084\u0094\u0092", objArr5);
        throw new NullPointerException(((String) objArr5[0]).intern());
    }
}
