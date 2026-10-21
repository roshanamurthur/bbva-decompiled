package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeadKeyCombiner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "consume", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class DeadKeyCombiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f5895a;

    @Nullable
    /* JADX INFO: renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m499consumeZmokQxo(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iM3368getUtf16CodePointZmokQxo = KeyEvent_androidKt.m3368getUtf16CodePointZmokQxo(event);
        if ((Integer.MIN_VALUE & iM3368getUtf16CodePointZmokQxo) != 0) {
            this.f5895a = Integer.valueOf(iM3368getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f5895a;
        if (num == null) {
            return Integer.valueOf(iM3368getUtf16CodePointZmokQxo);
        }
        this.f5895a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM3368getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iM3368getUtf16CodePointZmokQxo) : num2;
    }
}
