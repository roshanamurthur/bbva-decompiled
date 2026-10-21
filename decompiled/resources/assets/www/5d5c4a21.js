import{z as e,a8 as r,a9 as a,bY as t,aa as o,a as s,aJ as n,L as i,ak as b,V as l,h as c,aK as d,ag as g,Z as h,g as p}from"./952f98a9.js";var m=e`[ambient^=light] {
  --bbva-badge-reference-text-color: initial;
  --bbva-badge-reference-skeleton-color: initial;
}
`;const u={dark:e`
    ${e`[ambient^=dark] {
  --bbva-badge-reference-text-color: var(--colorsPrimaryCoreLightened, ${r(a.primaryCoreLightened)});
  --bbva-badge-reference-skeleton-color: var(--colorsPrimaryCoreDark, ${r(a.primaryCoreDark)});
}
`}
    ${t.dark}
  `,light:e`
    ${m}
    ${t.light}
  `};var v=e`:host {
  box-sizing: border-box;
  display: flex;
  height: 1.5rem;
  --bbva-text-color: var(--bbva-badge-reference-dark-mode-text-color, var(--bbva-badge-reference-text-color, var(--colorsSecondary600, ${r(a.secondary600)})));
  --skeleton-quote-color: var(--bbva-badge-reference-dark-mode-skeleton-quote-color, var(--bbva-badge-reference-skeleton-color, var(--colorsSecondary200, ${r(a.secondary200)})));
  --skeleton-quote-bg: var(--bbva-badge-reference-dark-mode-skeleton-bg, var(--bbva-badge-reference-skeleton-bg, transparent));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-clip-box] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(o.spacer)}))) / 16) * 1rem);
}

:host, :host([align-left]) {
  justify-content: flex-start;
}

:host([align-center]) {
  justify-content: center;
}

:host([align-right]) {
  justify-content: flex-end;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: radial-gradient( 24px 100%, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((32px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 32px 4px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
`;class f extends(s(n(i))){static get is(){return"bbva-badge-reference"}static get scopedElements(){const e=[d,g];return f.scopedElementsFromClasses(e)}static get properties(){return{entity:{type:String},number:{type:Number},showRawNumber:{type:Boolean,attribute:"show-raw-number"},maskChar:{type:String,attribute:"mask-char"},visibleChars:{type:Number,attribute:"visible-chars"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.showRawNumber=!1,this.maskChar="•",this.visibleChars=4,this.loading=!1}static get styles(){return[super.styles,v,u.light,u.dark,b("bbva-badge-reference-shared-styles")]}set number(e){const r=this._number;this._number=l(e,this.maskChar,!this.showRawNumber,this.visibleChars),this.requestUpdate("number",r)}get number(){return this._number}render(){return c`
      ${this.entity?c`<bbva-clip-box size="xsmall" icon="${this.entity}"></bbva-clip-box>`:""}

      <bbva-text tag="span" size="S" font-style="italic" text="${this.number}"></bbva-text>
    `}}var k={...h,bbvaBadgeReference:`\n    --bbva-badge-reference-dark-mode-text-color: ${p("colors.primaryCoreLightened")};\n    --bbva-badge-reference-dark-mode-skeleton-quote-color: #2E4452;\n  `};export{f as B,u as a,k as b};
