package com.bbva.cellswidgets.transformations;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PasswordTransformation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PasswordTransformation;", "Landroid/text/method/TransformationMethod;", "Landroid/view/View;", "view", "", "sourceText", "", "focused", "", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "onFocusChanged", "source", "getTransformation", "<init>", "()V", "Companion", "PasswordTransformationChar", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPasswordTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordTransformation.kt\ncom/bbva/cellswidgets/transformations/PasswordTransformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class PasswordTransformation implements TransformationMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f27316a;

    /* JADX INFO: compiled from: PasswordTransformation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PasswordTransformation$Companion;", "", "()V", "INSTANCE", "Lcom/bbva/cellswidgets/transformations/PasswordTransformation;", "instance", "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PasswordTransformation instance() {
            PasswordTransformation passwordTransformationAccess$getINSTANCE$cp = PasswordTransformation.access$getINSTANCE$cp();
            if (passwordTransformationAccess$getINSTANCE$cp == null) {
                synchronized (this) {
                    passwordTransformationAccess$getINSTANCE$cp = PasswordTransformation.access$getINSTANCE$cp();
                    if (passwordTransformationAccess$getINSTANCE$cp == null) {
                        passwordTransformationAccess$getINSTANCE$cp = new PasswordTransformation(null);
                    }
                }
            }
            return passwordTransformationAccess$getINSTANCE$cp;
        }
    }

    /* JADX INFO: compiled from: PasswordTransformation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PasswordTransformation$PasswordTransformationChar;", "", "", FirebaseAnalytics.Param.INDEX, "", "get", "startIndex", "endIndex", "subSequence", "getLength", "()I", "length", "source", "<init>", "(Lcom/bbva/cellswidgets/transformations/PasswordTransformation;Ljava/lang/CharSequence;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
    public final class PasswordTransformationChar implements CharSequence {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final CharSequence f27317p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PasswordTransformation f27318q0;

        public PasswordTransformationChar(@NotNull PasswordTransformation passwordTransformation, CharSequence source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f27318q0 = passwordTransformation;
            this.f27317p0 = source;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            return get(i10);
        }

        public char get(int index) {
            return this.f27318q0.f27316a;
        }

        public int getLength() {
            return this.f27317p0.length();
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // java.lang.CharSequence
        @NotNull
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.f27317p0.subSequence(startIndex, endIndex);
        }
    }

    public /* synthetic */ PasswordTransformation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ PasswordTransformation access$getINSTANCE$cp() {
        return null;
    }

    @Override // android.text.method.TransformationMethod
    @Nullable
    public CharSequence getTransformation(@Nullable CharSequence source, @Nullable View view) {
        if (source != null) {
            return new PasswordTransformationChar(this, source);
        }
        return null;
    }

    public PasswordTransformation() {
        this.f27316a = Typography.bullet;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(@Nullable View view, @Nullable CharSequence sourceText, boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
    }
}
