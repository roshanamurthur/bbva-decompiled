package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final /* synthetic */ Function1<Editable, Unit> f20457p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    final /* synthetic */ Function4<CharSequence, Integer, Integer, Integer, Unit> f20458q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    final /* synthetic */ Function4<CharSequence, Integer, Integer, Integer, Unit> f20459r0;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, Unit> function1, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function5) {
        this.f20457p0 = function1;
        this.f20458q0 = function4;
        this.f20459r0 = function5;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s4) {
        this.f20457p0.invoke(s4);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        this.f20458q0.invoke(text, Integer.valueOf(start), Integer.valueOf(count), Integer.valueOf(after));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        this.f20459r0.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
    }
}
