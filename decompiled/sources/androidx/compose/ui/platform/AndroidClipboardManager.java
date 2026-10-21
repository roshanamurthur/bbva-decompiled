package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "setText", "getText", "", "hasText", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidClipboardManager implements ClipboardManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final android.content.ClipboardManager f16985a;

    public AndroidClipboardManager(@NotNull android.content.ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.f16985a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    @Nullable
    public AnnotatedString getText() {
        ClipData primaryClip = this.f16985a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.f16985a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f16985a.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidClipboardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((android.content.ClipboardManager) systemService);
    }
}
