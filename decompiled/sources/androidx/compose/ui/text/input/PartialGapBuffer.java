package androidx.compose.ui.text.input;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q1.b;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0012J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "text", "", "replace", FirebaseAnalytics.Param.INDEX, "", "get", "toString", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getLength", "()I", "length", "<init>", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@InternalTextApi
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f18100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18102d;
    public static final int $stable = 8;

    public PartialGapBuffer(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.f18101c = -1;
        this.f18102d = -1;
    }

    public final char get(int index) {
        b bVar = this.f18100b;
        if (bVar == null) {
            return this.text.charAt(index);
        }
        if (index < this.f18101c) {
            return this.text.charAt(index);
        }
        int iA = bVar.f92744a - bVar.a();
        int i10 = this.f18101c;
        if (index >= iA + i10) {
            return this.text.charAt(index - ((iA - this.f18102d) + i10));
        }
        int i11 = index - i10;
        int i12 = bVar.f92746c;
        return i11 < i12 ? bVar.f92745b[i11] : bVar.f92745b[(i11 - i12) + bVar.f92747d];
    }

    public final int getLength() {
        b bVar = this.f18100b;
        if (bVar == null) {
            return this.text.length();
        }
        return (bVar.f92744a - bVar.a()) + (this.text.length() - (this.f18102d - this.f18101c));
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void replace(int start, int end, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (start > end) {
            throw new IllegalArgumentException(n1.e("start index must be less than or equal to end index: ", start, " > ", end).toString());
        }
        if (start < 0) {
            throw new IllegalArgumentException(g0.c("start must be non-negative, but was ", start).toString());
        }
        b bVar = this.f18100b;
        if (bVar == null) {
            int iMax = Math.max(255, text.length() + 128);
            char[] initBuffer = new char[iMax];
            int iMin = Math.min(start, 64);
            int iMin2 = Math.min(this.text.length() - end, 64);
            int i10 = start - iMin;
            GapBuffer_jvmKt.toCharArray(this.text, initBuffer, 0, i10, start);
            int i11 = iMax - iMin2;
            int i12 = iMin2 + end;
            GapBuffer_jvmKt.toCharArray(this.text, initBuffer, i11, end, i12);
            GapBuffer_jvmKt.toCharArray(text, initBuffer, iMin, 0, text.length());
            int length = text.length() + iMin;
            Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
            b bVar2 = new b();
            bVar2.f92744a = iMax;
            bVar2.f92745b = initBuffer;
            bVar2.f92746c = length;
            bVar2.f92747d = i11;
            this.f18100b = bVar2;
            this.f18101c = i10;
            this.f18102d = i12;
            return;
        }
        int i13 = this.f18101c;
        int i14 = start - i13;
        int i15 = end - i13;
        if (i14 < 0 || i15 > bVar.f92744a - bVar.a()) {
            this.text = toString();
            this.f18100b = null;
            this.f18101c = -1;
            this.f18102d = -1;
            replace(start, end, text);
            return;
        }
        Intrinsics.checkNotNullParameter(text, "text");
        int length2 = text.length() - (i15 - i14);
        if (length2 > bVar.a()) {
            int iA = length2 - bVar.a();
            int i16 = bVar.f92744a;
            do {
                i16 *= 2;
            } while (i16 - bVar.f92744a < iA);
            char[] cArr = new char[i16];
            ArraysKt___ArraysJvmKt.copyInto(bVar.f92745b, cArr, 0, 0, bVar.f92746c);
            int i17 = bVar.f92744a;
            int i18 = bVar.f92747d;
            int i19 = i17 - i18;
            int i20 = i16 - i19;
            ArraysKt___ArraysJvmKt.copyInto(bVar.f92745b, cArr, i20, i18, i19 + i18);
            bVar.f92745b = cArr;
            bVar.f92744a = i16;
            bVar.f92747d = i20;
        }
        int i21 = bVar.f92746c;
        if (i14 < i21 && i15 <= i21) {
            int i22 = i21 - i15;
            char[] cArr2 = bVar.f92745b;
            ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, bVar.f92747d - i22, i15, i21);
            bVar.f92746c = i14;
            bVar.f92747d -= i22;
        } else if (i14 >= i21 || i15 < i21) {
            int iA2 = bVar.a() + i14;
            int iA3 = bVar.a() + i15;
            int i23 = bVar.f92747d;
            char[] cArr3 = bVar.f92745b;
            ArraysKt___ArraysJvmKt.copyInto(cArr3, cArr3, bVar.f92746c, i23, iA2);
            bVar.f92746c += iA2 - i23;
            bVar.f92747d = iA3;
        } else {
            bVar.f92747d = bVar.a() + i15;
            bVar.f92746c = i14;
        }
        GapBuffer_jvmKt.toCharArray(text, bVar.f92745b, bVar.f92746c, 0, text.length());
        bVar.f92746c = text.length() + bVar.f92746c;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @NotNull
    public String toString() {
        b bVar = this.f18100b;
        if (bVar == null) {
            return this.text;
        }
        StringBuilder builder = new StringBuilder();
        builder.append((CharSequence) this.text, 0, this.f18101c);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(bVar.f92745b, 0, bVar.f92746c);
        char[] cArr = bVar.f92745b;
        int i10 = bVar.f92747d;
        builder.append(cArr, i10, bVar.f92744a - i10);
        String str = this.text;
        builder.append((CharSequence) str, this.f18102d, str.length());
        String string = builder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
