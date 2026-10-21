package androidx.camera.core.impl;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2117p0;

    public /* synthetic */ d0(int i10) {
        this.f2117p0 = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2117p0) {
            case 0:
                return OptionsBundle.lambda$static$0((Config.Option) obj, (Config.Option) obj2);
            default:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                LayoutNode.Companion companion = LayoutNode.INSTANCE;
                return layoutNode.getMeasurePassDelegate$ui_release().getZIndex() == layoutNode2.getMeasurePassDelegate$ui_release().getZIndex() ? Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getMeasurePassDelegate$ui_release().getZIndex(), layoutNode2.getMeasurePassDelegate$ui_release().getZIndex());
        }
    }
}
