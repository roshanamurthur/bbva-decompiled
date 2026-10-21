package androidx.compose.foundation.text;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.input.TextFieldValue;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "now", "", "snapshotIfNeeded", "forceNextSnapshot", "makeSnapshot", "undo", "redo", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxStoredCharacters", "()I", "maxStoredCharacters", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class UndoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int maxStoredCharacters;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f6074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f6075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Long f6077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6078f;

    /* JADX INFO: compiled from: UndoManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public a f6079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public TextFieldValue f6080b;

        public a(@Nullable a aVar, @NotNull TextFieldValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6079a = aVar;
            this.f6080b = value;
        }
    }

    public UndoManager() {
        this(0, 1, null);
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j10);
    }

    public final void forceNextSnapshot() {
        this.f6078f = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    public final void makeSnapshot(@NotNull TextFieldValue value) {
        a aVar;
        TextFieldValue textFieldValue;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6078f = false;
        a aVar2 = this.f6074b;
        if (Intrinsics.areEqual(value, aVar2 != null ? aVar2.f6080b : null)) {
            return;
        }
        String text = value.getText();
        a aVar3 = this.f6074b;
        if (Intrinsics.areEqual(text, (aVar3 == null || (textFieldValue = aVar3.f6080b) == null) ? null : textFieldValue.getText())) {
            a aVar4 = this.f6074b;
            if (aVar4 == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            aVar4.f6080b = value;
            return;
        }
        this.f6074b = new a(this.f6074b, value);
        this.f6075c = null;
        int length = value.getText().length() + this.f6076d;
        this.f6076d = length;
        if (length > this.maxStoredCharacters) {
            a aVar5 = this.f6074b;
            if ((aVar5 != null ? aVar5.f6079a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 == null) {
                    aVar = null;
                } else {
                    a aVar6 = aVar5.f6079a;
                    if (aVar6 != null) {
                        aVar = aVar6.f6079a;
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar5 = aVar5.f6079a;
                }
            }
            if (aVar5 == null) {
                return;
            }
            aVar5.f6079a = null;
        }
    }

    @Nullable
    public final TextFieldValue redo() {
        a aVar = this.f6075c;
        if (aVar == null) {
            return null;
        }
        this.f6075c = aVar.f6079a;
        this.f6074b = new a(this.f6074b, aVar.f6080b);
        this.f6076d = aVar.f6080b.getText().length() + this.f6076d;
        return aVar.f6080b;
    }

    public final void snapshotIfNeeded(@NotNull TextFieldValue value, long now) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.f6078f) {
            Long l6 = this.f6077e;
            if (now <= (l6 != null ? l6.longValue() : 0L) + ((long) UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS())) {
                return;
            }
        }
        this.f6077e = Long.valueOf(now);
        makeSnapshot(value);
    }

    @Nullable
    public final TextFieldValue undo() {
        a aVar;
        a aVar2 = this.f6074b;
        if (aVar2 == null || (aVar = aVar2.f6079a) == null) {
            return null;
        }
        this.f6074b = aVar;
        this.f6076d -= aVar2.f6080b.getText().length();
        this.f6075c = new a(this.f6075c, aVar2.f6080b);
        return aVar.f6080b;
    }

    public UndoManager(int i10) {
        this.maxStoredCharacters = i10;
    }

    public /* synthetic */ UndoManager(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : i10);
    }
}
