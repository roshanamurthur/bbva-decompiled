package com.bbva.ui.widget;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import androidx.appcompat.app.i;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.ui.compose.StatusNotificationKt;
import com.bbva.ui.compose.StatusNotificationType;
import com.bbva.ui.compose.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StatusNotification.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bR+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/ui/widget/StatusNotification;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/bbva/ui/widget/StatusNotification$Type;", "type", "setType", "", "textResId", "setText", "Lcom/bbva/ui/widget/StatusNotification$c;", "<set-?>", "x0", "Landroidx/compose/runtime/MutableState;", "getState", "()Lcom/bbva/ui/widget/StatusNotification$c;", "setState", "(Lcom/bbva/ui/widget/StatusNotification$c;)V", "state", "Companion", "c", UUIDPreferences.TYPE_KEY, "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStatusNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/widget/StatusNotification\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n81#2:123\n107#2,2:124\n*S KotlinDebug\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/widget/StatusNotification\n*L\n26#1:123\n26#1:124,2\n*E\n"})
public final class StatusNotification extends AbstractComposeView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState state;

    /* JADX INFO: compiled from: StatusNotification.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/ui/widget/StatusNotification$Companion;", "", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/bbva/ui/widget/StatusNotification$Type;", "type", "", "textResId", "", "show", HideCommand.ID, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nStatusNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/widget/StatusNotification$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: StatusNotification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.INFO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.WARNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static StatusNotificationType a(Type type) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 == 1) {
                return StatusNotificationType.INFO;
            }
            if (i10 == 2) {
                return StatusNotificationType.ERROR;
            }
            if (i10 == 3) {
                return StatusNotificationType.WARNING;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static final /* synthetic */ StatusNotificationType access$toStatusNotificationType(Companion companion, Type type) {
            companion.getClass();
            return a(type);
        }

        public final void hide(@NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            if (viewGroup instanceof BbvaTopAppBar) {
                ((BbvaTopAppBar) viewGroup).hideStatusNotification$ui_release();
                return;
            }
            StatusNotification statusNotification = (StatusNotification) viewGroup.getRootView().findViewWithTag("StatusNotification");
            if (statusNotification != null) {
                StatusNotification.access$hide(statusNotification);
            }
        }

        public final void show(@NotNull ViewGroup viewGroup, @NotNull Type type, @StringRes int textResId) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(type, "type");
            if (viewGroup instanceof BbvaTopAppBar) {
                ((BbvaTopAppBar) viewGroup).showStatusNotification$ui_release(a(type), textResId);
                return;
            }
            StatusNotification statusNotification = (StatusNotification) viewGroup.getRootView().findViewWithTag("StatusNotification");
            if (statusNotification == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                statusNotification = new StatusNotification(context, null);
                statusNotification.setTag("StatusNotification");
                StatusNotification.INSTANCE.getClass();
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getRootView().findViewById(R.id.content);
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeView(childAt);
                LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                linearLayout.setOrientation(1);
                linearLayout.addView(statusNotification);
                linearLayout.addView(childAt);
                viewGroup2.addView(linearLayout);
            }
            statusNotification.setType(type);
            statusNotification.setText(textResId);
            StatusNotification.access$show(statusNotification);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: StatusNotification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ui/widget/StatusNotification$Type;", "", "INFO", "ERROR", "WARNING", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ERROR;
        public static final Type INFO;
        public static final Type WARNING;

        static {
            Type type = new Type("INFO", 0);
            INFO = type;
            Type type2 = new Type("ERROR", 1);
            ERROR = type2;
            Type type3 = new Type("WARNING", 2);
            WARNING = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr);
        }

        public Type() {
            throw null;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: StatusNotification.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-750730497, iIntValue, -1, "com.bbva.ui.widget.StatusNotification.Content.<anonymous> (StatusNotification.kt:30)");
                }
                StatusNotification statusNotification = StatusNotification.this;
                StatusNotificationKt.StatusNotification(statusNotification.getState().f37732a, statusNotification.getState().f37733b, statusNotification.getState().f37734c, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: StatusNotification.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37731q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f37731q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37731q0 | 1);
            StatusNotification.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: StatusNotification.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final StatusNotificationType f37732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37734c;

        public c() {
            this(0);
        }

        public static c a(c cVar, StatusNotificationType type, int i10, boolean z10, int i11) {
            if ((i11 & 1) != 0) {
                type = cVar.f37732a;
            }
            if ((i11 & 2) != 0) {
                i10 = cVar.f37733b;
            }
            if ((i11 & 4) != 0) {
                z10 = cVar.f37734c;
            }
            cVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            return new c(type, i10, z10);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f37732a == cVar.f37732a && this.f37733b == cVar.f37733b && this.f37734c == cVar.f37734c;
        }

        public final int hashCode() {
            return (((this.f37732a.hashCode() * 31) + this.f37733b) * 31) + (this.f37734c ? 1231 : 1237);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Status(type=");
            sb2.append(this.f37732a);
            sb2.append(", textResId=");
            sb2.append(this.f37733b);
            sb2.append(", isVisible=");
            return i.c(sb2, this.f37734c, ")");
        }

        public c(@NotNull StatusNotificationType type, @StringRes int i10, boolean z10) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f37732a = type;
            this.f37733b = i10;
            this.f37734c = z10;
        }

        public /* synthetic */ c(int i10) {
            this(StatusNotificationType.INFO, 0, false);
        }
    }

    public /* synthetic */ StatusNotification(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final void access$hide(StatusNotification statusNotification) {
        statusNotification.setState(c.a(statusNotification.getState(), null, 0, false, 3));
    }

    public static final void access$show(StatusNotification statusNotification) {
        statusNotification.setState(c.a(statusNotification.getState(), null, 0, true, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c getState() {
        return (c) this.state.getValue();
    }

    private final void setState(c cVar) {
        this.state.setValue(cVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1076199697);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1076199697, i11, -1, "com.bbva.ui.widget.StatusNotification.Content (StatusNotification.kt:28)");
            }
            ThemeKt.BbvaTheme(null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -750730497, true, new a()), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
        }
    }

    public final void setText(@StringRes int textResId) {
        setState(c.a(getState(), null, textResId, false, 5));
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        setState(c.a(getState(), Companion.access$toStatusNotificationType(INSTANCE, type), 0, false, 6));
    }

    public StatusNotification(Context context) {
        super(context, null, 0, 6, null);
        this.state = SnapshotStateKt.mutableStateOf$default(new c(0), null, 2, null);
    }
}
