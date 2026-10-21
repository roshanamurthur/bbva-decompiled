package androidx.compose.ui.focus;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u00105\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000204\u0012\u0004\u0012\u00020\u000203¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016R\"\u0010%\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010-\u001a\u00020,8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "", "takeFocus", "releaseFocus", "", "force", "clearFocus", "refreshFocusEvents", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "a", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "rootFocusNode", "Landroidx/compose/ui/Modifier;", "c", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,290:1\n244#1:361\n245#1:433\n246#1:440\n247#1:487\n248#1:534\n249#1:541\n244#1:612\n245#1:684\n246#1:691\n247#1:738\n248#1:785\n249#1:792\n244#1:863\n245#1:935\n246#1:942\n247#1:989\n248#1:1036\n249#1:1043\n96#2:291\n96#2:360\n104#2:542\n104#2:611\n98#2:793\n98#2:862\n90#2,7:1213\n90#2:1229\n262#3:292\n230#3,5:293\n58#3:298\n59#3,8:300\n383#3,5:308\n263#3:313\n388#3:314\n393#3,2:316\n395#3,8:321\n403#3,9:332\n412#3,8:344\n68#3,7:352\n265#3:359\n253#3,2:362\n230#3,5:364\n58#3:369\n59#3,8:371\n383#3,5:379\n255#3,3:384\n388#3:387\n393#3,2:389\n395#3,8:394\n403#3,9:405\n412#3,8:417\n68#3,7:425\n258#3:432\n383#3,12:441\n395#3,8:456\n403#3,9:467\n412#3,8:479\n383#3,12:488\n395#3,8:503\n403#3,9:514\n412#3,8:526\n262#3:543\n230#3,5:544\n58#3:549\n59#3,8:551\n383#3,5:559\n263#3:564\n388#3:565\n393#3,2:567\n395#3,8:572\n403#3,9:583\n412#3,8:595\n68#3,7:603\n265#3:610\n253#3,2:613\n230#3,5:615\n58#3:620\n59#3,8:622\n383#3,5:630\n255#3,3:635\n388#3:638\n393#3,2:640\n395#3,8:645\n403#3,9:656\n412#3,8:668\n68#3,7:676\n258#3:683\n383#3,12:692\n395#3,8:707\n403#3,9:718\n412#3,8:730\n383#3,12:739\n395#3,8:754\n403#3,9:765\n412#3,8:777\n262#3:794\n230#3,5:795\n58#3:800\n59#3,8:802\n383#3,5:810\n263#3:815\n388#3:816\n393#3,2:818\n395#3,8:823\n403#3,9:834\n412#3,8:846\n68#3,7:854\n265#3:861\n253#3,2:864\n230#3,5:866\n58#3:871\n59#3,8:873\n383#3,5:881\n255#3,3:886\n388#3:889\n393#3,2:891\n395#3,8:896\n403#3,9:907\n412#3,8:919\n68#3,7:927\n258#3:934\n383#3,12:943\n395#3,8:958\n403#3,9:969\n412#3,8:981\n383#3,12:990\n395#3,8:1005\n403#3,9:1016\n412#3,8:1028\n253#3,2:1044\n230#3,5:1046\n58#3:1051\n59#3,8:1053\n383#3,5:1061\n255#3,3:1066\n388#3:1069\n393#3,2:1071\n395#3,8:1076\n403#3,9:1087\n412#3,8:1099\n68#3,7:1107\n258#3:1114\n383#3,6:1121\n393#3,2:1128\n395#3,8:1133\n403#3,9:1144\n412#3,8:1156\n383#3,6:1164\n393#3,2:1171\n395#3,8:1176\n403#3,9:1187\n412#3,8:1199\n190#3:1221\n191#3,6:1223\n198#3,3:1231\n1#4:299\n1#4:370\n1#4:550\n1#4:621\n1#4:801\n1#4:872\n1#4:1052\n1#4:1222\n261#5:315\n261#5:388\n261#5:566\n261#5:639\n261#5:817\n261#5:890\n261#5:1070\n261#5:1127\n261#5:1170\n261#5:1230\n234#6,3:318\n237#6,3:341\n234#6,3:391\n237#6,3:414\n234#6,3:453\n237#6,3:476\n234#6,3:500\n237#6,3:523\n234#6,3:569\n237#6,3:592\n234#6,3:642\n237#6,3:665\n234#6,3:704\n237#6,3:727\n234#6,3:751\n237#6,3:774\n234#6,3:820\n237#6,3:843\n234#6,3:893\n237#6,3:916\n234#6,3:955\n237#6,3:978\n234#6,3:1002\n237#6,3:1025\n234#6,3:1073\n237#6,3:1096\n234#6,3:1130\n237#6,3:1153\n234#6,3:1173\n237#6,3:1196\n1182#7:329\n1161#7,2:330\n1182#7:402\n1161#7,2:403\n1182#7:464\n1161#7,2:465\n1182#7:511\n1161#7,2:512\n1182#7:580\n1161#7,2:581\n1182#7:653\n1161#7,2:654\n1182#7:715\n1161#7,2:716\n1182#7:762\n1161#7,2:763\n1182#7:831\n1161#7,2:832\n1182#7:904\n1161#7,2:905\n1182#7:966\n1161#7,2:967\n1182#7:1013\n1161#7,2:1014\n1182#7:1084\n1161#7,2:1085\n1182#7:1141\n1161#7,2:1142\n1182#7:1184\n1161#7,2:1185\n51#8,6:434\n33#8,6:535\n51#8,6:685\n33#8,6:786\n51#8,6:936\n33#8,6:1037\n51#8,6:1115\n33#8,6:1207\n47#9:1220\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n190#1:361\n190#1:433\n190#1:440\n190#1:487\n190#1:534\n190#1:541\n203#1:612\n203#1:684\n203#1:691\n203#1:738\n203#1:785\n203#1:792\n218#1:863\n218#1:935\n218#1:942\n218#1:989\n218#1:1036\n218#1:1043\n188#1:291\n191#1:360\n201#1:542\n204#1:611\n216#1:793\n219#1:862\n260#1:1213,7\n261#1:1229\n188#1:292\n188#1:293,5\n188#1:298\n188#1:300,8\n188#1:308,5\n188#1:313\n188#1:314\n188#1:316,2\n188#1:321,8\n188#1:332,9\n188#1:344,8\n188#1:352,7\n188#1:359\n190#1:362,2\n190#1:364,5\n190#1:369\n190#1:371,8\n190#1:379,5\n190#1:384,3\n190#1:387\n190#1:389,2\n190#1:394,8\n190#1:405,9\n190#1:417,8\n190#1:425,7\n190#1:432\n190#1:441,12\n190#1:456,8\n190#1:467,9\n190#1:479,8\n190#1:488,12\n190#1:503,8\n190#1:514,9\n190#1:526,8\n201#1:543\n201#1:544,5\n201#1:549\n201#1:551,8\n201#1:559,5\n201#1:564\n201#1:565\n201#1:567,2\n201#1:572,8\n201#1:583,9\n201#1:595,8\n201#1:603,7\n201#1:610\n203#1:613,2\n203#1:615,5\n203#1:620\n203#1:622,8\n203#1:630,5\n203#1:635,3\n203#1:638\n203#1:640,2\n203#1:645,8\n203#1:656,9\n203#1:668,8\n203#1:676,7\n203#1:683\n203#1:692,12\n203#1:707,8\n203#1:718,9\n203#1:730,8\n203#1:739,12\n203#1:754,8\n203#1:765,9\n203#1:777,8\n216#1:794\n216#1:795,5\n216#1:800\n216#1:802,8\n216#1:810,5\n216#1:815\n216#1:816\n216#1:818,2\n216#1:823,8\n216#1:834,9\n216#1:846,8\n216#1:854,7\n216#1:861\n218#1:864,2\n218#1:866,5\n218#1:871\n218#1:873,8\n218#1:881,5\n218#1:886,3\n218#1:889\n218#1:891,2\n218#1:896,8\n218#1:907,9\n218#1:919,8\n218#1:927,7\n218#1:934\n218#1:943,12\n218#1:958,8\n218#1:969,9\n218#1:981,8\n218#1:990,12\n218#1:1005,8\n218#1:1016,9\n218#1:1028,8\n244#1:1044,2\n244#1:1046,5\n244#1:1051\n244#1:1053,8\n244#1:1061,5\n244#1:1066,3\n244#1:1069\n244#1:1071,2\n244#1:1076,8\n244#1:1087,9\n244#1:1099,8\n244#1:1107,7\n244#1:1114\n246#1:1121,6\n246#1:1128,2\n246#1:1133,8\n246#1:1144,9\n246#1:1156,8\n247#1:1164,6\n247#1:1171,2\n247#1:1176,8\n247#1:1187,9\n247#1:1199,8\n260#1:1221\n260#1:1223,6\n260#1:1231,3\n188#1:299\n190#1:370\n201#1:550\n203#1:621\n216#1:801\n218#1:872\n244#1:1052\n260#1:1222\n188#1:315\n190#1:388\n201#1:566\n203#1:639\n216#1:817\n218#1:890\n244#1:1070\n246#1:1127\n247#1:1170\n261#1:1230\n188#1:318,3\n188#1:341,3\n190#1:391,3\n190#1:414,3\n190#1:453,3\n190#1:476,3\n190#1:500,3\n190#1:523,3\n201#1:569,3\n201#1:592,3\n203#1:642,3\n203#1:665,3\n203#1:704,3\n203#1:727,3\n203#1:751,3\n203#1:774,3\n216#1:820,3\n216#1:843,3\n218#1:893,3\n218#1:916,3\n218#1:955,3\n218#1:978,3\n218#1:1002,3\n218#1:1025,3\n244#1:1073,3\n244#1:1096,3\n246#1:1130,3\n246#1:1153,3\n247#1:1173,3\n247#1:1196,3\n188#1:329\n188#1:330,2\n190#1:402\n190#1:403,2\n190#1:464\n190#1:465,2\n190#1:511\n190#1:512,2\n201#1:580\n201#1:581,2\n203#1:653\n203#1:654,2\n203#1:715\n203#1:716,2\n203#1:762\n203#1:763,2\n216#1:831\n216#1:832,2\n218#1:904\n218#1:905,2\n218#1:966\n218#1:967,2\n218#1:1013\n218#1:1014,2\n244#1:1084\n244#1:1085,2\n246#1:1141\n246#1:1142,2\n247#1:1184\n247#1:1185,2\n190#1:434,6\n190#1:535,6\n203#1:685,6\n203#1:786,6\n218#1:936,6\n218#1:1037,6\n245#1:1115,6\n248#1:1207,6\n260#1:1220\n*E\n"})
public final class FocusOwnerImpl implements FocusOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusTargetNode rootFocusNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FocusInvalidationManager f15486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FocusOwnerImpl$modifier$1 f15487c;
    public LayoutDirection layoutDirection;

    /* JADX INFO: compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetNode();
        this.f15486b = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.f15487c = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object other) {
                return other == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.f15488b.getRootFocusNode().hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("RootFocusTarget");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(@NotNull FocusTargetNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            @NotNull
            public FocusTargetNode create() {
                return this.f15488b.getRootFocusNode();
            }
        };
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo2228dispatchInterceptedSoftKeyboardEventZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo2228dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo2229dispatchKeyEventZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo2229dispatchKeyEventZmokQxo(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.rotary.RotaryScrollEvent r15) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @Nullable
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public Modifier getModifier() {
        return this.f15487c;
    }

    @NotNull
    /* JADX INFO: renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo2227moveFocus3ESFkO8(final int focusDirection) {
        final FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM2234customFocusSearchOMvw8 = FocusTraversalKt.m2234customFocusSearchOMvw8(focusTargetNodeFindActiveFocusNode, focusDirection, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (focusRequesterM2234customFocusSearchOMvw8 != companion.getDefault()) {
            return focusRequesterM2234customFocusSearchOMvw8 != companion.getCancel() && focusRequesterM2234customFocusSearchOMvw8.focus$ui_release();
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zM2235focusSearchsMXa3k8 = FocusTraversalKt.m2235focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1

            /* JADX INFO: compiled from: FocusOwnerImpl.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CustomDestinationResult.values().length];
                    try {
                        iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CustomDestinationResult.None.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zPerformRequestFocus;
                Modifier.Node node;
                NodeChain nodes;
                FocusTargetNode destination = focusTargetNode;
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (Intrinsics.areEqual(destination, focusTargetNodeFindActiveFocusNode)) {
                    return Boolean.FALSE;
                }
                int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
                if (!destination.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent = destination.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(destination);
                loop0: while (true) {
                    zPerformRequestFocus = true;
                    node = null;
                    if (layoutNodeRequireLayoutNode == null) {
                        break;
                    }
                    if ((k.a(layoutNodeRequireLayoutNode) & iM3725constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iM3725constructorimpl) != 0) {
                                Modifier.Node nodeAccess$pop = parent;
                                MutableVector mutableVector = null;
                                while (nodeAccess$pop != null) {
                                    if (nodeAccess$pop instanceof FocusTargetNode) {
                                        node = nodeAccess$pop;
                                        break loop0;
                                    }
                                    if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                        int i10 = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nodeAccess$pop = delegate;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeAccess$pop != null) {
                                                        mutableVector.add(nodeAccess$pop);
                                                        nodeAccess$pop = null;
                                                    }
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                    parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
                }
                if (node == null) {
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                int i11 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2233performCustomRequestFocusMxy_nc0(destination, focusDirection).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        booleanRef.element = true;
                    } else {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(destination);
                    }
                }
                return Boolean.valueOf(zPerformRequestFocus);
            }
        });
        if (booleanRef.element) {
            return false;
        }
        if (!zM2235focusSearchsMXa3k8) {
            if (!this.rootFocusNode.getFocusState().getHasFocus() || this.rootFocusNode.getFocusState().isFocused()) {
                return false;
            }
            FocusDirection.Companion companion2 = FocusDirection.INSTANCE;
            if (!FocusDirection.m2209equalsimpl0(focusDirection, companion2.m2222getNextdhqQ8s()) && !FocusDirection.m2209equalsimpl0(focusDirection, companion2.m2224getPreviousdhqQ8s())) {
                return false;
            }
            clearFocus(false);
            if (!this.rootFocusNode.getFocusState().isFocused() || !mo2227moveFocus3ESFkO8(focusDirection)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f15486b.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setRootFocusNode$ui_release(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<set-?>");
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        if (!force) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2232performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.INSTANCE.m2219getExitdhqQ8s()).ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return;
            }
        }
        FocusStateImpl focusState = this.rootFocusNode.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
            FocusTargetNode focusTargetNode = this.rootFocusNode;
            int i11 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetNode.setFocusState(focusStateImpl);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f15486b.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f15486b.scheduleInvalidation(node);
    }
}
