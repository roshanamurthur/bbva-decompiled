package androidx.compose.ui.text.android;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b\u0088\u0001\u0014\u0092\u0001\u00020\u0013ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getTopPadding-impl", "topPadding", "getBottomPadding-impl", "bottomPadding", "", "packedValue", "constructor-impl", "(J)J", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n*L\n1#1,1033:1\n32#2:1034\n39#2:1035\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n892#1:1034\n895#1:1035\n*E\n"})
public final class VerticalPaddings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17821a;

    public /* synthetic */ VerticalPaddings(long j10) {
        this.f17821a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m4000boximpl(long j10) {
        return new VerticalPaddings(j10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4002equalsimpl(long j10, Object obj) {
        return (obj instanceof VerticalPaddings) && j10 == ((VerticalPaddings) obj).getF17821a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4003equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m4004getBottomPaddingimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m4005getTopPaddingimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4006hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4007toStringimpl(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m4002equalsimpl(this.f17821a, obj);
    }

    public int hashCode() {
        return m4006hashCodeimpl(this.f17821a);
    }

    public String toString() {
        return m4007toStringimpl(this.f17821a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF17821a() {
        return this.f17821a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4001constructorimpl(long j10) {
        return j10;
    }
}
