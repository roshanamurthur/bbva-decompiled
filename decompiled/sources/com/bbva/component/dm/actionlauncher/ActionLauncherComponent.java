package com.bbva.component.dm.actionlauncher;

import android.content.Context;
import android.content.Intent;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionLauncherComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/ActionLauncherComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "", "", "attrs", "", "setProperties", "Landroid/content/Context;", "context", "propertyKey", "launch", "mapAction", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "action", "<init>", "()V", "Companion", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
public final class ActionLauncherComponent extends ReactiveComponent {

    @NotNull
    public static final String ID = "component-dm-actionlauncher";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Map<String, ? extends Object> f27338p0;

    @JvmField
    @NotNull
    public static final ActionSpec<Action> ACTION_LAUNCH_SUCCESS = new ActionSpec<>("launch-success");

    @JvmField
    @NotNull
    public static final ActionSpec<Action> ACTION_LAUNCH_ERROR = new ActionSpec<>("launch-error");

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getE0() {
        return ID;
    }

    public final void launch(@NotNull Context context, @NotNull Map<String, ? extends Object> mapAction) {
        Action actionFromMap = Action.INSTANCE.fromMap(mapAction);
        if (actionFromMap != null) {
            launch(context, actionFromMap);
        }
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Component
    public void setProperties(@NotNull Map<String, ? extends Object> attrs) {
        this.f27338p0 = attrs;
    }

    public final void launch(@NotNull Context context, @NotNull Action action) {
        Intent intent = IntentMappersKt.toIntent(action, context);
        if (intent != null) {
            intent.addFlags(268435456);
        } else {
            intent = null;
        }
        if ((intent != null ? intent.resolveActivity(context.getPackageManager()) : null) != null) {
            context.startActivity(intent);
            fire(ACTION_LAUNCH_SUCCESS, action);
        } else {
            fire(ACTION_LAUNCH_ERROR, action);
        }
    }

    public final void launch(@NotNull Context context, @NotNull String propertyKey) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) propertyKey, new char[]{JsonPointer.SEPARATOR}, false, 0, 6, (Object) null);
        Object obj = this.f27338p0;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProperties");
        }
        for (String str : listSplit$default) {
            if (obj instanceof Map) {
                obj = ((Map) obj).get(str);
            }
        }
        if (obj instanceof Map) {
            launch(context, (Map<String, ? extends Object>) obj);
        }
    }
}
