package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.MergePathsContent;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class MergePaths implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MergePathsMode f26013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26014c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {
        private static final /* synthetic */ MergePathsMode[] $VALUES;
        public static final MergePathsMode ADD;
        public static final MergePathsMode EXCLUDE_INTERSECTIONS;
        public static final MergePathsMode INTERSECT;
        public static final MergePathsMode MERGE;
        public static final MergePathsMode SUBTRACT;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            MERGE = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            ADD = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            SUBTRACT = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            INTERSECT = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            EXCLUDE_INTERSECTIONS = mergePathsMode5;
            $VALUES = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public MergePathsMode() {
            throw null;
        }

        public static MergePathsMode forId(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) $VALUES.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z10) {
        this.f26012a = str;
        this.f26013b = mergePathsMode;
        this.f26014c = z10;
    }

    public MergePathsMode getMode() {
        return this.f26013b;
    }

    public String getName() {
        return this.f26012a;
    }

    public boolean isHidden() {
        return this.f26014c;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        if (lottieDrawable.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19)) {
            return new MergePathsContent(this);
        }
        Logger.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f26013b + AbstractJsonLexerKt.END_OBJ;
    }
}
