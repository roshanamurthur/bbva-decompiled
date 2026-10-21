package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u001a.\u0010\u000b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composition;", "createSubcomposition", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class Wrapper_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ViewGroup.LayoutParams f17374a = new ViewGroup.LayoutParams(-2, -2);

    @MainThread
    @NotNull
    public static final Composition createSubcomposition(@NotNull LayoutNode container, @NotNull CompositionContext parent) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return CompositionKt.Composition(new UiApplier(container), parent);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final Composition setContent(@NotNull AbstractComposeView abstractComposeView, @NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        AndroidComposeView androidComposeView;
        Composition Composition;
        int i10;
        r1 r1Var;
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                Context context = abstractComposeView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                androidComposeView = new AndroidComposeView(context, parent.getEffectCoroutineContext());
                abstractComposeView.addView(androidComposeView.getView(), f17374a);
            }
            if (Build.VERSION.SDK_INT >= 29 && (!WrapperVerificationHelperMethods.INSTANCE.attributeSourceResourceMap(androidComposeView).isEmpty())) {
                androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                if (!InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    try {
                        Field declaredField = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
                        declaredField.setAccessible(true);
                        declaredField.setBoolean(null, true);
                    } catch (Exception unused) {
                        Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                    }
                }
            }
            Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), parent);
            View view = androidComposeView.getView();
            i10 = R.id.wrapped_composition_tag;
            Object tag = view.getTag(i10);
            r1Var = tag instanceof r1 ? (r1) tag : null;
            if (r1Var == null) {
                r1Var = new r1(androidComposeView, Composition);
                androidComposeView.getView().setTag(i10, r1Var);
            }
            r1Var.setContent(content);
            return r1Var;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            Context context2 = abstractComposeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            androidComposeView = new AndroidComposeView(context2, parent.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), f17374a);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            if (!InspectableValueKt.isDebugInspectorInfoEnabled()) {
                Field declaredField2 = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField2.setAccessible(true);
                declaredField2.setBoolean(null, true);
            }
        }
        Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), parent);
        View view2 = androidComposeView.getView();
        i10 = R.id.wrapped_composition_tag;
        Object tag2 = view2.getTag(i10);
        if (tag2 instanceof r1) {
        }
        if (r1Var == null) {
            r1Var = new r1(androidComposeView, Composition);
            androidComposeView.getView().setTag(i10, r1Var);
        }
        r1Var.setContent(content);
        return r1Var;
    }
}
