package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes11.dex */
public class Match {
    public final boolean ascending;
    public Double baseGuesses;
    public final List<Match> baseMatches;
    public final CharSequence baseToken;
    public final int day;
    public final String dictionaryName;
    public final String graph;
    public Double guesses;
    public Double guessesLog10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f63691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f63692j;
    public final boolean l33t;
    public final CharSequence matchedWord;
    public final int month;
    public final Pattern pattern;
    public final int rank;
    public final Matcher regexMatch;
    public final String regexName;
    public final int repeatCount;
    public final boolean reversed;
    public final String separator;
    public final String sequenceName;
    public final int sequenceSpace;
    public final Integer shiftedCount;
    public final Map<Character, Character> sub;
    public final String subDisplay;
    public final CharSequence token;
    public final int turns;
    public final int year;

    public static class Builder {
        public int A;
        public Double B;
        public Double C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Pattern f63693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f63696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f63697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f63698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f63699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f63700h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f63701i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map<Character, Character> f63702j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f63703k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f63704l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f63705n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f63706o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Matcher f63707p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public CharSequence f63708q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public double f63709r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List<Match> f63710s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f63711t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f63712u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f63713v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f63714w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f63715x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f63716y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f63717z;

        public Builder(Pattern pattern, int i10, int i11, CharSequence charSequence) {
            this.f63693a = pattern;
            this.f63694b = i10;
            this.f63695c = i11;
            this.f63696d = charSequence;
        }

        public Builder ascending(boolean z10) {
            this.f63705n = z10;
            return this;
        }

        public Builder baseGuesses(double d2) {
            this.f63709r = d2;
            return this;
        }

        public Builder baseMatches(List<Match> list) {
            this.f63710s = list;
            return this;
        }

        public Builder baseToken(CharSequence charSequence) {
            this.f63708q = charSequence;
            return this;
        }

        public Match build() {
            return new Match(this);
        }

        public Builder day(int i10) {
            this.A = i10;
            return this;
        }

        public Builder dictionaryName(String str) {
            this.f63699g = str;
            return this;
        }

        public Builder graph(String str) {
            this.f63712u = str;
            return this;
        }

        public Builder guesses(Double d2) {
            this.B = d2;
            return this;
        }

        public Builder guessesLog10(Double d2) {
            this.C = d2;
            return this;
        }

        public Builder l33t(boolean z10) {
            this.f63701i = z10;
            return this;
        }

        public Builder matchedWord(CharSequence charSequence) {
            this.f63697e = charSequence;
            return this;
        }

        public Builder month(int i10) {
            this.f63717z = i10;
            return this;
        }

        public Builder rank(int i10) {
            this.f63698f = i10;
            return this;
        }

        public Builder regexMatch(Matcher matcher) {
            this.f63707p = matcher;
            return this;
        }

        public Builder regexName(String str) {
            this.f63706o = str;
            return this;
        }

        public Builder repeatCount(int i10) {
            this.f63711t = i10;
            return this;
        }

        public Builder reversed(boolean z10) {
            this.f63700h = z10;
            return this;
        }

        public Builder separator(String str) {
            this.f63715x = str;
            return this;
        }

        public Builder sequenceName(String str) {
            this.f63704l = str;
            return this;
        }

        public Builder sequenceSpace(int i10) {
            this.m = i10;
            return this;
        }

        public Builder shiftedCount(int i10) {
            this.f63714w = i10;
            return this;
        }

        public Builder sub(Map<Character, Character> map) {
            this.f63702j = map;
            return this;
        }

        public Builder subDisplay(String str) {
            this.f63703k = str;
            return this;
        }

        public Builder turns(int i10) {
            this.f63713v = i10;
            return this;
        }

        public Builder year(int i10) {
            this.f63716y = i10;
            return this;
        }
    }

    public Match(Builder builder) {
        this.pattern = builder.f63693a;
        this.f63691i = builder.f63694b;
        this.f63692j = builder.f63695c;
        this.token = builder.f63696d;
        this.matchedWord = builder.f63697e;
        this.rank = builder.f63698f;
        this.dictionaryName = builder.f63699g;
        this.reversed = builder.f63700h;
        this.l33t = builder.f63701i;
        if (builder.f63702j == null) {
            builder.f63702j = new HashMap();
        }
        this.sub = builder.f63702j;
        this.subDisplay = builder.f63703k;
        this.sequenceName = builder.f63704l;
        this.sequenceSpace = builder.m;
        this.ascending = builder.f63705n;
        this.regexName = builder.f63706o;
        this.regexMatch = builder.f63707p;
        this.baseToken = builder.f63708q;
        this.baseGuesses = Double.valueOf(builder.f63709r);
        if (builder.f63710s == null) {
            builder.f63710s = new ArrayList();
        }
        this.baseMatches = builder.f63710s;
        this.repeatCount = builder.f63711t;
        this.graph = builder.f63712u;
        this.turns = builder.f63713v;
        this.shiftedCount = Integer.valueOf(builder.f63714w);
        this.separator = builder.f63715x;
        this.year = builder.f63716y;
        this.month = builder.f63717z;
        this.day = builder.A;
        this.guesses = builder.B;
        this.guessesLog10 = builder.C;
    }

    public int tokenLength() {
        CharSequence charSequence = this.token;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }
}
