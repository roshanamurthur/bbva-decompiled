package e0;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements OffsetMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OffsetMapping f68247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68249c;

    public m(@NotNull OffsetMapping delegate, int i10, int i11) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f68247a = delegate;
        this.f68248b = i10;
        this.f68249c = i11;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int i10) {
        int iOriginalToTransformed = this.f68247a.originalToTransformed(i10);
        int i11 = this.f68249c;
        if (iOriginalToTransformed < 0 || iOriginalToTransformed > i11) {
            throw new IllegalStateException(androidx.activity.a.d(androidx.collection.h.e("OffsetMapping.originalToTransformed returned invalid mapping: ", i10, " -> ", iOriginalToTransformed, " is not in range of transformed text [0, "), i11, AbstractJsonLexerKt.END_LIST).toString());
        }
        return iOriginalToTransformed;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int i10) {
        int iTransformedToOriginal = this.f68247a.transformedToOriginal(i10);
        int i11 = this.f68248b;
        if (iTransformedToOriginal < 0 || iTransformedToOriginal > i11) {
            throw new IllegalStateException(androidx.activity.a.d(androidx.collection.h.e("OffsetMapping.transformedToOriginal returned invalid mapping: ", i10, " -> ", iTransformedToOriginal, " is not in range of original text [0, "), i11, AbstractJsonLexerKt.END_LIST).toString());
        }
        return iTransformedToOriginal;
    }
}
